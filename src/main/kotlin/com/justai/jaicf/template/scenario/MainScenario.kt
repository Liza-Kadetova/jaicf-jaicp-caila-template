package com.justai.jaicf.template.scenario

import com.justai.jaicf.activator.caila.caila
import com.justai.jaicf.model.scenario.Scenario

object MainScenario : Scenario() {

    init {
        state("Start") {
            globalActivators {
                regex("/start")
            }
            action {
                reactions.say("Здравствуйте! Я бот-навигатор по некоммерческим организациям. Я могу рассказать, куда обратиться, если вам нужна помощь, или как вы можете помочь людям, животным и природе. Какая проблема вас интересует?")
            }
        }

        state("Hello", noContext = true) {
            activators {
                intent("Hello")
            }

            action {
                activator.caila?.topIntent?.answer?.let {
                    reactions.say(it)
                }
            }
        }

        state("Why", noContext = true) {
            activators {
                intent("Why")
            }

            action {
                activator.caila?.topIntent?.answer?.let {
                    reactions.say(it)
                }
            }
        }

        state("HowTo", noContext = true) {
            activators {
                intent("HowTo")
            }

            action {
                activator.caila?.topIntent?.answer?.let {
                    reactions.say(it);
                }
                reactions.say("Это подходящая информация?")
            }
        }


        state("Abuse", noContext = true) {
            globalActivators {
                intent("Abuse")
            }

            action {
                activator.caila?.topIntent?.answer?.let {
                    reactions.say(it);
                }
                reactions.say("Это подходящая информация?")
            }
        }

        state("Addict", noContext = true) {
            activators {
                intent("Addict")
            }

            action {
                activator.caila?.topIntent?.answer?.let {
                    reactions.say(it);
                }
                reactions.say("Это подходящая информация?")
            }
        }

        state("Animals", noContext = true) {
            activators {
                intent("Animals")
            }

            action {
                activator.caila?.topIntent?.answer?.let {
                    reactions.say(it);
                }
                reactions.say("Это подходящая информация?")
            }
        }

        state("Covid", noContext = true) {
            activators {
                intent("Covid")
            }

            action {
                activator.caila?.topIntent?.answer?.let {
                    reactions.say(it);
                }
                reactions.say("Это подходящая информация?")
            }
        }

        state("CultSciEdu", noContext = true) {
            activators {
                intent("CultSciEdu")
            }

            action {
                activator.caila?.topIntent?.answer?.let {
                    reactions.say(it);
                }
                reactions.say("Это подходящая информация?")
            }
        }

        state("Cure", noContext = true) {
            activators {
                intent("Cure")
            }

            action {
                activator.caila?.topIntent?.answer?.let {
                    reactions.say(it)
                }
            }
        }

        state("Disability", noContext = true) {
            activators {
                intent("Disability")
            }

            action {
                activator.caila?.topIntent?.answer?.let {
                    reactions.say(it);
                }
                reactions.say("Это подходящая информация?")
            }
        }

        state("Geo", noContext = true) {
            activators {
                intent("Geo")
            }

            action {
                activator.caila?.topIntent?.answer?.let {
                    reactions.say(it);
                }
                reactions.say("Это подходящая информация?")
            }
        }

        state("GoodBot", noContext = true) {
            activators {
                intent("GoodBot")
            }

            action {
                activator.caila?.topIntent?.answer?.let {
                    reactions.say(it)
                }
            }
        }

        state("Homeless", noContext = true) {
            activators {
                intent("Homeless")
            }

            action {
                activator.caila?.topIntent?.answer?.let {
                    reactions.say(it);
                }
                reactions.say("Это подходящая информация?")
            }
        }

        state("Lgbt", noContext = true) {
            activators {
                intent("Lgbt")
            }

            action {
                activator.caila?.topIntent?.answer?.let {
                    reactions.say(it);
                }
                reactions.say("Это подходящая информация?")
            }
        }

        state("Psycho", noContext = true) {
            activators {
                intent("Psycho")
            }

            action {
                activator.caila?.topIntent?.answer?.let {
                    reactions.say(it);
                }
                reactions.say("Это подходящая информация?")
            }
        }

        state("Mental", noContext = true) {
            activators {
                intent("Mental")
            }

            action {
                activator.caila?.topIntent?.answer?.let {
                    reactions.say(it);
                }
                reactions.say("Это подходящая информация?")
            }
        }

        state("Migrant", noContext = true) {
            activators {
                intent("Migrant")
            }

            action {
                activator.caila?.topIntent?.answer?.let {
                    reactions.say(it);
                }
                reactions.say("Это подходящая информация?")
            }
        }

        state("MpSearch", noContext = true) {
            activators {
                intent("MpSearch")
            }

            action {
                activator.caila?.topIntent?.answer?.let {
                    reactions.say(it);
                }
                reactions.say("Это подходящая информация?")
            }
        }

        state("Nature", noContext = true) {
            activators {
                intent("Nature")
            }

            action {
                activator.caila?.topIntent?.answer?.let {
                    reactions.say(it);
                }
                reactions.say("Это подходящая информация?")
            }
        }

        state("Orphan", noContext = true) {
            activators {
                intent("Orphan")
            }

            action {
                activator.caila?.topIntent?.answer?.let {
                    reactions.say(it);
                }
                reactions.say("Это подходящая информация?")
            }
        }

        state("Palliativ", noContext = true) {
            activators {
                intent("Palliativ")
            }

            action {
                activator.caila?.topIntent?.answer?.let {
                    reactions.say(it);
                }
                reactions.say("Это подходящая информация?")
            }
        }

        state("Poverty", noContext = true) {
            activators {
                intent("Poverty")
            }

            action {
                activator.caila?.topIntent?.answer?.let {
                    reactions.say(it);
                }
                reactions.say("Это подходящая информация?")
            }
        }

        state("Prison", noContext = true) {
            activators {
                intent("Prison")
            }

            action {
                activator.caila?.topIntent?.answer?.let {
                    reactions.say(it);
                }
                reactions.say("Это подходящая информация?")
            }
        }

        state("Senior", noContext = true) {
            activators {
                intent("Senior")
            }

            action {
                activator.caila?.topIntent?.answer?.let {
                    reactions.say(it);
                }
                reactions.say("Это подходящая информация?")
            }
        }

        state("SickAdults", noContext = true) {
            activators {
                intent("SickAdults")
            }

            action {
                activator.caila?.topIntent?.answer?.let {
                    reactions.say(it);
                }
                reactions.say("Это подходящая информация?")
            }
        }


        state("SickKids", noContext = true) {
            activators {
                intent("SickKids")
            }

            action {
                activator.caila?.topIntent?.answer?.let {
                    reactions.say(it);
                }
                reactions.say("Это подходящая информация?")
            }
        }

        state("NotSure", noContext = true) {
            activators {
                intent("NotSure")
            }

            action {
                activator.caila?.topIntent?.answer?.let {
                    reactions.say(it);
                }
                reactions.say("Это подходящая информация?")
            }
        }


        state("NotRelevant", noContext = true) {
            activators {
                intent("NotRelevant")
            }

            action {
                activator.caila?.topIntent?.answer?.let {
                    reactions.say(it)
                }
            }
        }

        state("Further", noContext = true) {
            activators {
                intent("Further")
            }

            action {
                activator.caila?.topIntent?.answer?.let {
                    reactions.say(it)
                }
            }
        }

        fallback {
            reactions.say("Извините, не могу ничего найти. Фонды, которые занимаются самыми разными проблемами, перечислены на сайтах проектов: \"Нужна помощь\", \"Если быть точным\", Добро.Мейл.ру, \"Все вместе\". Возможно, вам также будет полезна горячая линия Адреса Милосердия +74957417727. Там можно уточнить, какие организации помогают в разных сложных ситуациях.");
            reactions.say("Если этой информации недостаточно, пожалуйста, переформулируйте вопрос, возможно, я смогу найти что-то более подходящее.")
            }
        }
    }



