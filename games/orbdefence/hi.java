/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hi extends wb implements jb {
    static String field_l;
    static int field_k;
    static String field_h;
    private vi field_j;
    static hj[] field_g;
    static String field_f;
    static String field_e;
    static int[] field_i;
    static int field_m;

    final static void a(fj param0, int param1, boolean param2, int param3, boolean param4, int param5) {
        Object var6 = null;
        RuntimeException var6_ref = null;
        Throwable var7 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 2) {
              break L0;
            } else {
              field_h = (String) null;
              break L0;
            }
          }
          var6 = cd.field_w;
          synchronized (var6) {
            L1: {
              if (ll.field_a == param0) {
                return;
              } else {
                L2: {
                  ll.field_a = param0;
                  if (ll.field_a != null) {
                    ml.field_c.a(param2, ll.field_a, param5, param4, param3, -107);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                break L1;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var6_ref);

            stackIn_17_1 = new StringBuilder().append("hi.Q(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void a(boolean param0) {
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (!param0) {
              var5 = vf.field_a;
              var1 = var5;
              var2 = 0;
              var3 = var5.length;
              L1: while (true) {
                if (var3 <= var2) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  incrementValue$16 = var2;
                  var2++;
                  var5[incrementValue$16] = 0;
                  incrementValue$17 = var2;
                  var2++;
                  var5[incrementValue$17] = 0;
                  incrementValue$18 = var2;
                  var2++;
                  var5[incrementValue$18] = 0;
                  incrementValue$19 = var2;
                  var2++;
                  var5[incrementValue$19] = 0;
                  incrementValue$20 = var2;
                  var2++;
                  var5[incrementValue$20] = 0;
                  incrementValue$21 = var2;
                  var2++;
                  var5[incrementValue$21] = 0;
                  incrementValue$22 = var2;
                  var2++;
                  var5[incrementValue$22] = 0;
                  incrementValue$23 = var2;
                  var2++;
                  var5[incrementValue$23] = 0;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var1_ref), "hi.J(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static qj a(int param0, String[] param1) {
        qj var2 = null;
        RuntimeException var2_ref = null;
        qj stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2 = new qj(false);
              var2.field_c = param1;
              if (param0 == 2) {
                break L1;
              } else {
                field_h = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = (qj) (var2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2_ref);

            stackIn_6_1 = new StringBuilder().append("hi.M(").append(param0).append(',');

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
          throw dd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public final boolean c(int param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        if (param0 == 25296) {
          if (null != this.field_j.field_l) {
            if (this.field_j.field_l.length() == 0) {
              return true;
            } else {
              return false;
            }
          } else {
            stackIn_11_0 = 1;
            return stackIn_11_0 != 0;
          }
        } else {
          field_e = (String) null;
          if (null == this.field_j.field_l) {
            return true;
          } else {
            L0: {
              if (this.field_j.field_l.length() != 0) {
                stackIn_5_0 = 0;
                break L0;
              } else {
                stackIn_5_0 = 1;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    final String e(int param0) {
        int var2 = -80 / ((param0 - 25) / 58);
        return this.a(-11300, this.field_j.field_l);
    }

    final static String a(int param0, int param1, mg param2) {
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        String var5 = null;
        int var6 = 0;
        String stackIn_3_0 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  var3_int = param2.e(125);
                  if (param0 >= var3_int) {
                    break L2;
                  } else {
                    var3_int = param0;
                    break L2;
                  }
                }
                var4 = new byte[var3_int];
                param2.field_i = param2.field_i + cc.field_k.a(param2.field_i, var4, -1, 0, param2.field_j, var3_int);
                var5 = tj.a(var3_int, 0, 0, var4);
                var6 = 44 / ((-38 - param1) / 47);
                stackIn_3_0 = (String) (var5);
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = (Exception) (Object) decompiledCaughtException;
              stackIn_5_0 = "Cabbage";
              return stackIn_5_0;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L3: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3_ref);

            stackIn_8_1 = new StringBuilder().append("hi.P(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        return stackIn_3_0;
    }

    hi(vi param0) {
        try {
            this.field_j = param0;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "hi.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(vi param0, boolean param1) {
        try {
            if (param1) {
                field_f = (String) null;
            }
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "hi.K(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static int i(int param0) {
        int stackIn_28_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var1_int = 0;
            var2 = 0;
            L1: while (true) {
              if (!nf.e(32722)) {
                L2: {
                  ab.field_j.a(jc.a(ig.field_fb, (byte) 81, bg.field_c), param0 ^ -1, jc.a(ua.field_a, (byte) 37, vl.field_d));
                  if (!ab.field_j.a((byte) -1)) {
                    break L2;
                  } else {
                    var1_int = 1;
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    var3 = param0;
                    if (var1_int == 0) {
                      break L4;
                    } else {
                      if (0 > ab.field_j.field_h) {
                        break L4;
                      } else {
                        var3 = gg.field_O[ab.field_j.field_h];
                        if (2 == var3) {
                          me.c(true);
                          break L3;
                        } else {
                          if ((var3 ^ -1) != -6) {
                            break L3;
                          } else {
                            me.c(true);
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  if (var2 == 0) {
                    break L3;
                  } else {
                    if (kg.field_m != 2) {
                      me.c(true);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                L5: {
                  if (-1 != (var3 ^ -1)) {
                    break L5;
                  } else {
                    if (kg.field_m == 2) {
                      var4 = ji.b(107) - am.field_a;
                      var6 = (int)((-var4 + 10999L) / 1000L);
                      if (0 < var6) {
                        break L5;
                      } else {
                        var3 = 2;
                        gb.a(true, 5, true);
                        break L5;
                      }
                    } else {
                      break L5;
                    }
                  }
                }
                stackIn_28_0 = var3;
                break L0;
              } else {
                L6: {
                  ab.field_j.e((byte) -74);
                  if (ab.field_j.a((byte) -1)) {
                    var1_int = 1;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                if (13 == ob.field_K) {
                  var2 = 1;
                  continue L1;
                } else {
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var1), "hi.O(" + param0 + ')');
        }
        return stackIn_28_0;
    }

    public static void g(int param0) {
        field_e = null;
        field_h = null;
        field_f = null;
        field_l = null;
        field_g = null;
        field_i = null;
        if (param0 >= -65) {
            hi.h(113);
        }
    }

    abstract String a(int param0, String param1);

    final static boolean h(int param0) {
        String[] var2;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != 2) {
          L0: {
            var2 = (String[]) null;
            hi.a(-29, (String[]) null);
            if (bd.field_u.a(false)) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (bd.field_u.a(false)) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public final void a(vi param0, int param1) {
        try {
            this.b(-20959);
            if (param1 <= 27) {
                String var4 = (String) null;
                this.a(87, (String) null);
            }
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "hi.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    abstract qd a(String param0, byte param1);

    final qd a(byte param0) {
        if (param0 < 68) {
          field_f = (String) null;
          return this.a(this.field_j.field_l, (byte) -99);
        } else {
          return this.a(this.field_j.field_l, (byte) -99);
        }
    }

    static {
        field_l = "INSTRUCTIONS";
        field_h = "Password: ";
        field_f = "Connection lost - attempting to reconnect";
        field_e = "Loading fonts";
        field_m = -150;
        field_i = new int[8192];
    }
}
