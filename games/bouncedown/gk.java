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
        CharSequence var6 = null;
        CharSequence var7 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        boolean stackIn_9_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_10_0 = false;
        boolean stackOut_8_0 = false;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            if (!((gk) this).c(-109)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              param0 = param0.toLowerCase();
              param1 = param1.toLowerCase();
              var6 = (CharSequence) (Object) param0;
              var4_int = ((gk) this).field_l.field_a.a(param2 ^ -16444, ae.a(param2 + -51781023, var6));
              if (this.a(var4_int, false)) {
                if (param2 == 16484) {
                  var7 = (CharSequence) (Object) param1;
                  var5 = ((gk) this).field_l.field_k[var4_int].a(-122, ae.a(-51764539, var7));
                  stackOut_10_0 = ((gk) this).a(var4_int, var5, (byte) -14);
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  stackOut_8_0 = ((boolean[]) ((gk) this).field_o[9])[3];
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              } else {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("gk.L(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L1;
            }
          }
          L2: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L2;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L2;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param2 + ')');
        }
        return stackIn_11_0;
    }

    private final synchronized void e(int param0, int param1) {
        if (((gk) this).field_b) {
            ((gk) this).field_o[param1] = (Object) (Object) ((gk) this).field_n.a(param1, true);
        } else {
            ((gk) this).field_o[param1] = nh.a(false, -11560, ((gk) this).field_n.a(param1, true));
        }
        if (param0 != -19250) {
            gk.a(((int[]) ((gk) this).field_o[1])[10], (String) ((gk) this).field_o[2]);
        }
    }

    final static boolean b() {
        return ih.field_Q.a(-125);
    }

    final int a(byte param0, int param1) {
        if (param0 != 47) {
            return ((int[]) ((gk) this).field_o[6])[22];
        }
        if (!(this.a(param1, false))) {
            return 0;
        }
        return ((gk) this).field_l.field_c[param1];
    }

    final static void a(int param0, String param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
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
                if (!nh.field_P) {
                  if (ea.field_b <= ge.field_c) {
                    if (ge.field_c < ea.field_b + sd.field_lb) {
                      stackOut_14_0 = 1;
                      stackIn_16_0 = stackOut_14_0;
                      break L4;
                    } else {
                      stackOut_13_0 = 0;
                      stackIn_16_0 = stackOut_13_0;
                      break L4;
                    }
                  } else {
                    stackOut_11_0 = 0;
                    stackIn_16_0 = stackOut_11_0;
                    break L4;
                  }
                } else {
                  stackOut_9_0 = 0;
                  stackIn_16_0 = stackOut_9_0;
                  break L4;
                }
              }
              L5: {
                L6: {
                  var2_int = stackIn_16_0;
                  if (param1 == null) {
                    break L6;
                  } else {
                    L7: {
                      if (nh.field_P) {
                        break L7;
                      } else {
                        if (var2_int != 0) {
                          break L7;
                        } else {
                          break L6;
                        }
                      }
                    }
                    ge.field_c = ea.field_b;
                    break L5;
                  }
                }
                ge.field_c = 0;
                break L5;
              }
              L8: {
                mh.field_Z = ck.field_c;
                if (param1 != null) {
                  nh.field_P = false;
                  break L8;
                } else {
                  if (var2_int == 0) {
                    break L8;
                  } else {
                    nh.field_P = true;
                    break L8;
                  }
                }
              }
              ha.field_b = sj.field_d;
              break L2;
            }
            L9: {
              oc.field_b = param1;
              if (nh.field_P) {
                break L9;
              } else {
                if (ge.field_c >= ea.field_b) {
                  break L9;
                } else {
                  if (mi.field_j) {
                    ge.field_c = 0;
                    mh.field_Z = ck.field_c;
                    ha.field_b = sj.field_d;
                    break L9;
                  } else {
                    break L9;
                  }
                }
              }
            }
            L10: {
              ck.field_c = -1;
              if (param0 > 20) {
                break L10;
              } else {
                gk.b(false);
                break L10;
              }
            }
            L11: {
              if (!nh.field_P) {
                break L11;
              } else {
                if (jk.field_K != ge.field_c) {
                  break L11;
                } else {
                  nh.field_P = false;
                  ge.field_c = 0;
                  break L11;
                }
              }
            }
            sj.field_d = -1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var2 = decompiledCaughtException;
            stackOut_39_0 = (RuntimeException) var2;
            stackOut_39_1 = new StringBuilder().append("gk.B(").append(param0).append(',');
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param1 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L12;
            } else {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L12;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + ')');
        }
    }

    private final synchronized boolean a(int param0, boolean param1) {
        if (!((gk) this).c(-94)) {
          return false;
        } else {
          L0: {
            if (!param1) {
              break L0;
            } else {
              ((gk) this).field_c = (Object[][]) ((gk) this).field_o[8];
              break L0;
            }
          }
          L1: {
            if (0 > param0) {
              break L1;
            } else {
              if (((gk) this).field_l.field_c.length <= param0) {
                break L1;
              } else {
                if (0 != ((gk) this).field_l.field_c[param0]) {
                  return true;
                } else {
                  break L1;
                }
              }
            }
          }
          if (!pe.field_e) {
            return false;
          } else {
            throw new IllegalArgumentException(Integer.toString(param0));
          }
        }
    }

    final boolean b(String param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (((gk) this).c(-78)) {
              L1: {
                param0 = param0.toLowerCase();
                var4 = (CharSequence) (Object) param0;
                var3_int = ((gk) this).field_l.field_a.a(-55, ae.a(-51764539, var4));
                if (!param1) {
                  break L1;
                } else {
                  field_g = (byte[][]) ((gk) this).field_o[0];
                  break L1;
                }
              }
              stackOut_5_0 = ((gk) this).d(var3_int, 77);
              stackIn_6_0 = stackOut_5_0;
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
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("gk.M(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ')');
        }
        return stackIn_6_0;
    }

    final synchronized int a(int param0, int param1) {
        if (!this.a(param0, false)) {
            return 0;
        }
        if (param1 != 0) {
            return -128;
        }
        if (!(null == ((gk) this).field_o[param0])) {
            return 100;
        }
        return ((gk) this).field_n.a(113, param0);
    }

    final synchronized boolean c(int param0) {
        if (((gk) this).field_l == null) {
            ((gk) this).field_l = ((gk) this).field_n.b(1);
            if (null == ((gk) this).field_l) {
                return false;
            }
            ((gk) this).field_o = new Object[((gk) this).field_l.field_m];
            ((gk) this).field_c = new Object[((gk) this).field_l.field_m][];
        }
        int var2 = 110 % ((-19 - param0) / 57);
        return true;
    }

    private final synchronized boolean a(int param0, int param1, int param2) {
        if (((gk) this).c(72)) {
          L0: {
            if (0 > param0) {
              break L0;
            } else {
              if (0 > param1) {
                break L0;
              } else {
                if (((gk) this).field_l.field_c.length <= param0) {
                  break L0;
                } else {
                  if (param1 < ((gk) this).field_l.field_c[param0]) {
                    return true;
                  } else {
                    break L0;
                  }
                }
              }
            }
          }
          if (!pe.field_e) {
            return false;
          } else {
            throw new IllegalArgumentException(param0 + " " + param1);
          }
        } else {
          return false;
        }
    }

    public static void b(boolean param0) {
        field_e = null;
        field_g = null;
        field_i = null;
        field_j = null;
        field_h = null;
        field_m = null;
    }

    final boolean a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_1_0 = 0;
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
              var4 = (CharSequence) (Object) param0;
              var3_int = ((gk) this).field_l.field_a.a(-86, ae.a(-51764539, var4));
              if (0 > var3_int) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                return true;
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
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("gk.CA(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
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
          throw ii.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ')');
        }
        return stackIn_8_0 != 0;
    }

    final int b(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (((gk) this).c(param1 + 145)) {
              param0 = param0.toLowerCase();
              if (param1 == -100) {
                var4 = (CharSequence) (Object) param0;
                var3_int = ((gk) this).field_l.field_a.a(-64, ae.a(-51764539, var4));
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
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    final synchronized int a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Bounce.field_N;
        if (!((gk) this).c(94)) {
          return 0;
        } else {
          var2 = 0;
          var3 = 0;
          var4 = 0;
          L0: while (true) {
            if (var4 >= ((gk) this).field_o.length) {
              if (var2 == 0) {
                return 100;
              } else {
                var4 = var3 * param0 / var2;
                return var4;
              }
            } else {
              if (((gk) this).field_l.field_q[var4] > 0) {
                var3 = var3 + ((gk) this).a(var4, 0);
                var2 += 100;
                var4++;
                continue L0;
              } else {
                var4++;
                continue L0;
              }
            }
          }
        }
    }

    final int a(boolean param0) {
        if (!((gk) this).c(45)) {
            return -1;
        }
        if (!param0) {
            return -115;
        }
        return ((gk) this).field_l.field_c.length;
    }

    final static void a(int param0, int param1, tg[] param2, int param3, int param4) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
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
                  na.c(var5_int + param0, param3, param4 + param0 - var6, param3 - -param2[1].field_o);
                  var8 = param0 - -var5_int;
                  var9 = param4 + (param0 + -var6);
                  param0 = var8;
                  L2: while (true) {
                    if (var9 <= param0) {
                      na.a(hh.field_h);
                      break L0;
                    } else {
                      param2[1].a(param0, param3);
                      param0 = param0 + var7;
                      continue L2;
                    }
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
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) runtimeException;
            stackOut_9_1 = new StringBuilder().append("gk.H(").append(param0).append(',').append(1).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final synchronized byte[] b(String param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        Object stackIn_5_0 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
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
            var4_int = -22 / ((70 - param2) / 47);
            if (((gk) this).c(50)) {
              param0 = param0.toLowerCase();
              param1 = param1.toLowerCase();
              var7 = (CharSequence) (Object) param0;
              var5 = ((gk) this).field_l.field_a.a(-73, ae.a(-51764539, var7));
              if (this.a(var5, false)) {
                var8 = (CharSequence) (Object) param1;
                var6 = ((gk) this).field_l.field_k[var5].a(-96, ae.a(-51764539, var8));
                stackOut_6_0 = ((gk) this).b(104, var6, var5);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return (byte[]) (Object) stackIn_5_0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("gk.Q(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          L2: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
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
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param2 + ')');
        }
        return stackIn_7_0;
    }

    final synchronized boolean d(int param0, int param1) {
        if (!this.a(param0, false)) {
            return false;
        }
        if (!(((gk) this).field_o[param0] == null)) {
            return true;
        }
        this.e(-19250, param0);
        if (param1 <= 68) {
            field_d = '￾';
        }
        if (null == ((gk) this).field_o[param0]) {
            return false;
        }
        return true;
    }

    final int a(int param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (this.a(param0, false)) {
              var5 = -1 / ((51 - param2) / 44);
              param1 = param1.toLowerCase();
              var6 = (CharSequence) (Object) param1;
              var4_int = ((gk) this).field_l.field_k[param0].a(-79, ae.a(-51764539, var6));
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
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param2 + ')');
        }
        return stackIn_7_0;
    }

    final synchronized boolean a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Bounce.field_N;
        if (!((gk) this).c(-95)) {
          return false;
        } else {
          L0: {
            if (param0 <= -35) {
              break L0;
            } else {
              boolean discarded$2 = ((gk) this).a(-77, -72, (byte) -81);
              break L0;
            }
          }
          var2 = 1;
          var3 = 0;
          L1: while (true) {
            if (var3 >= ((gk) this).field_l.field_n.length) {
              return var2 != 0;
            } else {
              var4 = ((gk) this).field_l.field_n[var3];
              if (null == ((gk) this).field_o[var4]) {
                this.e(-19250, var4);
                if (null == ((gk) this).field_o[var4]) {
                  var2 = 0;
                  var3++;
                  continue L1;
                } else {
                  var3++;
                  continue L1;
                }
              } else {
                var3++;
                continue L1;
              }
            }
          }
        }
    }

    final static void b(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = Bounce.field_N;
          var2 = 0;
          var3 = oa.field_a;
          if (var3 < 5) {
            var2 = var3 * var3 * 8192 / 1100;
            break L0;
          } else {
            if (105 > var3) {
              var2 = (-40960 + var3 * 16384) / 220;
              break L0;
            } else {
              if (var3 >= 120) {
                break L0;
              } else {
                var3 = 120 - var3;
                var2 = 8192 - var3 * var3 * 8192 / 3300;
                break L0;
              }
            }
          }
        }
        L1: {
          var4 = 1;
          var5 = 0;
          if (param0 == 3) {
            var4 = -1;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (param0 == 1) {
            var5 = 1;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (4 == param0) {
            var5 = 1;
            var4 = 1;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (param0 == 5) {
            var4 = -1;
            var5 = 1;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (6 == param0) {
            var5 = -1;
            var4 = 1;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          L7: {
            if (7 == param0) {
              break L7;
            } else {
              if (param0 == 8) {
                break L7;
              } else {
                break L6;
              }
            }
          }
          var4 = -1;
          var5 = -1;
          break L6;
        }
        L8: {
          if (param0 == 11) {
            var4 = -1;
            break L8;
          } else {
            break L8;
          }
        }
        L9: {
          if (12 != param0) {
            break L9;
          } else {
            var5 = -1;
            var4 = -1;
            break L9;
          }
        }
        L10: {
          if (param0 == 13) {
            var4 = 1;
            var5 = -1;
            break L10;
          } else {
            break L10;
          }
        }
        L11: {
          if (14 != param0) {
            break L11;
          } else {
            var5 = 1;
            var4 = -1;
            break L11;
          }
        }
        L12: {
          if (param0 == 15) {
            var5 = 1;
            var4 = 1;
            break L12;
          } else {
            break L12;
          }
        }
        il.field_e = jf.a(var2 * var4, false, var5 * var2);
    }

    final synchronized boolean a(int param0, int param1, byte param2) {
        if (!(this.a(param0, param1, 0))) {
            return false;
        }
        if (null != ((gk) this).field_c[param0]) {
            if (!(((gk) this).field_c[param0][param1] == null)) {
                return true;
            }
        }
        if (null != ((gk) this).field_o[param0]) {
            return true;
        }
        if (param2 != -14) {
            int discarded$0 = ((gk) this).a((String) null, ((boolean[]) ((gk) this).field_o[2])[0]);
        }
        this.e(param2 ^ 19260, param0);
        if (((gk) this).field_o[param0] != null) {
            return true;
        }
        return false;
    }

    final byte[] b(int param0, int param1, int param2) {
        int var4 = -13 % ((46 - param0) / 44);
        return this.a((byte) 121, param2, param1, (int[]) null);
    }

    gk(td param0, boolean param1, int param2) {
        RuntimeException runtimeException = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        ((gk) this).field_l = null;
        try {
          L0: {
            L1: {
              if (0 > param2) {
                break L1;
              } else {
                if (2 >= param2) {
                  L2: {
                    stackOut_4_0 = this;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (!param1) {
                      stackOut_6_0 = this;
                      stackOut_6_1 = 0;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      break L2;
                    } else {
                      stackOut_5_0 = this;
                      stackOut_5_1 = 1;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      break L2;
                    }
                  }
                  ((gk) this).field_b = stackIn_7_1 != 0;
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
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) runtimeException;
            stackOut_9_1 = new StringBuilder().append("gk.<init>(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final synchronized byte[] a(byte param0, int param1, int param2, int[] param3) {
        Object var5 = null;
        byte[] var7 = null;
        Object stackIn_2_0 = null;
        Object stackIn_24_0 = null;
        Object stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        Object stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        Object stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_23_0 = null;
        Object stackOut_1_0 = null;
        Object stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        Object stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        Object stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
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
                if (!this.a(param1, false, param3, param2)) {
                  this.e(-19250, param1);
                  if (this.a(param1, false, param3, param2)) {
                    break L1;
                  } else {
                    return null;
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
                    var7 = qf.a(0, false, ((gk) this).field_c[param1][param2]);
                    var5 = (Object) (Object) var7;
                    if (var7 != null) {
                      break L3;
                    } else {
                      throw new RuntimeException("");
                    }
                  }
                }
                L4: {
                  if (var5 == null) {
                    break L4;
                  } else {
                    if (((gk) this).field_k != 1) {
                      if (((gk) this).field_k != 2) {
                        break L4;
                      } else {
                        ((gk) this).field_c[param1] = null;
                        break L4;
                      }
                    } else {
                      ((gk) this).field_c[param1][param2] = null;
                      if (1 != ((gk) this).field_l.field_c[param1]) {
                        break L4;
                      } else {
                        ((gk) this).field_c[param1] = null;
                        break L4;
                      }
                    }
                  }
                }
                stackOut_23_0 = var5;
                stackIn_24_0 = stackOut_23_0;
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
          L5: {
            var5 = (Object) (Object) decompiledCaughtException;
            stackOut_25_0 = var5;
            stackOut_25_1 = new StringBuilder().append("gk.N(").append(121).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param3 == null) {
              stackOut_27_0 = stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L5;
            } else {
              stackOut_26_0 = stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L5;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ')');
        }
        return (byte[]) (Object) stackIn_24_0;
    }

    final synchronized byte[] c(int param0, int param1) {
        if (!((gk) this).c(68)) {
            return null;
        }
        if (((gk) this).field_l.field_c.length == 1) {
            return ((gk) this).b(113, param1, 0);
        }
        if (!this.a(param1, false)) {
            return null;
        }
        if (param0 <= 118) {
            field_h = null;
        }
        if (!(((gk) this).field_l.field_c[param1] != 1)) {
            return ((gk) this).b(-19, 0, param1);
        }
        throw new RuntimeException();
    }

    private final synchronized boolean a(int param0, boolean param1, int[] param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        Object var9 = null;
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
        byte[] var23 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        int stackIn_35_2 = 0;
        int stackIn_85_0 = 0;
        int stackIn_99_0 = 0;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        String stackIn_103_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        int stackOut_34_2 = 0;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        int stackOut_33_2 = 0;
        int stackOut_84_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_100_0 = null;
        StringBuilder stackOut_100_1 = null;
        RuntimeException stackOut_102_0 = null;
        StringBuilder stackOut_102_1 = null;
        String stackOut_102_2 = null;
        RuntimeException stackOut_101_0 = null;
        StringBuilder stackOut_101_1 = null;
        String stackOut_101_2 = null;
        var22 = Bounce.field_N;
        try {
          L0: {
            if (this.a(param0, false)) {
              if (null != ((gk) this).field_o[param0]) {
                L1: {
                  var5_int = ((gk) this).field_l.field_q[param0];
                  var6 = ((gk) this).field_l.field_o[param0];
                  if (null == ((gk) this).field_c[param0]) {
                    ((gk) this).field_c[param0] = new Object[((gk) this).field_l.field_c[param0]];
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var7 = ((gk) this).field_c[param0];
                var8 = 1;
                var9_int = 0;
                L2: while (true) {
                  L3: {
                    if (var9_int >= var5_int) {
                      break L3;
                    } else {
                      L4: {
                        if (var6 != null) {
                          var10_int = var6[var9_int];
                          break L4;
                        } else {
                          var10_int = var9_int;
                          break L4;
                        }
                      }
                      if (var7[var10_int] != null) {
                        var9_int++;
                        continue L2;
                      } else {
                        var8 = 0;
                        break L3;
                      }
                    }
                  }
                  if (var8 != 0) {
                    stackOut_20_0 = 1;
                    stackIn_21_0 = stackOut_20_0;
                    return stackIn_21_0 != 0;
                  } else {
                    L5: {
                      L6: {
                        if (param2 == null) {
                          break L6;
                        } else {
                          L7: {
                            if (0 != param2[0]) {
                              break L7;
                            } else {
                              if (param2[1] != 0) {
                                break L7;
                              } else {
                                if (param2[2] != 0) {
                                  break L7;
                                } else {
                                  if (param2[3] == 0) {
                                    break L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                          }
                          var9_array = qf.a(0, true, ((gk) this).field_o[param0]);
                          var10_ref = new wi(var9_array);
                          var10_ref.a(85, param2, 5, var10_ref.field_i.length);
                          break L5;
                        }
                      }
                      var9_array = qf.a(0, false, ((gk) this).field_o[param0]);
                      break L5;
                    }
                    try {
                      L8: {
                        var23 = ta.a(21125, var9_array);
                        var10 = var23;
                        break L8;
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L9: {
                        var11_ref_RuntimeException = decompiledCaughtException;
                        stackOut_32_0 = (RuntimeException) var11_ref_RuntimeException;
                        stackOut_32_1 = new StringBuilder();
                        stackIn_34_0 = stackOut_32_0;
                        stackIn_34_1 = stackOut_32_1;
                        stackIn_33_0 = stackOut_32_0;
                        stackIn_33_1 = stackOut_32_1;
                        if (param2 == null) {
                          stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
                          stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
                          stackOut_34_2 = 0;
                          stackIn_35_0 = stackOut_34_0;
                          stackIn_35_1 = stackOut_34_1;
                          stackIn_35_2 = stackOut_34_2;
                          break L9;
                        } else {
                          stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
                          stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
                          stackOut_33_2 = 1;
                          stackIn_35_0 = stackOut_33_0;
                          stackIn_35_1 = stackOut_33_1;
                          stackIn_35_2 = stackOut_33_2;
                          break L9;
                        }
                      }
                      throw ii.a((Throwable) (Object) stackIn_35_0, (stackIn_35_2 != 0) + " " + param0 + " " + param2.length + " " + nb.a(var9_array, param2.length, (byte) -86) + " " + nb.a(var9_array, -2 + param2.length, (byte) -82) + " " + ((gk) this).field_l.field_j[param0] + " " + ((gk) this).field_l.field_b);
                    }
                    L10: {
                      if (!((gk) this).field_b) {
                        break L10;
                      } else {
                        ((gk) this).field_o[param0] = null;
                        break L10;
                      }
                    }
                    L11: {
                      if (var5_int > 1) {
                        if (2 == ((gk) this).field_k) {
                          var11 = var23.length;
                          var11--;
                          var12 = 255 & var23[var11];
                          var11 = var11 - var5_int * var12 * 4;
                          var13 = new wi(var10);
                          var14 = 0;
                          var13.field_h = var11;
                          var15 = 0;
                          var16_int = 0;
                          L12: while (true) {
                            if (var12 <= var16_int) {
                              if (var14 == 0) {
                                stackOut_84_0 = 1;
                                stackIn_85_0 = stackOut_84_0;
                                return stackIn_85_0 != 0;
                              } else {
                                var16 = new byte[var14];
                                var13.field_h = var11;
                                var14 = 0;
                                var17 = 0;
                                var18 = 0;
                                L13: while (true) {
                                  if (var18 >= var12) {
                                    var7[var15] = (Object) (Object) var16;
                                    break L11;
                                  } else {
                                    var19 = 0;
                                    var20 = 0;
                                    L14: while (true) {
                                      if (var5_int <= var20) {
                                        var18++;
                                        continue L13;
                                      } else {
                                        L15: {
                                          var19 = var19 + var13.j(-3);
                                          if (var6 == null) {
                                            var21 = var20;
                                            break L15;
                                          } else {
                                            var21 = var6[var20];
                                            break L15;
                                          }
                                        }
                                        L16: {
                                          if (var21 != param3) {
                                            break L16;
                                          } else {
                                            cb.a(var10, var17, var16, var14, var19);
                                            var14 = var14 + var19;
                                            break L16;
                                          }
                                        }
                                        var17 = var17 + var19;
                                        var20++;
                                        continue L14;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              var17 = 0;
                              var18 = 0;
                              L17: while (true) {
                                if (var5_int <= var18) {
                                  var16_int++;
                                  continue L12;
                                } else {
                                  L18: {
                                    var17 = var17 + var13.j(-3);
                                    if (var6 != null) {
                                      var19 = var6[var18];
                                      break L18;
                                    } else {
                                      var19 = var18;
                                      break L18;
                                    }
                                  }
                                  L19: {
                                    if (param3 == var19) {
                                      var15 = var19;
                                      var14 = var14 + var17;
                                      break L19;
                                    } else {
                                      break L19;
                                    }
                                  }
                                  var18++;
                                  continue L17;
                                }
                              }
                            }
                          }
                        } else {
                          var11 = var23.length;
                          var11--;
                          var12 = var23[var11] & 255;
                          var11 = var11 - 4 * (var5_int * var12);
                          var13 = new wi(var10);
                          var14_ref_int__ = new int[var5_int];
                          var13.field_h = var11;
                          var15 = 0;
                          L20: while (true) {
                            if (var15 >= var12) {
                              var15_ref_byte____ = new byte[var5_int][];
                              var16_int = 0;
                              L21: while (true) {
                                if (var16_int >= var5_int) {
                                  var13.field_h = var11;
                                  var16_int = 0;
                                  var17 = 0;
                                  L22: while (true) {
                                    if (var12 <= var17) {
                                      var17 = 0;
                                      L23: while (true) {
                                        if (var5_int <= var17) {
                                          break L11;
                                        } else {
                                          L24: {
                                            if (var6 != null) {
                                              var18 = var6[var17];
                                              break L24;
                                            } else {
                                              var18 = var17;
                                              break L24;
                                            }
                                          }
                                          L25: {
                                            if (0 == ((gk) this).field_k) {
                                              var7[var18] = nh.a(false, -11560, var15_ref_byte____[var17]);
                                              break L25;
                                            } else {
                                              var7[var18] = (Object) (Object) var15_ref_byte____[var17];
                                              break L25;
                                            }
                                          }
                                          var17++;
                                          continue L23;
                                        }
                                      }
                                    } else {
                                      var18 = 0;
                                      var19 = 0;
                                      L26: while (true) {
                                        if (var19 >= var5_int) {
                                          var17++;
                                          continue L22;
                                        } else {
                                          var18 = var18 + var13.j(-3);
                                          cb.a(var10, var16_int, var15_ref_byte____[var19], var14_ref_int__[var19], var18);
                                          var14_ref_int__[var19] = var14_ref_int__[var19] + var18;
                                          var16_int = var16_int + var18;
                                          var19++;
                                          continue L26;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  var15_ref_byte____[var16_int] = new byte[var14_ref_int__[var16_int]];
                                  var14_ref_int__[var16_int] = 0;
                                  var16_int++;
                                  continue L21;
                                }
                              }
                            } else {
                              var16_int = 0;
                              var17 = 0;
                              L27: while (true) {
                                if (var17 >= var5_int) {
                                  var15++;
                                  continue L20;
                                } else {
                                  var16_int = var16_int + var13.j(-3);
                                  var14_ref_int__[var17] = var14_ref_int__[var17] + var16_int;
                                  var17++;
                                  continue L27;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        L28: {
                          if (var6 != null) {
                            var11 = var6[0];
                            break L28;
                          } else {
                            var11 = 0;
                            break L28;
                          }
                        }
                        if (0 == ((gk) this).field_k) {
                          var7[var11] = nh.a(false, -11560, var10);
                          break L11;
                        } else {
                          var7[var11] = (Object) (Object) var23;
                          return true;
                        }
                      }
                    }
                    stackOut_98_0 = 1;
                    stackIn_99_0 = stackOut_98_0;
                    break L0;
                  }
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
          L29: {
            var5 = decompiledCaughtException;
            stackOut_100_0 = (RuntimeException) var5;
            stackOut_100_1 = new StringBuilder().append("gk.P(").append(param0).append(',').append(false).append(',');
            stackIn_102_0 = stackOut_100_0;
            stackIn_102_1 = stackOut_100_1;
            stackIn_101_0 = stackOut_100_0;
            stackIn_101_1 = stackOut_100_1;
            if (param2 == null) {
              stackOut_102_0 = (RuntimeException) (Object) stackIn_102_0;
              stackOut_102_1 = (StringBuilder) (Object) stackIn_102_1;
              stackOut_102_2 = "null";
              stackIn_103_0 = stackOut_102_0;
              stackIn_103_1 = stackOut_102_1;
              stackIn_103_2 = stackOut_102_2;
              break L29;
            } else {
              stackOut_101_0 = (RuntimeException) (Object) stackIn_101_0;
              stackOut_101_1 = (StringBuilder) (Object) stackIn_101_1;
              stackOut_101_2 = "{...}";
              stackIn_103_0 = stackOut_101_0;
              stackIn_103_1 = stackOut_101_1;
              stackIn_103_2 = stackOut_101_2;
              break L29;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_103_0, stackIn_103_2 + ',' + param3 + ')');
        }
        return stackIn_99_0 != 0;
    }

    final int a(String param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (!((gk) this).c(-104)) {
              stackOut_2_0 = -1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              param0 = param0.toLowerCase();
              var4 = (CharSequence) (Object) param0;
              var3_int = ((gk) this).field_l.field_a.a(-107, ae.a(-51764539, var4));
              if (!this.a(var3_int, param1)) {
                stackOut_6_0 = -1;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                return var3_int;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("gk.A(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Create a free Account";
    }
}
