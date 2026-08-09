/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class u {
    private ec field_f;
    private ah field_c;
    static String field_d;
    static int field_a;
    static hl field_b;
    static fg field_g;
    private ah field_e;

    public static void b(int param0) {
        if (param0 != 32768) {
          u.b(61);
          field_b = null;
          field_g = null;
          field_d = null;
          return;
        } else {
          field_b = null;
          field_g = null;
          field_d = null;
          return;
        }
    }

    final static boolean a(int param0) {
        if (cl.field_e) {
          if (param0 > 79) {
            if (sf.field_d != 0) {
              return false;
            } else {
              return true;
            }
          } else {
            field_b = (hl) null;
            if (sf.field_d != 0) {
              return false;
            } else {
              return true;
            }
          }
        } else {
          return false;
        }
    }

    final static String a(int param0, fj param1) {
        String stackIn_30_0 = null;
        Object stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        Object stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        Object var3 = null;
        String var3_ref = null;
        int var4 = 0;
        String var5 = null;
        var4 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              var2 = null;
              if (param0 == 18440) {
                break L1;
              } else {
                field_d = (String) null;
                break L1;
              }
            }
            L2: {
              if (param1.field_e == null) {
                break L2;
              } else {
                L3: {
                  var5 = param1.field_e;
                  var2 = var5;
                  var3 = var2;
                  var2 = var5;
                  var2 = var5;
                  if (param1.field_k == 1) {
                    var2 = "<img=0>" + var5;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                if ((param1.field_k ^ -1) != -3) {
                  break L2;
                } else {
                  var2 = "<img=1>" + (String) (var2);
                  var3 = var2;
                  var3 = var2;
                  break L2;
                }
              }
            }
            L4: {
              var3_ref = "";
              if (-3 == (param1.field_i ^ -1)) {
                if (!param1.field_l) {
                  L5: {
                    if (param1.field_g != 0) {
                      break L5;
                    } else {
                      if (0 != param1.field_s) {
                        break L5;
                      } else {
                        var3_ref = sk.a(new String[]{(String) (var2)}, vd.field_b, 119);
                        break L4;
                      }
                    }
                  }
                  var3_ref = sk.a(new String[]{(String) (var2)}, mc.field_h, param0 ^ 18544);
                  break L4;
                } else {
                  break L4;
                }
              } else {
                L6: {
                  if (0 != param1.field_i) {
                    break L6;
                  } else {
                    if (!go.field_c) {
                      break L6;
                    } else {
                      var3_ref = "[" + nm.field_v + "] ";
                      break L6;
                    }
                  }
                }
                L7: {
                  if (param1.field_i != 1) {
                    break L7;
                  } else {
                    var3_ref = "[" + sk.a(new String[]{param1.field_c}, qe.field_e, 127) + "] ";
                    break L7;
                  }
                }
                L8: {
                  if (-5 != (param1.field_i ^ -1)) {
                    break L8;
                  } else {
                    if (ec.field_h == null) {
                      break L8;
                    } else {
                      var3_ref = "[" + ec.field_h + "] ";
                      break L8;
                    }
                  }
                }
                L9: {
                  if (-4 != (param1.field_i ^ -1)) {
                    break L9;
                  } else {
                    var3_ref = "[#" + param1.field_c + "] ";
                    break L9;
                  }
                }
                if (!param1.field_l) {
                  var3_ref = var3_ref + (String) (var2) + ": ";
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            stackIn_30_0 = (String) (var3_ref);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = decompiledCaughtException;
            stackIn_33_0 = var2;

            stackIn_33_1 = new StringBuilder().append("u.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_34_0 = stackIn_33_0;
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L10;
            } else {
              stackIn_34_0 = stackIn_33_0;
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L10;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ')');
        }
        return stackIn_30_0;
    }

    final j a(int param0, int param1) {
        j var3;
        byte[] var4;
        j var5;
        j var6;
        var3 = (j) (this.field_f.a((byte) 119, (long)param0));
        if (var3 == null) {
          L0: {
            if (-32769 < (param0 ^ -1)) {
              var4 = this.field_e.a(22, param0, 1);
              break L0;
            } else {
              var4 = this.field_c.a(-107, param0 & 32767, 1);
              break L0;
            }
          }
          if (param1 < -125) {
            L1: {
              var6 = new j();
              if (var4 != null) {
                var6.a(new bh(var4), 15067);
                break L1;
              } else {
                break L1;
              }
            }
            if (param0 >= 32768) {
              var6.g(25271);
              this.field_f.a(var6, (long)param0, (byte) 50);
              return var6;
            } else {
              this.field_f.a(var6, (long)param0, (byte) 50);
              return var6;
            }
          } else {
            L2: {
              this.a(-123, -16);
              var5 = new j();
              if (var4 != null) {
                var5.a(new bh(var4), 15067);
                break L2;
              } else {
                break L2;
              }
            }
            if (param0 < 32768) {
              this.field_f.a(var5, (long)param0, (byte) 50);
              return var5;
            } else {
              var5.g(25271);
              this.field_f.a(var5, (long)param0, (byte) 50);
              return var5;
            }
          }
        } else {
          return var3;
        }
    }

    u(int param0, ah param1, ah param2, sm param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_f = new ec(64);
        try {
          L0: {
            L1: {
              this.field_c = param2;
              this.field_e = param1;
              if (this.field_e == null) {
                break L1;
              } else {
                this.field_e.b(-23126, 1);
                break L1;
              }
            }
            if (null != this.field_c) {
              this.field_c.b(-23126, 1);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("u.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_10_0), stackIn_16_2 + ')');
        }
    }

    static {
        field_d = "Play free version";
    }
}
