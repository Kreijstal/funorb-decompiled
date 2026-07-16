/*
 * Decompiled by CFR-JS 0.4.0.
 */
class pb extends qb {
    byte[] field_g;
    static kc field_k;
    static int field_j;
    int field_i;
    static boolean field_h;

    final void f(int param0, int param1) {
        ((pb) this).field_g[-1 + (((pb) this).field_i - param0)] = (byte)param0;
        if (param1 == 8049) {
            return;
        }
        ((pb) this).field_g = null;
    }

    final int e(boolean param0) {
        if (!param0) {
            ((pb) this).f(35, -38);
            ((pb) this).field_i = ((pb) this).field_i + 3;
            return ((255 & ((pb) this).field_g[-2 + ((pb) this).field_i]) << 1801365000) + ((((pb) this).field_g[-3 + ((pb) this).field_i] << -735951856 & 16711680) - -(255 & ((pb) this).field_g[((pb) this).field_i - 1]));
        }
        ((pb) this).field_i = ((pb) this).field_i + 3;
        return ((255 & ((pb) this).field_g[-2 + ((pb) this).field_i]) << 1801365000) + ((((pb) this).field_g[-3 + ((pb) this).field_i] << -735951856 & 16711680) - -(255 & ((pb) this).field_g[((pb) this).field_i - 1]));
    }

    final byte a(boolean param0) {
        if (!param0) {
            ((pb) this).b(-119, -24);
            int fieldTemp$0 = ((pb) this).field_i;
            ((pb) this).field_i = ((pb) this).field_i + 1;
            return ((pb) this).field_g[fieldTemp$0];
        }
        int fieldTemp$1 = ((pb) this).field_i;
        ((pb) this).field_i = ((pb) this).field_i + 1;
        return ((pb) this).field_g[fieldTemp$1];
    }

    private final void b(long param0, int param1) {
        int fieldTemp$0 = ((pb) this).field_i;
        ((pb) this).field_i = ((pb) this).field_i + 1;
        ((pb) this).field_g[fieldTemp$0] = (byte)(int)(param0 >> 695453232);
        int fieldTemp$1 = ((pb) this).field_i;
        ((pb) this).field_i = ((pb) this).field_i + 1;
        ((pb) this).field_g[fieldTemp$1] = (byte)(int)(param0 >> 347751848);
        int fieldTemp$2 = ((pb) this).field_i;
        ((pb) this).field_i = ((pb) this).field_i + 1;
        ((pb) this).field_g[fieldTemp$2] = (byte)(int)(param0 >> 977465504);
        int var4 = -33 / ((param1 - -31) / 52);
        int fieldTemp$3 = ((pb) this).field_i;
        ((pb) this).field_i = ((pb) this).field_i + 1;
        ((pb) this).field_g[fieldTemp$3] = (byte)(int)(param0 >> -542704936);
        int fieldTemp$4 = ((pb) this).field_i;
        ((pb) this).field_i = ((pb) this).field_i + 1;
        ((pb) this).field_g[fieldTemp$4] = (byte)(int)(param0 >> 284882704);
        int fieldTemp$5 = ((pb) this).field_i;
        ((pb) this).field_i = ((pb) this).field_i + 1;
        ((pb) this).field_g[fieldTemp$5] = (byte)(int)(param0 >> 744825352);
        int fieldTemp$6 = ((pb) this).field_i;
        ((pb) this).field_i = ((pb) this).field_i + 1;
        ((pb) this).field_g[fieldTemp$6] = (byte)(int)param0;
    }

