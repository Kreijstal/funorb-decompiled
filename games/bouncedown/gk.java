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
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44);
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
          throw ii.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param2 + 41);
        }
        return stackIn_11_0;
    }

    private final synchronized void e(int param0, int param1) {
        L0: {
          L1: {
            if (!((gk) this).field_b) {
              break L1;
            } else {
              ((gk) this).field_o[param1] = (Object) (Object) ((gk) this).field_n.a(param1, true);
              if (Bounce.field_N == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          ((gk) this).field_o[param1] = nh.a(false, -11560, ((gk) this).field_n.a(param1, true));
          break L0;
        }
        L2: {
          if (param0 == -19250) {
            break L2;
          } else {
            gk.a(((int[]) ((gk) this).field_o[1])[10], (String) ((gk) this).field_o[2]);
            break L2;
          }
        }
    }

    final static boolean b(int param0) {
        if (param0 < 110) {
            field_g = null;
        }
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
        int stackIn_13_0 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
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
                        stackOut_11_0 = 1;
                        stackIn_13_0 = stackOut_11_0;
                        break L4;
                      }
                    }
                  }
                }
                stackOut_12_0 = 0;
                stackIn_13_0 = stackOut_12_0;
                break L4;
              }
              L6: {
                L7: {
                  L8: {
                    var2_int = stackIn_13_0;
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
                  if (param1 != null) {
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
            stackOut_38_0 = (RuntimeException) var2;
            stackOut_38_1 = new StringBuilder().append("gk.B(").append(param0).append(44);
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param1 == null) {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L14;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L14;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + 41);
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
          throw ii.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 41);
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
          throw ii.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 41);
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
          throw ii.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 41);
        }
        return stackIn_7_0;
    }

    final synchronized int a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        var5 = Bounce.field_N;
        if (!((gk) this).c(94)) {
          return 0;
        } else {
          var2 = 0;
          var3 = 0;
          var4 = 0;
          L0: while (true) {
            L1: {
              L2: {
                if (~var4 <= ~((gk) this).field_o.length) {
                  break L2;
                } else {
                  stackOut_5_0 = -1;
                  stackOut_5_1 = ~((gk) this).field_l.field_q[var4];
                  stackIn_11_0 = stackOut_5_0;
                  stackIn_11_1 = stackOut_5_1;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  if (var5 != 0) {
                    break L1;
                  } else {
                    L3: {
                      if (stackIn_6_0 > stackIn_6_1) {
                        var3 = var3 + ((gk) this).a(var4, 0);
                        var2 += 100;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var4++;
                    if (var5 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              stackOut_10_0 = ~var2;
              stackOut_10_1 = -1;
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              break L1;
            }
            if (stackIn_11_0 == stackIn_11_1) {
              return 100;
            } else {
              var4 = var3 * param0 / var2;
              return var4;
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
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
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
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("gk.H(").append(param0).append(44).append(param1).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param3 + 44 + param4 + 41);
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
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44);
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
          throw ii.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param2 + 41);
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
            stackOut_8_1 = new StringBuilder().append("gk.I(").append(param0).append(44);
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
          throw ii.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param2 + 41);
        }
        return stackIn_7_0;
    }

    final synchronized boolean a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_12_0 = 0;
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
            L2: {
              L3: {
                if (~var3 <= ~((gk) this).field_l.field_n.length) {
                  break L3;
                } else {
                  stackOut_7_0 = ((gk) this).field_l.field_n[var3];
                  stackIn_13_0 = stackOut_7_0;
                  stackIn_8_0 = stackOut_7_0;
                  if (var5 != 0) {
                    break L2;
                  } else {
                    L4: {
                      var4 = stackIn_8_0;
                      if (null != ((gk) this).field_o[var4]) {
                        break L4;
                      } else {
                        this.e(-19250, var4);
                        if (null != ((gk) this).field_o[var4]) {
                          break L4;
                        } else {
                          var2 = 0;
                          break L4;
                        }
                      }
                    }
                    var3++;
                    if (var5 == 0) {
                      continue L1;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              stackOut_12_0 = var2;
              stackIn_13_0 = stackOut_12_0;
              break L2;
            }
            return stackIn_13_0 != 0;
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
          L1: {
            var6 = Bounce.field_N;
            var2 = 0;
            var3 = oa.field_a;
            if (var3 < 5) {
              break L1;
            } else {
              L2: {
                if (105 > var3) {
                  break L2;
                } else {
                  if (var3 >= 120) {
                    break L0;
                  } else {
                    var3 = 120 - var3;
                    var2 = 8192 - var3 * var3 * 8192 / 3300;
                    if (var6 == 0) {
                      break L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              var2 = (-40960 + var3 * 16384) / 220;
              if (var6 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          var2 = var3 * var3 * 8192 / 1100;
          break L0;
        }
        L3: {
          var4 = 1;
          field_j = null;
          var5 = 0;
          if (param0 == 3) {
            var4 = -1;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (param0 == 1) {
            var5 = 1;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (4 == param0) {
            var5 = 1;
            var4 = 1;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          if (param0 == 5) {
            var4 = -1;
            var5 = 1;
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          if (6 == param0) {
            var5 = -1;
            var4 = 1;
            break L7;
          } else {
            break L7;
          }
        }
        L8: {
          L9: {
            if (7 == param0) {
              break L9;
            } else {
              if (param0 == 8) {
                break L9;
              } else {
                break L8;
              }
            }
          }
          var4 = -1;
          var5 = -1;
          break L8;
        }
        L10: {
          if (param0 == 11) {
            var4 = -1;
            break L10;
          } else {
            break L10;
          }
        }
        L11: {
          if (12 != param0) {
            break L11;
          } else {
            var5 = -1;
            var4 = -1;
            break L11;
          }
        }
        L12: {
          if (param0 == 13) {
            var4 = 1;
            var5 = -1;
            break L12;
          } else {
            break L12;
          }
        }
        L13: {
          if (14 != param0) {
            break L13;
          } else {
            var5 = 1;
            var4 = -1;
            break L13;
          }
        }
        L14: {
          if (param0 == 15) {
            var5 = 1;
            var4 = 1;
            break L14;
          } else {
            break L14;
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
          throw ii.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    private final synchronized byte[] a(byte param0, int param1, int param2, int[] param3) {
        Object var5 = null;
        byte[] var7 = null;
        Object stackIn_2_0 = null;
        Object stackIn_27_0 = null;
        Object stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        Object stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        Object stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_26_0 = null;
        Object stackOut_1_0 = null;
        Object stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        Object stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        Object stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
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
                stackOut_26_0 = var5;
                stackIn_27_0 = stackOut_26_0;
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
            stackOut_28_0 = var5;
            stackOut_28_1 = new StringBuilder().append("gk.N(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param3 == null) {
              stackOut_30_0 = stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L7;
            } else {
              stackOut_29_0 = stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L7;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + 41);
        }
        return (byte[]) (Object) stackIn_27_0;
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
        int stackIn_25_0 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        int stackIn_39_2 = 0;
        int stackIn_55_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_111_0 = 0;
        int stackIn_115_0 = 0;
        int stackIn_128_0 = 0;
        RuntimeException stackIn_130_0 = null;
        StringBuilder stackIn_130_1 = null;
        RuntimeException stackIn_131_0 = null;
        StringBuilder stackIn_131_1 = null;
        RuntimeException stackIn_132_0 = null;
        StringBuilder stackIn_132_1 = null;
        String stackIn_132_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        int stackOut_38_2 = 0;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        int stackOut_37_2 = 0;
        int stackOut_54_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_94_0 = 0;
        int stackOut_107_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_114_0 = 0;
        int stackOut_127_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_129_0 = null;
        StringBuilder stackOut_129_1 = null;
        RuntimeException stackOut_131_0 = null;
        StringBuilder stackOut_131_1 = null;
        String stackOut_131_2 = null;
        RuntimeException stackOut_130_0 = null;
        StringBuilder stackOut_130_1 = null;
        String stackOut_130_2 = null;
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
                              if (var6 != null) {
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
                          var23 = ta.a(21125, var9_array);
                          var10 = var23;
                          break L12;
                        }
                      } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L13: {
                          var11_ref_RuntimeException = decompiledCaughtException;
                          stackOut_36_0 = (RuntimeException) var11_ref_RuntimeException;
                          stackOut_36_1 = new StringBuilder();
                          stackIn_38_0 = stackOut_36_0;
                          stackIn_38_1 = stackOut_36_1;
                          stackIn_37_0 = stackOut_36_0;
                          stackIn_37_1 = stackOut_36_1;
                          if (param2 == null) {
                            stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
                            stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
                            stackOut_38_2 = 0;
                            stackIn_39_0 = stackOut_38_0;
                            stackIn_39_1 = stackOut_38_1;
                            stackIn_39_2 = stackOut_38_2;
                            break L13;
                          } else {
                            stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
                            stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
                            stackOut_37_2 = 1;
                            stackIn_39_0 = stackOut_37_0;
                            stackIn_39_1 = stackOut_37_1;
                            stackIn_39_2 = stackOut_37_2;
                            break L13;
                          }
                        }
                        throw ii.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + " " + param0 + " " + param2.length + " " + nb.a(var9_array, param2.length, (byte) -86) + " " + nb.a(var9_array, -2 + param2.length, (byte) -82) + " " + ((gk) this).field_l.field_j[param0] + " " + ((gk) this).field_l.field_b);
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
                                    var7[var11] = (Object) (Object) var23;
                                    if (var22 == 0) {
                                      break L20;
                                    } else {
                                      break L21;
                                    }
                                  }
                                }
                                var7[var11] = nh.a(false, -11560, var23);
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
                              var11 = var23.length;
                              var11--;
                              var12 = var23[var11] & 255;
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
                                      stackOut_54_0 = 0;
                                      stackIn_63_0 = stackOut_54_0;
                                      stackIn_55_0 = stackOut_54_0;
                                      if (var22 != 0) {
                                        break L24;
                                      } else {
                                        var17 = stackIn_55_0;
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
                                  stackOut_62_0 = var5_int;
                                  stackIn_63_0 = stackOut_62_0;
                                  break L24;
                                }
                                var15_ref_byte____ = new byte[stackIn_63_0][];
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
                                          stackOut_71_0 = 0;
                                          stackIn_80_0 = stackOut_71_0;
                                          stackIn_72_0 = stackOut_71_0;
                                          if (var22 != 0) {
                                            break L33;
                                          } else {
                                            var19 = stackIn_72_0;
                                            L35: while (true) {
                                              L36: {
                                                L37: {
                                                  if (var19 >= var5_int) {
                                                    break L37;
                                                  } else {
                                                    var18 = var18 + var13.j(-3);
                                                    cb.a(var23, var16_int, var15_ref_byte____[var19], var14_ref_int__[var19], var18);
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
                                      stackOut_79_0 = 0;
                                      stackIn_80_0 = stackOut_79_0;
                                      break L33;
                                    }
                                    var17 = stackIn_80_0;
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
                          var11 = var23.length;
                          var11--;
                          var12 = 255 & var23[var11];
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
                                  stackOut_94_0 = 0;
                                  stackIn_108_0 = stackOut_94_0;
                                  stackIn_95_0 = stackOut_94_0;
                                  if (var22 != 0) {
                                    break L45;
                                  } else {
                                    var18 = stackIn_95_0;
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
                                                  if (var6 != null) {
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
                              stackOut_107_0 = -1;
                              stackIn_108_0 = stackOut_107_0;
                              break L45;
                            }
                            if (stackIn_108_0 == ~var14) {
                              stackOut_110_0 = 1;
                              stackIn_111_0 = stackOut_110_0;
                              return stackIn_111_0 != 0;
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
                                    stackOut_114_0 = 0;
                                    stackIn_128_0 = stackOut_114_0;
                                    stackIn_115_0 = stackOut_114_0;
                                    if (var22 != 0) {
                                      break L15;
                                    } else {
                                      var20 = stackIn_115_0;
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
                        stackOut_127_0 = 1;
                        stackIn_128_0 = stackOut_127_0;
                        break L15;
                      }
                      break L0;
                    }
                  }
                  stackOut_24_0 = 1;
                  stackIn_25_0 = stackOut_24_0;
                  return stackIn_25_0 != 0;
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
            stackOut_129_0 = (RuntimeException) var5;
            stackOut_129_1 = new StringBuilder().append("gk.P(").append(param0).append(44).append(param1).append(44);
            stackIn_131_0 = stackOut_129_0;
            stackIn_131_1 = stackOut_129_1;
            stackIn_130_0 = stackOut_129_0;
            stackIn_130_1 = stackOut_129_1;
            if (param2 == null) {
              stackOut_131_0 = (RuntimeException) (Object) stackIn_131_0;
              stackOut_131_1 = (StringBuilder) (Object) stackIn_131_1;
              stackOut_131_2 = "null";
              stackIn_132_0 = stackOut_131_0;
              stackIn_132_1 = stackOut_131_1;
              stackIn_132_2 = stackOut_131_2;
              break L61;
            } else {
              stackOut_130_0 = (RuntimeException) (Object) stackIn_130_0;
              stackOut_130_1 = (StringBuilder) (Object) stackIn_130_1;
              stackOut_130_2 = "{...}";
              stackIn_132_0 = stackOut_130_0;
              stackIn_132_1 = stackOut_130_1;
              stackIn_132_2 = stackOut_130_2;
              break L61;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_132_0, stackIn_132_2 + 44 + param3 + 41);
        }
        return stackIn_128_0 != 0;
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
          throw ii.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 41);
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
