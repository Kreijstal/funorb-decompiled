/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kl {
    static String field_d;
    static String field_b;
    static int[] field_c;
    static String[] field_a;

    final static bi a(int param0) {
        bi var1 = new bi(e.field_e, uf.field_k, vg.field_I[0], b.field_b[0], ij.field_H[0], ob.field_a[0], of.field_d[0], rd.field_d);
        c.o(-28210);
        int var2 = -70 / ((param0 - 76) / 39);
        return var1;
    }

    final static dd a(int param0, rh param1, String param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        dd stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 252) {
                break L1;
              } else {
                kl.a(122);
                break L1;
              }
            }
            var4_int = param1.a(param2, (byte) -100);
            var5 = param1.a(param3, (byte) -15, var4_int);
            stackIn_3_0 = vb.a(param0 ^ -141, param1, var4_int, var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("kl.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void b(int param0) {
        int var1_int = 0;
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var4 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              bl.b();
              bj.field_l = 11;
              h.field_b = new int[260];
              var1_int = 0;
              if (param0 == 31207) {
                break L1;
              } else {
                kl.a(38);
                break L1;
              }
            }
            L2: while (true) {
              if (var1_int >= 256) {
                var5 = 256;
                var1_int = var5;
                L3: while (true) {
                  if (var5 >= h.field_b.length) {
                    break L0;
                  } else {
                    h.field_b[var5] = 255;
                    var5++;
                    continue L3;
                  }
                }
              } else {
                var2 = 15.0;
                h.field_b[var1_int] = (int)(Math.pow((double)((float)var1_int / 256.0f), var2) * 255.0);
                var1_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var1), "kl.D(" + param0 + ')');
        }
    }

    final static char a(byte param0, char param1) {
        int var2;
        int var3;
        L0: {
          var3 = fleas.field_A ? 1 : 0;
          if (param0 == -78) {
            break L0;
          } else {
            field_b = (String) null;
            break L0;
          }
        }
        L1: {
          var2 = param1;
          if ((var2 ^ -1) == -33) {
            break L1;
          } else {
            if (-161 != (var2 ^ -1)) {
              if (-96 != (var2 ^ -1)) {
                if ((var2 ^ -1) != -46) {
                  L2: {
                    if (91 != var2) {
                      if (93 != var2) {
                        if (var2 == 35) {
                          break L2;
                        } else {
                          L3: {
                            if (224 != var2) {
                              if (225 == var2) {
                                break L3;
                              } else {
                                if (226 != var2) {
                                  if ((var2 ^ -1) != -229) {
                                    if (227 != var2) {
                                      if (-193 == (var2 ^ -1)) {
                                        break L3;
                                      } else {
                                        if (-194 != (var2 ^ -1)) {
                                          if ((var2 ^ -1) == -195) {
                                            break L3;
                                          } else {
                                            if (var2 == 196) {
                                              break L3;
                                            } else {
                                              if (var2 == 195) {
                                                break L3;
                                              } else {
                                                L4: {
                                                  if ((var2 ^ -1) == -233) {
                                                    break L4;
                                                  } else {
                                                    if (233 != var2) {
                                                      if (-235 == (var2 ^ -1)) {
                                                        break L4;
                                                      } else {
                                                        if (var2 != 235) {
                                                          if ((var2 ^ -1) == -201) {
                                                            break L4;
                                                          } else {
                                                            if (-202 == (var2 ^ -1)) {
                                                              break L4;
                                                            } else {
                                                              if ((var2 ^ -1) == -203) {
                                                                break L4;
                                                              } else {
                                                                if ((var2 ^ -1) == -204) {
                                                                  break L4;
                                                                } else {
                                                                  L5: {
                                                                    if ((var2 ^ -1) != -238) {
                                                                      if (-239 != (var2 ^ -1)) {
                                                                        if (-240 != (var2 ^ -1)) {
                                                                          if (var2 != 205) {
                                                                            if ((var2 ^ -1) == -207) {
                                                                              break L5;
                                                                            } else {
                                                                              if (207 == var2) {
                                                                                break L5;
                                                                              } else {
                                                                                L6: {
                                                                                  if (-243 == (var2 ^ -1)) {
                                                                                    break L6;
                                                                                  } else {
                                                                                    if ((var2 ^ -1) == -244) {
                                                                                      break L6;
                                                                                    } else {
                                                                                      if (244 != var2) {
                                                                                        if (246 != var2) {
                                                                                          if (var2 != 245) {
                                                                                            if (210 == var2) {
                                                                                              break L6;
                                                                                            } else {
                                                                                              if (var2 != 211) {
                                                                                                if (212 != var2) {
                                                                                                  if (var2 != 214) {
                                                                                                    if (-214 == (var2 ^ -1)) {
                                                                                                      break L6;
                                                                                                    } else {
                                                                                                      L7: {
                                                                                                        if (var2 == 249) {
                                                                                                          break L7;
                                                                                                        } else {
                                                                                                          if (-251 == (var2 ^ -1)) {
                                                                                                            break L7;
                                                                                                          } else {
                                                                                                            if (var2 != 251) {
                                                                                                              if (var2 != 252) {
                                                                                                                if (-218 != (var2 ^ -1)) {
                                                                                                                  if (218 != var2) {
                                                                                                                    if ((var2 ^ -1) == -220) {
                                                                                                                      break L7;
                                                                                                                    } else {
                                                                                                                      if ((var2 ^ -1) != -221) {
                                                                                                                        L8: {
                                                                                                                          if (var2 == 231) {
                                                                                                                            break L8;
                                                                                                                          } else {
                                                                                                                            if (var2 == 199) {
                                                                                                                              break L8;
                                                                                                                            } else {
                                                                                                                              L9: {
                                                                                                                                if (var2 == 255) {
                                                                                                                                  break L9;
                                                                                                                                } else {
                                                                                                                                  if ((var2 ^ -1) != -377) {
                                                                                                                                    L10: {
                                                                                                                                      if (-242 != (var2 ^ -1)) {
                                                                                                                                        if ((var2 ^ -1) == -210) {
                                                                                                                                          break L10;
                                                                                                                                        } else {
                                                                                                                                          if (223 != var2) {
                                                                                                                                            return Character.toLowerCase(param1);
                                                                                                                                          } else {
                                                                                                                                            return 'b';
                                                                                                                                          }
                                                                                                                                        }
                                                                                                                                      } else {
                                                                                                                                        break L10;
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                    return 'n';
                                                                                                                                  } else {
                                                                                                                                    break L9;
                                                                                                                                  }
                                                                                                                                }
                                                                                                                              }
                                                                                                                              return 'y';
                                                                                                                            }
                                                                                                                          }
                                                                                                                        }
                                                                                                                        return 'c';
                                                                                                                      } else {
                                                                                                                        break L7;
                                                                                                                      }
                                                                                                                    }
                                                                                                                  } else {
                                                                                                                    break L7;
                                                                                                                  }
                                                                                                                } else {
                                                                                                                  break L7;
                                                                                                                }
                                                                                                              } else {
                                                                                                                break L7;
                                                                                                              }
                                                                                                            } else {
                                                                                                              break L7;
                                                                                                            }
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                      return 'u';
                                                                                                    }
                                                                                                  } else {
                                                                                                    break L6;
                                                                                                  }
                                                                                                } else {
                                                                                                  break L6;
                                                                                                }
                                                                                              } else {
                                                                                                break L6;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            break L6;
                                                                                          }
                                                                                        } else {
                                                                                          break L6;
                                                                                        }
                                                                                      } else {
                                                                                        break L6;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                return 'o';
                                                                              }
                                                                            }
                                                                          } else {
                                                                            break L5;
                                                                          }
                                                                        } else {
                                                                          break L5;
                                                                        }
                                                                      } else {
                                                                        break L5;
                                                                      }
                                                                    } else {
                                                                      break L5;
                                                                    }
                                                                  }
                                                                  return 'i';
                                                                }
                                                              }
                                                            }
                                                          }
                                                        } else {
                                                          break L4;
                                                        }
                                                      }
                                                    } else {
                                                      break L4;
                                                    }
                                                  }
                                                }
                                                return 'e';
                                              }
                                            }
                                          }
                                        } else {
                                          break L3;
                                        }
                                      }
                                    } else {
                                      break L3;
                                    }
                                  } else {
                                    break L3;
                                  }
                                } else {
                                  break L3;
                                }
                              }
                            } else {
                              break L3;
                            }
                          }
                          return 'a';
                        }
                      } else {
                        break L2;
                      }
                    } else {
                      break L2;
                    }
                  }
                  return param1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            } else {
              break L1;
            }
          }
        }
        return '_';
    }

    public static void a(byte param0) {
        field_b = null;
        field_c = null;
        field_a = null;
        field_d = null;
        if (param0 != -24) {
            field_d = (String) null;
        }
    }

    static {
        field_d = "<%0>Spring:<%1> when a flea stands on top of a spring it is catapulted upwards until it hits an obstacle, at which point it falls back down to land on the spring again.";
        field_b = "Fleas: <%0>";
        field_a = new String[]{"The fleas must be saved!<br><br>Click on \"Right Slope\", then click in the highlighted area to start placing slopes for them to climb.", "Stop the fleas from drowning by placing a block between them and the water.", "Bombs explode on contact, destroying everything nearby... except the fleas.", "This is a Teleporter. It lets you get fleas to places that they could otherwise not reach.", "Fans blow fleas sideways, allowing them to get past certain obstacles... or pushing them into other obstacles!", "Gravity. It's just a theory, honest. Change its direction by getting a flea to touch the arrows.", "The first flea to touch one of these tiles will bounce off, destroying the tile in the process.", "This is a balloon and a landing pad. The balloon will always rise up to the next landing pad, regardless of any tiles in the way.", "These green switches turn recessed walls into normal blocks, drastically changing the layout of the level.", "These are spiders! They are nasty, and eat every flea that walks underneath them. You must find a way around them, or kill them with a bomb!", "", "", "", "", ""};
        field_c = new int[8192];
    }
}