    final void a(int param0, int param1, int param2, int[] param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Object var14 = null;
        var13 = Main.field_T;
        var5 = ((pb) this).field_i;
        ((pb) this).field_i = param0;
        if (param2 <= -107) {
          var6 = (-param0 + param1) / 8;
          var7 = 0;
          L0: while (true) {
            if (var6 <= var7) {
              ((pb) this).field_i = var5;
              return;
            } else {
              var8 = ((pb) this).e((byte) 126);
              var9 = ((pb) this).e((byte) 126);
              var10 = -957401312;
              var11 = -1640531527;
              var12 = 32;
              L1: while (true) {
                int incrementValue$2 = var12;
                var12--;
                if ((incrementValue$2 ^ -1) >= -1) {
                  ((pb) this).field_i = ((pb) this).field_i - 8;
                  ((pb) this).a(-246, var8);
                  ((pb) this).a(-246, var9);
                  var7++;
                  continue L0;
                } else {
                  var9 = var9 - (var10 - -param3[343932931 & var10 >>> -1580755125] ^ (var8 << 1027333892 ^ var8 >>> 477734629) + var8);
                  var10 = var10 - var11;
                  var8 = var8 - (param3[var10 & 3] + var10 ^ (var9 << 757193668 ^ var9 >>> 849299813) - -var9);
                  continue L1;
                }
              }
            }
          }
        } else {
          var14 = null;
          ((pb) this).a((int[]) null, 32);
          var6 = (-param0 + param1) / 8;
          var7 = 0;
          L2: while (true) {
            if (var6 <= var7) {
              ((pb) this).field_i = var5;
              return;
            } else {
              var8 = ((pb) this).e((byte) 126);
              var9 = ((pb) this).e((byte) 126);
              var10 = -957401312;
              var11 = -1640531527;
              var12 = 32;
              L3: while (true) {
                int incrementValue$3 = var12;
                var12--;
                if ((incrementValue$3 ^ -1) >= -1) {
                  ((pb) this).field_i = ((pb) this).field_i - 8;
                  ((pb) this).a(-246, var8);
                  ((pb) this).a(-246, var9);
                  var7++;
                  continue L2;
                } else {
                  var9 = var9 - (var10 - -param3[343932931 & var10 >>> -1580755125] ^ (var8 << 1027333892 ^ var8 >>> 477734629) + var8);
                  var10 = var10 - var11;
                  var8 = var8 - (param3[var10 & 3] + var10 ^ (var9 << 757193668 ^ var9 >>> 849299813) - -var9);
                  continue L3;
                }
              }
            }
          }
        }
    }

    final void a(long param0, byte param1) {
        int fieldTemp$0 = ((pb) this).field_i;
        ((pb) this).field_i = ((pb) this).field_i + 1;
        ((pb) this).field_g[fieldTemp$0] = (byte)(int)(param0 >> -1755117768);
        if (param1 != 98) {
            return;
        }
        int fieldTemp$1 = ((pb) this).field_i;
        ((pb) this).field_i = ((pb) this).field_i + 1;
        ((pb) this).field_g[fieldTemp$1] = (byte)(int)(param0 >> -51094032);
        int fieldTemp$2 = ((pb) this).field_i;
        ((pb) this).field_i = ((pb) this).field_i + 1;
        ((pb) this).field_g[fieldTemp$2] = (byte)(int)(param0 >> -539624792);
        int fieldTemp$3 = ((pb) this).field_i;
        ((pb) this).field_i = ((pb) this).field_i + 1;
        ((pb) this).field_g[fieldTemp$3] = (byte)(int)(param0 >> 623477024);
        int fieldTemp$4 = ((pb) this).field_i;
        ((pb) this).field_i = ((pb) this).field_i + 1;
        ((pb) this).field_g[fieldTemp$4] = (byte)(int)(param0 >> 1743942488);
        int fieldTemp$5 = ((pb) this).field_i;
        ((pb) this).field_i = ((pb) this).field_i + 1;
        ((pb) this).field_g[fieldTemp$5] = (byte)(int)(param0 >> 1135300880);
        int fieldTemp$6 = ((pb) this).field_i;
        ((pb) this).field_i = ((pb) this).field_i + 1;
        ((pb) this).field_g[fieldTemp$6] = (byte)(int)(param0 >> -1230903288);
        int fieldTemp$7 = ((pb) this).field_i;
        ((pb) this).field_i = ((pb) this).field_i + 1;
        ((pb) this).field_g[fieldTemp$7] = (byte)(int)param0;
    }

    final void a(java.math.BigInteger param0, java.math.BigInteger param1, int param2) {
        int var4 = ((pb) this).field_i;
        ((pb) this).field_i = 0;
        byte[] var5 = new byte[var4];
        ((pb) this).a(param2 + 15893, var5, 0, var4);
        java.math.BigInteger var6 = new java.math.BigInteger(var5);
        java.math.BigInteger var7 = var6.modPow(param1, param0);
        byte[] var8 = var7.toByteArray();
        ((pb) this).field_i = 0;
        ((pb) this).e(var8.length, 26040);
        if (param2 != -15792) {
            field_k = null;
            ((pb) this).a(var8.length, 0, var8, (byte) -113);
            return;
        }
        ((pb) this).a(var8.length, 0, var8, (byte) -113);
    }

