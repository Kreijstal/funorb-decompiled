/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class on {
    static String field_i;
    private pf field_d;
    static boolean field_b;
    static gq field_g;
    private oh field_e;
    static int field_c;
    static String field_f;
    static String field_a;
    static String field_h;

    final oh c(int param0) {
        oh var2 = ((on) this).field_d.field_h.field_e;
        int var3 = -32 % ((25 - param0) / 37);
        if (!(((on) this).field_d.field_h != var2)) {
            ((on) this).field_e = null;
            return null;
        }
        ((on) this).field_e = var2.field_e;
        return var2;
    }

    final static String a(boolean param0) {
        if (sc.field_q) {
            return null;
        }
        if (~ri.field_F < ~rq.field_e) {
            return null;
        }
        if (!(~(ri.field_F + de.field_i) >= ~rq.field_e)) {
            return jq.field_d;
        }
        return null;
    }

    final oh b(byte param0) {
        oh var2 = ((on) this).field_e;
        if (param0 != -124) {
            field_i = null;
            if (!(((on) this).field_d.field_h != var2)) {
                ((on) this).field_e = null;
                return null;
            }
            ((on) this).field_e = var2.field_e;
            return var2;
        }
        if (!(((on) this).field_d.field_h != var2)) {
            ((on) this).field_e = null;
            return null;
        }
        ((on) this).field_e = var2.field_e;
        return var2;
    }

    final oh a(int param0) {
        oh var2 = ((on) this).field_d.field_h.field_f;
        if (param0 != 2) {
            field_b = false;
            if (!(((on) this).field_d.field_h != var2)) {
                ((on) this).field_e = null;
                return null;
            }
            ((on) this).field_e = var2.field_f;
            return var2;
        }
        if (!(((on) this).field_d.field_h != var2)) {
            ((on) this).field_e = null;
            return null;
        }
        ((on) this).field_e = var2.field_f;
        return var2;
    }

    public static void b(int param0) {
        field_i = null;
        field_g = null;
        field_a = null;
        field_h = null;
        field_f = null;
    }

    final oh a(boolean param0, oh param1) {
        oh var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_6_0 = null;
        oh stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        oh stackOut_9_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param1 != null) {
                var3 = param1;
                break L1;
              } else {
                var3 = ((on) this).field_d.field_h.field_f;
                break L1;
              }
            }
            if (var3 == ((on) this).field_d.field_h) {
              ((on) this).field_e = null;
              stackOut_5_0 = null;
              stackIn_6_0 = stackOut_5_0;
              return (oh) (Object) stackIn_6_0;
            } else {
              L2: {
                if (!param0) {
                  break L2;
                } else {
                  field_c = 27;
                  break L2;
                }
              }
              ((on) this).field_e = var3.field_f;
              stackOut_9_0 = (oh) var3;
              stackIn_10_0 = stackOut_9_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("on.A(").append(param0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw r.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_10_0;
    }

    on(pf param0) {
        try {
            ((on) this).field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "on.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final oh a(byte param0, oh param1) {
        oh var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        Object stackIn_6_0 = null;
        oh stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        oh stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              var4 = -19 / ((param0 - 20) / 59);
              if (param1 == null) {
                var3 = ((on) this).field_d.field_h.field_e;
                break L1;
              } else {
                var3 = param1;
                break L1;
              }
            }
            if (((on) this).field_d.field_h == var3) {
              ((on) this).field_e = null;
              stackOut_5_0 = null;
              stackIn_6_0 = stackOut_5_0;
              return (oh) (Object) stackIn_6_0;
            } else {
              ((on) this).field_e = var3.field_e;
              stackOut_7_0 = (oh) var3;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3_ref;
            stackOut_9_1 = new StringBuilder().append("on.H(").append(param0).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw r.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
        return stackIn_8_0;
    }

    final oh a(byte param0) {
        oh var2 = ((on) this).field_e;
        if (((on) this).field_d.field_h == var2) {
            ((on) this).field_e = null;
            return null;
        }
        ((on) this).field_e = var2.field_f;
        if (param0 < 44) {
            on.a(-53, false);
            return var2;
        }
        return var2;
    }

    final static void a(int param0, boolean param1) {
        int var2 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_94_0 = 0;
        int stackIn_99_0 = 0;
        int stackIn_106_0 = 0;
        int stackOut_92_0 = 0;
        int stackOut_93_0 = 0;
        int stackOut_97_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_104_0 = 0;
        int stackOut_105_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_84_0 = 0;
        int stackOut_85_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_26_0 = 0;
        if (ce.field_x == null) {
          if (param0 == 1) {
            if (in.field_g == null) {
              L0: {
                if (!cj.field_x) {
                  break L0;
                } else {
                  if (!cs.field_i) {
                    break L0;
                  } else {
                    L1: {
                      L2: {
                        if (!v.field_b) {
                          break L2;
                        } else {
                          if (!sr.field_h) {
                            break L2;
                          } else {
                            stackOut_92_0 = 1;
                            stackIn_94_0 = stackOut_92_0;
                            break L1;
                          }
                        }
                      }
                      stackOut_93_0 = 0;
                      stackIn_94_0 = stackOut_93_0;
                      break L1;
                    }
                    L3: {
                      L4: {
                        var2 = stackIn_94_0;
                        if (!param1) {
                          break L4;
                        } else {
                          if (var2 != 0) {
                            break L4;
                          } else {
                            if (!me.a(45)) {
                              break L4;
                            } else {
                              stackOut_97_0 = 1;
                              stackIn_99_0 = stackOut_97_0;
                              break L3;
                            }
                          }
                        }
                      }
                      stackOut_98_0 = 0;
                      stackIn_99_0 = stackOut_98_0;
                      break L3;
                    }
                    qr.a(stackIn_99_0 != 0, (byte) 112);
                    if (!v.field_b) {
                      break L0;
                    } else {
                      if (sr.field_h) {
                        L5: {
                          L6: {
                            if (!param1) {
                              break L6;
                            } else {
                              if (!me.a(119)) {
                                break L6;
                              } else {
                                stackOut_104_0 = 1;
                                stackIn_106_0 = stackOut_104_0;
                                break L5;
                              }
                            }
                          }
                          stackOut_105_0 = 0;
                          stackIn_106_0 = stackOut_105_0;
                          break L5;
                        }
                        kh.a(stackIn_106_0 != 0, false);
                        break L0;
                      } else {
                        return;
                      }
                    }
                  }
                }
              }
              return;
            } else {
              L7: {
                in.field_g.a(param1, param0 ^ -74);
                if (!cj.field_x) {
                  break L7;
                } else {
                  if (!cs.field_i) {
                    break L7;
                  } else {
                    L8: {
                      L9: {
                        if (!v.field_b) {
                          break L9;
                        } else {
                          if (!sr.field_h) {
                            break L9;
                          } else {
                            stackOut_72_0 = 1;
                            stackIn_74_0 = stackOut_72_0;
                            break L8;
                          }
                        }
                      }
                      stackOut_73_0 = 0;
                      stackIn_74_0 = stackOut_73_0;
                      break L8;
                    }
                    L10: {
                      L11: {
                        var2 = stackIn_74_0;
                        if (!param1) {
                          break L11;
                        } else {
                          if (var2 != 0) {
                            break L11;
                          } else {
                            if (!me.a(45)) {
                              break L11;
                            } else {
                              stackOut_77_0 = 1;
                              stackIn_79_0 = stackOut_77_0;
                              break L10;
                            }
                          }
                        }
                      }
                      stackOut_78_0 = 0;
                      stackIn_79_0 = stackOut_78_0;
                      break L10;
                    }
                    qr.a(stackIn_79_0 != 0, (byte) 112);
                    if (!v.field_b) {
                      break L7;
                    } else {
                      if (sr.field_h) {
                        L12: {
                          L13: {
                            if (!param1) {
                              break L13;
                            } else {
                              if (!me.a(119)) {
                                break L13;
                              } else {
                                stackOut_84_0 = 1;
                                stackIn_86_0 = stackOut_84_0;
                                break L12;
                              }
                            }
                          }
                          stackOut_85_0 = 0;
                          stackIn_86_0 = stackOut_85_0;
                          break L12;
                        }
                        kh.a(stackIn_86_0 != 0, false);
                        break L7;
                      } else {
                        return;
                      }
                    }
                  }
                }
              }
              return;
            }
          } else {
            return;
          }
        } else {
          ce.field_x.a(param1, 81);
          if (param0 == 1) {
            if (in.field_g != null) {
              in.field_g.a(param1, param0 ^ -74);
              if (cj.field_x) {
                if (cs.field_i) {
                  if (v.field_b) {
                    L14: {
                      if (!sr.field_h) {
                        stackOut_50_0 = 0;
                        stackIn_51_0 = stackOut_50_0;
                        break L14;
                      } else {
                        stackOut_49_0 = 1;
                        stackIn_51_0 = stackOut_49_0;
                        break L14;
                      }
                    }
                    L15: {
                      L16: {
                        var2 = stackIn_51_0;
                        if (!param1) {
                          break L16;
                        } else {
                          if (var2 != 0) {
                            break L16;
                          } else {
                            if (!me.a(45)) {
                              break L16;
                            } else {
                              stackOut_54_0 = 1;
                              stackIn_56_0 = stackOut_54_0;
                              break L15;
                            }
                          }
                        }
                      }
                      stackOut_55_0 = 0;
                      stackIn_56_0 = stackOut_55_0;
                      break L15;
                    }
                    L17: {
                      qr.a(stackIn_56_0 != 0, (byte) 112);
                      if (!v.field_b) {
                        break L17;
                      } else {
                        if (sr.field_h) {
                          L18: {
                            L19: {
                              if (!param1) {
                                break L19;
                              } else {
                                if (!me.a(119)) {
                                  break L19;
                                } else {
                                  stackOut_61_0 = 1;
                                  stackIn_63_0 = stackOut_61_0;
                                  break L18;
                                }
                              }
                            }
                            stackOut_62_0 = 0;
                            stackIn_63_0 = stackOut_62_0;
                            break L18;
                          }
                          kh.a(stackIn_63_0 != 0, false);
                          break L17;
                        } else {
                          return;
                        }
                      }
                    }
                    return;
                  } else {
                    L20: {
                      L21: {
                        var2 = 0;
                        if (!param1) {
                          break L21;
                        } else {
                          if (var2 != 0) {
                            break L21;
                          } else {
                            if (!me.a(45)) {
                              break L21;
                            } else {
                              stackOut_37_0 = 1;
                              stackIn_39_0 = stackOut_37_0;
                              break L20;
                            }
                          }
                        }
                      }
                      stackOut_38_0 = 0;
                      stackIn_39_0 = stackOut_38_0;
                      break L20;
                    }
                    L22: {
                      qr.a(stackIn_39_0 != 0, (byte) 112);
                      if (!v.field_b) {
                        break L22;
                      } else {
                        if (sr.field_h) {
                          L23: {
                            L24: {
                              if (!param1) {
                                break L24;
                              } else {
                                if (!me.a(119)) {
                                  break L24;
                                } else {
                                  stackOut_44_0 = 1;
                                  stackIn_46_0 = stackOut_44_0;
                                  break L23;
                                }
                              }
                            }
                            stackOut_45_0 = 0;
                            stackIn_46_0 = stackOut_45_0;
                            break L23;
                          }
                          kh.a(stackIn_46_0 != 0, false);
                          break L22;
                        } else {
                          return;
                        }
                      }
                    }
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              if (cj.field_x) {
                if (cs.field_i) {
                  L25: {
                    L26: {
                      if (!v.field_b) {
                        break L26;
                      } else {
                        if (!sr.field_h) {
                          break L26;
                        } else {
                          stackOut_12_0 = 1;
                          stackIn_14_0 = stackOut_12_0;
                          break L25;
                        }
                      }
                    }
                    stackOut_13_0 = 0;
                    stackIn_14_0 = stackOut_13_0;
                    break L25;
                  }
                  L27: {
                    L28: {
                      var2 = stackIn_14_0;
                      if (!param1) {
                        break L28;
                      } else {
                        if (var2 != 0) {
                          break L28;
                        } else {
                          if (!me.a(45)) {
                            break L28;
                          } else {
                            stackOut_17_0 = 1;
                            stackIn_19_0 = stackOut_17_0;
                            break L27;
                          }
                        }
                      }
                    }
                    stackOut_18_0 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    break L27;
                  }
                  L29: {
                    qr.a(stackIn_19_0 != 0, (byte) 112);
                    if (!v.field_b) {
                      break L29;
                    } else {
                      if (sr.field_h) {
                        L30: {
                          L31: {
                            if (!param1) {
                              break L31;
                            } else {
                              if (!me.a(119)) {
                                break L31;
                              } else {
                                stackOut_25_0 = 1;
                                stackIn_27_0 = stackOut_25_0;
                                break L30;
                              }
                            }
                          }
                          stackOut_26_0 = 0;
                          stackIn_27_0 = stackOut_26_0;
                          break L30;
                        }
                        kh.a(stackIn_27_0 != 0, false);
                        break L29;
                      } else {
                        return;
                      }
                    }
                  }
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Email (Login):";
        field_a = "Some players haven't unlocked the currently selected game options.<br>Please see the player list on the left for details.";
        field_f = "Enter name of friend to delete from list";
        field_g = new gq(0, 2, 2, 1);
        field_h = "Loading fonts";
    }
}
