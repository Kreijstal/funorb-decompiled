/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g extends aa {
    private int field_f;
    private long field_j;
    private int field_h;
    private long field_i;
    static int[] field_g;
    private long field_k;
    private long[] field_e;

    final void b(int param0) {
        if ((this.field_i ^ -1L) > (this.field_j ^ -1L)) {
            this.field_i = this.field_i + (-this.field_i + this.field_j);
        }
        this.field_k = (long)param0;
    }

    public static void b(byte param0) {
        field_g = null;
        int var1 = 31 / ((48 - param0) / 47);
    }

    final int a(int param0, long param1) {
        int var4;
        int var5;
        L0: {
          var5 = OrbDefence.field_D ? 1 : 0;
          if (param0 == -21342) {
            break L0;
          } else {
            this.field_h = 48;
            break L0;
          }
        }
        if (this.field_j > this.field_i) {
          this.field_k = this.field_k + (this.field_j - this.field_i);
          this.field_i = this.field_i + (-this.field_i + this.field_j);
          this.field_j = this.field_j + param1;
          return 1;
        } else {
          var4 = 0;
          L1: while (true) {
            L2: {
              this.field_j = this.field_j + param1;
              var4++;
              if (10 <= var4) {
                break L2;
              } else {
                if ((this.field_i ^ -1L) < (this.field_j ^ -1L)) {
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if ((this.field_j ^ -1L) <= (this.field_i ^ -1L)) {
                break L3;
              } else {
                this.field_j = this.field_i;
                break L3;
              }
            }
            return var4;
          }
        }
    }

    final long a(int param0) {
        this.field_i = this.field_i + this.a(false);
        if (param0 != 17990) {
            this.a(74);
        }
        if (!(this.field_i >= this.field_j)) {
            return (this.field_j - this.field_i) / 1000000L;
        }
        return 0L;
    }

    final static String a(CharSequence param0, byte param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -119) {
                break L1;
              } else {
                g.b((byte) 111);
                break L1;
              }
            }
            L2: {
              var2 = jj.a(param1 + 14580, bk.a(124, param0));
              if (var2 == null) {
                var2 = "";
                break L2;
              } else {
                break L2;
              }
            }
            stackIn_6_0 = (String) (var2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2_ref);

            stackIn_9_1 = new StringBuilder().append("g.G(");

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
          throw dd.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        return stackIn_6_0;
    }

    final static String[] a(int param0, char param1, String param2) {
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        CharSequence var11 = null;
        String[] stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var11 = (CharSequence) ((Object) param2);
            var3_int = bi.a(var11, param1, 126);
            var4 = new String[1 + var3_int];
            var5 = 0;
            var7 = 85 % ((param0 - -27) / 51);
            var6 = 0;
            var8 = 0;
            L1: while (true) {
              if (var3_int <= var8) {
                var4[var3_int] = param2.substring(var6);
                stackIn_8_0 = (String[]) (var4);
                break L0;
              } else {
                var9 = var6;
                L2: while (true) {
                  if (param1 == param2.charAt(var9)) {
                    incrementValue$1 = var5;
                    var5++;
                    var4[incrementValue$1] = param2.substring(var6, var9);
                    var6 = var9 + 1;
                    var8++;
                    continue L1;
                  } else {
                    var9++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("g.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        return stackIn_8_0;
    }

    private final long a(boolean param0) {
        int var8 = 0;
        int var9 = OrbDefence.field_D ? 1 : 0;
        long var2 = System.nanoTime();
        long var4 = -this.field_k + var2;
        this.field_k = var2;
        if (var4 > -5000000000L) {
            if (!(5000000000L <= var4)) {
                this.field_e[this.field_f] = var4;
                this.field_f = (this.field_f - -1) % 10;
                if (1 > this.field_h) {
                    this.field_h = this.field_h + 1;
                }
            }
        }
        if (param0) {
            return 29L;
        }
        long var6 = 0L;
        for (var8 = 1; var8 <= this.field_h; var8++) {
            var6 = var6 + this.field_e[(-var8 + this.field_f + 10) % 10];
        }
        return var6 / (long)this.field_h;
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            String var4 = null;
            java.net.URL var5 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      if (param0 == 1) {
                        break L2;
                      } else {
                        var4 = (String) null;
                        g.a(16, 'L', (String) null);
                        break L2;
                      }
                    }
                    var5 = param1.getCodeBase();
                    var3 = f.a(param1, var5, -123).getFile();
                    gm.a(true, "updatelinks", new Object[]{"home", var3 + "home.ws"}, param1);
                    gm.a(true, "updatelinks", new Object[]{"gamelist", var3 + "togamelist.ws"}, param1);
                    gm.a(true, "updatelinks", new Object[]{"serverlist", var3 + "toserverlist.ws"}, param1);
                    gm.a(true, "updatelinks", new Object[]{"options", var3 + "options.ws"}, param1);
                    gm.a(true, "updatelinks", new Object[]{"terms", var3 + "terms.ws"}, param1);
                    gm.a(true, "updatelinks", new Object[]{"privacy", var3 + "privacy.ws"}, param1);
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var2 = decompiledCaughtException;
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var2_ref);

                stackIn_8_1 = new StringBuilder().append("g.D(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L4;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L4;
                }
              }
              throw dd.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    g() {
        this.field_f = 0;
        this.field_h = 1;
        this.field_i = 0L;
        this.field_k = 0L;
        this.field_j = 0L;
        this.field_e = new long[10];
        this.field_i = System.nanoTime();
        this.field_j = System.nanoTime();
    }

    static {
        field_g = new int[128];
    }
}