    final static void a(java.applet.Applet param0, byte param1) {
        h.a(param0, (byte) 52, "");
        if (param1 < 4) {
            return;
        }
        wh.a(param0, 63);
    }

    final String d(int param0) {
        int fieldTemp$0 = ((pb) this).field_i;
        ((pb) this).field_i = ((pb) this).field_i + 1;
        int var2 = ((pb) this).field_g[fieldTemp$0];
        int var3 = 10 / ((33 - param0) / 53);
        if (!(var2 == 0)) {
            throw new IllegalStateException("");
        }
        int var4 = ((pb) this).field_i;
        while (true) {
            int fieldTemp$1 = ((pb) this).field_i;
            ((pb) this).field_i = ((pb) this).field_i + 1;
            if (((pb) this).field_g[fieldTemp$1] == 0) {
                break;
            }
        }
        int var5 = -var4 + ((pb) this).field_i - 1;
        if (var5 == 0) {
            return "";
        }
        return bd.a(255, var4, ((pb) this).field_g, var5);
    }

    final void d(int param0, int param1) {
        ((pb) this).field_g[-param0 + (((pb) this).field_i - 2)] = (byte)(param0 >> 1077277896);
        ((pb) this).field_g[-1 + -param0 + ((pb) this).field_i] = (byte)param0;
        if (param1 == -27308) {
            return;
        }
        Object var4 = null;
        ((pb) this).a(-105, (String) null);
    }

    final int b(int param0, byte param1) {
        int var3 = ml.a(((pb) this).field_g, param0, ((pb) this).field_i, param1 ^ 12014);
        ((pb) this).a(-246, var3);
        if (param1 != 5) {
            field_k = null;
            return var3;
        }
        return var3;
    }

    final void a(int param0, String param1) {
        int var3 = 0;
        CharSequence var4 = null;
        if (param0 != 744825352) {
            String discarded$0 = ((pb) this).d(80);
            var3 = param1.indexOf(' ');
            if ((var3 ^ -1) <= -1) {
                throw new IllegalArgumentException("");
            }
            int fieldTemp$1 = ((pb) this).field_i;
            ((pb) this).field_i = ((pb) this).field_i + 1;
            ((pb) this).field_g[fieldTemp$1] = (byte) 0;
            var4 = (CharSequence) (Object) param1;
            ((pb) this).field_i = ((pb) this).field_i + hi.a(param1.length(), 0, ((pb) this).field_g, var4, ((pb) this).field_i, false);
            int fieldTemp$2 = ((pb) this).field_i;
            ((pb) this).field_i = ((pb) this).field_i + 1;
            ((pb) this).field_g[fieldTemp$2] = (byte) 0;
            return;
        }
        var3 = param1.indexOf(' ');
        if ((var3 ^ -1) <= -1) {
            throw new IllegalArgumentException("");
        }
        int fieldTemp$3 = ((pb) this).field_i;
        ((pb) this).field_i = ((pb) this).field_i + 1;
        ((pb) this).field_g[fieldTemp$3] = (byte) 0;
        CharSequence var5 = (CharSequence) (Object) param1;
        ((pb) this).field_i = ((pb) this).field_i + hi.a(param1.length(), 0, ((pb) this).field_g, var5, ((pb) this).field_i, false);
        int fieldTemp$4 = ((pb) this).field_i;
        ((pb) this).field_i = ((pb) this).field_i + 1;
        ((pb) this).field_g[fieldTemp$4] = (byte) 0;
    }

    final static void a(li param0, int param1) {
        if (param1 != 13427) {
            Object var3 = null;
            pb.a((java.applet.Applet) null, (byte) -39);
            bg.field_tb.a((je) (Object) param0);
            return;
        }
        bg.field_tb.a((je) (Object) param0);
    }

    final void a(int param0, byte param1) {
        int fieldTemp$0 = ((pb) this).field_i;
        ((pb) this).field_i = ((pb) this).field_i + 1;
        ((pb) this).field_g[fieldTemp$0] = (byte)(param0 >> 729225616);
        int fieldTemp$1 = ((pb) this).field_i;
        ((pb) this).field_i = ((pb) this).field_i + 1;
        ((pb) this).field_g[fieldTemp$1] = (byte)(param0 >> -1412304632);
        int fieldTemp$2 = ((pb) this).field_i;
        ((pb) this).field_i = ((pb) this).field_i + 1;
        ((pb) this).field_g[fieldTemp$2] = (byte)param0;
        if (param1 == 60) {
            return;
        }
        field_k = null;
    }

