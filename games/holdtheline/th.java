/*
 * Decompiled by CFR-JS 0.4.0.
 */
class th extends IntrusiveNode {
    static String[] field_o;
    static String[] field_n;
    static gn field_m;
    static int field_j;
    int field_l;
    byte[] field_i;
    static int[] field_k;

    public static void a(byte param0) {
        field_n = null;
        field_m = null;
        field_k = null;
        field_o = null;
        if (param0 > -14) {
          field_o = (String[]) null;
        }
    }

    final void a(int param0, boolean param1) {
        int fieldTemp$0 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_i[fieldTemp$0] = (byte)(param0 >> 16);
        if (param1) {
          field_o = (String[]) null;
        }
        int fieldTemp$1 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_i[fieldTemp$1] = (byte)(param0 >> 8);
        int fieldTemp$2 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_i[fieldTemp$2] = (byte)param0;
    }

    final String i(int param0) {
        if (param0 != -1) {
          field_n = (String[]) null;
        }
        if (this.field_i[this.field_l] == 0) {
          this.field_l = this.field_l + 1;
          return null;
        }
        return this.j(-1231);
    }

    final int a(int param0) {
        this.field_l = this.field_l + 4;
        int var2 = 32 % ((param0 - 0) / 45);
        return (-16777216 & this.field_i[this.field_l - 4] << 24) + (16711680 & this.field_i[this.field_l - 3] << 16) - (-(65280 & this.field_i[-2 + this.field_l] << 8) - (255 & this.field_i[this.field_l - 1]));
    }

    final byte f(int param0) {
        if (param0 != 0) {
          field_m = (gn) null;
        }
        int fieldTemp$0 = this.field_l;
        this.field_l = this.field_l + 1;
        return this.field_i[fieldTemp$0];
    }

    final void b(int param0, long param1) {
        int fieldTemp$0 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_i[fieldTemp$0] = (byte)(int)(param1 >> 32);
        int fieldTemp$1 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_i[fieldTemp$1] = (byte)(int)(param1 >> 24);
        int fieldTemp$2 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_i[fieldTemp$2] = (byte)(int)(param1 >> 16);
        int fieldTemp$3 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_i[fieldTemp$3] = (byte)(int)(param1 >> 8);
        int fieldTemp$4 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_i[fieldTemp$4] = (byte)(int)param1;
        if (param0 != -483502376) {
          th.a((byte) -81);
        }
    }

    final void a(byte param0, long param1) {
        int fieldTemp$0 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_i[fieldTemp$0] = (byte)(int)(param1 >> 56);
        if (param0 != -84) {
          return;
        }
        int fieldTemp$1 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_i[fieldTemp$1] = (byte)(int)(param1 >> 48);
        int fieldTemp$2 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_i[fieldTemp$2] = (byte)(int)(param1 >> 40);
        int fieldTemp$3 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_i[fieldTemp$3] = (byte)(int)(param1 >> 32);
        int fieldTemp$4 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_i[fieldTemp$4] = (byte)(int)(param1 >> 24);
        int fieldTemp$5 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_i[fieldTemp$5] = (byte)(int)(param1 >> 16);
        int fieldTemp$6 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_i[fieldTemp$6] = (byte)(int)(param1 >> 8);
        int fieldTemp$7 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_i[fieldTemp$7] = (byte)(int)param1;
    }

    final int e(int param0) {
        int var2 = this.field_i[this.field_l] & 255;
        if (var2 >= param0) {
          return -32768 + this.k(94);
        }
        return this.f((byte) -34);
    }

    final int g(int param0) {
        int var2 = -15 / ((param0 - 48) / 58);
        if (this.field_i[this.field_l] < 0) {
          return this.a(-75) & 2147483647;
        }
        return this.k(-74);
    }

