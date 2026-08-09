/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class f {
    private int field_g;
    static String field_b;
    static int field_a;
    private br field_f;
    private int field_e;
    private br[] field_d;
    private br field_h;
    static int field_c;

    final br b(int param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var3;
        br var4;
        br var5;
        br var7;
        br var8;
        Object stackIn_4_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_24_0 = null;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if ((this.field_e ^ -1) < -1) {
          if (this.field_h == this.field_d[this.field_e + -1]) {
            L0: while (true) {
              L1: {
                if (this.field_g <= this.field_e) {
                  break L1;
                } else {
                  fieldTemp$2 = this.field_e;
                  this.field_e = this.field_e + 1;
                  var8 = this.field_d[fieldTemp$2].field_d;
                  stackIn_18_0 = this;

                  if (var3 == 0) {
                    if (((f) (this)).field_d[-1 + this.field_e] != var8) {
                      this.field_h = var8.field_d;
                      return var8;
                    } else {
                      if (var3 == 0) {
                        continue L0;
                      } else {
                        break L1;
                      }
                    }
                  } else {
                    var4 = (br) null;
                    this.a(false, -86L, (br) null);
                    return null;
                  }
                }
              }
              if (param0 <= -105) {
                return null;
              } else {
                stackIn_24_0 = this;
                var4 = (br) null;
                this.a(false, -86L, (br) null);
                return null;
              }
            }
          } else {
            var5 = this.field_h;
            this.field_h = var5.field_d;
            return var5;
          }
        } else {
          L2: while (true) {
            L3: {
              if (this.field_g <= this.field_e) {
                break L3;
              } else {
                fieldTemp$3 = this.field_e;
                this.field_e = this.field_e + 1;
                var7 = this.field_d[fieldTemp$3].field_d;
                stackIn_4_0 = this;

                if (var3 == 0) {
                  if (((f) (this)).field_d[-1 + this.field_e] != var7) {
                    this.field_h = var7.field_d;
                    return var7;
                  } else {
                    if (var3 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                } else {
                  var4 = (br) null;
                  this.a(false, -86L, (br) null);
                  return null;
                }
              }
            }
            if (param0 <= -105) {
              return null;
            } else {
              stackIn_10_0 = this;
              var4 = (br) null;
              this.a(false, -86L, (br) null);
              return null;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 < -31) {
            return;
        }
        f.a((byte) -51);
    }

    final br a(int param0, long param1) {
        br var4;
        br var5;
        int var6;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        var4 = this.field_d[(int)(param1 & (long)(this.field_g - 1))];
        if (param0 == 0) {
          this.field_f = var4.field_d;
          L0: while (true) {
            if (this.field_f != var4) {
              if (var6 == 0) {
                if (param1 == this.field_f.field_e) {
                  var5 = this.field_f;
                  this.field_f = this.field_f.field_d;
                  return var5;
                } else {
                  this.field_f = this.field_f.field_d;
                  if (var6 == 0) {
                    continue L0;
                  } else {
                    this.field_f = null;
                    return null;
                  }
                }
              } else {
                return null;
              }
            } else {
              this.field_f = null;
              return null;
            }
          }
        } else {
          this.field_g = -49;
          this.field_f = var4.field_d;
          L1: while (true) {
            if (this.field_f != var4) {
              if (var6 == 0) {
                if (param1 == this.field_f.field_e) {
                  var5 = this.field_f;
                  this.field_f = this.field_f.field_d;
                  return var5;
                } else {
                  this.field_f = this.field_f.field_d;
                  if (var6 == 0) {
                    continue L1;
                  } else {
                    this.field_f = null;
                    return null;
                  }
                }
              } else {
                return null;
              }
            } else {
              this.field_f = null;
              return null;
            }
          }
        }
    }

    final void a(boolean param0, long param1, br param2) {
        br var5 = null;
        try {
            if (!(param2.field_b == null)) {
                param2.a(true);
            }
            if (!param0) {
                this.field_g = 88;
            }
            var5 = this.field_d[(int)(param1 & (long)(this.field_g - 1))];
            param2.field_d = var5;
            param2.field_b = var5.field_b;
            param2.field_b.field_d = param2;
            param2.field_e = param1;
            param2.field_d.field_b = param2;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "f.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final br a(int param0) {
        this.field_e = param0;
        return this.b(-119);
    }

    final static void a(java.applet.Applet param0, boolean param1, byte param2, String param3) {
        try {
            int var4_int = 0;
            java.net.MalformedURLException var4 = null;
            RuntimeException var4_ref = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            String stackIn_10_2 = null;
            StringBuilder stackIn_12_1 = null;
            StringBuilder stackIn_13_1 = null;
            String stackIn_13_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  if (!go.field_l.startsWith("win")) {
                    break L1;
                  } else {
                    if (!va.a(9805, param3)) {
                      break L1;
                    } else {
                      break L0;
                    }
                  }
                }
                try {
                  L2: {
                    param0.getAppletContext().showDocument(new java.net.URL(param3), "_blank");
                    var4_int = 3 / ((param2 - 39) / 61);
                    break L2;
                  }
                } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var4 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
                  bd.a("MGR1: " + param3, (Throwable) null, false);
                  return;
                }
                return;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var4_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_9_0 = (RuntimeException) (var4_ref);

                stackIn_9_1 = new StringBuilder().append("f.A(");

                if (param0 == null) {
                  stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
                  stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
                  stackIn_10_2 = "null";
                  break L3;
                } else {
                  stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
                  stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
                  stackIn_10_2 = "{...}";
                  break L3;
                }
              }
              L4: {


                stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',');

                if (param3 == null) {
                  stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
                  stackIn_13_2 = "null";
                  break L4;
                } else {
                  stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
                  stackIn_13_2 = "{...}";
                  break L4;
                }
              }
              throw fa.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    f(int param0) {
        br dupTemp$0 = null;
        br var3 = null;
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        this.field_e = 0;
        this.field_g = param0;
        this.field_d = new br[param0];
        int var2 = 0;
        do {
            if (var2 >= param0) {
                return;
            }
            dupTemp$0 = new br();
            var3 = dupTemp$0;
            this.field_d[var2] = dupTemp$0;
            var3.field_d = var3;
            var3.field_b = var3;
            var2++;
            if (var4 != 0) {
                return;
            }
        } while (var4 == 0);
    }

    static {
        field_b = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_c = 0;
    }
}