    final int b(boolean param0) {
        if (param0) {
            return 99;
        }
        if (0 <= ((pb) this).field_g[((pb) this).field_i]) {
            return ((pb) this).d((byte) 72);
        }
        return 2147483647 & ((pb) this).e((byte) 126);
    }

    final void b(String param0, int param1) {
        long var3 = 0L;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = Main.field_T;
        var3 = 0L;
        if (param1 == 15045) {
          L0: {
            var5 = 0L;
            var7 = param0.length();
            var8 = 19;
            if (0 > var8) {
              break L0;
            } else {
              L1: {
                var3 = var3 * 38L;
                if (var7 <= var8) {
                  break L1;
                } else {
                  L2: {
                    var9 = param0.charAt(var8);
                    if (65 > var9) {
                      break L2;
                    } else {
                      if (var9 > 90) {
                        break L2;
                      } else {
                        var3 = var3 + (long)(-65 + var9 + 2);
                        break L1;
                      }
                    }
                  }
                  L3: {
                    if (var9 < 97) {
                      break L3;
                    } else {
                      if (var9 > 122) {
                        break L3;
                      } else {
                        var3 = var3 + (long)(-97 + (var9 + 2));
                        break L1;
                      }
                    }
                  }
                  L4: {
                    if (var9 < 48) {
                      break L4;
                    } else {
                      if (var9 > 57) {
                        break L4;
                      } else {
                        var3 = var3 + (long)(28 - -var9 - 48);
                        break L1;
                      }
                    }
                  }
                  var3 = var3 + 1L;
                  break L1;
                }
              }
              L5: {
                if (-11 != (var8 ^ -1)) {
                  var8--;
                  break L5;
                } else {
                  var5 = var3;
                  var3 = 0L;
                  break L5;
                }
              }
              var8--;
              var8--;
              var8--;
              break L0;
            }
          }
          this.b(var3, 87);
          this.b(var5, -127);
          return;
        } else {
          field_h = false;
          L6: {
            var5 = 0L;
            var7 = param0.length();
            var8 = 19;
            if (0 > var8) {
              break L6;
            } else {
              L7: {
                var3 = var3 * 38L;
                if (var7 <= var8) {
                  break L7;
                } else {
                  L8: {
                    var9 = param0.charAt(var8);
                    if (65 > var9) {
                      break L8;
                    } else {
                      if (var9 > 90) {
                        break L8;
                      } else {
                        var3 = var3 + (long)(-65 + var9 + 2);
                        break L7;
                      }
                    }
                  }
                  L9: {
                    if (var9 < 97) {
                      break L9;
                    } else {
                      if (var9 > 122) {
                        break L9;
                      } else {
                        var3 = var3 + (long)(-97 + (var9 + 2));
                        break L7;
                      }
                    }
                  }
                  L10: {
                    if (var9 < 48) {
                      break L10;
                    } else {
                      if (var9 > 57) {
                        break L10;
                      } else {
                        var3 = var3 + (long)(28 - -var9 - 48);
                        break L7;
                      }
                    }
                  }
                  var3 = var3 + 1L;
                  break L7;
                }
              }
              L11: {
                if (-11 != (var8 ^ -1)) {
                  var8--;
                  break L11;
                } else {
                  var5 = var3;
                  var3 = 0L;
                  break L11;
                }
              }
              var8--;
              var8--;
              var8--;
              break L6;
            }
          }
          this.b(var3, 87);
          this.b(var5, -127);
          return;
        }
    }

    final int d(byte param0) {
        ((pb) this).field_i = ((pb) this).field_i + 2;
        if (param0 != 72) {
            field_k = null;
            return ((((pb) this).field_g[-2 + ((pb) this).field_i] & 255) << 1491421416) - -(((pb) this).field_g[-1 + ((pb) this).field_i] & 255);
        }
        return ((((pb) this).field_g[-2 + ((pb) this).field_i] & 255) << 1491421416) - -(((pb) this).field_g[-1 + ((pb) this).field_i] & 255);
    }

    final int f(int param0) {
        int var2 = -93 / ((-40 - param0) / 54);
        int fieldTemp$0 = ((pb) this).field_i;
        ((pb) this).field_i = ((pb) this).field_i + 1;
        return ((pb) this).field_g[fieldTemp$0] & 255;
    }

