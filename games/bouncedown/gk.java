/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gk {
    static int field_a;
    static ie field_e;
    static java.applet.Applet field_j;
    static int[] field_i;
    private boolean field_b;
    private td field_n;
    static String field_h;
    static boolean field_f;
    private Object[] field_o;
    static byte[][] field_g;
    private int field_k;
    private g field_l;
    static char field_d;
    private Object[][] field_c;
    static String field_m;

    final boolean a(String param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        boolean stackIn_10_0 = false;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        boolean stackOut_11_0 = false;
        boolean stackOut_9_0 = false;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            if (!((gk) this).c(-109)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              param0 = param0.toLowerCase();
              param1 = param1.toLowerCase();
              var4_int = ((gk) this).field_l.field_a.a(param2 ^ -16444, ae.a(param2 + -51781023, (CharSequence) (Object) param0));
              if (this.a(var4_int, false)) {
                if (param2 == 16484) {
                  var5 = ((gk) this).field_l.field_k[var4_int].a(-122, ae.a(-51764539, (CharSequence) (Object) param1));
                  stackOut_11_0 = ((gk) this).a(var4_int, var5, (byte) -14);
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  stackOut_9_0 = ((boolean[]) ((gk) this).field_o[9])[3];
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              } else {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("gk.L(");
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L1;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L1;
            }
          }
          L2: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L2;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L2;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param2 + ')');
        }
        return stackIn_12_0;
    }

    private final synchronized void e(int param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                if (!((gk) this).field_b) {
                  break L2;
                } else {
                  ((gk) this).field_o[param1] = (Object) (Object) ((gk) this).field_n.a(param1, true);
                  if (Bounce.field_N == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((gk) this).field_o[param1] = nh.a(false, -11560, ((gk) this).field_n.a(param1, true));
              break L1;
            }
            L3: {
              if (param0 == -19250) {
                break L3;
              } else {
                gk.a(((int[]) ((gk) this).field_o[1])[10], (String) ((gk) this).field_o[2]);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var3, "gk.R(" + param0 + ',' + param1 + ')');
        }
    }

    final static boolean b(int param0) {
        RuntimeException var1 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        try {
          L0: {
            L1: {
              if (param0 >= 110) {
                break L1;
              } else {
                field_g = null;
                break L1;
              }
            }
            stackOut_3_0 = ih.field_Q.a(-125);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var1, "gk.J(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final int a(byte param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 == 47) {
              if (!this.a(param1, false)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                stackOut_8_0 = ((gk) this).field_l.field_c[param1];
                stackIn_9_0 = stackOut_8_0;
                break L0;
              }
            } else {
              stackOut_1_0 = ((int[]) ((gk) this).field_o[6])[22];
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var3, "gk.S(" + param0 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    final static void a(int param0, String param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_23_0 = 0;
        int stackOut_25_0 = 0;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        var3 = Bounce.field_N;
        try {
          L0: {
            L1: {
              ge.field_c = ge.field_c + 1;
              if (ck.field_c != -1) {
                break L1;
              } else {
                if (sj.field_d != -1) {
                  break L1;
                } else {
                  ck.field_c = uc.field_C;
                  sj.field_d = ll.field_y;
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                if (param1 != null) {
                  if (param1.equals((Object) (Object) oc.field_b)) {
                    break L2;
                  } else {
                    break L3;
                  }
                } else {
                  if (null != oc.field_b) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                L5: {
                  if (nh.field_P) {
                    break L5;
                  } else {
                    if (~ea.field_b < ~ge.field_c) {
                      break L5;
                    } else {
                      if (~ge.field_c <= ~(ea.field_b + sd.field_lb)) {
                        break L5;
                      } else {
                        stackOut_23_0 = 1;
                        stackIn_26_0 = stackOut_23_0;
                        break L4;
                      }
                    }
                  }
                }
                stackOut_25_0 = 0;
                stackIn_26_0 = stackOut_25_0;
                break L4;
              }
              L6: {
                L7: {
                  L8: {
                    var2_int = stackIn_26_0;
                    if (param1 == null) {
                      break L8;
                    } else {
                      if (nh.field_P) {
                        break L7;
                      } else {
                        if (var2_int != 0) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                  ge.field_c = 0;
                  if (var3 == 0) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
                ge.field_c = ea.field_b;
                break L6;
              }
              L9: {
                L10: {
                  mh.field_Z = ck.field_c;
                  if (null != param1) {
                    break L10;
                  } else {
                    if (var2_int == 0) {
                      break L9;
                    } else {
                      nh.field_P = true;
                      if (var3 == 0) {
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                }
                nh.field_P = false;
                break L9;
              }
              ha.field_b = sj.field_d;
              break L2;
            }
            L11: {
              oc.field_b = param1;
              if (nh.field_P) {
                break L11;
              } else {
                if (~ge.field_c <= ~ea.field_b) {
                  break L11;
                } else {
                  if (mi.field_j) {
                    ge.field_c = 0;
                    mh.field_Z = ck.field_c;
                    ha.field_b = sj.field_d;
                    break L11;
                  } else {
                    break L11;
                  }
                }
              }
            }
            L12: {
              ck.field_c = -1;
              if (param0 > 20) {
                break L12;
              } else {
                gk.b(false);
                break L12;
              }
            }
            L13: {
              if (!nh.field_P) {
                break L13;
              } else {
                if (jk.field_K != ge.field_c) {
                  break L13;
                } else {
                  nh.field_P = false;
                  ge.field_c = 0;
                  break L13;
                }
              }
            }
            sj.field_d = -1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var2 = decompiledCaughtException;
            stackOut_69_0 = (RuntimeException) var2;
            stackOut_69_1 = new StringBuilder().append("gk.B(").append(param0).append(',');
            stackIn_72_0 = stackOut_69_0;
            stackIn_72_1 = stackOut_69_1;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            if (param1 == null) {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L14;
            } else {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "{...}";
              stackIn_73_0 = stackOut_70_0;
              stackIn_73_1 = stackOut_70_1;
              stackIn_73_2 = stackOut_70_2;
              break L14;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_73_0, stackIn_73_2 + ')');
        }
    }

    private final synchronized boolean a(int param0, boolean param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_20_0 = 0;
        try {
          L0: {
            if (!((gk) this).c(-94)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                if (!param1) {
                  break L1;
                } else {
                  ((gk) this).field_c = (Object[][]) ((gk) this).field_o[8];
                  break L1;
                }
              }
              L2: {
                if (0 > param0) {
                  break L2;
                } else {
                  if (((gk) this).field_l.field_c.length <= param0) {
                    break L2;
                  } else {
                    if (0 != ((gk) this).field_l.field_c[param0]) {
                      stackOut_22_0 = 1;
                      stackIn_23_0 = stackOut_22_0;
                      break L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              if (!pe.field_e) {
                stackOut_20_0 = 0;
                stackIn_21_0 = stackOut_20_0;
                return stackIn_21_0 != 0;
              } else {
                throw new IllegalArgumentException(Integer.toString(param0));
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var3, "gk.D(" + param0 + ',' + param1 + ')');
        }
        return stackIn_23_0 != 0;
    }

    final boolean b(String param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (((gk) this).c(-78)) {
              L1: {
                param0 = param0.toLowerCase();
                var3_int = ((gk) this).field_l.field_a.a(-55, ae.a(-51764539, (CharSequence) (Object) param0));
                if (!param1) {
                  break L1;
                } else {
                  field_g = (byte[][]) ((gk) this).field_o[0];
                  break L1;
                }
              }
              stackOut_6_0 = ((gk) this).d(var3_int, 77);
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("gk.M(");
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L2;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    final synchronized int a(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (this.a(param0, false)) {
              if (param1 == 0) {
                if (null != ((gk) this).field_o[param0]) {
                  stackOut_9_0 = 100;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                } else {
                  stackOut_11_0 = ((gk) this).field_n.a(113, param0);
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                }
              } else {
                stackOut_4_0 = -128;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var3, "gk.O(" + param0 + ',' + param1 + ')');
        }
        return stackIn_12_0;
    }

    final synchronized boolean c(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_7_0 = 0;
        try {
          L0: {
            L1: {
              if (((gk) this).field_l != null) {
                break L1;
              } else {
                ((gk) this).field_l = ((gk) this).field_n.b(1);
                if (null != ((gk) this).field_l) {
                  ((gk) this).field_o = new Object[((gk) this).field_l.field_m];
                  ((gk) this).field_c = new Object[((gk) this).field_l.field_m][];
                  break L1;
                } else {
                  stackOut_4_0 = 0;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0 != 0;
                }
              }
            }
            var2_int = 110 % ((-19 - param0) / 57);
            stackOut_7_0 = 1;
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var2, "gk.W(" + param0 + ')');
        }
        return stackIn_8_0 != 0;
    }

    private final synchronized boolean a(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (((gk) this).c(72)) {
              L1: {
                if (param2 > param0) {
                  break L1;
                } else {
                  if (0 > param1) {
                    break L1;
                  } else {
                    if (((gk) this).field_l.field_c.length <= param0) {
                      break L1;
                    } else {
                      if (param1 < ((gk) this).field_l.field_c[param0]) {
                        stackOut_20_0 = 1;
                        stackIn_21_0 = stackOut_20_0;
                        break L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
              if (!pe.field_e) {
                stackOut_18_0 = 0;
                stackIn_19_0 = stackOut_18_0;
                return stackIn_19_0 != 0;
              } else {
                throw new IllegalArgumentException(param0 + " " + param1);
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var4, "gk.BA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_21_0 != 0;
    }

    public static void b(boolean param0) {
        try {
            field_e = null;
            field_g = null;
            field_i = null;
            field_j = null;
            field_h = null;
            field_m = null;
            if (param0) {
                gk.b(-83, -52);
            }
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "gk.F(" + param0 + ')');
        }
    }

    final boolean a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (((gk) this).c(115)) {
              L1: {
                param0 = param0.toLowerCase();
                if (param1 == -16) {
                  break L1;
                } else {
                  ((byte[]) ((gk) this).field_o[1])[0] = (byte) 78;
                  break L1;
                }
              }
              var3_int = ((gk) this).field_l.field_a.a(-86, ae.a(-51764539, (CharSequence) (Object) param0));
              if (0 > var3_int) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0 != 0;
              } else {
                stackOut_11_0 = 1;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("gk.CA(");
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L2;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param1 + ')');
        }
        return stackIn_12_0 != 0;
    }

    final int b(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (((gk) this).c(param1 + 145)) {
              param0 = param0.toLowerCase();
              if (param1 == -100) {
                var3_int = ((gk) this).field_l.field_a.a(-64, ae.a(-51764539, (CharSequence) (Object) param0));
                stackOut_6_0 = ((gk) this).a(var3_int, 0);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = ((int[]) ((gk) this).field_o[0])[19];
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("gk.V(");
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L1;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    final synchronized int a(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_20_0 = 0;
        var5 = Bounce.field_N;
        try {
          L0: {
            if (!((gk) this).c(94)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              var2_int = 0;
              var3 = 0;
              var4 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (~var4 <= ~((gk) this).field_o.length) {
                      break L3;
                    } else {
                      stackOut_8_0 = -1;
                      stackOut_8_1 = ~((gk) this).field_l.field_q[var4];
                      stackIn_16_0 = stackOut_8_0;
                      stackIn_16_1 = stackOut_8_1;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      if (var5 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (stackIn_9_0 > stackIn_9_1) {
                            var3 = var3 + ((gk) this).a(var4, 0);
                            var2_int += 100;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        var4++;
                        if (var5 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_15_0 = ~var2_int;
                  stackOut_15_1 = -1;
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  break L2;
                }
                if (stackIn_16_0 == stackIn_16_1) {
                  stackOut_18_0 = 100;
                  stackIn_19_0 = stackOut_18_0;
                  return stackIn_19_0;
                } else {
                  var4 = var3 * param0 / var2_int;
                  stackOut_20_0 = var4;
                  stackIn_21_0 = stackOut_20_0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var2, "gk.U(" + param0 + ')');
        }
        return stackIn_21_0;
    }

    final int a(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (((gk) this).c(45)) {
              if (param0) {
                stackOut_6_0 = ((gk) this).field_l.field_c.length;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = -115;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = -1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var2, "gk.K(" + param0 + ')');
        }
        return stackIn_7_0;
    }

    final static void a(int param0, int param1, tg[] param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var10 = Bounce.field_N;
        try {
          L0: {
            L1: {
              if (param2 == null) {
                break L1;
              } else {
                if (param4 > 0) {
                  var5_int = param2[0].field_t;
                  var6 = param2[2].field_t;
                  var7 = param2[1].field_t;
                  param2[0].a(param0, param3);
                  param2[2].a(param4 + (param0 + -var6), param3);
                  na.b(hh.field_h);
                  na.c(var5_int + param0, param3, param4 + param0 - var6, param3 - -param2[param1].field_o);
                  var8 = param0 - -var5_int;
                  var9 = param4 + (param0 + -var6);
                  param0 = var8;
                  L2: while (true) {
                    L3: {
                      L4: {
                        if (var9 <= param0) {
                          break L4;
                        } else {
                          param2[1].a(param0, param3);
                          param0 = param0 + var7;
                          if (var10 != 0) {
                            break L3;
                          } else {
                            if (var10 == 0) {
                              continue L2;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      na.a(hh.field_h);
                      break L3;
                    }
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("gk.H(").append(param0).append(',').append(param1).append(',');
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L5;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final synchronized byte[] b(String param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        byte[] stackOut_8_0 = null;
        Object stackOut_6_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            var4_int = -22 / ((70 - param2) / 47);
            if (!((gk) this).c(50)) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (byte[]) (Object) stackIn_4_0;
            } else {
              param0 = param0.toLowerCase();
              param1 = param1.toLowerCase();
              var5 = ((gk) this).field_l.field_a.a(-73, ae.a(-51764539, (CharSequence) (Object) param0));
              if (this.a(var5, false)) {
                var6 = ((gk) this).field_l.field_k[var5].a(-96, ae.a(-51764539, (CharSequence) (Object) param1));
                stackOut_8_0 = ((gk) this).b(104, var6, var5);
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (byte[]) (Object) stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("gk.Q(");
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L1;
            }
          }
          L2: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L2;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param2 + ')');
        }
        return stackIn_9_0;
    }

    final synchronized boolean d(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (this.a(param0, false)) {
              if (((gk) this).field_o[param0] != null) {
                stackOut_6_0 = 1;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                L1: {
                  this.e(-19250, param0);
                  if (param1 > 68) {
                    break L1;
                  } else {
                    field_d = '￾';
                    break L1;
                  }
                }
                if (null != ((gk) this).field_o[param0]) {
                  stackOut_14_0 = 1;
                  stackIn_15_0 = stackOut_14_0;
                  return stackIn_15_0 != 0;
                } else {
                  stackOut_16_0 = 0;
                  stackIn_17_0 = stackOut_16_0;
                  break L0;
                }
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var3, "gk.C(" + param0 + ',' + param1 + ')');
        }
        return stackIn_17_0 != 0;
    }

    final int a(int param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (this.a(param0, false)) {
              var5 = -1 / ((51 - param2) / 44);
              param1 = param1.toLowerCase();
              var4_int = ((gk) this).field_l.field_k[param0].a(-79, ae.a(-51764539, (CharSequence) (Object) param1));
              if (this.a(param0, var4_int, 0)) {
                stackOut_6_0 = var4_int;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = -1;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = -1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("gk.I(").append(param0).append(',');
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L1;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param2 + ')');
        }
        return stackIn_7_0;
    }

    final synchronized boolean a(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_18_0 = 0;
        var5 = Bounce.field_N;
        try {
          L0: {
            if (!((gk) this).c(-95)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              L1: {
                if (param0 <= -35) {
                  break L1;
                } else {
                  boolean discarded$2 = ((gk) this).a(-77, -72, (byte) -81);
                  break L1;
                }
              }
              var2_int = 1;
              var3 = 0;
              L2: while (true) {
                L3: {
                  L4: {
                    if (~var3 <= ~((gk) this).field_l.field_n.length) {
                      break L4;
                    } else {
                      stackOut_11_0 = ((gk) this).field_l.field_n[var3];
                      stackIn_19_0 = stackOut_11_0;
                      stackIn_12_0 = stackOut_11_0;
                      if (var5 != 0) {
                        break L3;
                      } else {
                        L5: {
                          var4 = stackIn_12_0;
                          if (null != ((gk) this).field_o[var4]) {
                            break L5;
                          } else {
                            this.e(-19250, var4);
                            if (null != ((gk) this).field_o[var4]) {
                              break L5;
                            } else {
                              var2_int = 0;
                              break L5;
                            }
                          }
                        }
                        var3++;
                        if (var5 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  stackOut_18_0 = var2_int;
                  stackIn_19_0 = stackOut_18_0;
                  break L3;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var2, "gk.E(" + param0 + ')');
        }
        return stackIn_19_0 != 0;
    }

    final static void b(int param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = Bounce.field_N;
        try {
          L0: {
            L1: {
              L2: {
                var2_int = 0;
                var3 = oa.field_a;
                if (var3 < 5) {
                  break L2;
                } else {
                  L3: {
                    if (105 > var3) {
                      break L3;
                    } else {
                      if (var3 >= 120) {
                        break L1;
                      } else {
                        var3 = 120 - var3;
                        var2_int = 8192 - var3 * var3 * 8192 / 3300;
                        if (var6 == 0) {
                          break L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  var2_int = (-40960 + var3 * 16384) / 220;
                  if (var6 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var2_int = var3 * var3 * 8192 / 1100;
              break L1;
            }
            L4: {
              var4 = 1;
              if (param1 == -1) {
                break L4;
              } else {
                field_j = null;
                break L4;
              }
            }
            L5: {
              var5 = 0;
              if (param0 == 3) {
                var4 = -1;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (param0 == 1) {
                var5 = 1;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (4 == param0) {
                var5 = 1;
                var4 = 1;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (param0 == 5) {
                var4 = -1;
                var5 = 1;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              if (6 == param0) {
                var5 = -1;
                var4 = 1;
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              L11: {
                if (7 == param0) {
                  break L11;
                } else {
                  if (param0 == 8) {
                    break L11;
                  } else {
                    break L10;
                  }
                }
              }
              var4 = -1;
              var5 = -1;
              break L10;
            }
            L12: {
              if (param0 == 11) {
                var4 = -1;
                break L12;
              } else {
                break L12;
              }
            }
            L13: {
              if (12 != param0) {
                break L13;
              } else {
                var5 = -1;
                var4 = -1;
                break L13;
              }
            }
            L14: {
              if (param0 == 13) {
                var4 = 1;
                var5 = -1;
                break L14;
              } else {
                break L14;
              }
            }
            L15: {
              if (14 != param0) {
                break L15;
              } else {
                var5 = 1;
                var4 = -1;
                break L15;
              }
            }
            L16: {
              if (param0 == 15) {
                var5 = 1;
                var4 = 1;
                break L16;
              } else {
                break L16;
              }
            }
            il.field_e = jf.a(var2_int * var4, false, var5 * var2_int);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var2, "gk.G(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized boolean a(int param0, int param1, byte param2) {
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_14_0 = 0;
        try {
          L0: {
            if (!this.a(param0, param1, 0)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                if (null == ((gk) this).field_c[param0]) {
                  break L1;
                } else {
                  if (((gk) this).field_c[param0][param1] != null) {
                    stackOut_11_0 = 1;
                    stackIn_12_0 = stackOut_11_0;
                    return stackIn_12_0 != 0;
                  } else {
                    break L1;
                  }
                }
              }
              if (null == ((gk) this).field_o[param0]) {
                L2: {
                  if (param2 == -14) {
                    break L2;
                  } else {
                    int discarded$2 = ((gk) this).a((String) null, ((boolean[]) ((gk) this).field_o[2])[0]);
                    break L2;
                  }
                }
                this.e(param2 ^ 19260, param0);
                if (((gk) this).field_o[param0] == null) {
                  stackOut_22_0 = 0;
                  stackIn_23_0 = stackOut_22_0;
                  break L0;
                } else {
                  stackOut_20_0 = 1;
                  stackIn_21_0 = stackOut_20_0;
                  return stackIn_21_0 != 0;
                }
              } else {
                stackOut_14_0 = 1;
                stackIn_15_0 = stackOut_14_0;
                return stackIn_15_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var4, "gk.DA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_23_0 != 0;
    }

    final byte[] b(int param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        byte[] stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_0_0 = null;
        try {
          L0: {
            var4_int = -13 % ((46 - param0) / 44);
            stackOut_0_0 = this.a((byte) 121, param2, param1, (int[]) null);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var4, "gk.T(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_1_0;
    }

    gk(td param0, boolean param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        ((gk) this).field_l = null;
        try {
          L0: {
            L1: {
              if (0 > param2) {
                break L1;
              } else {
                if (2 >= param2) {
                  ((gk) this).field_b = param1;
                  ((gk) this).field_k = param2;
                  ((gk) this).field_n = param0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            throw new IllegalArgumentException("");
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) runtimeException;
            stackOut_7_1 = new StringBuilder().append("gk.<init>(");
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L2;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final synchronized byte[] a(byte param0, int param1, int param2, int[] param3) {
        Object var5 = null;
        int var6 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_44_0 = null;
        Object stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        Object stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        Object stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_15_0 = null;
        Object stackOut_43_0 = null;
        Object stackOut_1_0 = null;
        Object stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        Object stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        Object stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        try {
          L0: {
            if (this.a(param1, param2, 0)) {
              L1: {
                L2: {
                  var5 = null;
                  if (((gk) this).field_c[param1] == null) {
                    break L2;
                  } else {
                    if (null == ((gk) this).field_c[param1][param2]) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                var6 = this.a(param1, false, param3, param2) ? 1 : 0;
                if (var6 == 0) {
                  this.e(-19250, param1);
                  var6 = this.a(param1, false, param3, param2) ? 1 : 0;
                  if (var6 == 0) {
                    stackOut_15_0 = null;
                    stackIn_16_0 = stackOut_15_0;
                    return (byte[]) (Object) stackIn_16_0;
                  } else {
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              if (null == ((gk) this).field_c[param1]) {
                throw new RuntimeException("");
              } else {
                L3: {
                  if (((gk) this).field_c[param1][param2] == null) {
                    break L3;
                  } else {
                    var5 = (Object) (Object) qf.a(0, false, ((gk) this).field_c[param1][param2]);
                    if (var5 != null) {
                      break L3;
                    } else {
                      throw new RuntimeException("");
                    }
                  }
                }
                L4: {
                  if (param0 == 121) {
                    break L4;
                  } else {
                    ((boolean[]) ((gk) this).field_o[1])[5] = true;
                    break L4;
                  }
                }
                L5: {
                  if (var5 == null) {
                    break L5;
                  } else {
                    L6: {
                      if (((gk) this).field_k != 1) {
                        break L6;
                      } else {
                        ((gk) this).field_c[param1][param2] = null;
                        if (1 != ((gk) this).field_l.field_c[param1]) {
                          break L5;
                        } else {
                          ((gk) this).field_c[param1] = null;
                          if (Bounce.field_N == 0) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    if (((gk) this).field_k != 2) {
                      break L5;
                    } else {
                      ((gk) this).field_c[param1] = null;
                      break L5;
                    }
                  }
                }
                stackOut_43_0 = var5;
                stackIn_44_0 = stackOut_43_0;
                break L0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (byte[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = (Object) (Object) decompiledCaughtException;
            stackOut_45_0 = var5;
            stackOut_45_1 = new StringBuilder().append("gk.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_48_0 = stackOut_45_0;
            stackIn_48_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param3 == null) {
              stackOut_48_0 = stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "null";
              stackIn_49_0 = stackOut_48_0;
              stackIn_49_1 = stackOut_48_1;
              stackIn_49_2 = stackOut_48_2;
              break L7;
            } else {
              stackOut_46_0 = stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "{...}";
              stackIn_49_0 = stackOut_46_0;
              stackIn_49_1 = stackOut_46_1;
              stackIn_49_2 = stackOut_46_2;
              break L7;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_49_0, stackIn_49_2 + ')');
        }
        return (byte[]) (Object) stackIn_44_0;
    }

    final synchronized byte[] c(int param0, int param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_5_0 = null;
        Object stackIn_10_0 = null;
        byte[] stackIn_18_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_9_0 = null;
        byte[] stackOut_17_0 = null;
        byte[] stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        try {
          if (((gk) this).c(68)) {
            if (((gk) this).field_l.field_c.length != 1) {
              if (!this.a(param1, false)) {
                stackOut_9_0 = null;
                stackIn_10_0 = stackOut_9_0;
                return (byte[]) (Object) stackIn_10_0;
              } else {
                L0: {
                  if (param0 > 118) {
                    break L0;
                  } else {
                    field_h = null;
                    break L0;
                  }
                }
                if (((gk) this).field_l.field_c[param1] == 1) {
                  stackOut_17_0 = ((gk) this).b(-19, 0, param1);
                  stackIn_18_0 = stackOut_17_0;
                  return stackIn_18_0;
                } else {
                  throw new RuntimeException();
                }
              }
            } else {
              stackOut_4_0 = ((gk) this).b(113, param1, 0);
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          } else {
            stackOut_1_0 = null;
            stackIn_2_0 = stackOut_1_0;
            return (byte[]) (Object) stackIn_2_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var3, "gk.AA(" + param0 + ',' + param1 + ')');
        }
    }

    private final synchronized boolean a(int param0, boolean param1, int[] param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        Object[] var9 = null;
        int var9_int = 0;
        byte[] var9_array = null;
        int var10_int = 0;
        byte[] var10 = null;
        wi var10_ref = null;
        RuntimeException var11_ref_RuntimeException = null;
        int var11 = 0;
        int var12 = 0;
        wi var13 = null;
        int var14 = 0;
        int[] var14_ref_int__ = null;
        int var15 = 0;
        byte[][] var15_ref_byte____ = null;
        int var16_int = 0;
        byte[] var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_31_0 = 0;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        int stackIn_53_2 = 0;
        int stackIn_76_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_104_0 = 0;
        int stackIn_123_0 = 0;
        int stackIn_139_0 = 0;
        int stackIn_143_0 = 0;
        int stackIn_147_0 = 0;
        int stackIn_162_0 = 0;
        RuntimeException stackIn_164_0 = null;
        StringBuilder stackIn_164_1 = null;
        RuntimeException stackIn_166_0 = null;
        StringBuilder stackIn_166_1 = null;
        RuntimeException stackIn_167_0 = null;
        StringBuilder stackIn_167_1 = null;
        String stackIn_167_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        int stackOut_52_2 = 0;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        int stackOut_50_2 = 0;
        int stackOut_75_0 = 0;
        int stackOut_84_0 = 0;
        int stackOut_94_0 = 0;
        int stackOut_103_0 = 0;
        int stackOut_122_0 = 0;
        int stackOut_138_0 = 0;
        int stackOut_142_0 = 0;
        int stackOut_146_0 = 0;
        int stackOut_161_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_163_0 = null;
        StringBuilder stackOut_163_1 = null;
        RuntimeException stackOut_166_0 = null;
        StringBuilder stackOut_166_1 = null;
        String stackOut_166_2 = null;
        RuntimeException stackOut_164_0 = null;
        StringBuilder stackOut_164_1 = null;
        String stackOut_164_2 = null;
        var22 = Bounce.field_N;
        try {
          L0: {
            if (this.a(param0, param1)) {
              if (null != ((gk) this).field_o[param0]) {
                L1: {
                  var5_int = ((gk) this).field_l.field_q[param0];
                  if (!param1) {
                    break L1;
                  } else {
                    ((gk) this).field_o[9] = ((gk) this).field_o[11];
                    break L1;
                  }
                }
                L2: {
                  var6 = ((gk) this).field_l.field_o[param0];
                  if (null == ((gk) this).field_c[param0]) {
                    ((gk) this).field_c[param0] = new Object[((gk) this).field_l.field_c[param0]];
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var7 = ((gk) this).field_c[param0];
                var8 = 1;
                var9_int = 0;
                L3: while (true) {
                  L4: {
                    L5: {
                      if (var9_int >= var5_int) {
                        break L5;
                      } else {
                        if (var22 != 0) {
                          break L4;
                        } else {
                          L6: {
                            L7: {
                              if (null != var6) {
                                break L7;
                              } else {
                                var10_int = var9_int;
                                if (var22 == 0) {
                                  break L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            var10_int = var6[var9_int];
                            break L6;
                          }
                          L8: {
                            if (var7[var10_int] != null) {
                              break L8;
                            } else {
                              var8 = 0;
                              if (var22 == 0) {
                                break L5;
                              } else {
                                break L8;
                              }
                            }
                          }
                          var9_int++;
                          if (var22 == 0) {
                            continue L3;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    if (var8 != 0) {
                      break L4;
                    } else {
                      L9: {
                        L10: {
                          if (param2 == null) {
                            break L10;
                          } else {
                            L11: {
                              if (0 != param2[0]) {
                                break L11;
                              } else {
                                if (param2[1] != 0) {
                                  break L11;
                                } else {
                                  if (param2[2] != 0) {
                                    break L11;
                                  } else {
                                    if (param2[3] == 0) {
                                      break L10;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                              }
                            }
                            var9_array = qf.a(0, true, ((gk) this).field_o[param0]);
                            var10_ref = new wi(var9_array);
                            var10_ref.a(85, param2, 5, var10_ref.field_i.length);
                            break L9;
                          }
                        }
                        var9_array = qf.a(0, false, ((gk) this).field_o[param0]);
                        break L9;
                      }
                      try {
                        L12: {
                          var10 = ta.a(21125, var9_array);
                          break L12;
                        }
                      } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L13: {
                          var11_ref_RuntimeException = decompiledCaughtException;
                          stackOut_49_0 = (RuntimeException) var11_ref_RuntimeException;
                          stackOut_49_1 = new StringBuilder();
                          stackIn_52_0 = stackOut_49_0;
                          stackIn_52_1 = stackOut_49_1;
                          stackIn_50_0 = stackOut_49_0;
                          stackIn_50_1 = stackOut_49_1;
                          if (null == param2) {
                            stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
                            stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
                            stackOut_52_2 = 0;
                            stackIn_53_0 = stackOut_52_0;
                            stackIn_53_1 = stackOut_52_1;
                            stackIn_53_2 = stackOut_52_2;
                            break L13;
                          } else {
                            stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
                            stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
                            stackOut_50_2 = 1;
                            stackIn_53_0 = stackOut_50_0;
                            stackIn_53_1 = stackOut_50_1;
                            stackIn_53_2 = stackOut_50_2;
                            break L13;
                          }
                        }
                        throw ii.a((Throwable) (Object) stackIn_53_0, (stackIn_53_2 != 0) + " " + param0 + " " + var9_array.length + " " + nb.a(var9_array, var9_array.length, (byte) -86) + " " + nb.a(var9_array, -2 + var9_array.length, (byte) -82) + " " + ((gk) this).field_l.field_j[param0] + " " + ((gk) this).field_l.field_b);
                      }
                      L14: {
                        if (!((gk) this).field_b) {
                          break L14;
                        } else {
                          ((gk) this).field_o[param0] = null;
                          break L14;
                        }
                      }
                      L15: {
                        L16: {
                          L17: {
                            if (var5_int > 1) {
                              break L17;
                            } else {
                              L18: {
                                L19: {
                                  if (var6 != null) {
                                    break L19;
                                  } else {
                                    var11 = 0;
                                    if (var22 == 0) {
                                      break L18;
                                    } else {
                                      break L19;
                                    }
                                  }
                                }
                                var11 = var6[0];
                                break L18;
                              }
                              L20: {
                                L21: {
                                  if (0 == ((gk) this).field_k) {
                                    break L21;
                                  } else {
                                    var7[var11] = (Object) (Object) var10;
                                    if (var22 == 0) {
                                      break L20;
                                    } else {
                                      break L21;
                                    }
                                  }
                                }
                                var7[var11] = nh.a(false, -11560, var10);
                                break L20;
                              }
                              if (var22 == 0) {
                                break L16;
                              } else {
                                break L17;
                              }
                            }
                          }
                          L22: {
                            if (2 == ((gk) this).field_k) {
                              break L22;
                            } else {
                              var11 = var10.length;
                              var11--;
                              var12 = var10[var11] & 255;
                              var11 = var11 - 4 * (var5_int * var12);
                              var13 = new wi(var10);
                              var14_ref_int__ = new int[var5_int];
                              var13.field_h = var11;
                              var15 = 0;
                              L23: while (true) {
                                L24: {
                                  L25: {
                                    if (var15 >= var12) {
                                      break L25;
                                    } else {
                                      var16_int = 0;
                                      stackOut_75_0 = 0;
                                      stackIn_85_0 = stackOut_75_0;
                                      stackIn_76_0 = stackOut_75_0;
                                      if (var22 != 0) {
                                        break L24;
                                      } else {
                                        var17 = stackIn_76_0;
                                        L26: while (true) {
                                          L27: {
                                            L28: {
                                              if (~var17 <= ~var5_int) {
                                                break L28;
                                              } else {
                                                var16_int = var16_int + var13.j(-3);
                                                var14_ref_int__[var17] = var14_ref_int__[var17] + var16_int;
                                                var17++;
                                                if (var22 != 0) {
                                                  break L27;
                                                } else {
                                                  if (var22 == 0) {
                                                    continue L26;
                                                  } else {
                                                    break L28;
                                                  }
                                                }
                                              }
                                            }
                                            var15++;
                                            break L27;
                                          }
                                          if (var22 == 0) {
                                            continue L23;
                                          } else {
                                            break L25;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  stackOut_84_0 = var5_int;
                                  stackIn_85_0 = stackOut_84_0;
                                  break L24;
                                }
                                var15_ref_byte____ = new byte[stackIn_85_0][];
                                var16_int = 0;
                                L29: while (true) {
                                  L30: {
                                    L31: {
                                      if (~var16_int <= ~var5_int) {
                                        break L31;
                                      } else {
                                        var15_ref_byte____[var16_int] = new byte[var14_ref_int__[var16_int]];
                                        var14_ref_int__[var16_int] = 0;
                                        var16_int++;
                                        if (var22 != 0) {
                                          break L30;
                                        } else {
                                          if (var22 == 0) {
                                            continue L29;
                                          } else {
                                            break L31;
                                          }
                                        }
                                      }
                                    }
                                    var13.field_h = var11;
                                    var16_int = 0;
                                    break L30;
                                  }
                                  var17 = 0;
                                  L32: while (true) {
                                    L33: {
                                      L34: {
                                        if (var12 <= var17) {
                                          break L34;
                                        } else {
                                          var18 = 0;
                                          stackOut_94_0 = 0;
                                          stackIn_104_0 = stackOut_94_0;
                                          stackIn_95_0 = stackOut_94_0;
                                          if (var22 != 0) {
                                            break L33;
                                          } else {
                                            var19 = stackIn_95_0;
                                            L35: while (true) {
                                              L36: {
                                                L37: {
                                                  if (var19 >= var5_int) {
                                                    break L37;
                                                  } else {
                                                    var18 = var18 + var13.j(-3);
                                                    cb.a(var10, var16_int, var15_ref_byte____[var19], var14_ref_int__[var19], var18);
                                                    var14_ref_int__[var19] = var14_ref_int__[var19] + var18;
                                                    var16_int = var16_int + var18;
                                                    var19++;
                                                    if (var22 != 0) {
                                                      break L36;
                                                    } else {
                                                      if (var22 == 0) {
                                                        continue L35;
                                                      } else {
                                                        break L37;
                                                      }
                                                    }
                                                  }
                                                }
                                                var17++;
                                                break L36;
                                              }
                                              if (var22 == 0) {
                                                continue L32;
                                              } else {
                                                break L34;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      stackOut_103_0 = 0;
                                      stackIn_104_0 = stackOut_103_0;
                                      break L33;
                                    }
                                    var17 = stackIn_104_0;
                                    L38: while (true) {
                                      L39: {
                                        if (~var5_int >= ~var17) {
                                          break L39;
                                        } else {
                                          if (var22 != 0) {
                                            break L16;
                                          } else {
                                            L40: {
                                              L41: {
                                                if (var6 != null) {
                                                  break L41;
                                                } else {
                                                  var18 = var17;
                                                  if (var22 == 0) {
                                                    break L40;
                                                  } else {
                                                    break L41;
                                                  }
                                                }
                                              }
                                              var18 = var6[var17];
                                              break L40;
                                            }
                                            L42: {
                                              L43: {
                                                if (0 == ((gk) this).field_k) {
                                                  break L43;
                                                } else {
                                                  var7[var18] = (Object) (Object) var15_ref_byte____[var17];
                                                  if (var22 == 0) {
                                                    break L42;
                                                  } else {
                                                    break L43;
                                                  }
                                                }
                                              }
                                              var7[var18] = nh.a(false, -11560, var15_ref_byte____[var17]);
                                              break L42;
                                            }
                                            var17++;
                                            if (var22 == 0) {
                                              continue L38;
                                            } else {
                                              break L39;
                                            }
                                          }
                                        }
                                      }
                                      if (var22 == 0) {
                                        break L16;
                                      } else {
                                        break L22;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var11 = var10.length;
                          var11--;
                          var12 = 255 & var10[var11];
                          var11 = var11 - var5_int * var12 * 4;
                          var13 = new wi(var10);
                          var14 = 0;
                          var13.field_h = var11;
                          var15 = 0;
                          var16_int = 0;
                          L44: while (true) {
                            L45: {
                              L46: {
                                if (~var12 >= ~var16_int) {
                                  break L46;
                                } else {
                                  var17 = 0;
                                  stackOut_122_0 = 0;
                                  stackIn_139_0 = stackOut_122_0;
                                  stackIn_123_0 = stackOut_122_0;
                                  if (var22 != 0) {
                                    break L45;
                                  } else {
                                    var18 = stackIn_123_0;
                                    L47: while (true) {
                                      L48: {
                                        L49: {
                                          if (var5_int <= var18) {
                                            break L49;
                                          } else {
                                            var17 = var17 + var13.j(-3);
                                            if (var22 != 0) {
                                              break L48;
                                            } else {
                                              L50: {
                                                L51: {
                                                  if (null != var6) {
                                                    break L51;
                                                  } else {
                                                    var19 = var18;
                                                    if (var22 == 0) {
                                                      break L50;
                                                    } else {
                                                      break L51;
                                                    }
                                                  }
                                                }
                                                var19 = var6[var18];
                                                break L50;
                                              }
                                              L52: {
                                                if (~param3 == ~var19) {
                                                  var15 = var19;
                                                  var14 = var14 + var17;
                                                  break L52;
                                                } else {
                                                  break L52;
                                                }
                                              }
                                              var18++;
                                              if (var22 == 0) {
                                                continue L47;
                                              } else {
                                                break L49;
                                              }
                                            }
                                          }
                                        }
                                        var16_int++;
                                        break L48;
                                      }
                                      if (var22 == 0) {
                                        continue L44;
                                      } else {
                                        break L46;
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_138_0 = -1;
                              stackIn_139_0 = stackOut_138_0;
                              break L45;
                            }
                            if (stackIn_139_0 == ~var14) {
                              stackOut_142_0 = 1;
                              stackIn_143_0 = stackOut_142_0;
                              return stackIn_143_0 != 0;
                            } else {
                              var16 = new byte[var14];
                              var13.field_h = var11;
                              var14 = 0;
                              var17 = 0;
                              var18 = 0;
                              L53: while (true) {
                                L54: {
                                  if (~var18 <= ~var12) {
                                    break L54;
                                  } else {
                                    var19 = 0;
                                    stackOut_146_0 = 0;
                                    stackIn_162_0 = stackOut_146_0;
                                    stackIn_147_0 = stackOut_146_0;
                                    if (var22 != 0) {
                                      break L15;
                                    } else {
                                      var20 = stackIn_147_0;
                                      L55: while (true) {
                                        L56: {
                                          L57: {
                                            if (~var5_int >= ~var20) {
                                              break L57;
                                            } else {
                                              var19 = var19 + var13.j(-3);
                                              if (var22 != 0) {
                                                break L56;
                                              } else {
                                                L58: {
                                                  L59: {
                                                    if (var6 == null) {
                                                      break L59;
                                                    } else {
                                                      var21 = var6[var20];
                                                      if (var22 == 0) {
                                                        break L58;
                                                      } else {
                                                        break L59;
                                                      }
                                                    }
                                                  }
                                                  var21 = var20;
                                                  break L58;
                                                }
                                                L60: {
                                                  if (var21 != param3) {
                                                    break L60;
                                                  } else {
                                                    cb.a(var10, var17, var16, var14, var19);
                                                    var14 = var14 + var19;
                                                    break L60;
                                                  }
                                                }
                                                var17 = var17 + var19;
                                                var20++;
                                                if (var22 == 0) {
                                                  continue L55;
                                                } else {
                                                  break L57;
                                                }
                                              }
                                            }
                                          }
                                          var18++;
                                          break L56;
                                        }
                                        if (var22 == 0) {
                                          continue L53;
                                        } else {
                                          break L54;
                                        }
                                      }
                                    }
                                  }
                                }
                                var7[var15] = (Object) (Object) var16;
                                break L16;
                              }
                            }
                          }
                        }
                        stackOut_161_0 = 1;
                        stackIn_162_0 = stackOut_161_0;
                        break L15;
                      }
                      break L0;
                    }
                  }
                  stackOut_30_0 = 1;
                  stackIn_31_0 = stackOut_30_0;
                  return stackIn_31_0 != 0;
                }
              } else {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L61: {
            var5 = decompiledCaughtException;
            stackOut_163_0 = (RuntimeException) var5;
            stackOut_163_1 = new StringBuilder().append("gk.P(").append(param0).append(',').append(param1).append(',');
            stackIn_166_0 = stackOut_163_0;
            stackIn_166_1 = stackOut_163_1;
            stackIn_164_0 = stackOut_163_0;
            stackIn_164_1 = stackOut_163_1;
            if (param2 == null) {
              stackOut_166_0 = (RuntimeException) (Object) stackIn_166_0;
              stackOut_166_1 = (StringBuilder) (Object) stackIn_166_1;
              stackOut_166_2 = "null";
              stackIn_167_0 = stackOut_166_0;
              stackIn_167_1 = stackOut_166_1;
              stackIn_167_2 = stackOut_166_2;
              break L61;
            } else {
              stackOut_164_0 = (RuntimeException) (Object) stackIn_164_0;
              stackOut_164_1 = (StringBuilder) (Object) stackIn_164_1;
              stackOut_164_2 = "{...}";
              stackIn_167_0 = stackOut_164_0;
              stackIn_167_1 = stackOut_164_1;
              stackIn_167_2 = stackOut_164_2;
              break L61;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_167_0, stackIn_167_2 + ',' + param3 + ')');
        }
        return stackIn_162_0 != 0;
    }

    final int a(String param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (!((gk) this).c(-104)) {
              stackOut_3_0 = -1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              param0 = param0.toLowerCase();
              var3_int = ((gk) this).field_l.field_a.a(-107, ae.a(-51764539, (CharSequence) (Object) param0));
              if (!this.a(var3_int, param1)) {
                stackOut_8_0 = -1;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0;
              } else {
                stackOut_10_0 = var3_int;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("gk.A(");
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L1;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ')');
        }
        return stackIn_11_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Create a free Account";
    }
}
