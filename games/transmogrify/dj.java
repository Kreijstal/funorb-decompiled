/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dj {
    static String field_a;
    static StringBuilder field_b;
    static String field_c;

    abstract byte[] a(boolean param0);

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        if (param0 != 48) {
            return;
        }
        field_b = null;
    }

    final static String a(CharSequence param0, byte param1) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        String stackIn_28_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        StringBuilder var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = 55 % ((-79 - param1) / 36);
                        var3 = param0.length();
                        var4 = new StringBuilder(var3);
                        var5 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((var3 ^ -1) >= (var5 ^ -1)) {
                            statePc = 27;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var6 = param0.charAt(var5);
                        if (var6 < 97) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var6 <= 122) {
                            statePc = 23;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var6 < 48) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var6 <= 57) {
                            statePc = 24;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var6 < 65) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (90 < var6) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        discarded$0 = var4.append((char)(32 + var6));
                        if (var8 == 0) {
                            statePc = 26;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var6 == 43) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var6 != 38) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        discarded$1 = var4.append('+');
                        if (var8 == 0) {
                            statePc = 26;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var7 = var4.length();
                        if (0 >= var7) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (-96 == (var4.charAt(-1 + var7) ^ -1)) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        discarded$2 = var4.append('_');
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var8 == 0) {
                            statePc = 26;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        discarded$3 = var4.append((char) var6);
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        discarded$4 = var4.append((char) var6);
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        discarded$5 = var4.append((char) var6);
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var5++;
                        if (var8 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackIn_28_0 = var4.toString();
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 28: {
                    return stackIn_28_0;
                }
                case 29: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_31_0 = (RuntimeException) (var2);
                    stackIn_30_0 = stackIn_31_0;
                    stackIn_31_1 = new StringBuilder().append("dj.E(");
                    stackIn_30_1 = stackIn_31_1;
                    if (param0 == null) {
                        statePc = 31;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    stackIn_32_0 = (RuntimeException) ((Object) stackIn_30_0);
                    stackIn_32_1 = (StringBuilder) ((Object) stackIn_30_1);
                    stackIn_32_2 = "{...}";
                    statePc = 32;
                    continue stateLoop;
                }
                case 31: {
                    stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
                    stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
                    stackIn_32_2 = "null";
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    throw ch.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param1 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(boolean param0, boolean param1) {
        int var2;
        int var3;
        var3 = Transmogrify.field_A ? 1 : 0;
        if ((wj.field_o ^ -1) >= -1) {
          if (!qj.b((byte) 73)) {
            var2 = 1;
            if (var3 == 0) {
              if (null == vg.field_b) {
                if (wc.field_b) {
                  tf.a((byte) 46, param1, var2);
                  if (param0) {
                    return;
                  } else {
                    dj.b(1);
                    return;
                  }
                } else {
                  if (param0) {
                    return;
                  } else {
                    dj.b(1);
                    return;
                  }
                }
              } else {
                if (param0) {
                  return;
                } else {
                  dj.b(1);
                  return;
                }
              }
            } else {
              var2 = 0;
              if (var3 == 0) {
                L0: {
                  if (null != vg.field_b) {
                    break L0;
                  } else {
                    if (!wc.field_b) {
                      break L0;
                    } else {
                      tf.a((byte) 46, param1, var2);
                      if (param0) {
                        return;
                      } else {
                        dj.b(1);
                        return;
                      }
                    }
                  }
                }
                if (param0) {
                  return;
                } else {
                  dj.b(1);
                  return;
                }
              } else {
                if (vg.field_b == null) {
                  L1: {
                    L2: {
                      ub.field_c = ql.a(0, 0, lk.field_b, 0, 640, 480);
                      if (null != ub.field_c) {
                        break L2;
                      } else {
                        var2 = 3;
                        if (var3 == 0) {
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                    var2 = 2;
                    cj.a(ub.field_c, 13861);
                    break L1;
                  }
                  L3: {
                    if (null != vg.field_b) {
                      break L3;
                    } else {
                      if (!wc.field_b) {
                        break L3;
                      } else {
                        tf.a((byte) 46, param1, var2);
                        if (param0) {
                          return;
                        } else {
                          dj.b(1);
                          return;
                        }
                      }
                    }
                  }
                  if (param0) {
                    return;
                  } else {
                    dj.b(1);
                    return;
                  }
                } else {
                  ub.field_c = vg.field_b.d((byte) -18);
                  kc.a(-14226, 2);
                  if (var3 == 0) {
                    L4: {
                      L5: {
                        if (null != ub.field_c) {
                          break L5;
                        } else {
                          var2 = 3;
                          if (var3 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var2 = 2;
                      cj.a(ub.field_c, 13861);
                      break L4;
                    }
                    L6: {
                      if (null != vg.field_b) {
                        break L6;
                      } else {
                        if (!wc.field_b) {
                          break L6;
                        } else {
                          tf.a((byte) 46, param1, var2);
                          if (param0) {
                            return;
                          } else {
                            dj.b(1);
                            return;
                          }
                        }
                      }
                    }
                    if (param0) {
                      return;
                    } else {
                      dj.b(1);
                      return;
                    }
                  } else {
                    L7: {
                      L8: {
                        ub.field_c = ql.a(0, 0, lk.field_b, 0, 640, 480);
                        if (null != ub.field_c) {
                          break L8;
                        } else {
                          var2 = 3;
                          if (var3 == 0) {
                            break L7;
                          } else {
                            break L8;
                          }
                        }
                      }
                      var2 = 2;
                      cj.a(ub.field_c, 13861);
                      break L7;
                    }
                    L9: {
                      if (null != vg.field_b) {
                        break L9;
                      } else {
                        if (!wc.field_b) {
                          break L9;
                        } else {
                          tf.a((byte) 46, param1, var2);
                          if (param0) {
                            return;
                          } else {
                            dj.b(1);
                            return;
                          }
                        }
                      }
                    }
                    if (param0) {
                      return;
                    } else {
                      dj.b(1);
                      return;
                    }
                  }
                }
              }
            }
          } else {
            var2 = 0;
            if (var3 == 0) {
              L10: {
                if (null != vg.field_b) {
                  break L10;
                } else {
                  if (!wc.field_b) {
                    break L10;
                  } else {
                    tf.a((byte) 46, param1, var2);
                    if (param0) {
                      return;
                    } else {
                      dj.b(1);
                      return;
                    }
                  }
                }
              }
              if (param0) {
                return;
              } else {
                dj.b(1);
                return;
              }
            } else {
              if (vg.field_b == null) {
                L11: {
                  L12: {
                    ub.field_c = ql.a(0, 0, lk.field_b, 0, 640, 480);
                    if (null != ub.field_c) {
                      break L12;
                    } else {
                      var2 = 3;
                      if (var3 == 0) {
                        break L11;
                      } else {
                        break L12;
                      }
                    }
                  }
                  var2 = 2;
                  cj.a(ub.field_c, 13861);
                  break L11;
                }
                L13: {
                  if (null != vg.field_b) {
                    break L13;
                  } else {
                    if (!wc.field_b) {
                      break L13;
                    } else {
                      tf.a((byte) 46, param1, var2);
                      if (param0) {
                        return;
                      } else {
                        dj.b(1);
                        return;
                      }
                    }
                  }
                }
                if (param0) {
                  return;
                } else {
                  dj.b(1);
                  return;
                }
              } else {
                ub.field_c = vg.field_b.d((byte) -18);
                kc.a(-14226, 2);
                if (var3 == 0) {
                  L14: {
                    L15: {
                      if (null != ub.field_c) {
                        break L15;
                      } else {
                        var2 = 3;
                        if (var3 == 0) {
                          break L14;
                        } else {
                          break L15;
                        }
                      }
                    }
                    var2 = 2;
                    cj.a(ub.field_c, 13861);
                    break L14;
                  }
                  if (null == vg.field_b) {
                    if (wc.field_b) {
                      tf.a((byte) 46, param1, var2);
                      if (param0) {
                        return;
                      } else {
                        dj.b(1);
                        return;
                      }
                    } else {
                      if (param0) {
                        return;
                      } else {
                        dj.b(1);
                        return;
                      }
                    }
                  } else {
                    if (param0) {
                      return;
                    } else {
                      dj.b(1);
                      return;
                    }
                  }
                } else {
                  L16: {
                    L17: {
                      ub.field_c = ql.a(0, 0, lk.field_b, 0, 640, 480);
                      if (null != ub.field_c) {
                        break L17;
                      } else {
                        var2 = 3;
                        if (var3 == 0) {
                          break L16;
                        } else {
                          break L17;
                        }
                      }
                    }
                    var2 = 2;
                    cj.a(ub.field_c, 13861);
                    break L16;
                  }
                  L18: {
                    if (null != vg.field_b) {
                      break L18;
                    } else {
                      if (!wc.field_b) {
                        break L18;
                      } else {
                        tf.a((byte) 46, param1, var2);
                        if (param0) {
                          return;
                        } else {
                          dj.b(1);
                          return;
                        }
                      }
                    }
                  }
                  if (param0) {
                    return;
                  } else {
                    dj.b(1);
                    return;
                  }
                }
              }
            }
          }
        } else {
          if (vg.field_b == null) {
            L19: {
              L20: {
                ub.field_c = ql.a(0, 0, lk.field_b, 0, 640, 480);
                if (null != ub.field_c) {
                  break L20;
                } else {
                  var2 = 3;
                  if (var3 == 0) {
                    break L19;
                  } else {
                    break L20;
                  }
                }
              }
              var2 = 2;
              cj.a(ub.field_c, 13861);
              break L19;
            }
            L21: {
              if (null != vg.field_b) {
                break L21;
              } else {
                if (!wc.field_b) {
                  break L21;
                } else {
                  tf.a((byte) 46, param1, var2);
                  if (param0) {
                    return;
                  } else {
                    dj.b(1);
                    return;
                  }
                }
              }
            }
            if (param0) {
              return;
            } else {
              dj.b(1);
              return;
            }
          } else {
            ub.field_c = vg.field_b.d((byte) -18);
            kc.a(-14226, 2);
            if (var3 == 0) {
              L22: {
                L23: {
                  if (null != ub.field_c) {
                    break L23;
                  } else {
                    var2 = 3;
                    if (var3 == 0) {
                      break L22;
                    } else {
                      break L23;
                    }
                  }
                }
                var2 = 2;
                cj.a(ub.field_c, 13861);
                break L22;
              }
              L24: {
                if (null != vg.field_b) {
                  break L24;
                } else {
                  if (!wc.field_b) {
                    break L24;
                  } else {
                    tf.a((byte) 46, param1, var2);
                    if (param0) {
                      return;
                    } else {
                      dj.b(1);
                      return;
                    }
                  }
                }
              }
              if (param0) {
                return;
              } else {
                dj.b(1);
                return;
              }
            } else {
              L25: {
                L26: {
                  ub.field_c = ql.a(0, 0, lk.field_b, 0, 640, 480);
                  if (null != ub.field_c) {
                    break L26;
                  } else {
                    var2 = 3;
                    if (var3 == 0) {
                      break L25;
                    } else {
                      break L26;
                    }
                  }
                }
                var2 = 2;
                cj.a(ub.field_c, 13861);
                break L25;
              }
              L27: {
                if (null != vg.field_b) {
                  break L27;
                } else {
                  if (!wc.field_b) {
                    break L27;
                  } else {
                    tf.a((byte) 46, param1, var2);
                    if (param0) {
                      return;
                    } else {
                      dj.b(1);
                      return;
                    }
                  }
                }
              }
              if (param0) {
                return;
              } else {
                dj.b(1);
                return;
              }
            }
          }
        }
    }

    final static byte[] a(int param0, hj param1, byte[] param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        byte[] stackIn_3_0 = null;
        Object stackIn_6_0 = null;
        byte[] stackIn_21_0 = null;
        byte[] stackIn_24_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4_int = param1.k(param3, 1522829539);
                        if (param0 == -39) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = (byte[]) null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    try {
                        if ((var4_int ^ -1) != -1) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_6_0 = null;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return (byte[]) ((Object) stackIn_6_0);
                }
                case 7: {
                    try {
                        if (param2 == null) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if ((var4_int ^ -1) != (param2.length ^ -1)) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        param2 = new byte[var4_int];
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var5 = param1.k(3, 1522829539);
                        var6 = (byte)param1.k(8, 1522829539);
                        if ((var5 ^ -1) < -1) {
                            statePc = 18;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var7 = 0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var4_int <= var7) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        param2[var7] = (byte)var6;
                        var7++;
                        if (var8 != 0) {
                            statePc = 23;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var8 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var8 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var7 = 0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var4_int <= var7) {
                            statePc = 23;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackIn_24_0 = (byte[]) (param2);
                        stackIn_21_0 = stackIn_24_0;
                        if (var8 != 0) {
                            statePc = 24;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackIn_21_0[var7] = (byte)(param1.k(var5, ak.a(param0, -1522829510)) + var6);
                        var7++;
                        if (var8 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackIn_24_0 = (byte[]) (param2);
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 24: {
                    return stackIn_24_0;
                }
                case 25: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_27_0 = (RuntimeException) (var4);
                    stackIn_26_0 = stackIn_27_0;
                    stackIn_27_1 = new StringBuilder().append("dj.F(").append(param0).append(',');
                    stackIn_26_1 = stackIn_27_1;
                    if (param1 == null) {
                        statePc = 27;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    stackIn_28_0 = (RuntimeException) ((Object) stackIn_26_0);
                    stackIn_28_1 = (StringBuilder) ((Object) stackIn_26_1);
                    stackIn_28_2 = "{...}";
                    statePc = 28;
                    continue stateLoop;
                }
                case 27: {
                    stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
                    stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
                    stackIn_28_2 = "null";
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    stackIn_30_0 = (RuntimeException) ((Object) stackIn_28_0);
                    stackIn_29_0 = stackIn_30_0;
                    stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');
                    stackIn_29_1 = stackIn_30_1;
                    if (param2 == null) {
                        statePc = 30;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    stackIn_31_0 = (RuntimeException) ((Object) stackIn_29_0);
                    stackIn_31_1 = (StringBuilder) ((Object) stackIn_29_1);
                    stackIn_31_2 = "{...}";
                    statePc = 31;
                    continue stateLoop;
                }
                case 30: {
                    stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
                    stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
                    stackIn_31_2 = "null";
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    throw ch.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param3 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static boolean a(char param0, boolean param1) {
        if (!param1) {
            return false;
        }
        if (param0 < 48) {
            return false;
        }
        if (57 < param0) {
            return false;
        }
        return true;
    }

    abstract void a(byte[] param0, byte param1);

    final static int a(boolean param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_9_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((param1 ^ -1) >= -1) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var3_int = var3_int << 1782217825 | 1 & param2;
                        param1--;
                        param2 = param2 >>> 1;
                        if (var4 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var4 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (param0) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        field_b = (StringBuilder) null;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackIn_9_0 = var3_int;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return stackIn_9_0;
                }
                case 10: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    throw ch.a((Throwable) ((Object) var3), "dj.G(" + param0 + ',' + param1 + ',' + param2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(boolean param0, String[] param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                field_a = (String) null;
                break L1;
              }
            }
            L2: {
              if (ta.field_f != null) {
                ta.field_f.field_D.a(param1, 17036);
                break L2;
              } else {
                break L2;
              }
            }
            if (null != ca.field_g) {
              ca.field_g.field_B.a(param1, 17036);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var2);

            stackIn_11_1 = new StringBuilder().append("dj.J(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    final static boolean b(int param0) {
        pd.field_b = true;
        if (param0 != -1) {
            return false;
        }
        qf.field_b = lk.a(param0 + 1) - -15000L;
        return 11 == gl.field_y ? true : false;
    }

    static {
        field_a = "Waiting for fonts";
        field_b = new StringBuilder(12);
    }
}