    final long d(boolean param0) {
        long var2 = 0L;
        long var4 = 0L;
        if (!param0) {
            Object var6 = null;
            ((pb) this).a((int[]) null, -115);
            var2 = (long)((pb) this).e((byte) 125) & 4294967295L;
            var4 = (long)((pb) this).e((byte) 125) & 4294967295L;
            return var4 + (var2 << -464188256);
        }
        var2 = (long)((pb) this).e((byte) 125) & 4294967295L;
        var4 = (long)((pb) this).e((byte) 125) & 4294967295L;
        return var4 + (var2 << -464188256);
    }

    final void a(int param0, byte[] param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        var6 = Main.field_T;
        if (param0 > 1) {
          var5 = param2;
          L0: while (true) {
            if (param2 - -param3 > var5) {
              int fieldTemp$11 = ((pb) this).field_i;
              ((pb) this).field_i = ((pb) this).field_i + 1;
              param1[var5] = ((pb) this).field_g[fieldTemp$11];
              var5++;
              continue L0;
            } else {
              return;
            }
          }
        } else {
          String discarded$12 = ((pb) this).f((byte) 15);
          var5 = param2;
          L1: while (true) {
            if (param2 - -param3 > var5) {
              int fieldTemp$13 = ((pb) this).field_i;
              ((pb) this).field_i = ((pb) this).field_i + 1;
              param1[var5] = ((pb) this).field_g[fieldTemp$13];
              var5++;
              continue L1;
            } else {
              return;
            }
          }
        }
    }

    final void a(long param0, int param1) {
        int fieldTemp$0 = ((pb) this).field_i;
        ((pb) this).field_i = ((pb) this).field_i + 1;
        ((pb) this).field_g[fieldTemp$0] = (byte)(int)(param0 >> -472318688);
        int fieldTemp$1 = ((pb) this).field_i;
        ((pb) this).field_i = ((pb) this).field_i + 1;
        ((pb) this).field_g[fieldTemp$1] = (byte)(int)(param0 >> -1406222120);
        int fieldTemp$2 = ((pb) this).field_i;
        ((pb) this).field_i = ((pb) this).field_i + 1;
        ((pb) this).field_g[fieldTemp$2] = (byte)(int)(param0 >> 1442653008);
        int fieldTemp$3 = ((pb) this).field_i;
        ((pb) this).field_i = ((pb) this).field_i + 1;
        ((pb) this).field_g[fieldTemp$3] = (byte)(int)(param0 >> 1636194440);
        int fieldTemp$4 = ((pb) this).field_i;
        ((pb) this).field_i = ((pb) this).field_i + 1;
        ((pb) this).field_g[fieldTemp$4] = (byte)(int)param0;
        if (param1 > 94) {
            return;
        }
        String discarded$5 = ((pb) this).f((byte) 48);
    }

    final boolean e(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (param0 != -1) {
            field_h = false;
            ((pb) this).field_i = ((pb) this).field_i - 4;
            var2 = ml.a(((pb) this).field_g, 0, ((pb) this).field_i, 12011);
            var3 = ((pb) this).e((byte) 124);
            if (var2 == var3) {
                return true;
            }
            return false;
        }
        ((pb) this).field_i = ((pb) this).field_i - 4;
        var2 = ml.a(((pb) this).field_g, 0, ((pb) this).field_i, 12011);
        var3 = ((pb) this).e((byte) 124);
        if (var2 == var3) {
            return true;
        }
        return false;
    }

    final int a(int param0) {
        int var2 = 255 & ((pb) this).field_g[((pb) this).field_i];
        if (param0 != 0) {
            String discarded$4 = ((pb) this).c(false);
            if (var2 >= 128) {
                return ((pb) this).d((byte) 72) + -32768;
            }
            return ((pb) this).f(-107);
        }
        if (var2 >= 128) {
            return ((pb) this).d((byte) 72) + -32768;
        }
        return ((pb) this).f(-107);
    }

