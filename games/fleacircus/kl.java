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
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var1 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = fleas.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        bl.b();
                        bj.field_l = 11;
                        h.field_b = new int[260];
                        var1_int = 0;
                        if (param0 == 31207) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        kl.a(38);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (var1_int >= 256) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var2 = 15.0;
                        h.field_b[var1_int] = (int)(Math.pow((double)((float)var1_int / 256.0f), var2) * 255.0);
                        var1_int++;
                        if (var4 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var4 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var1_int = 256;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var1_int >= h.field_b.length) {
                            statePc = 14;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        h.field_b[var1_int] = 255;
                        var1_int++;
                        if (var4 != 0) {
                            statePc = 15;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var4 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    var1 = (RuntimeException) ((Object) caughtException);
                    throw pf.a((Throwable) ((Object) var1), "kl.D(" + param0 + ')');
                }
                case 14: {
                    return;
                }
                case 15: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
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
        var2 = param1;
        if ((var2 ^ -1) != -33) {
          L1: {
            if (-161 != (var2 ^ -1)) {
              break L1;
            } else {
              if (var3 != 0) {
                break L1;
              } else {
                return '_';
              }
            }
          }
          L2: {
            if (-96 != (var2 ^ -1)) {
              break L2;
            } else {
              if (var3 != 0) {
                break L2;
              } else {
                return '_';
              }
            }
          }
          L3: {
            if ((var2 ^ -1) != -46) {
              break L3;
            } else {
              if (var3 != 0) {
                break L3;
              } else {
                return '_';
              }
            }
          }
          L4: {
            if (91 != var2) {
              break L4;
            } else {
              if (var3 != 0) {
                break L4;
              } else {
                return param1;
              }
            }
          }
          L5: {
            if (93 != var2) {
              break L5;
            } else {
              if (var3 != 0) {
                break L5;
              } else {
                return param1;
              }
            }
          }
          if (var2 != 35) {
            L6: {
              if (224 != var2) {
                break L6;
              } else {
                if (var3 != 0) {
                  break L6;
                } else {
                  return 'a';
                }
              }
            }
            if (225 != var2) {
              L7: {
                if (226 != var2) {
                  break L7;
                } else {
                  if (var3 != 0) {
                    break L7;
                  } else {
                    return 'a';
                  }
                }
              }
              L8: {
                if ((var2 ^ -1) != -229) {
                  break L8;
                } else {
                  if (var3 != 0) {
                    break L8;
                  } else {
                    return 'a';
                  }
                }
              }
              L9: {
                if (227 != var2) {
                  break L9;
                } else {
                  if (var3 != 0) {
                    break L9;
                  } else {
                    return 'a';
                  }
                }
              }
              if (-193 != (var2 ^ -1)) {
                L10: {
                  if (-194 != (var2 ^ -1)) {
                    break L10;
                  } else {
                    if (var3 != 0) {
                      break L10;
                    } else {
                      return 'a';
                    }
                  }
                }
                if ((var2 ^ -1) != -195) {
                  if (var2 != 196) {
                    if (var2 != 195) {
                      if ((var2 ^ -1) != -233) {
                        L11: {
                          if (233 != var2) {
                            break L11;
                          } else {
                            if (var3 != 0) {
                              break L11;
                            } else {
                              return 'e';
                            }
                          }
                        }
                        if (-235 != (var2 ^ -1)) {
                          L12: {
                            if (var2 != 235) {
                              break L12;
                            } else {
                              if (var3 != 0) {
                                break L12;
                              } else {
                                return 'e';
                              }
                            }
                          }
                          if ((var2 ^ -1) != -201) {
                            if (-202 != (var2 ^ -1)) {
                              if ((var2 ^ -1) != -203) {
                                if ((var2 ^ -1) != -204) {
                                  L13: {
                                    if ((var2 ^ -1) != -238) {
                                      break L13;
                                    } else {
                                      if (var3 != 0) {
                                        break L13;
                                      } else {
                                        return 'i';
                                      }
                                    }
                                  }
                                  L14: {
                                    if (-239 != (var2 ^ -1)) {
                                      break L14;
                                    } else {
                                      if (var3 != 0) {
                                        break L14;
                                      } else {
                                        return 'i';
                                      }
                                    }
                                  }
                                  L15: {
                                    if (-240 != (var2 ^ -1)) {
                                      break L15;
                                    } else {
                                      if (var3 != 0) {
                                        break L15;
                                      } else {
                                        return 'i';
                                      }
                                    }
                                  }
                                  L16: {
                                    if (var2 != 205) {
                                      break L16;
                                    } else {
                                      if (var3 != 0) {
                                        break L16;
                                      } else {
                                        return 'i';
                                      }
                                    }
                                  }
                                  if ((var2 ^ -1) != -207) {
                                    if (207 == var2) {
                                      return 'i';
                                    } else {
                                      L17: {
                                        if (-243 == (var2 ^ -1)) {
                                          break L17;
                                        } else {
                                          if ((var2 ^ -1) == -244) {
                                            break L17;
                                          } else {
                                            L18: {
                                              if (244 != var2) {
                                                break L18;
                                              } else {
                                                if (var3 == 0) {
                                                  break L17;
                                                } else {
                                                  break L18;
                                                }
                                              }
                                            }
                                            L19: {
                                              if (246 != var2) {
                                                break L19;
                                              } else {
                                                if (var3 == 0) {
                                                  break L17;
                                                } else {
                                                  break L19;
                                                }
                                              }
                                            }
                                            L20: {
                                              if (var2 != 245) {
                                                break L20;
                                              } else {
                                                if (var3 == 0) {
                                                  break L17;
                                                } else {
                                                  break L20;
                                                }
                                              }
                                            }
                                            if (210 == var2) {
                                              break L17;
                                            } else {
                                              L21: {
                                                if (var2 != 211) {
                                                  break L21;
                                                } else {
                                                  if (var3 == 0) {
                                                    break L17;
                                                  } else {
                                                    break L21;
                                                  }
                                                }
                                              }
                                              L22: {
                                                if (212 != var2) {
                                                  break L22;
                                                } else {
                                                  if (var3 == 0) {
                                                    break L17;
                                                  } else {
                                                    break L22;
                                                  }
                                                }
                                              }
                                              L23: {
                                                if (var2 != 214) {
                                                  break L23;
                                                } else {
                                                  if (var3 == 0) {
                                                    break L17;
                                                  } else {
                                                    break L23;
                                                  }
                                                }
                                              }
                                              if (-214 == (var2 ^ -1)) {
                                                break L17;
                                              } else {
                                                L24: {
                                                  if (var2 == 249) {
                                                    break L24;
                                                  } else {
                                                    if (-251 == (var2 ^ -1)) {
                                                      break L24;
                                                    } else {
                                                      L25: {
                                                        if (var2 != 251) {
                                                          break L25;
                                                        } else {
                                                          if (var3 == 0) {
                                                            break L24;
                                                          } else {
                                                            break L25;
                                                          }
                                                        }
                                                      }
                                                      L26: {
                                                        if (var2 != 252) {
                                                          break L26;
                                                        } else {
                                                          if (var3 == 0) {
                                                            break L24;
                                                          } else {
                                                            break L26;
                                                          }
                                                        }
                                                      }
                                                      if (-218 != (var2 ^ -1)) {
                                                        if (218 != var2) {
                                                          if ((var2 ^ -1) == -220) {
                                                            break L24;
                                                          } else {
                                                            if ((var2 ^ -1) != -221) {
                                                              L27: {
                                                                if (var2 == 231) {
                                                                  break L27;
                                                                } else {
                                                                  if (var2 == 199) {
                                                                    break L27;
                                                                  } else {
                                                                    L28: {
                                                                      if (var2 == 255) {
                                                                        break L28;
                                                                      } else {
                                                                        if ((var2 ^ -1) != -377) {
                                                                          L29: {
                                                                            if (-242 != (var2 ^ -1)) {
                                                                              if ((var2 ^ -1) == -210) {
                                                                                break L29;
                                                                              } else {
                                                                                if (223 != var2) {
                                                                                  return Character.toLowerCase(param1);
                                                                                } else {
                                                                                  if (var3 == 0) {
                                                                                    return 'b';
                                                                                  } else {
                                                                                    return '_';
                                                                                  }
                                                                                }
                                                                              }
                                                                            } else {
                                                                              if (var3 == 0) {
                                                                                break L29;
                                                                              } else {
                                                                                if ((var2 ^ -1) == -210) {
                                                                                  return 'n';
                                                                                } else {
                                                                                  if (223 != var2) {
                                                                                    return Character.toLowerCase(param1);
                                                                                  } else {
                                                                                    return '_';
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                          }
                                                                          return 'n';
                                                                        } else {
                                                                          if (var3 == 0) {
                                                                            break L28;
                                                                          } else {
                                                                            if (-242 != (var2 ^ -1)) {
                                                                              if ((var2 ^ -1) == -210) {
                                                                                return 'n';
                                                                              } else {
                                                                                if (223 != var2) {
                                                                                  return Character.toLowerCase(param1);
                                                                                } else {
                                                                                  if (var3 == 0) {
                                                                                    return 'b';
                                                                                  } else {
                                                                                    return '_';
                                                                                  }
                                                                                }
                                                                              }
                                                                            } else {
                                                                              if ((var2 ^ -1) == -210) {
                                                                                return 'n';
                                                                              } else {
                                                                                if (223 != var2) {
                                                                                  return Character.toLowerCase(param1);
                                                                                } else {
                                                                                  return '_';
                                                                                }
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                    return 'y';
                                                                  }
                                                                }
                                                              }
                                                              return 'c';
                                                            } else {
                                                              if (var3 == 0) {
                                                                break L24;
                                                              } else {
                                                                L30: {
                                                                  if (var2 == 231) {
                                                                    break L30;
                                                                  } else {
                                                                    if (var2 == 199) {
                                                                      break L30;
                                                                    } else {
                                                                      if (var2 == 255) {
                                                                        return 'y';
                                                                      } else {
                                                                        if ((var2 ^ -1) != -377) {
                                                                          L31: {
                                                                            if (-242 != (var2 ^ -1)) {
                                                                              if ((var2 ^ -1) == -210) {
                                                                                break L31;
                                                                              } else {
                                                                                if (223 != var2) {
                                                                                  return Character.toLowerCase(param1);
                                                                                } else {
                                                                                  if (var3 == 0) {
                                                                                    return 'b';
                                                                                  } else {
                                                                                    return '_';
                                                                                  }
                                                                                }
                                                                              }
                                                                            } else {
                                                                              if (var3 == 0) {
                                                                                break L31;
                                                                              } else {
                                                                                if ((var2 ^ -1) == -210) {
                                                                                  return 'n';
                                                                                } else {
                                                                                  if (223 != var2) {
                                                                                    return Character.toLowerCase(param1);
                                                                                  } else {
                                                                                    return '_';
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                          }
                                                                          return 'n';
                                                                        } else {
                                                                          if (-242 != (var2 ^ -1)) {
                                                                            if ((var2 ^ -1) == -210) {
                                                                              return 'n';
                                                                            } else {
                                                                              if (223 != var2) {
                                                                                return Character.toLowerCase(param1);
                                                                              } else {
                                                                                if (var3 == 0) {
                                                                                  return 'b';
                                                                                } else {
                                                                                  return '_';
                                                                                }
                                                                              }
                                                                            }
                                                                          } else {
                                                                            if ((var2 ^ -1) == -210) {
                                                                              return 'n';
                                                                            } else {
                                                                              if (223 != var2) {
                                                                                return Character.toLowerCase(param1);
                                                                              } else {
                                                                                return '_';
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                                return 'c';
                                                              }
                                                            }
                                                          }
                                                        } else {
                                                          if (var3 == 0) {
                                                            break L24;
                                                          } else {
                                                            if ((var2 ^ -1) == -220) {
                                                              return 'u';
                                                            } else {
                                                              if ((var2 ^ -1) != -221) {
                                                                L32: {
                                                                  if (var2 == 231) {
                                                                    break L32;
                                                                  } else {
                                                                    if (var2 == 199) {
                                                                      break L32;
                                                                    } else {
                                                                      L33: {
                                                                        if (var2 == 255) {
                                                                          break L33;
                                                                        } else {
                                                                          if ((var2 ^ -1) != -377) {
                                                                            L34: {
                                                                              if (-242 != (var2 ^ -1)) {
                                                                                if ((var2 ^ -1) == -210) {
                                                                                  break L34;
                                                                                } else {
                                                                                  if (223 != var2) {
                                                                                    return Character.toLowerCase(param1);
                                                                                  } else {
                                                                                    if (var3 == 0) {
                                                                                      return 'b';
                                                                                    } else {
                                                                                      return '_';
                                                                                    }
                                                                                  }
                                                                                }
                                                                              } else {
                                                                                if (var3 == 0) {
                                                                                  break L34;
                                                                                } else {
                                                                                  if ((var2 ^ -1) == -210) {
                                                                                    return 'n';
                                                                                  } else {
                                                                                    if (223 != var2) {
                                                                                      return Character.toLowerCase(param1);
                                                                                    } else {
                                                                                      return '_';
                                                                                    }
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            return 'n';
                                                                          } else {
                                                                            if (var3 == 0) {
                                                                              break L33;
                                                                            } else {
                                                                              L35: {
                                                                                if (-242 != (var2 ^ -1)) {
                                                                                  break L35;
                                                                                } else {
                                                                                  break L35;
                                                                                }
                                                                              }
                                                                              if ((var2 ^ -1) == -210) {
                                                                                return 'n';
                                                                              } else {
                                                                                if (223 != var2) {
                                                                                  return Character.toLowerCase(param1);
                                                                                } else {
                                                                                  if (var3 == 0) {
                                                                                    return 'b';
                                                                                  } else {
                                                                                    return '_';
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                      return 'y';
                                                                    }
                                                                  }
                                                                }
                                                                return 'c';
                                                              } else {
                                                                L36: {
                                                                  if (var2 == 231) {
                                                                    break L36;
                                                                  } else {
                                                                    if (var2 == 199) {
                                                                      break L36;
                                                                    } else {
                                                                      if (var2 == 255) {
                                                                        return 'y';
                                                                      } else {
                                                                        L37: {
                                                                          if ((var2 ^ -1) != -377) {
                                                                            break L37;
                                                                          } else {
                                                                            break L37;
                                                                          }
                                                                        }
                                                                        L38: {
                                                                          L39: {
                                                                            if (-242 != (var2 ^ -1)) {
                                                                              break L39;
                                                                            } else {
                                                                              if (var3 == 0) {
                                                                                break L38;
                                                                              } else {
                                                                                break L39;
                                                                              }
                                                                            }
                                                                          }
                                                                          if ((var2 ^ -1) == -210) {
                                                                            break L38;
                                                                          } else {
                                                                            if (223 != var2) {
                                                                              return Character.toLowerCase(param1);
                                                                            } else {
                                                                              if (var3 == 0) {
                                                                                return 'b';
                                                                              } else {
                                                                                return '_';
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                        return 'n';
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                                return 'c';
                                                              }
                                                            }
                                                          }
                                                        }
                                                      } else {
                                                        if (var3 == 0) {
                                                          break L24;
                                                        } else {
                                                          L40: {
                                                            if (218 != var2) {
                                                              break L40;
                                                            } else {
                                                              break L40;
                                                            }
                                                          }
                                                          L41: {
                                                            if ((var2 ^ -1) == -220) {
                                                              break L41;
                                                            } else {
                                                              L42: {
                                                                if ((var2 ^ -1) != -221) {
                                                                  break L42;
                                                                } else {
                                                                  if (var3 == 0) {
                                                                    break L41;
                                                                  } else {
                                                                    break L42;
                                                                  }
                                                                }
                                                              }
                                                              L43: {
                                                                if (var2 == 231) {
                                                                  break L43;
                                                                } else {
                                                                  if (var2 == 199) {
                                                                    break L43;
                                                                  } else {
                                                                    L44: {
                                                                      if (var2 == 255) {
                                                                        break L44;
                                                                      } else {
                                                                        L45: {
                                                                          if ((var2 ^ -1) != -377) {
                                                                            break L45;
                                                                          } else {
                                                                            if (var3 == 0) {
                                                                              break L44;
                                                                            } else {
                                                                              break L45;
                                                                            }
                                                                          }
                                                                        }
                                                                        L46: {
                                                                          L47: {
                                                                            if (-242 != (var2 ^ -1)) {
                                                                              break L47;
                                                                            } else {
                                                                              if (var3 == 0) {
                                                                                break L46;
                                                                              } else {
                                                                                break L47;
                                                                              }
                                                                            }
                                                                          }
                                                                          if ((var2 ^ -1) == -210) {
                                                                            break L46;
                                                                          } else {
                                                                            if (223 != var2) {
                                                                              return Character.toLowerCase(param1);
                                                                            } else {
                                                                              if (var3 == 0) {
                                                                                return 'b';
                                                                              } else {
                                                                                return '_';
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                        return 'n';
                                                                      }
                                                                    }
                                                                    return 'y';
                                                                  }
                                                                }
                                                              }
                                                              return 'c';
                                                            }
                                                          }
                                                          return 'u';
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                                return 'u';
                                              }
                                            }
                                          }
                                        }
                                      }
                                      return 'o';
                                    }
                                  } else {
                                    return 'i';
                                  }
                                } else {
                                  return 'e';
                                }
                              } else {
                                return 'e';
                              }
                            } else {
                              return 'e';
                            }
                          } else {
                            return 'e';
                          }
                        } else {
                          return 'e';
                        }
                      } else {
                        return 'e';
                      }
                    } else {
                      return 'a';
                    }
                  } else {
                    return 'a';
                  }
                } else {
                  return 'a';
                }
              } else {
                return 'a';
              }
            } else {
              return 'a';
            }
          } else {
            return param1;
          }
        } else {
          return '_';
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_c = null;
        field_a = null;
        field_d = null;
        if (param0 == -24) {
            return;
        }
        field_d = (String) null;
    }

    static {
        field_d = "<%0>Spring:<%1> when a flea stands on top of a spring it is catapulted upwards until it hits an obstacle, at which point it falls back down to land on the spring again.";
        field_b = "Fleas: <%0>";
        field_a = new String[]{"The fleas must be saved!<br><br>Click on \"Right Slope\", then click in the highlighted area to start placing slopes for them to climb.", "Stop the fleas from drowning by placing a block between them and the water.", "Bombs explode on contact, destroying everything nearby... except the fleas.", "This is a Teleporter. It lets you get fleas to places that they could otherwise not reach.", "Fans blow fleas sideways, allowing them to get past certain obstacles... or pushing them into other obstacles!", "Gravity. It's just a theory, honest. Change its direction by getting a flea to touch the arrows.", "The first flea to touch one of these tiles will bounce off, destroying the tile in the process.", "This is a balloon and a landing pad. The balloon will always rise up to the next landing pad, regardless of any tiles in the way.", "These green switches turn recessed walls into normal blocks, drastically changing the layout of the level.", "These are spiders! They are nasty, and eat every flea that walks underneath them. You must find a way around them, or kill them with a bomb!", "", "", "", "", ""};
        field_c = new int[8192];
    }
}
