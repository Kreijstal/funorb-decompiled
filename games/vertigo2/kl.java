/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kl extends cr {
    static String field_Nb;
    int field_Kb;
    static cr field_Ib;
    private cr[] field_Mb;
    private cr[] field_Lb;
    static String field_Jb;
    private cr field_Hb;

    private final void a(int param0, int param1, int param2) {
        cr dupTemp$0 = null;
        int var4;
        int var5;
        int var6;
        int var7;
        java.applet.Applet var8;
        int var9;
        var7 = Vertigo2.field_L ? 1 : 0;
        var4 = 0;
        L0: while (true) {
          if (this.field_Mb.length <= var4) {
            L1: {
              if (param0 == -12320) {
                break L1;
              } else {
                var8 = (java.applet.Applet) null;
                kl.a((byte) -49, (String) null, (java.applet.Applet) null);
                break L1;
              }
            }
            this.field_Hb.a(param0 ^ -12414, this.field_Fb, this.field_db - param1, param1, 0);
            var9 = 0;
            var4 = var9;
            L2: while (true) {
              if (this.field_Lb.length <= var9) {
                return;
              } else {
                this.field_Lb[var9].a(121, -(2 * param2) + this.field_Hb.field_Fb, -(param2 * 2) + this.field_Hb.field_db, param2, param2);
                if (var9 != this.field_Kb) {
                  dupTemp$0 = this.field_Lb[var9];
                  dupTemp$0.field_wb = dupTemp$0.field_wb + 10000;
                  var9++;
                  continue L2;
                } else {
                  var9++;
                  continue L2;
                }
              }
            }
          } else {
            var5 = var4 * this.field_Fb / this.field_Mb.length;
            var6 = this.field_Fb * (1 + var4) / this.field_Mb.length;
            this.field_Mb[var4].field_wb = var5;
            this.field_Mb[var4].field_N = 0;
            this.field_Mb[var4].field_Fb = -var5 + var6;
            this.field_Mb[var4].field_db = param1;
            var4++;
            continue L0;
          }
        }
    }

    final static String a(byte param0, String param1, java.applet.Applet param2) {
        try {
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            java.applet.Applet var8 = null;
            String stackIn_8_0 = null;
            Object stackIn_13_0 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            StringBuilder stackIn_19_1 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var3_ref = null;
            RuntimeException var3_ref2 = null;
            var7 = Vertigo2.field_L ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (param0 == 70) {
                    break L1;
                  } else {
                    var8 = (java.applet.Applet) null;
                    kl.a((byte) 75, (String) null, (java.applet.Applet) null);
                    break L1;
                  }
                }
                try {
                  L2: {
                    var3 = (String) (je.a(param2, false, "getcookies"));
                    var4 = jr.a((byte) -9, ';', var3);
                    var5 = 0;
                    L3: while (true) {
                      if (var4.length <= var5) {
                        decompiledRegionSelector0 = 0;
                        break L2;
                      } else {
                        L4: {
                          var6 = var4[var5].indexOf('=');
                          if (-1 < (var6 ^ -1)) {
                            break L4;
                          } else {
                            if (!var4[var5].substring(0, var6).trim().equals(param1)) {
                              break L4;
                            } else {
                              stackIn_8_0 = var4[var5].substring(var6 - -1).trim();
                              decompiledRegionSelector0 = 1;
                              break L2;
                            }
                          }
                        }
                        var5++;
                        continue L3;
                      }
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L5: {
                    var3_ref = decompiledCaughtException;
                    decompiledRegionSelector0 = 0;
                    break L5;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  stackIn_13_0 = null;
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L6: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_16_0 = (RuntimeException) (var3_ref2);

                stackIn_16_1 = new StringBuilder().append("kl.F(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackIn_17_2 = "null";
                  break L6;
                } else {
                  stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackIn_17_2 = "{...}";
                  break L6;
                }
              }
              L7: {


                stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

                if (param2 == null) {
                  stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
                  stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackIn_20_2 = "null";
                  break L7;
                } else {
                  stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
                  stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackIn_20_2 = "{...}";
                  break L7;
                }
              }
              throw wn.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return (String) ((Object) stackIn_13_0);
            } else {
              return stackIn_8_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(boolean param0) {
        field_Jb = null;
        field_Nb = null;
        field_Ib = null;
        if (!param0) {
            kl.b(false);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this.field_Fb = param3;
        this.field_db = param5;
        this.field_N = param6;
        if (param1 != 12318) {
            this.field_Hb = (cr) null;
        }
        this.field_wb = param2;
        this.a(param1 ^ -2, param4, param0);
    }

    kl(long param0, cr param1, String[] param2, cr param3, cr[] param4, int param5) {
        super(param0, (cr) null);
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        cr var9 = null;
        int var11 = 0;
        try {
          L0: {
            this.field_Mb = new cr[param2.length];
            this.field_Hb = new cr(0L, param3);
            this.field_Lb = param4;
            var8_int = 0;
            L1: while (true) {
              if (param2.length <= var8_int) {
                this.b(this.field_Hb, 122);
                var11 = 0;
                var8_int = var11;
                L2: while (true) {
                  if (var11 >= param4.length) {
                    this.field_Kb = param5;
                    this.field_Mb[param5].field_V = true;
                    break L0;
                  } else {
                    this.field_Hb.b(param4[var11], 122);
                    var11++;
                    continue L2;
                  }
                }
              } else {
                var9 = new cr(0L, param1);
                var9.field_S = param2[var8_int];
                this.field_Mb[var8_int] = var9;
                this.b(var9, 119);
                var8_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var8);

            stackIn_11_1 = new StringBuilder().append("kl.<init>(").append(param0).append(',');

            if (param1 == null) {
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
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param3 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param4 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_12_0), stackIn_21_2 + ',' + param5 + ')');
        }
    }

    final void k(int param0) {
        cr dupTemp$0 = null;
        cr dupTemp$1 = null;
        int var2;
        int var3;
        var3 = Vertigo2.field_L ? 1 : 0;
        var2 = param0;
        L0: while (true) {
          if (this.field_Mb.length <= var2) {
            return;
          } else {
            if (this.field_Kb != var2) {
              if (0 != this.field_Mb[var2].field_tb) {
                this.field_Mb[this.field_Kb].field_V = false;
                dupTemp$0 = this.field_Lb[this.field_Kb];
                dupTemp$0.field_wb = dupTemp$0.field_wb + 10000;
                this.field_Kb = var2;
                this.field_Mb[var2].field_V = true;
                dupTemp$1 = this.field_Lb[var2];
                dupTemp$1.field_wb = dupTemp$1.field_wb - 10000;
                var2++;
                continue L0;
              } else {
                var2++;
                continue L0;
              }
            } else {
              var2++;
              continue L0;
            }
          }
        }
    }

    static {
        field_Nb = "Press TAB to chat or F10 to open Quick Chat.";
        field_Jb = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
    }
}