    final void a(String param0, int param1) {
        int var3 = 0;
        CharSequence var4 = null;
        if (param1 != 19235) {
            ((pb) this).a(-127L, -81);
            var3 = param0.indexOf(' ');
            if (var3 >= 0) {
                throw new IllegalArgumentException("");
            }
            var4 = (CharSequence) (Object) param0;
            ((pb) this).field_i = ((pb) this).field_i + hi.a(param0.length(), 0, ((pb) this).field_g, var4, ((pb) this).field_i, false);
            int fieldTemp$0 = ((pb) this).field_i;
            ((pb) this).field_i = ((pb) this).field_i + 1;
            ((pb) this).field_g[fieldTemp$0] = (byte) 0;
            return;
        }
        var3 = param0.indexOf(' ');
        if (var3 >= 0) {
            throw new IllegalArgumentException("");
        }
        CharSequence var5 = (CharSequence) (Object) param0;
        ((pb) this).field_i = ((pb) this).field_i + hi.a(param0.length(), 0, ((pb) this).field_g, var5, ((pb) this).field_i, false);
        int fieldTemp$1 = ((pb) this).field_i;
        ((pb) this).field_i = ((pb) this).field_i + 1;
        ((pb) this).field_g[fieldTemp$1] = (byte) 0;
    }

    final void a(int param0, int param1, byte[] param2, byte param3) {
        int var5 = 0;
        int var6 = 0;
        var6 = Main.field_T;
        var5 = param1;
        if (param3 > -73) {
          this.b(51L, -75);
          L0: while (true) {
            if (var5 < param0 + param1) {
              int fieldTemp$2 = ((pb) this).field_i;
              ((pb) this).field_i = ((pb) this).field_i + 1;
              ((pb) this).field_g[fieldTemp$2] = param2[var5];
              var5++;
              continue L0;
            } else {
              return;
            }
          }
        } else {
          L1: while (true) {
            if (var5 < param0 + param1) {
              int fieldTemp$3 = ((pb) this).field_i;
              ((pb) this).field_i = ((pb) this).field_i + 1;
              ((pb) this).field_g[fieldTemp$3] = param2[var5];
              var5++;
              continue L1;
            } else {
              return;
            }
          }
        }
    }

