/*
 * Decompiled by CFR-JS 0.4.0.
 */
class dh extends uf {
    static int field_h;
    byte[] field_i;
    static int field_l;
    static boolean field_j;
    int field_k;

    final void a(java.math.BigInteger param0, byte param1, java.math.BigInteger param2) {
        int var4_int = 0;
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var8 = null;
        byte[] var9 = null;
        try {
            var4_int = this.field_k;
            this.field_k = 0;
            var5 = new byte[var4_int];
            int var7 = 14 / ((64 - param1) / 40);
            this.a(var4_int, 0, 91, var5);
            var6 = new java.math.BigInteger(var5);
            var8 = var6.modPow(param0, param2);
            var9 = var8.toByteArray();
            this.field_k = 0;
            this.h(-1564407352, var9.length);
            this.a(-222449912, var9, var9.length, 0);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "dh.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final int i(int param0) {
        this.field_k = this.field_k + 2;
        if (param0 != -25578) {
            return 62;
        }
        return (255 & this.field_i[-1 + this.field_k]) + ((this.field_i[-2 + this.field_k] & 255) << -1915115064);
    }

    final static void a(java.applet.Applet param0, boolean param1) {
        try {
            Object discarded$6 = null;
            Object discarded$7 = null;
            Object discarded$8 = null;
            Object discarded$9 = null;
            Object discarded$10 = null;
            Object discarded$11 = null;
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            java.net.URL var4 = null;
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            String stackIn_8_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_5_0 = null;
            StringBuilder stackOut_5_1 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            String stackOut_6_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var4 = param0.getCodeBase();
                      var3 = bb.a((byte) 122, var4, param0).getFile();
                      discarded$6 = cd.a(param0, "updatelinks", new Object[]{"home", var3 + "home.ws"}, 10056);
                      discarded$7 = cd.a(param0, "updatelinks", new Object[]{"gamelist", var3 + "togamelist.ws"}, 10056);
                      discarded$8 = cd.a(param0, "updatelinks", new Object[]{"serverlist", var3 + "toserverlist.ws"}, 10056);
                      discarded$9 = cd.a(param0, "updatelinks", new Object[]{"options", var3 + "options.ws"}, 10056);
                      discarded$10 = cd.a(param0, "updatelinks", new Object[]{"terms", var3 + "terms.ws"}, 10056);
                      discarded$11 = cd.a(param0, "updatelinks", new Object[]{"privacy", var3 + "privacy.ws"}, 10056);
                      if (param1) {
                        break L2;
                      } else {
                        field_l = -99;
                        break L2;
                      }
                    }
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
                stackOut_5_0 = (RuntimeException) (var2_ref);
                stackOut_5_1 = new StringBuilder().append("dh.L(");
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                if (param0 == null) {
                  stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackOut_7_2 = "null";
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  stackIn_8_2 = stackOut_7_2;
                  break L4;
                } else {
                  stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
                  stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
                  stackOut_6_2 = "{...}";
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_8_1 = stackOut_6_1;
                  stackIn_8_2 = stackOut_6_2;
                  break L4;
                }
              }
              throw qk.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final String e(int param0) {
        int fieldTemp$0 = 0;
        int var2 = this.field_k;
        while (true) {
            fieldTemp$0 = this.field_k;
            this.field_k = this.field_k + 1;
            if (this.field_i[fieldTemp$0] == 0) {
                break;
            }
        }
        int var3 = -var2 + this.field_k + param0;
        if (!(-1 != (var3 ^ -1))) {
            return "";
        }
        return tc.a((byte) -114, this.field_i, var3, var2);
    }

    final void a(int param0, int[] param1) {
        boolean discarded$2 = false;
        int incrementValue$3 = 0;
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var10 = Terraphoenix.field_V;
        try {
          L0: {
            var3_int = this.field_k / 8;
            this.field_k = 0;
            var4 = 0;
            L1: while (true) {
              if (var3_int <= var4) {
                L2: {
                  if (param0 == -6716) {
                    break L2;
                  } else {
                    discarded$2 = this.c(0);
                    break L2;
                  }
                }
                break L0;
              } else {
                var5 = this.f((byte) -107);
                var6 = this.f((byte) -107);
                var7 = 0;
                var8 = -1640531527;
                var9 = 32;
                L3: while (true) {
                  incrementValue$3 = var9;
                  var9--;
                  if (0 >= incrementValue$3) {
                    this.field_k = this.field_k - 8;
                    this.e(var5, 8959);
                    this.e(var6, 8959);
                    var4++;
                    continue L1;
                  } else {
                    var5 = var5 + (var7 + param1[var7 & 3] ^ var6 + (var6 >>> -1739618747 ^ var6 << 1843789828));
                    var7 = var7 + var8;
                    var6 = var6 + (param1[293601283 & var7 >>> -248618325] + var7 ^ var5 + (var5 << 803487044 ^ var5 >>> 1902111397));
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var3);
            stackOut_10_1 = new StringBuilder().append("dh.PA(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    final void b(int param0, int param1) {
        this.field_i[this.field_k + -param1 + -4] = (byte)(param1 >> 657947576);
        this.field_i[-3 + (this.field_k + -param1)] = (byte)(param1 >> -1633837360);
        this.field_i[-2 + this.field_k - param1] = (byte)(param1 >> -764694520);
        this.field_i[param0 + -param1 + this.field_k] = (byte)param1;
    }

    final boolean c(int param0) {
        this.field_k = this.field_k - 4;
        int var2 = gj.a(this.field_k, param0, 255, this.field_i);
        int var3 = this.f((byte) -107);
        if (var3 == var2) {
            return true;
        }
        return false;
    }

    final void j(int param0, int param1) {
        int discarded$0 = 0;
        if (param1 != -119) {
            discarded$0 = this.a(79);
        }
        this.field_i[this.field_k - param0 - 1] = (byte)param0;
    }

    final void i(int param0, int param1) {
        int fieldTemp$0 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_i[fieldTemp$0] = (byte)param0;
        int var3 = -106 % ((param1 - -56) / 34);
    }

    final void a(byte param0, int param1) {
        if (param0 != -107) {
            this.field_i = (byte[]) null;
        }
        if (64 > param1) {
            if (63 >= (param1 ^ -1)) {
                this.i(param1 + 64, 125);
                return;
            }
        }
        if ((param1 ^ -1) > -16385) {
            if (!(-16384 > param1)) {
                this.h(-1564407352, param1 - -49152);
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    final String j(int param0) {
        if (0 == this.field_i[this.field_k]) {
            this.field_k = this.field_k + 1;
            return null;
        }
        if (param0 != -1915115064) {
            String var3 = (String) null;
            this.a((String) null, 123);
        }
        return this.e(-1);
    }

    final int e(byte param0) {
        int discarded$0 = 0;
        int var2 = this.field_i[this.field_k] & 255;
        if (param0 < 91) {
            discarded$0 = this.a(-53);
        }
        if (-129 >= (var2 ^ -1)) {
            return -49152 + this.i(-25578);
        }
        return this.a(-16384) + -64;
    }

    final int h(int param0) {
        int var2 = 255 & this.field_i[this.field_k];
        int var3 = 109 / ((param0 - 21) / 63);
        if (128 > var2) {
            return this.a(-16384);
        }
        return this.i(-25578) - 32768;
    }

    final static void g(byte param0) {
        qi.field_b = false;
        fd.field_k = false;
        bm.a(-1, (byte) 1);
        if (param0 != -124) {
            return;
        }
        pe.field_a = og.field_a;
        qe.field_f = og.field_a;
    }

    final int i(byte param0) {
        int fieldTemp$1 = 0;
        int var4 = Terraphoenix.field_V;
        int fieldTemp$0 = this.field_k;
        this.field_k = this.field_k + 1;
        int var2 = this.field_i[fieldTemp$0];
        if (param0 != 13) {
            return -108;
        }
        int var3 = 0;
        while (var2 < 0) {
            var3 = (var2 & 127 | var3) << 1192620327;
            fieldTemp$1 = this.field_k;
            this.field_k = this.field_k + 1;
            var2 = this.field_i[fieldTemp$1];
        }
        return var2 | var3;
    }

    final void a(String param0, int param1) {
        int fieldTemp$0 = 0;
        int var3_int = param0.indexOf(' ');
        if (!((var3_int ^ -1) > -1)) {
            throw new IllegalArgumentException("");
        }
        CharSequence var4 = (CharSequence) ((Object) param0);
        this.field_k = this.field_k + ed.a(0, (byte) -97, var4, this.field_i, this.field_k, param0.length());
        if (param1 != 2295) {
            return;
        }
        try {
            fieldTemp$0 = this.field_k;
            this.field_k = this.field_k + 1;
            this.field_i[fieldTemp$0] = (byte) 0;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "dh.MA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, byte param1) {
        int fieldTemp$0 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_i[fieldTemp$0] = (byte)(param0 >> 1477402160);
        int fieldTemp$1 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_i[fieldTemp$1] = (byte)(param0 >> -1954921848);
        if (param1 >= -74) {
            return;
        }
        int fieldTemp$2 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_i[fieldTemp$2] = (byte)param0;
    }

    final void h(int param0, int param1) {
        int fieldTemp$0 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_i[fieldTemp$0] = (byte)(param1 >> -1564407352);
        if (param0 != -1564407352) {
            this.field_i = (byte[]) null;
        }
        int fieldTemp$1 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_i[fieldTemp$1] = (byte)param1;
    }

    final void a(int param0, int[] param1, int param2, int param3) {
        String discarded$2 = null;
        int incrementValue$3 = 0;
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var13 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              var5_int = this.field_k;
              this.field_k = param2;
              var6 = (-param2 + param3) / 8;
              if (param0 == -14328) {
                break L1;
              } else {
                discarded$2 = this.c((byte) 63);
                break L1;
              }
            }
            var7 = 0;
            L2: while (true) {
              if (var7 >= var6) {
                this.field_k = var5_int;
                break L0;
              } else {
                var8 = this.f((byte) -107);
                var9 = this.f((byte) -107);
                var10 = -957401312;
                var11 = -1640531527;
                var12 = 32;
                L3: while (true) {
                  incrementValue$3 = var12;
                  var12--;
                  if (-1 <= (incrementValue$3 ^ -1)) {
                    this.field_k = this.field_k - 8;
                    this.e(var8, param0 ^ -5385);
                    this.e(var9, param0 ^ -5385);
                    var7++;
                    continue L2;
                  } else {
                    var9 = var9 - (var8 + (var8 >>> -1117374139 ^ var8 << -1028121212) ^ var10 - -param1[(var10 & 7501) >>> 207624107]);
                    var10 = var10 - var11;
                    var8 = var8 - (param1[3 & var10] + var10 ^ var9 + (var9 << -358556668 ^ var9 >>> 407878853));
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var5);
            stackOut_11_1 = new StringBuilder().append("dh.W(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, String param1) {
        String discarded$1 = null;
        RuntimeException var3 = null;
        long var3_long = 0L;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var10 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              var3_long = 0L;
              var5 = 0L;
              var7 = param1.length();
              var8 = 19;
              if (param0 == -97) {
                break L1;
              } else {
                discarded$1 = this.c((byte) 109);
                break L1;
              }
            }
            L2: while (true) {
              if (var8 < 0) {
                this.a(var3_long, (byte) 99);
                this.a(var5, (byte) 111);
                break L0;
              } else {
                L3: {
                  var3_long = var3_long * 38L;
                  if (var8 >= var7) {
                    break L3;
                  } else {
                    L4: {
                      var9 = param1.charAt(var8);
                      if (var9 < 65) {
                        break L4;
                      } else {
                        if (var9 > 90) {
                          break L4;
                        } else {
                          var3_long = var3_long + (long)(-65 + (2 - -var9));
                          break L3;
                        }
                      }
                    }
                    L5: {
                      if (var9 < 97) {
                        break L5;
                      } else {
                        if (var9 <= 122) {
                          var3_long = var3_long + (long)(var9 + 2 + -97);
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (var9 < 48) {
                        break L6;
                      } else {
                        if (57 < var9) {
                          break L6;
                        } else {
                          var3_long = var3_long + (long)(var9 + 28 + -48);
                          break L3;
                        }
                      }
                    }
                    var3_long = var3_long + 1L;
                    break L3;
                  }
                }
                L7: {
                  if (10 == var8) {
                    var5 = var3_long;
                    var3_long = 0L;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                var8--;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var3);
            stackOut_22_1 = new StringBuilder().append("dh.K(").append(param0).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
    }

    final void e(int param0, int param1) {
        int fieldTemp$0 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_i[fieldTemp$0] = (byte)(param0 >> 282766872);
        int fieldTemp$1 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_i[fieldTemp$1] = (byte)(param0 >> -455653488);
        int fieldTemp$2 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_i[fieldTemp$2] = (byte)(param0 >> -705825688);
        if (param1 != 8959) {
            return;
        }
        int fieldTemp$3 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_i[fieldTemp$3] = (byte)param0;
    }

    final int f(byte param0) {
        if (param0 != -107) {
            this.a(58L, 30);
        }
        this.field_k = this.field_k + 4;
        return (this.field_i[this.field_k - 2] << -1765248664 & 65280) + (((this.field_i[this.field_k + -3] & 255) << -393875568) + ((255 & this.field_i[-4 + this.field_k]) << 1703593848)) - -(255 & this.field_i[-1 + this.field_k]);
    }

    final void f(int param0, int param1) {
        int fieldTemp$0 = 0;
        int var4 = Terraphoenix.field_V;
        while (param0 > this.field_k) {
            fieldTemp$0 = this.field_k;
            this.field_k = this.field_k + 1;
            this.field_i[fieldTemp$0] = (byte) 0;
        }
        if (param1 != -2108648176) {
            this.field_k = 38;
        }
    }

    final void a(long param0, int param1) {
        int fieldTemp$0 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_i[fieldTemp$0] = (byte)(int)(param0 >> -1671198088);
        int fieldTemp$1 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_i[fieldTemp$1] = (byte)(int)(param0 >> -2036200912);
        int fieldTemp$2 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_i[fieldTemp$2] = (byte)(int)(param0 >> 1097567400);
        int fieldTemp$3 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_i[fieldTemp$3] = (byte)(int)(param0 >> 273079200);
        int fieldTemp$4 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_i[fieldTemp$4] = (byte)(int)(param0 >> 361340120);
        if (param1 <= 18) {
            this.field_i = (byte[]) null;
        }
        int fieldTemp$5 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_i[fieldTemp$5] = (byte)(int)(param0 >> 137249936);
        int fieldTemp$6 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_i[fieldTemp$6] = (byte)(int)(param0 >> 2125782280);
        int fieldTemp$7 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_i[fieldTemp$7] = (byte)(int)param0;
    }

    final int a(int param0) {
        if (param0 != -16384) {
            return -93;
        }
        int fieldTemp$0 = this.field_k;
        this.field_k = this.field_k + 1;
        return 255 & this.field_i[fieldTemp$0];
    }

    final void b(long param0, int param1) {
        int fieldTemp$0 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_i[fieldTemp$0] = (byte)(int)(param0 >> 1180682272);
        if (param1 != -2108648176) {
            return;
        }
        int fieldTemp$1 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_i[fieldTemp$1] = (byte)(int)(param0 >> 1418683864);
        int fieldTemp$2 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_i[fieldTemp$2] = (byte)(int)(param0 >> -2108648176);
        int fieldTemp$3 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_i[fieldTemp$3] = (byte)(int)(param0 >> -222449912);
        int fieldTemp$4 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_i[fieldTemp$4] = (byte)(int)param0;
    }

    final int d(int param0, int param1) {
        int var3 = gj.a(this.field_k, param0, param1 ^ 8551, this.field_i);
        this.e(var3, 8959);
        if (param1 != 8600) {
            this.field_k = 47;
        }
        return var3;
    }

    final byte f(int param0) {
        if (param0 != 2) {
            field_h = 75;
        }
        int fieldTemp$0 = this.field_k;
        this.field_k = this.field_k + 1;
        return this.field_i[fieldTemp$0];
    }

    final void a(int param0, byte[] param1, int param2, int param3) {
        int fieldTemp$2 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var6 = Terraphoenix.field_V;
        try {
          L0: {
            var5_int = param3;
            L1: while (true) {
              if (param2 + param3 <= var5_int) {
                L2: {
                  if (param0 == -222449912) {
                    break L2;
                  } else {
                    field_h = 53;
                    break L2;
                  }
                }
                break L0;
              } else {
                fieldTemp$2 = this.field_k;
                this.field_k = this.field_k + 1;
                this.field_i[fieldTemp$2] = param1[var5_int];
                var5_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var5);
            stackOut_7_1 = new StringBuilder().append("dh.S(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final String c(byte param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = this.field_k;
        this.field_k = this.field_k + 1;
        int var2 = this.field_i[fieldTemp$0];
        if (!(var2 == 0)) {
            throw new IllegalStateException("");
        }
        int var3 = this.field_k;
        while (true) {
            fieldTemp$1 = this.field_k;
            this.field_k = this.field_k + 1;
            if (this.field_i[fieldTemp$1] == 0) {
                break;
            }
        }
        int var4 = -var3 + (this.field_k + -1);
        int var5 = -27 % ((-56 - param0) / 60);
        if (0 == var4) {
            return "";
        }
        return tc.a((byte) -114, this.field_i, var4, var3);
    }

    private final void a(long param0, byte param1) {
        int fieldTemp$0 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_i[fieldTemp$0] = (byte)(int)(param0 >> -1968452688);
        int fieldTemp$1 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_i[fieldTemp$1] = (byte)(int)(param0 >> 1740995624);
        int fieldTemp$2 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_i[fieldTemp$2] = (byte)(int)(param0 >> 1286847392);
        int fieldTemp$3 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_i[fieldTemp$3] = (byte)(int)(param0 >> -127007144);
        int fieldTemp$4 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_i[fieldTemp$4] = (byte)(int)(param0 >> -1442479792);
        if (param1 < 90) {
            field_j = false;
        }
        int fieldTemp$5 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_i[fieldTemp$5] = (byte)(int)(param0 >> 2067663624);
        int fieldTemp$6 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_i[fieldTemp$6] = (byte)(int)param0;
    }

    final static void g(int param0) {
        if (-uf.field_e + 0 != kf.field_f) {
            if (-uf.field_e + 250 == kf.field_f) {
            }
        }
        kf.field_f = kf.field_f + 1;
        if (param0 <= 67) {
            field_j = true;
        }
    }

    final void c(int param0, int param1) {
        int discarded$0 = 0;
        if (!(0 == (-128 & param1))) {
            if (!(-1 == (param1 & -16384 ^ -1))) {
                if (!(-1 == (param1 & -2097152 ^ -1))) {
                    if (!((param1 & -268435456) == 0)) {
                        this.i(param1 >>> 698486044 | 128, -14);
                    }
                    this.i((268611395 | param1) >>> -1868064235, param0 + 37);
                }
                this.i((param1 | 2111024) >>> -1156246098, -99);
            }
            this.i(param1 >>> 769844839 | 128, param0 + -5);
        }
        if (param0 != 0) {
            discarded$0 = this.i((byte) -56);
        }
        this.i(127 & param1, 15);
    }

    final void g(int param0, int param1) {
        this.field_i[this.field_k + (-param0 + -2)] = (byte)(param0 >> -1771206520);
        this.field_i[this.field_k - (param0 + 1)] = (byte)param0;
        if (param1 != -20125) {
            this.field_i = (byte[]) null;
        }
    }

    final void a(int param0, int param1, int param2, byte[] param3) {
        int fieldTemp$8 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        var7 = Terraphoenix.field_V;
        try {
          L0: {
            var5_int = 52 / ((30 - param2) / 56);
            var6 = param1;
            L1: while (true) {
              if (param1 - -param0 <= var6) {
                break L0;
              } else {
                fieldTemp$8 = this.field_k;
                this.field_k = this.field_k + 1;
                param3[var6] = this.field_i[fieldTemp$8];
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var5);
            stackOut_5_1 = new StringBuilder().append("dh.V(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    final int d(byte param0) {
        this.field_k = this.field_k + 3;
        if (param0 > -112) {
            this.field_k = -17;
        }
        return (this.field_i[-1 + this.field_k] & 255) + ((this.field_i[this.field_k - 2] << 1679937224 & 65280) + ((255 & this.field_i[-3 + this.field_k]) << -1017524688));
    }

    final int d(int param0) {
        if (param0 != -10355) {
            return -125;
        }
        if (0 <= this.field_i[this.field_k]) {
            return this.i(param0 ^ 19355);
        }
        return this.f((byte) -107) & 2147483647;
    }

    dh(int param0) {
        this.field_k = 0;
        this.field_i = qg.a(90, param0);
    }

    final void b(String param0, int param1) {
        int var3_int = 0;
        int fieldTemp$0 = 0;
        CharSequence var4 = null;
        int fieldTemp$1 = 0;
        try {
            if (param1 > -19) {
                this.field_k = 65;
            }
            var3_int = param0.indexOf(' ');
            if (var3_int >= 0) {
                throw new IllegalArgumentException("");
            }
            fieldTemp$0 = this.field_k;
            this.field_k = this.field_k + 1;
            this.field_i[fieldTemp$0] = (byte) 0;
            var4 = (CharSequence) ((Object) param0);
            this.field_k = this.field_k + ed.a(0, (byte) 115, var4, this.field_i, this.field_k, param0.length());
            fieldTemp$1 = this.field_k;
            this.field_k = this.field_k + 1;
            this.field_i[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "dh.R(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final long h(byte param0) {
        long var2 = 4294967295L & (long)this.f((byte) -107);
        long var4 = (long)this.f((byte) -107) & 4294967295L;
        if (param0 != 78) {
            return -96L;
        }
        return (var2 << 1581314336) + var4;
    }

    dh(byte[] param0) {
        try {
            this.field_i = param0;
            this.field_k = 0;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "dh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = 10;
        field_j = true;
    }
}
