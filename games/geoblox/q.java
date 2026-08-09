/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class q extends ib implements ga {
    static uj field_h;
    static double field_f;
    private dj field_g;

    final static void a(byte param0, boolean param1) {
        if (param0 < 102) {
            return;
        }
        b.a(false, param1, false);
    }

    final lh e(int param0) {
        if (param0 != 32) {
            return (lh) null;
        }
        return this.a(-257, this.field_g.field_s);
    }

    public final boolean a(int param0) {
        String var3;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        if (param0 == -26556) {
          if (this.field_g.field_s != null) {
            if (this.field_g.field_s.length() == 0) {
              return true;
            } else {
              return false;
            }
          } else {
            stackIn_11_0 = 1;
            return stackIn_11_0 != 0;
          }
        } else {
          var3 = (String) null;
          this.b(-33, (String) null);
          if (this.field_g.field_s == null) {
            return true;
          } else {
            L0: {
              if (this.field_g.field_s.length() != 0) {
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

    public final void a(dj param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -18649) {
                break L1;
              } else {
                this.field_g = (dj) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("q.S(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    abstract String b(int param0, String param1);

    final static boolean a(char param0, byte param1) {
        if (Character.isISOControl(param0)) {
          return false;
        } else {
          if (!pf.a(-123, param0)) {
            if (param0 != 45) {
              if (param0 != 160) {
                if (32 != param0) {
                  if (param0 != 95) {
                    if (param1 <= 88) {
                      return false;
                    } else {
                      return false;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, d param5, String param6, int param7, int param8) {
        try {
            ag.field_l = param7;
            bm.field_u = param3;
            gh.field_z = param6;
            hc.field_T = param0;
            pc.field_C = param1;
            vg.field_a = param2;
            ph.field_i = param5;
            if (param4 != -23949) {
                field_f = -0.8279321027589008;
            }
            ij.field_W = param8;
            wg.field_i = (ji) ((Object) new kk());
            cl.field_c = new uf(param5);
            gb.field_b = new em(wg.field_i, cl.field_c);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "q.N(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    public final void a(dj param0, byte param1) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param1 != 74) {
                this.a(-117);
                this.b(-28133);
                break L1;
              } else {
                this.b(-28133);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("q.J(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
    }

    final static void a(byte param0, int param1, String param2) {
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        try {
          L0: {
            L1: {
              va.field_d = false;
              ii.field_a = false;
              if (null == Geoblox.field_y) {
                break L1;
              } else {
                if (Geoblox.field_y.field_I) {
                  L2: {
                    if (8 == param1) {
                      L3: {
                        param1 = 2;
                        if (!cf.field_i) {
                          param2 = mi.field_E;
                          break L3;
                        } else {
                          param2 = rc.field_f;
                          break L3;
                        }
                      }
                      ml.field_t.a(b.field_a, 0);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L4: {
                    var3_int = 1;
                    if ((param1 ^ -1) == -11) {
                      n.c((byte) -4);
                      var3_int = 0;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (var3_int == 0) {
                      break L5;
                    } else {
                      L6: {
                        if (!ii.field_a) {
                          break L6;
                        } else {
                          param2 = wj.a(mi.field_R, new String[]{param2}, (byte) -25);
                          break L6;
                        }
                      }
                      L7: {
                        if (!mi.field_I) {
                          break L7;
                        } else {
                          param2 = kf.field_b;
                          break L7;
                        }
                      }
                      Geoblox.field_y.a(param1, param0 + 19686, param2);
                      break L5;
                    }
                  }
                  if ((param1 ^ -1) == -257) {
                    break L1;
                  } else {
                    if ((param1 ^ -1) != -11) {
                      if (!cf.field_i) {
                        ml.field_t.i(-119);
                        break L1;
                      } else {
                        break L1;
                      }
                    } else {
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            if (param0 == 124) {
              break L0;
            } else {
              var4 = (String) null;
              q.a(-94, -21, 56, -5, 62, (d) null, (String) null, -54, -101);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var3);

            stackIn_29_1 = new StringBuilder().append("q.O(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L8;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L8;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ')');
        }
    }

    final static qd a(rh param0, int param1, String param2, String param3, rh param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        qd stackIn_3_0 = null;
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
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 1) {
                break L1;
              } else {
                var7 = (String) null;
                q.a((byte) 108, 111, (String) null);
                break L1;
              }
            }
            var5_int = param4.a((byte) 126, param3);
            var6 = param4.a(param2, param1 + -69, var5_int);
            stackIn_3_0 = ea.a(param4, (byte) -127, param0, var6, var5_int);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("q.R(");

            if (param0 == null) {
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


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

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
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), stackIn_16_2 + ')');
        }
        return stackIn_3_0;
    }

    abstract lh a(int param0, String param1);

    final String b(byte param0) {
        if (param0 != -103) {
          this.field_g = (dj) null;
          return this.b(422, this.field_g.field_s);
        } else {
          return this.b(422, this.field_g.field_s);
        }
    }

    public static void f(int param0) {
        field_h = null;
        if (param0 != 1) {
            field_h = (uj) null;
        }
    }

    q(dj param0) {
        try {
            this.field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "q.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = new uj();
        field_f = Math.atan2(1.0, 0.0);
    }
}
