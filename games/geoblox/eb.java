/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb {
    float field_j;
    static dm[] field_g;
    private int field_c;
    private ii[] field_a;
    String field_e;
    static String field_f;
    private int field_d;
    static long field_b;
    static int field_i;
    private int field_h;

    private final void a(int param0, ii param1, int param2) {
        float var4_float = 0.0f;
        try {
            var4_float = (float)(this.field_h + 1) + (float)param0 / 100.0f;
            if (param2 > -90) {
                String var5 = (String) null;
                eb.a((java.applet.Applet) null, (byte) 114, (String) null);
            }
            if (param0 == 0) {
                this.field_e = param1.field_g;
            } else {
                this.field_e = param1.field_m + " - " + param0 + "%";
            }
            this.field_j = var4_float * (float)this.field_c / (float)(1 + this.field_d);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "eb.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void a(byte param0) {
        field_f = null;
        field_g = null;
        if (param0 <= -68) {
            return;
        }
        eb.a(-101, -31);
    }

    final boolean a(boolean param0) {
        int var3;
        String var4;
        ii var5;
        L0: {
          var3 = Geoblox.field_C;
          if (param0) {
            break L0;
          } else {
            var4 = (String) null;
            eb.a((java.applet.Applet) null, (byte) -56, (String) null);
            break L0;
          }
        }
        L1: while (true) {
          if (this.field_h < this.field_d) {
            var5 = this.field_a[this.field_h];
            if (var5.field_i.a(0)) {
              L2: {
                if (var5.field_l < 0) {
                  break L2;
                } else {
                  if (var5.field_i.a((byte) 102, var5.field_l)) {
                    break L2;
                  } else {
                    this.a(var5.field_i.b((byte) 36, var5.field_l), var5, -119);
                    return false;
                  }
                }
              }
              L3: {
                if (null == var5.field_f) {
                  break L3;
                } else {
                  if (!var5.field_i.a(var5.field_f, (byte) -126)) {
                    this.a(var5.field_i.a(0, var5.field_f), var5, -123);
                    return false;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (-1 >= (var5.field_l ^ -1)) {
                  break L4;
                } else {
                  if (var5.field_f != null) {
                    break L4;
                  } else {
                    if (null == var5.field_m) {
                      break L4;
                    } else {
                      if (!var5.field_i.b(true)) {
                        this.a(var5.field_i.b((byte) 106), var5, -108);
                        return false;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
              }
              this.field_h = this.field_h + 1;
              continue L1;
            } else {
              this.a(0, var5, -123);
              return false;
            }
          } else {
            return true;
          }
        }
    }

    final static int a(int param0, int param1) {
        int var3 = Geoblox.field_C;
        gj.field_s = null;
        qh.field_J = 0;
        li.field_a = null;
        int var2 = vg.field_a;
        vg.field_a = ij.field_W;
        ij.field_W = var2;
        if (param0 == 51) {
            wg.field_i.field_q = 2;
            wg.field_i.field_b = wg.field_i.field_b + 1;
            if (-3 < (wg.field_i.field_b ^ -1)) {
                if ((wg.field_i.field_b ^ -1) <= -3 && 50 == param0) {
                    return 5;
                }
                if (param1 != 28625) {
                    field_i = -67;
                    if (!(-5 < (wg.field_i.field_b ^ -1))) {
                        return 1;
                    }
                    return -1;
                }
                if (!(-5 < (wg.field_i.field_b ^ -1))) {
                    return 1;
                }
                return -1;
            }
            if (!(-52 != (param0 ^ -1))) {
                return 2;
            }
            if ((wg.field_i.field_b ^ -1) > -3) {
                if (param1 != 28625) {
                    field_i = -67;
                    if (!(-5 < (wg.field_i.field_b ^ -1))) {
                        return 1;
                    }
                    return -1;
                }
                if (!(-5 < (wg.field_i.field_b ^ -1))) {
                    return 1;
                }
                return -1;
            }
            if (50 == param0) {
                return 5;
            }
            if (param1 != 28625) {
                field_i = -67;
                if (!(-5 < (wg.field_i.field_b ^ -1))) {
                    return 1;
                }
                return -1;
            }
            if (!(-5 < (wg.field_i.field_b ^ -1))) {
                return 1;
            }
            return -1;
        }
        if (50 != param0) {
            wg.field_i.field_q = 1;
            wg.field_i.field_b = wg.field_i.field_b + 1;
            if (-3 >= (wg.field_i.field_b ^ -1)) {
                if (-52 == (param0 ^ -1)) {
                    return 2;
                }
                if ((wg.field_i.field_b ^ -1) <= -3 && 50 == param0) {
                    return 5;
                }
                if (param1 != 28625) {
                    field_i = -67;
                    if (!(-5 < (wg.field_i.field_b ^ -1))) {
                        return 1;
                    }
                    return -1;
                }
                if (!(-5 < (wg.field_i.field_b ^ -1))) {
                    return 1;
                }
                return -1;
            }
            if ((wg.field_i.field_b ^ -1) <= -3 && 50 == param0) {
                return 5;
            }
            if (param1 != 28625) {
                field_i = -67;
                if (!(-5 < (wg.field_i.field_b ^ -1))) {
                    return 1;
                }
                return -1;
            }
            if (!(-5 < (wg.field_i.field_b ^ -1))) {
                return 1;
            }
            return -1;
        }
        wg.field_i.field_q = 5;
        wg.field_i.field_b = wg.field_i.field_b + 1;
        if (-3 >= (wg.field_i.field_b ^ -1)) {
            if (-52 == (param0 ^ -1)) {
                return 2;
            }
            if ((wg.field_i.field_b ^ -1) > -3) {
                if (param1 != 28625) {
                    field_i = -67;
                    if (!(-5 < (wg.field_i.field_b ^ -1))) {
                        return 1;
                    }
                    return -1;
                }
                if (!(-5 < (wg.field_i.field_b ^ -1))) {
                    return 1;
                }
                return -1;
            }
            if (50 == param0) {
                return 5;
            }
            if (param1 != 28625) {
                field_i = -67;
                if (!(-5 < (wg.field_i.field_b ^ -1))) {
                    return 1;
                }
                return -1;
            }
            if (!(-5 < (wg.field_i.field_b ^ -1))) {
                return 1;
            }
            return -1;
        }
        if ((wg.field_i.field_b ^ -1) <= -3 && 50 == param0) {
            return 5;
        }
        if (param1 != 28625) {
            field_i = -67;
            if (!(-5 < (wg.field_i.field_b ^ -1))) {
                return 1;
            }
            return -1;
        }
        if (!(-5 < (wg.field_i.field_b ^ -1))) {
            return 1;
        }
        return -1;
    }

    final static void a(java.applet.Applet param0, byte param1, String param2) {
        try {
            java.net.URL var3 = null;
            Exception var3_ref = null;
            RuntimeException var3_ref2 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            StringBuilder stackIn_11_1 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              try {
                L0: {
                  L1: {
                    if (param1 > 109) {
                      break L1;
                    } else {
                      field_f = (String) null;
                      break L1;
                    }
                  }
                  var3 = new java.net.URL(param0.getCodeBase(), param2);
                  var3 = wf.a(var3, 59, param0);
                  pa.a(var3.toString(), (byte) 64, true, param0);
                  break L0;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var3_ref = (Exception) (Object) decompiledCaughtException;
                var3_ref.printStackTrace();
                return;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var3_ref2);

                stackIn_8_1 = new StringBuilder().append("eb.C(");

                if (param0 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L2;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L2;
                }
              }
              L3: {


                stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "null";
                  break L3;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "{...}";
                  break L3;
                }
              }
              throw t.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private eb() throws Throwable {
        throw new Error();
    }

    static {
        field_f = "Fetching highscores.";
        field_i = 2;
    }
}
