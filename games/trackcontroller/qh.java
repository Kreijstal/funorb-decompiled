/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qh {
    private boolean field_d;
    static ja field_e;
    static long field_f;
    private int[] field_g;
    private int field_a;
    static String field_c;
    static ea field_b;
    private int field_h;
    static boolean field_i;

    public static void a(int param0) {
        int var1 = 12 / ((param0 - 26) / 63);
        field_b = null;
        field_c = null;
        field_e = null;
    }

    final void a(int param0, int param1) {
        if ((param0 ^ -1) <= -1) {
          if (this.field_a >= param0) {
            if (this.field_a == param0) {
              this.field_a = this.field_a - 1;
              if (param1 != -12759) {
                this.a(-123, 110);
                return;
              } else {
                return;
              }
            } else {
              pd.a(this.field_g, 1 + param0, this.field_g, param0, -param0 + this.field_a);
              this.field_a = this.field_a - 1;
              if (param1 != -12759) {
                this.a(-123, 110);
                return;
              } else {
                return;
              }
            }
          } else {
            throw new ArrayIndexOutOfBoundsException(param0);
          }
        } else {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
    }

    final static hg a(kk param0, int param1, kk param2, int param3, int param4) {
        RuntimeException var5 = null;
        kk var6 = null;
        Object stackIn_4_0 = null;
        hg stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param4 == -11948) {
                break L1;
              } else {
                var6 = (kk) null;
                qh.a((kk) null, -65, (kk) null, -113, 27);
                break L1;
              }
            }
            if (sk.a(param3, param2, param4 + 11949, param1)) {
              stackIn_6_0 = ra.a(param4 + 11446, param0.a(param1, param3, (byte) -67));
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("qh.H(");

            if (param0 == null) {
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


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',');

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
          throw sl.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (hg) ((Object) stackIn_4_0);
        } else {
          return stackIn_6_0;
        }
    }

    final void a(byte param0, int param1) {
        this.a(this.field_a - -1, true, param1);
        int var3 = 39 / ((54 - param0) / 57);
    }

    final int c(byte param0, int param1) {
        int var3;
        if (this.field_a < param1) {
          throw new ArrayIndexOutOfBoundsException(param1);
        } else {
          var3 = -41 / ((param0 - 1) / 55);
          return this.field_g[param1];
        }
    }

    private final void a(int param0, boolean param1, int param2) {
        if (param0 <= this.field_a) {
          if (this.field_g.length > param0) {
            this.field_g[param0] = param2;
            if (!param1) {
              this.b(-86);
              return;
            } else {
              return;
            }
          } else {
            this.b((byte) 123, param0);
            this.field_g[param0] = param2;
            if (!param1) {
              this.b(-86);
              return;
            } else {
              return;
            }
          }
        } else {
          this.field_a = param0;
          if (this.field_g.length <= param0) {
            this.b((byte) 123, param0);
            this.field_g[param0] = param2;
            if (param1) {
              return;
            } else {
              this.b(-86);
              return;
            }
          } else {
            this.field_g[param0] = param2;
            if (!param1) {
              this.b(-86);
              return;
            } else {
              return;
            }
          }
        }
    }

    private final void b(byte param0, int param1) {
        int[] var5 = new int[this.b(param1, 20029)];
        int[] var3 = var5;
        pd.a(this.field_g, 0, var5, 0, this.field_g.length);
        int var4 = 87 / ((param0 - 58) / 62);
        this.field_g = var5;
    }

    private final int b(int param0, int param1) {
        int var3;
        int var4;
        var4 = TrackController.field_F ? 1 : 0;
        if (param1 != 20029) {
          field_c = (String) null;
          var3 = this.field_g.length;
          L0: while (true) {
            if (var3 > param0) {
              return var3;
            } else {
              if (!this.field_d) {
                var3 = var3 + this.field_h;
                continue L0;
              } else {
                if (var3 != 0) {
                  var3 = var3 * this.field_h;
                  continue L0;
                } else {
                  var3 = 1;
                  continue L0;
                }
              }
            }
          }
        } else {
          var3 = this.field_g.length;
          L1: while (true) {
            if (var3 > param0) {
              return var3;
            } else {
              if (!this.field_d) {
                var3 = var3 + this.field_h;
                continue L1;
              } else {
                if (var3 != 0) {
                  var3 = var3 * this.field_h;
                  continue L1;
                } else {
                  var3 = 1;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final int b(int param0) {
        if (param0 != -1) {
            field_e = (ja) null;
            return this.field_a - -1;
        }
        return this.field_a - -1;
    }

    final static void a(boolean param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            String stackIn_7_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              try {
                L0: {
                  var2 = new java.net.URL(param1.getCodeBase(), "toserverlist.ws");
                  param1.getAppletContext().showDocument(of.a(param1, var2, param0), "_top");
                  break L0;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = (Exception) (Object) decompiledCaughtException;
                var2_ref.printStackTrace();
                return;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L1: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_6_0 = (RuntimeException) (var2_ref2);

                stackIn_6_1 = new StringBuilder().append("qh.D(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
                  stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
                  stackIn_7_2 = "null";
                  break L1;
                } else {
                  stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
                  stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
                  stackIn_7_2 = "{...}";
                  break L1;
                }
              }
              throw sl.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private qh() throws Throwable {
        throw new Error();
    }

    static {
        field_c = "Type your email address again to make sure it's correct";
        field_e = new ja();
    }
}