    public static void c(byte param0) {
        if (param0 < 56) {
            field_h = true;
            field_k = null;
            return;
        }
        field_k = null;
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            try {
                if (param0 != -124) {
                    field_h = false;
                }
                var2 = new java.net.URL(param1.getCodeBase(), "quit.ws");
                param1.getAppletContext().showDocument(fh.a(param1, var2, -1), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final String f(byte param0) {
        if (!(-1 != (((pb) this).field_g[((pb) this).field_i] ^ -1))) {
            ((pb) this).field_i = ((pb) this).field_i + 1;
            return null;
        }
        if (param0 != 29) {
            return null;
        }
        return ((pb) this).c(false);
    }

    final void b(int param0, int param1) {
        if (param0 != -9469) {
            field_h = true;
            int fieldTemp$0 = ((pb) this).field_i;
            ((pb) this).field_i = ((pb) this).field_i + 1;
            ((pb) this).field_g[fieldTemp$0] = (byte)param1;
            return;
        }
        int fieldTemp$1 = ((pb) this).field_i;
        ((pb) this).field_i = ((pb) this).field_i + 1;
        ((pb) this).field_g[fieldTemp$1] = (byte)param1;
    }

    final void a(int[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = Main.field_T;
        var3 = ((pb) this).field_i / param1;
        ((pb) this).field_i = 0;
        var4 = 0;
        L0: while (true) {
          if (var3 > var4) {
            var5 = ((pb) this).e((byte) 124);
            var6 = ((pb) this).e((byte) 126);
            var7 = 0;
            var8 = -1640531527;
            var9 = 32;
            L1: while (true) {
              int incrementValue$2 = var9;
              var9--;
              if (0 >= incrementValue$2) {
                ((pb) this).field_i = ((pb) this).field_i - 8;
                ((pb) this).a(param1 ^ -254, var5);
                ((pb) this).a(param1 + -254, var6);
                var4++;
                continue L0;
              } else {
                var5 = var5 + ((var6 >>> -282819131 ^ var6 << 1125987300) - -var6 ^ var7 + param0[3 & var7]);
                var7 = var7 + var8;
                var6 = var6 + ((var5 >>> 617532645 ^ var5 << -253904124) - -var5 ^ param0[(var7 & 7068) >>> 1761805483] + var7);
                continue L1;
              }
            }
          } else {
            return;
          }
        }
    }

    final String c(boolean param0) {
        int var2 = ((pb) this).field_i;
        while (true) {
            int fieldTemp$0 = ((pb) this).field_i;
            ((pb) this).field_i = ((pb) this).field_i + 1;
            if (((pb) this).field_g[fieldTemp$0] == 0) {
                break;
            }
        }
        int var3 = -1 + (((pb) this).field_i - var2);
        if (0 == var3) {
            return "";
        }
        if (param0) {
            Object var4 = null;
            ((pb) this).a((String) null, 84);
            return bd.a(255, var2, ((pb) this).field_g, var3);
        }
        return bd.a(255, var2, ((pb) this).field_g, var3);
    }

    final int b(byte param0) {
        int var2 = ((pb) this).field_g[((pb) this).field_i] & 255;
        if (param0 != 59) {
            int discarded$4 = ((pb) this).b((byte) 40);
            if (128 <= var2) {
                return ((pb) this).d((byte) 72) + -49152;
            }
            return -64 + ((pb) this).f(80);
        }
        if (128 <= var2) {
            return ((pb) this).d((byte) 72) + -49152;
        }
        return -64 + ((pb) this).f(80);
    }

    final void e(int param0, int param1) {
        int fieldTemp$0 = ((pb) this).field_i;
        ((pb) this).field_i = ((pb) this).field_i + 1;
        ((pb) this).field_g[fieldTemp$0] = (byte)(param0 >> 580824904);
        int fieldTemp$1 = ((pb) this).field_i;
        ((pb) this).field_i = ((pb) this).field_i + 1;
        ((pb) this).field_g[fieldTemp$1] = (byte)param0;
        if (param1 == 26040) {
            return;
        }
        Object var4 = null;
        ((pb) this).b((String) null, 9);
    }

    final int e(byte param0) {
        if (param0 <= 123) {
            return 14;
        }
        ((pb) this).field_i = ((pb) this).field_i + 4;
        return (16711680 & ((pb) this).field_g[((pb) this).field_i - 3] << 1945416336) + (((((pb) this).field_g[((pb) this).field_i - 4] & 255) << -379994504) - -((255 & ((pb) this).field_g[((pb) this).field_i + -2]) << 1179247784)) + (255 & ((pb) this).field_g[((pb) this).field_i - 1]);
    }

    final void a(int param0, int param1) {
        int fieldTemp$0 = ((pb) this).field_i;
        ((pb) this).field_i = ((pb) this).field_i + 1;
        ((pb) this).field_g[fieldTemp$0] = (byte)(param1 >> -1276144488);
        int fieldTemp$1 = ((pb) this).field_i;
        ((pb) this).field_i = ((pb) this).field_i + 1;
        ((pb) this).field_g[fieldTemp$1] = (byte)(param1 >> -815763536);
        int fieldTemp$2 = ((pb) this).field_i;
        ((pb) this).field_i = ((pb) this).field_i + 1;
        ((pb) this).field_g[fieldTemp$2] = (byte)(param1 >> -484888248);
        if (param0 != -246) {
            field_k = null;
            int fieldTemp$3 = ((pb) this).field_i;
            ((pb) this).field_i = ((pb) this).field_i + 1;
            ((pb) this).field_g[fieldTemp$3] = (byte)param1;
            return;
        }
        int fieldTemp$4 = ((pb) this).field_i;
        ((pb) this).field_i = ((pb) this).field_i + 1;
        ((pb) this).field_g[fieldTemp$4] = (byte)param1;
    }

    pb(int param0) {
        ((pb) this).field_g = nh.a(-61, param0);
        ((pb) this).field_i = 0;
    }

    pb(byte[] param0) {
        ((pb) this).field_i = 0;
        ((pb) this).field_g = param0;
    }

    final void c(int param0, int param1) {
        int var4 = 0;
        var4 = Main.field_T;
        if (param0 != 1442653008) {
          int discarded$7 = ((pb) this).b(false);
          L0: while (true) {
            if (((pb) this).field_i < param1) {
              int fieldTemp$8 = ((pb) this).field_i;
              ((pb) this).field_i = ((pb) this).field_i + 1;
              ((pb) this).field_g[fieldTemp$8] = (byte) 0;
              continue L0;
            } else {
              return;
            }
          }
        } else {
          L1: while (true) {
            if (((pb) this).field_i < param1) {
              int fieldTemp$9 = ((pb) this).field_i;
              ((pb) this).field_i = ((pb) this).field_i + 1;
              ((pb) this).field_g[fieldTemp$9] = (byte) 0;
              continue L1;
            } else {
              return;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = false;
    }
}
