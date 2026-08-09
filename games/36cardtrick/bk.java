/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bk {
    qb field_a;
    static String field_f;
    static String field_e;
    static String[] field_c;
    static String field_b;
    private qb field_d;

    final qb a(byte param0) {
        qb var2;
        var2 = this.field_a.field_d;
        if (param0 == 74) {
          if (var2 == this.field_a) {
            this.field_d = null;
            return null;
          } else {
            this.field_d = var2.field_d;
            return var2;
          }
        } else {
          this.field_d = (qb) null;
          if (var2 == this.field_a) {
            this.field_d = null;
            return null;
          } else {
            this.field_d = var2.field_d;
            return var2;
          }
        }
    }

    final static void a(java.applet.Applet param0, int param1, String param2, boolean param3) {
        try {
            java.net.MalformedURLException var4 = null;
            RuntimeException var4_ref = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            String stackIn_13_2 = null;
            StringBuilder stackIn_15_1 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                if (param1 == -25573) {
                  L1: {
                    if (!le.field_m.startsWith("win")) {
                      break L1;
                    } else {
                      if (gl.a(param2, 873140897)) {
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                  try {
                    L2: {
                      param0.getAppletContext().showDocument(new java.net.URL(param2), "_blank");
                      break L2;
                    }
                  } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var4 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
                    k.a((Throwable) null, (byte) -120, "MGR1: " + param2);
                    return;
                  }
                  return;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var4_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_12_0 = (RuntimeException) (var4_ref);

                stackIn_12_1 = new StringBuilder().append("bk.C(");

                if (param0 == null) {
                  stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
                  stackIn_13_2 = "null";
                  break L3;
                } else {
                  stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
                  stackIn_13_2 = "{...}";
                  break L3;
                }
              }
              L4: {


                stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "null";
                  break L4;
                } else {
                  stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "{...}";
                  break L4;
                }
              }
              throw ma.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param3 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final qb d(int param0) {
        qb var2;
        qb var3;
        var2 = this.field_a.field_d;
        if (param0 < -58) {
          if (var2 == this.field_a) {
            return null;
          } else {
            var2.c(111);
            return var2;
          }
        } else {
          var3 = (qb) null;
          this.a((qb) null, -66);
          if (var2 == this.field_a) {
            return null;
          } else {
            var2.c(111);
            return var2;
          }
        }
    }

    final qb b(byte param0) {
        qb var2;
        var2 = this.field_d;
        if (this.field_a == var2) {
          this.field_d = null;
          return null;
        } else {
          if (param0 > -91) {
            return (qb) null;
          } else {
            this.field_d = var2.field_d;
            return var2;
          }
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_b = null;
        field_e = null;
        field_f = null;
        field_c = null;
    }

    final boolean a(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != 2220) {
          L0: {
            field_c = (String[]) null;
            if (this.field_a != this.field_a.field_d) {
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
            if (this.field_a != this.field_a.field_d) {
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

    final qb b(int param0) {
        qb var2;
        if (param0 < -6) {
          var2 = this.field_a.field_a;
          if (this.field_a == var2) {
            return null;
          } else {
            var2.c(126);
            return var2;
          }
        } else {
          field_f = (String) null;
          var2 = this.field_a.field_a;
          if (this.field_a == var2) {
            return null;
          } else {
            var2.c(126);
            return var2;
          }
        }
    }

    final void a(int param0, qb param1) {
        try {
            if (!(null == param1.field_a)) {
                param1.c(109);
            }
            param1.field_a = this.field_a;
            if (param0 > -119) {
                String var4 = (String) null;
                bk.a((java.applet.Applet) null, 44, (String) null, true);
            }
            param1.field_d = this.field_a.field_d;
            param1.field_a.field_d = param1;
            param1.field_d.field_a = param1;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "bk.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public bk() {
        this.field_a = new qb();
        this.field_a.field_d = this.field_a;
        this.field_a.field_a = this.field_a;
    }

    final void a(qb param0, int param1) {
        RuntimeException var3 = null;
        String var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0.field_a != null) {
                param0.c(107);
                break L1;
              } else {
                break L1;
              }
            }
            param0.field_a = this.field_a.field_a;
            param0.field_d = this.field_a;
            param0.field_a.field_d = param0;
            param0.field_d.field_a = param0;
            if (param1 == 27362) {
              break L0;
            } else {
              var4 = (String) null;
              bk.a((java.applet.Applet) null, -120, (String) null, false);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("bk.E(");

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
          throw ma.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
    }

    final void c(int param0) {
        qb var2;
        int var3;
        var3 = Main.field_T;
        L0: while (true) {
          var2 = this.field_a.field_d;
          if (var2 == this.field_a) {
            if (param0 != 29026) {
              field_c = (String[]) null;
              this.field_d = null;
              return;
            } else {
              this.field_d = null;
              return;
            }
          } else {
            var2.c(param0 ^ 28988);
            continue L0;
          }
        }
    }

    static {
        field_e = "Account created successfully!";
        field_b = "Email address is unavailable";
        field_f = "Loading graphics";
    }
}