    final int d(byte param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        var4 = HoldTheLine.field_D;
        int fieldTemp$0 = this.field_l;
        this.field_l = this.field_l + 1;
        var2 = this.field_i[fieldTemp$0];
        var3 = 0;
        while (var2 < 0) {
          var3 = (var2 & 127 | var3) << 7;
          fieldTemp$1 = this.field_l;
          this.field_l = this.field_l + 1;
          var2 = this.field_i[fieldTemp$1];
        }
        if (param0 >= -2) {
          this.b((byte) 59);
        }
        return var3 | var2;
    }

    final void a(byte param0, int param1) {
        if (param0 != -58) {
          return;
        }
        int fieldTemp$0 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_i[fieldTemp$0] = (byte)(param1 >> 24);
        int fieldTemp$1 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_i[fieldTemp$1] = (byte)(param1 >> 16);
        int fieldTemp$2 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_i[fieldTemp$2] = (byte)(param1 >> 8);
        int fieldTemp$3 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_i[fieldTemp$3] = (byte)param1;
    }

    final void c(int param0, String param1) {
        int var3_int = 0;
        CharSequence var5 = null;
        int fieldTemp$0 = 0;
        try {
          int var4 = -69 / ((25 - param0) / 56);
          var3_int = param1.indexOf('\0');
          if (var3_int >= 0) {
            throw new IllegalArgumentException("");
          }
          var5 = (CharSequence) ((Object) param1);
          this.field_l = this.field_l + pj.a(var5, this.field_l, param1.length(), this.field_i, 0, (byte) 29);
          fieldTemp$0 = this.field_l;
          this.field_l = this.field_l + 1;
          this.field_i[fieldTemp$0] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "th.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int[] param3) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = HoldTheLine.field_D;
        try {
          var5_int = this.field_l;
          this.field_l = param0;
          var6 = (-param0 + param1) / 8;
          var7 = 0;
          while (true) {
            if (var6 <= var7) {
              this.field_l = var5_int;
              if (param2 != -12875) {
                this.g(-112, -117);
              }
              return;
            }
            var8 = this.a(-79);
            var9 = this.a(-111);
            var10 = -957401312;
            var11 = -1640531527;
            var12 = 32;
            while (true) {
              incrementValue$0 = var12;
              var12--;
              if (incrementValue$0 > 0) {
                var9 = var9 - (var10 + param3[(6517 & var10) >>> 11] ^ (var8 << 4 ^ var8 >>> 5) + var8);
                var10 = var10 - var11;
                var8 = var8 - (var9 + (var9 >>> 5 ^ var9 << 4) ^ var10 + param3[3 & var10]);
                continue;
              }
              break;
            }
            this.field_l = this.field_l - 8;
            this.a((byte) -58, var8);
            this.a((byte) -58, var9);
            var7++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("th.CB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void c(int param0, int param1) {
        this.field_i[-4 + (this.field_l - param1)] = (byte)(param1 >> 24);
        if (param0 <= 123) {
          return;
        }
        this.field_i[-3 - param1 + this.field_l] = (byte)(param1 >> 16);
        this.field_i[-param1 + this.field_l - 2] = (byte)(param1 >> 8);
        this.field_i[-1 + this.field_l - param1] = (byte)param1;
    }

    final static void e(int param0, int param1) {
        if (we.field_o == null) {
          we.field_o = new hj(640, 480);
        }
        vb.a(-124, we.field_o);
        eg.a(false);
        ug.b(-1);
        int var2 = -99 / ((25 - param0) / 63);
        we.field_o.d(0, 0, param1);
    }

    final String j(int param0) {
        int fieldTemp$0 = 0;
        int var2;
        int var3;
        String var4;
        var2 = this.field_l;
        if (param0 != -1231) {
          var4 = (String) null;
          this.c(122, (String) null);
        }
        do {
          fieldTemp$0 = this.field_l;
          this.field_l = this.field_l + 1;
        } while (this.field_i[fieldTemp$0] != 0);
        var3 = -1 + (this.field_l - var2);
        if (var3 != 0) {
          return sm.a(var3, var2, -129, this.field_i);
        }
        return "";
    }

    final int a(int param0, byte param1) {
        int var3 = qe.a(param0, this.field_l, 0, this.field_i);
        this.a((byte) -58, var3);
        if (param1 < 40) {
          this.a(-12);
        }
        return var3;
    }

    final static nd c(byte param0) {
        if (bb.field_a == gg.field_M) {
          throw new IllegalStateException();
        }
        if (param0 >= -41) {
          field_j = -78;
        }
        if (bb.field_a != fd.field_c) {
          return null;
        }
        bb.field_a = gg.field_M;
        return bg.field_d;
    }

    final boolean e(byte param0) {
        this.field_l = this.field_l - 4;
        int var2 = qe.a(0, this.field_l, 0, this.field_i);
        int var3 = this.a(-53);
        if (var3 == var2) {
          return true;
        }
        if (param0 != 78) {
          this.field_l = 38;
          return false;
        }
        return false;
    }

    final void a(java.math.BigInteger param0, java.math.BigInteger param1, byte param2) {
        int var4_int = 0;
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        try {
          var4_int = this.field_l;
          this.field_l = 0;
          var5 = new byte[var4_int];
          this.a(var4_int, 0, (byte) 87, var5);
          var6 = new java.math.BigInteger(var5);
          var7 = var6.modPow(param0, param1);
          var8 = var7.toByteArray();
          this.field_l = 0;
          this.b(-652561784, var8.length);
          if (param2 != 114) {
            field_m = (gn) null;
          }
          this.a(var8.length, 120, var8, 0);
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "th.FB(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static boolean a(int param0, lb param1, lb param2) {
        RuntimeException var3 = null;
        wb var4 = null;
        wb var5 = null;
        int var6 = 0;
        wb var7 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7 = new wb(param1.field_s, param1.field_r);
          var4 = new wb(param2.field_s, param2.field_r);
          var5 = new wb(param2.field_r, param1.field_r);
          var6 = var7.a(false, var4);
          if (~var6 == param0) {
            return false;
          }
          lk.field_b = (float)var5.a(false, var7) / (float)var6;
          mm.field_d = (float)var5.a(false, var4) / (float)var6;
          if (lk.field_b >= 0.0f &&
            0.0f <= mm.field_d &&
            1.0f > lk.field_b) {
            if (!(1.0f > mm.field_d)) {
              return false;
            }
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("th.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final int h(int param0) {
        this.field_l = this.field_l + 2;
        if (param0 != -14232) {
          lb var3 = (lb) null;
          th.a(19, (lb) null, (lb) null);
        }
        int var2 = (255 & this.field_i[-1 + this.field_l]) + ((255 & this.field_i[this.field_l - 2]) << 8);
        if (32767 < var2) {
          var2 = var2 - 65536;
        }
        return var2;
    }

    final void a(int param0, int param1, byte param2, byte[] param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = HoldTheLine.field_D;
        try {
          for (var5_int = param1; param0 + param1 > var5_int; var5_int++) {
            fieldTemp$0 = this.field_l;
            this.field_l = this.field_l + 1;
            param3[var5_int] = this.field_i[fieldTemp$0];
          }
          if (param2 <= 67) {
            field_o = (String[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("th.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void a(int param0, int param1) {
        if (param0 != -268435456) {
          this.f((byte) -102);
        }
        this.field_i[-1 - param1 + this.field_l] = (byte)param1;
    }

    final int c(boolean param0) {
        this.field_l = this.field_l + 3;
        if (param0) {
          this.f(9, -63);
        }
        return (this.field_i[-1 + this.field_l] & 255) + ((this.field_i[-3 + this.field_l] << 16 & 16711680) + ((255 & this.field_i[-2 + this.field_l]) << 8));
    }

    final void b(int param0, String param1) {
        int var8 = 0;
        long var3_long = 0L;
        long var5 = 0L;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var10 = HoldTheLine.field_D;
        try {
          var3_long = (long)param0;
          var5 = 0L;
          var7 = param1.length();
          for (var8 = 19; var8 >= 0; var8--) {
            var3_long = var3_long * 38L;
            if (var8 < var7) {
              var9 = param1.charAt(var8);
              if (var9 >= 65 &&
                var9 <= 90) {
                var3_long = var3_long + (long)(var9 + 2 - 65);
              } else {
                if (var9 >= 97 &&
                  var9 <= 122) {
                  var3_long = var3_long + (long)(var9 - 95);
                } else {
                  if (48 <= var9 &&
                    var9 <= 57) {
                    var3_long = var3_long + (long)(-20 + var9);
                  } else {
                    var3_long = var3_long + 1L;
                  }
                }
              }
            }
            if (var8 == 10) {
              var5 = var3_long;
              var3_long = 0L;
            }
          }
          this.a(8, var3_long);
          this.a(8, var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_24_0 = var3;
          stackIn_24_1 = new StringBuilder().append("th.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final static void b(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2_int = 0;
        int[] var2 = null;
        hj[] var3 = null;
        int var4 = 0;
        int[] var4_ref_int__ = null;
        int var6_int = 0;
        hj var6 = null;
        hj var7 = null;
        int var8 = 0;
        int var9 = 0;
        ec var10 = null;
        vk var11 = null;
        hj var12 = null;
        hj var13 = null;
        hj[] var14 = null;
        vk var15 = null;
        hj[] var16 = null;
        hj[] var3Lifetime1;
        int var4Lifetime1;
        var8 = HoldTheLine.field_D;
        try {
          var10 = (ec) (l.field_a[13]);
          if (!param0) {
            field_m = (gn) null;
          }
          if (7 == DelegatingCanvas.field_d) {
            for (var2_int = 0; var2_int < 4; var2_int++) {
              var10.field_o[0][var2_int] = p.a(pf.a((byte) 82, var2_int), (byte) -110, var2_int);
            }
          } else {
            if (DelegatingCanvas.field_d != 1 &&
              DelegatingCanvas.field_d != 0) {
              var2_int = pc.field_l[5];
              var14 = new hj[var2_int];
              var3 = var14;
              for (var4 = 0; var4 < var2_int; var4++) {
                var11 = tk.field_c[5][var4];
                var11.b(3);
                var6_int = pf.a((byte) 88, var4);
                if (var6_int != 0) {
                  if (2 != var6_int) {
                    if (of.a(-969)) {
                      var13 = var11.a(9392, 2, 111).e();
                      var7 = var13;
                      qm.a(var13, 64, -1);
                    } else {
                      var7 = new hj(111, 84);
                    }
                    vb.a(-93, var7);
                    rf.field_ab.a(var7.field_s - rf.field_ab.field_s >> 1, var7.field_y - rf.field_ab.field_y >> 1);
                    ug.b(-1);
                  } else {
                    var12 = var11.a(9392, 2, 111).e();
                    var7 = var12;
                    qm.a(var12, 64, -1);
                  }
                  var3[var4] = var7;
                } else {
                  var3[var4] = var11.a(9392, 2, 111);
                }
              }
              var10.field_o[0] = var14;
              if (var10.field_c >= 1) {
                var4_ref_int__ = go.field_g[kn.b((byte) -49).field_p];
                var10.field_o[1] = new hj[]{ua.field_b.a(84, var4_ref_int__[0], 9, 111), ua.field_b.a(84, var4_ref_int__[1], 9, 111)};
                if (2 <= var10.field_c) {
                  var10.field_o[2] = new hj[]{ua.field_b.a(84, var4_ref_int__[0] + 8, 9, 111), ua.field_b.a(84, 8 + var4_ref_int__[1], 9, 111)};
                  return;
                }
              }
              return;
            }
            for (var2_int = 0; var2_int < 4; var2_int++) {
              var10.field_o[0][var2_int] = p.a(pf.a((byte) 94, var2_int), (byte) -127, var2_int);
            }
            if (1 <= var10.field_c) {
              var2_int = pc.field_l[cf.field_w];
              var16 = new hj[var2_int];
              var3Lifetime1 = var16;
              var9 = 0;
              var4Lifetime1 = var9;
              while (var2_int > var9) {
                var15 = tk.field_c[cf.field_w][var9];
                var15.b(3);
                if (gj.a(var9, -117, cf.field_w) != 0) {
                  var6 = var15.a(9392, DelegatingCanvas.field_d, 111).e();
                  qm.a(var6, 64, -1);
                  vb.a(-108, var6);
                  rf.field_ab.a(-rf.field_ab.field_s + var6.field_s >> 1, -rf.field_ab.field_y + var6.field_y >> 1);
                  ug.b(-1);
                  var3Lifetime1[var9] = var6;
                } else {
                  var3Lifetime1[var9] = var15.a(9392, 1, 111);
                }
                var9++;
              }
              var10.field_o[1] = var16;
            }
            if (var10.field_c < 2) {
              return;
            }
            var2 = go.field_g[kn.b((byte) -49).field_p];
            var10.field_o[2] = new hj[]{ua.field_b.a(84, var2[0], 9, 111), ua.field_b.a(84, var2[1], 9, 111)};
            if (3 > var10.field_c) {
              return;
            }
            var10.field_o[3] = new hj[]{ua.field_b.a(84, var2[0] + 8, 9, 111), ua.field_b.a(84, var2[1] + 8, 9, 111)};
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var1), "th.AB(" + param0 + ')');
        }
    }

    final int f(byte param0) {
        if (param0 >= -15) {
          this.g(3);
        }
        int fieldTemp$0 = this.field_l;
        this.field_l = this.field_l + 1;
        return this.field_i[fieldTemp$0] & 255;
    }

    private final void a(int param0, long param1) {
        int fieldTemp$0 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_i[fieldTemp$0] = (byte)(int)(param1 >> 48);
        int fieldTemp$1 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_i[fieldTemp$1] = (byte)(int)(param1 >> 40);
        if (param0 != 8) {
          return;
        }
        int fieldTemp$2 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_i[fieldTemp$2] = (byte)(int)(param1 >> 32);
        int fieldTemp$3 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_i[fieldTemp$3] = (byte)(int)(param1 >> 24);
        int fieldTemp$4 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_i[fieldTemp$4] = (byte)(int)(param1 >> 16);
        int fieldTemp$5 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_i[fieldTemp$5] = (byte)(int)(param1 >> 8);
        int fieldTemp$6 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_i[fieldTemp$6] = (byte)(int)param1;
    }

    final void a(int param0, String param1) {
        int var3_int = 0;
        int fieldTemp$0 = 0;
        CharSequence var4 = null;
        int fieldTemp$1 = 0;
        try {
          if (param0 != 29336) {
            this.a(5, false);
          }
          var3_int = param1.indexOf('\0');
          if (var3_int >= 0) {
            throw new IllegalArgumentException("");
          }
          fieldTemp$0 = this.field_l;
          this.field_l = this.field_l + 1;
          this.field_i[fieldTemp$0] = (byte) 0;
          var4 = (CharSequence) ((Object) param1);
          this.field_l = this.field_l + pj.a(var4, this.field_l, param1.length(), this.field_i, 0, (byte) 29);
          fieldTemp$1 = this.field_l;
          this.field_l = this.field_l + 1;
          this.field_i[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "th.EA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void d(int param0, int param1) {
        if ((param0 & -128) != 0) {
          if ((-16384 & param0) != 0) {
            if ((param0 & -2097152) != 0) {
              if ((-268435456 & param0) != 0) {
                this.f(111, 128 | param0 >>> 28);
              }
              this.f(111, param0 >>> 21 | 128);
            }
            this.f(111, 128 | param0 >>> 14);
          }
          this.f(111, 128 | param0 >>> 7);
        }
        if (param1 >= -84) {
          return;
        }
        this.f(111, param0 & 127);
    }

    final void a(int param0, int param1, byte[] param2, int param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = HoldTheLine.field_D;
        try {
          if (param1 <= 10) {
            this.f(-98);
          }
          for (var5_int = param3; var5_int < param3 + param0; var5_int++) {
            fieldTemp$0 = this.field_l;
            this.field_l = this.field_l + 1;
            this.field_i[fieldTemp$0] = param2[var5_int];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("th.EB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    final void g(int param0, int param1) {
        if (param0 != -29190) {
          this.e((byte) 87);
        }
        this.field_i[-param1 + this.field_l - 2] = (byte)(param1 >> 8);
        this.field_i[this.field_l - (param1 + 1)] = (byte)param1;
    }

    final int k(int param0) {
        int var2 = 47 / ((7 - param0) / 52);
        this.field_l = this.field_l + 2;
        return (255 & this.field_i[this.field_l - 1]) + (this.field_i[this.field_l - 2] << 8 & 65280);
    }

    final int b(byte param0) {
        int var2 = 255 & this.field_i[this.field_l];
        if (param0 != -84) {
          field_k = (int[]) null;
        }
        if (var2 >= 128) {
          return -49152 + this.k(121);
        }
        return -64 + this.f((byte) -112);
    }

    final long d(boolean param0) {
        long var2 = (long)this.a(76) & 4294967295L;
        long var4 = 4294967295L & (long)this.a(-64);
        if (!param0) {
          return -125L;
        }
        return var4 + (var2 << 32);
    }

    final void b(int param0, int param1) {
        int fieldTemp$0 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_i[fieldTemp$0] = (byte)(param1 >> 8);
        int fieldTemp$1 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_i[fieldTemp$1] = (byte)param1;
        if (param0 != -652561784) {
          this.a((byte) 58, 112L);
        }
    }

    final void f(int param0, int param1) {
        if (param0 != 111) {
          this.k(121);
        }
        int fieldTemp$0 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_i[fieldTemp$0] = (byte)param1;
    }

    final void b(byte param0, int param1) {
        int fieldTemp$0 = 0;
        int var4;
        var4 = HoldTheLine.field_D;
        while (this.field_l < param1) {
          fieldTemp$0 = this.field_l;
          this.field_l = this.field_l + 1;
          this.field_i[fieldTemp$0] = (byte) 0;
        }
        if (param0 != 127) {
          field_n = (String[]) null;
        }
    }

    th(int param0) {
        this.field_i = al.a(param0, (byte) 85);
        this.field_l = 0;
    }

    final String a(boolean param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        lb var5;
        int fieldTemp$0 = this.field_l;
        this.field_l = this.field_l + 1;
        var2 = this.field_i[fieldTemp$0];
        if (var2 != 0) {
          throw new IllegalStateException("");
        }
        if (!param0) {
          var5 = (lb) null;
          th.a(-112, (lb) null, (lb) null);
        }
        var3 = this.field_l;
        do {
          fieldTemp$1 = this.field_l;
          this.field_l = this.field_l + 1;
        } while (this.field_i[fieldTemp$1] != 0);
        var4 = this.field_l - var3 - 1;
        if (var4 == 0) {
          return "";
        }
        return sm.a(var4, var3, -129, this.field_i);
    }

    th(byte[] param0) {
        try {
          this.field_l = 0;
          this.field_i = param0;
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "th.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int[] param0, int param1) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = HoldTheLine.field_D;
        try {
          if (param1 != 111) {
            this.a(84, (byte) 12);
          }
          var3_int = this.field_l / 8;
          this.field_l = 0;
          var4 = 0;
          while (true) {
            if (var4 >= var3_int) {
              return;
            }
            var5 = this.a(-104);
            var6 = this.a(-82);
            var7 = 0;
            var8 = -1640531527;
            var9 = 32;
            while (true) {
              incrementValue$0 = var9;
              var9--;
              if (0 < incrementValue$0) {
                var5 = var5 + (var7 + param0[var7 & 3] ^ (var6 >>> 5 ^ var6 << 4) + var6);
                var7 = var7 + var8;
                var6 = var6 + ((var5 >>> 5 ^ var5 << 4) + var5 ^ param0[var7 >>> 11 & -1451229181] + var7);
                continue;
              }
              break;
            }
            this.field_l = this.field_l - 8;
            this.a((byte) -58, var5);
            this.a((byte) -58, var6);
            var4++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("th.HA(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_o = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
        field_j = 0;
        field_k = new int[]{215, 180};
    }
}
