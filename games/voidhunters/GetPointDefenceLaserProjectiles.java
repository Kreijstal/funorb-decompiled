/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetPointDefenceLaserProjectiles extends ConsoleCommand {
    static mob field_o;
    static String field_p;

    final static int a(boolean param0, int param1) {
        if (param0) {
          field_o = (mob) null;
          if (!li.field_i) {
            return ita.a(param1, 7988).field_H;
          }
          if (param1 == 3) {
            return 11;
          }
          return SetTorpedoEnergyUsed.a(param1, 300).field_a;
        }
        if (!li.field_i) {
          return ita.a(param1, 7988).field_H;
        }
        if (param1 == 3) {
          return 11;
        }
        return SetTorpedoEnergyUsed.a(param1, 300).field_a;
    }

    final static boolean a(int param0, int param1) {
        if (param1 == 11284) {
          return 0 != (param0 & kf.field_a) ? true : false;
        }
        field_p = (String) null;
        return 0 != (param0 & kf.field_a) ? true : false;
    }

    GetPointDefenceLaserProjectiles(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        if (param7 >= 59) {
          if (param2 < ob.field_j) {
            ooa.a(param6, param8, param4, param1, -17572, param9, param5, param0, param3, param2);
          } else {
            if (GetCountermeasureLauncherProjectiles.field_o < param2) {
              ooa.a(param6, param8, param4, param1, -17572, param9, param5, param0, param3, param2);
            } else {
              if (param4 < ob.field_j) {
                ooa.a(param6, param8, param4, param1, -17572, param9, param5, param0, param3, param2);
              } else {
                if (param4 > GetCountermeasureLauncherProjectiles.field_o) {
                  ooa.a(param6, param8, param4, param1, -17572, param9, param5, param0, param3, param2);
                } else {
                  if (param6 < ob.field_j) {
                    ooa.a(param6, param8, param4, param1, -17572, param9, param5, param0, param3, param2);
                  } else {
                    if (param6 > GetCountermeasureLauncherProjectiles.field_o) {
                      ooa.a(param6, param8, param4, param1, -17572, param9, param5, param0, param3, param2);
                    } else {
                      if (param9 < ob.field_j) {
                        ooa.a(param6, param8, param4, param1, -17572, param9, param5, param0, param3, param2);
                      } else {
                        if (GetCountermeasureLauncherProjectiles.field_o < param9) {
                          ooa.a(param6, param8, param4, param1, -17572, param9, param5, param0, param3, param2);
                        } else {
                          if (NebulaField.field_c > param1) {
                            ooa.a(param6, param8, param4, param1, -17572, param9, param5, param0, param3, param2);
                          } else {
                            if (param1 > hab.field_i) {
                              ooa.a(param6, param8, param4, param1, -17572, param9, param5, param0, param3, param2);
                            } else {
                              if (param5 < NebulaField.field_c) {
                                ooa.a(param6, param8, param4, param1, -17572, param9, param5, param0, param3, param2);
                              } else {
                                if (hab.field_i < param5) {
                                  ooa.a(param6, param8, param4, param1, -17572, param9, param5, param0, param3, param2);
                                } else {
                                  if (param0 < NebulaField.field_c) {
                                    ooa.a(param6, param8, param4, param1, -17572, param9, param5, param0, param3, param2);
                                  } else {
                                    if (param0 > hab.field_i) {
                                      ooa.a(param6, param8, param4, param1, -17572, param9, param5, param0, param3, param2);
                                    } else {
                                      if (param8 < NebulaField.field_c) {
                                        ooa.a(param6, param8, param4, param1, -17572, param9, param5, param0, param3, param2);
                                      } else {
                                        if (hab.field_i < param8) {
                                          ooa.a(param6, param8, param4, param1, -17572, param9, param5, param0, param3, param2);
                                        } else {
                                          lia.a(param4, param0, param5, param2, param6, param3, param8, param9, param1, (byte) -57);
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        } else {
          field_p = (String) null;
          if (param2 < ob.field_j) {
            ooa.a(param6, param8, param4, param1, -17572, param9, param5, param0, param3, param2);
          } else {
            if (GetCountermeasureLauncherProjectiles.field_o < param2) {
              ooa.a(param6, param8, param4, param1, -17572, param9, param5, param0, param3, param2);
            } else {
              if (param4 < ob.field_j) {
                ooa.a(param6, param8, param4, param1, -17572, param9, param5, param0, param3, param2);
              } else {
                if (param4 > GetCountermeasureLauncherProjectiles.field_o) {
                  ooa.a(param6, param8, param4, param1, -17572, param9, param5, param0, param3, param2);
                } else {
                  if (param6 < ob.field_j) {
                    ooa.a(param6, param8, param4, param1, -17572, param9, param5, param0, param3, param2);
                  } else {
                    if (param6 > GetCountermeasureLauncherProjectiles.field_o) {
                      ooa.a(param6, param8, param4, param1, -17572, param9, param5, param0, param3, param2);
                    } else {
                      if (param9 < ob.field_j) {
                        ooa.a(param6, param8, param4, param1, -17572, param9, param5, param0, param3, param2);
                      } else {
                        if (GetCountermeasureLauncherProjectiles.field_o < param9) {
                          ooa.a(param6, param8, param4, param1, -17572, param9, param5, param0, param3, param2);
                        } else {
                          if (NebulaField.field_c > param1) {
                            ooa.a(param6, param8, param4, param1, -17572, param9, param5, param0, param3, param2);
                          } else {
                            if (param1 > hab.field_i) {
                              ooa.a(param6, param8, param4, param1, -17572, param9, param5, param0, param3, param2);
                            } else {
                              if (param5 < NebulaField.field_c) {
                                ooa.a(param6, param8, param4, param1, -17572, param9, param5, param0, param3, param2);
                              } else {
                                if (hab.field_i < param5) {
                                  ooa.a(param6, param8, param4, param1, -17572, param9, param5, param0, param3, param2);
                                } else {
                                  if (param0 < NebulaField.field_c) {
                                    ooa.a(param6, param8, param4, param1, -17572, param9, param5, param0, param3, param2);
                                  } else {
                                    if (param0 > hab.field_i) {
                                      ooa.a(param6, param8, param4, param1, -17572, param9, param5, param0, param3, param2);
                                    } else {
                                      if (param8 < NebulaField.field_c) {
                                        ooa.a(param6, param8, param4, param1, -17572, param9, param5, param0, param3, param2);
                                      } else {
                                        if (hab.field_i >= param8) {
                                          lia.a(param4, param0, param5, param2, param6, param3, param8, param9, param1, (byte) -57);
                                        } else {
                                          ooa.a(param6, param8, param4, param1, -17572, param9, param5, param0, param3, param2);
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_2_0 = null;
        ConsoleValue stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard <= -119) {
            stackIn_4_0 = new ConsoleValue(GetLaserFireForce.a(88, 77));
            return stackIn_4_0;
          }
          stackIn_2_0 = (ConsoleValue) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("pqa.A(");
          if (arguments == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
          field_p = (String) null;
          field_p = null;
          field_o = null;
          return;
        }
        field_p = null;
        field_o = null;
    }

    static {
        field_p = "Mute this player for 48 hours";
    }
}
