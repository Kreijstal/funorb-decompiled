/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ll extends nl {
    int[] field_x;

    void b(int param0, int param1, int param2) {
        int var10 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        param0 = param0 + this.field_u;
        param1 = param1 + this.field_p;
        int var4 = param0 + param1 * vp.field_i;
        int var5 = 0;
        int var6 = this.field_n;
        int var7 = this.field_r;
        int var8 = vp.field_i - var7;
        int var9 = 0;
        if (param1 < vp.field_f) {
          var10 = vp.field_f - param1;
          var6 = var6 - var10;
          param1 = vp.field_f;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * vp.field_i;
        }
        if (param1 + var6 > vp.field_d) {
          var6 = var6 - (param1 + var6 - vp.field_d);
        }
        if (param0 < vp.field_b) {
          var10Lifetime1 = vp.field_b - param0;
          var7 = var7 - var10Lifetime1;
          param0 = vp.field_b;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (param0 + var7 > vp.field_k) {
          var10Lifetime2 = param0 + var7 - vp.field_k;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 > 0) {
          if (var6 <= 0) {
            return;
          }
          ll.a(vp.field_j, this.field_x, 0, var5, var4, var7, var6, var8, var9, param2);
          return;
        }
    }

    final void c() {
        int var4 = 0;
        int incrementValue$0 = 0;
        int var3 = 0;
        int[] var1 = new int[this.field_r * this.field_n];
        int var2 = 0;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        for (var3 = 0; var3 < this.field_r; var3++) {
          for (var4 = this.field_n - 1; var4 >= 0; var4--) {
            incrementValue$0 = var2;
            var2++;
            var1[incrementValue$0] = this.field_x[var3 + var4 * this.field_r];
          }
        }
        this.field_x = var1;
        var3Lifetime1 = this.field_p;
        this.field_p = this.field_u;
        this.field_u = this.field_q - this.field_n - var3Lifetime1;
        var3Lifetime2 = this.field_n;
        this.field_n = this.field_r;
        this.field_r = var3Lifetime2;
        var3Lifetime3 = this.field_q;
        this.field_q = this.field_v;
        this.field_v = var3Lifetime3;
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var15 = 0;
        int var16 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var17;
        int var18;
        int var19;
        var10 = param9 >> 16 & 255;
        var11 = param9 >> 8 & 255;
        var12 = param9 & 255;
        var13 = -(param5 >> 2);
        param5 = -(param5 & 3);
        var14 = var13 + var13 + var13 + var13 + param5;
        for (var15 = -param6; var15 < 0; var15++) {
          for (var16 = var14; var16 < 0; var16++) {
            boolean decompiledFrameRemainder0 = true;
            param2 = param1[param3++];
            if (param2 == 0) {
              param4++;
            } else {
              var17 = param2 >> 16 & 255;
              var18 = param2 >> 8 & 255;
              var19 = param2 & 255;
              if (var17 == var18 &&
                var18 == var19) {
                if (var17 > 128) {
                  incrementValue$1 = param4;
                  param4++;
                  param0[incrementValue$1] = (var10 * (256 - var17) + 255 * (var17 - 128) >> 7 << 16) + (var11 * (256 - var18) + 255 * (var18 - 128) >> 7 << 8) + (var12 * (256 - var19) + 255 * (var19 - 128) >> 7);
                } else {
                  incrementValue$2 = param4;
                  param4++;
                  param0[incrementValue$2] = (var17 * var10 >> 7 << 16) + (var18 * var11 >> 7 << 8) + (var19 * var12 >> 7);
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                param0[param4++] = param2;
              }
            }
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_25_0 = 0;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        var6 = param2 * this.field_r + param1;
        param3 = param3 & 4095;
        param4 = param4 & 4095;
        if (param2 < 0) {
          var12 = 0;
          var11 = 0;
          var8 = 0;
          var7 = 0;
        } else {
          if (param1 < 0) {
            var11 = 0;
            var7 = 0;
          } else {
            var7 = this.field_x[var6];
            if (var7 == 0) {
              stackIn_5_0 = 0;
            } else {
              stackIn_5_0 = (4096 - param3) * (4096 - param4);
            }
            var11 = stackIn_5_0;
          }
          if (param1 >= this.field_r - 1) {
            var12 = 0;
            var8 = 0;
          } else {
            var8 = this.field_x[var6 + 1];
            if (var8 == 0) {
              stackIn_11_0 = 0;
            } else {
              stackIn_11_0 = param3 * (4096 - param4);
            }
            var12 = stackIn_11_0;
          }
        }
        if (param2 >= this.field_n - 1) {
          var14 = 0;
          var13 = 0;
          var10 = 0;
          var9 = 0;
        } else {
          if (param1 < 0) {
            var13 = 0;
            var9 = 0;
          } else {
            var9 = this.field_x[var6 + this.field_r];
            if (var9 == 0) {
              stackIn_19_0 = 0;
            } else {
              stackIn_19_0 = (4096 - param3) * param4;
            }
            var13 = stackIn_19_0;
          }
          if (param1 >= this.field_r - 1) {
            var14 = 0;
            var10 = 0;
          } else {
            var10 = this.field_x[var6 + this.field_r + 1];
            if (var10 == 0) {
              stackIn_25_0 = 0;
            } else {
              stackIn_25_0 = param3 * param4;
            }
            var14 = stackIn_25_0;
          }
        }
        var11 = var11 >> 16;
        var12 = var12 >> 16;
        var13 = var13 >> 16;
        var14 = var14 >> 16;
        var15 = var11 + var12 + var13 + var14;
        if (var15 < 256) {
          if (var15 < 128) {
            return;
          }
          var16 = (var7 & 16711935) * var11 + (var8 & 16711935) * var12;
          var16 = var16 + ((var9 & 16711935) * var13 + (var10 & 16711935) * var14);
          var17 = (var7 & 65280) * var11 + (var8 & 65280) * var12;
          var17 = var17 + ((var9 & 65280) * var13 + (var10 & 65280) * var14);
          var18 = ((var16 >>> 16) / var15 << 16) + (var17 / var15 & 65280) + (var16 & 65535) / var15;
          if (var18 == 0) {
            var18 = 1;
          }
          vp.field_j[param0] = var18;
        } else {
          var16 = (var7 & 16711935) * var11 + (var8 & 16711935) * var12;
          var16 = var16 + ((var9 & 16711935) * var13 + (var10 & 16711935) * var14);
          var17 = (var7 & 65280) * var11 + (var8 & 65280) * var12;
          var17 = var17 + ((var9 & 65280) * var13 + (var10 & 65280) * var14);
          var18 = (var16 >>> 8 & 16711935) + (var17 >>> 8 & 65280);
          if (var18 == 0) {
            var18 = 1;
          }
          vp.field_j[param0] = var18;
        }
    }

    ll(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        this.field_v = param0;
        this.field_q = param1;
        this.field_u = param2;
        this.field_p = param3;
        this.field_r = param4;
        this.field_n = param5;
        this.field_x = param6;
    }

    private final static void b(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var11 = 0;
        int var12 = 0;
        int incrementValue$12 = 0;
        int var10;
        int var13;
        var10 = 256 - param9;
        for (var11 = -param6; var11 < 0; var11++) {
          for (var12 = -param5; var12 < 0; var12++) {
            param2 = param1[param3++];
            if (param2 == 0) {
              param4++;
            } else {
              var13 = param0[param4];
              incrementValue$12 = param4;
              param4++;
              param0[incrementValue$12] = ((param2 & 16711935) * param9 + (var13 & 16711935) * var10 & -16711936) + ((param2 & 65280) * param9 + (var13 & 65280) * var10 & 16711680) >> 8;
            }
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
        }
    }

    final ll d() {
        int var3 = 0;
        ll var1 = new ll(this.field_r, this.field_n);
        var1.field_v = this.field_v;
        var1.field_q = this.field_q;
        var1.field_u = this.field_u;
        var1.field_p = this.field_p;
        int var2 = this.field_x.length;
        for (var3 = 0; var3 < var2; var3++) {
          var1.field_x[var3] = this.field_x[var3];
        }
        return var1;
    }

    private final static void a(int param0, int param1, int param2, int[] param3, int[] param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13) {
        int incrementValue$12 = 0;
        for (param8 = -param10; param8 < 0; param8++) {
          for (param6 = -param9; param6 < 0; param6++) {
            param0 = param4[param5++];
            if (param0 == 0) {
              param7++;
            } else {
              param1 = (param0 & 16711935) * param13;
              param0 = (param1 & -16711936) + (param0 * param13 - param1 & 16711680) >>> 8;
              param1 = param3[param7];
              param2 = param0 + param1;
              param0 = (param0 & 16711935) + (param1 & 16711935);
              param1 = (param0 & 16777472) + (param2 - param0 & 65536);
              incrementValue$12 = param7;
              param7++;
              param3[incrementValue$12] = param2 - param1 | param1 - (param1 >>> 8);
            }
          }
          param7 = param7 + param11;
          param5 = param5 + param12;
        }
    }

    private final static void a(int param0, int param1, int param2, int[] param3, int[] param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12) {
        int incrementValue$12 = 0;
        for (param8 = -param10; param8 < 0; param8++) {
          for (param6 = -param9; param6 < 0; param6++) {
            param0 = param4[param5++];
            if (param0 == 0) {
              param7++;
            } else {
              param1 = param3[param7];
              param2 = param0 + param1;
              param0 = (param0 & 16711935) + (param1 & 16711935);
              param1 = (param0 & 16777472) + (param2 - param0 & 65536);
              incrementValue$12 = param7;
              param7++;
              param3[incrementValue$12] = param2 - param1 | param1 - (param1 >>> 8);
            }
          }
          param7 = param7 + param11;
          param5 = param5 + param12;
        }
    }

    void b(int param0, int param1) {
        int var9 = 0;
        int var9Lifetime1;
        int var9Lifetime2;
        param0 = param0 + this.field_u;
        param1 = param1 + this.field_p;
        int var3 = param0 + param1 * vp.field_i;
        int var4 = 0;
        int var5 = this.field_n;
        int var6 = this.field_r;
        int var7 = vp.field_i - var6;
        int var8 = 0;
        if (param1 < vp.field_f) {
          var9 = vp.field_f - param1;
          var5 = var5 - var9;
          param1 = vp.field_f;
          var4 = var4 + var9 * var6;
          var3 = var3 + var9 * vp.field_i;
        }
        if (param1 + var5 > vp.field_d) {
          var5 = var5 - (param1 + var5 - vp.field_d);
        }
        if (param0 < vp.field_b) {
          var9Lifetime1 = vp.field_b - param0;
          var6 = var6 - var9Lifetime1;
          param0 = vp.field_b;
          var4 = var4 + var9Lifetime1;
          var3 = var3 + var9Lifetime1;
          var8 = var8 + var9Lifetime1;
          var7 = var7 + var9Lifetime1;
        }
        if (param0 + var6 > vp.field_k) {
          var9Lifetime2 = param0 + var6 - vp.field_k;
          var6 = var6 - var9Lifetime2;
          var8 = var8 + var9Lifetime2;
          var7 = var7 + var9Lifetime2;
        }
        if (var6 > 0) {
          if (var5 <= 0) {
            return;
          }
          ll.b(vp.field_j, this.field_x, 0, var4, var3, var6, var5, var7, var8);
          return;
        }
    }

    final ll a() {
        int var2 = 0;
        int var3 = 0;
        ll var1 = new ll(this.field_r, this.field_n);
        var1.field_v = this.field_v;
        var1.field_q = this.field_q;
        var1.field_u = this.field_v - this.field_r - this.field_u;
        var1.field_p = this.field_p;
        for (var2 = 0; var2 < this.field_n; var2++) {
          for (var3 = 0; var3 < this.field_r; var3++) {
            var1.field_x[var2 * this.field_r + var3] = this.field_x[var2 * this.field_r + this.field_r - 1 - var3];
          }
        }
        return var1;
    }

    ll(int param0, int param1) {
        this.field_x = new int[param0 * param1];
        this.field_v = param0;
        this.field_r = param0;
        this.field_q = param1;
        this.field_n = param1;
        this.field_p = 0;
        this.field_u = 0;
    }

    private final static void a(int param0, int[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        int incrementValue$5 = 0;
        int var12;
        int var13;
        int var14;
        for (var10 = -param7; var10 < 0; var10++) {
          for (var11 = -param6; var11 < 0; var11++) {
            param3 = param2[param4++];
            if (param3 != 0) {
              param0 = param1[param5];
              if (param0 != 0) {
                var12 = ((param3 & 16711680) >>> 16) * ((param0 & 16711680) >>> 16) >>> 8;
                var13 = (param3 & 65280) * (param0 & 65280) >>> 24;
                var14 = (param3 & 255) * (param0 & 255) >>> 8;
                incrementValue$5 = param5;
                param5++;
                param1[incrementValue$5] = (var12 << 16) + (var13 << 8) + var14;
              } else {
                param5++;
              }
            } else {
              param5++;
            }
          }
          param5 = param5 + param8;
          param4 = param4 + param9;
        }
    }

    ll(byte[] param0, java.awt.Component param1) {
        Throwable decompiledCaughtException = null;
        java.awt.Image var3 = null;
        InterruptedException var3_ref = null;
        java.awt.MediaTracker var4 = null;
        java.awt.image.PixelGrabber var5 = null;
        try {
          var3 = java.awt.Toolkit.getDefaultToolkit().createImage(param0);
          var4 = new java.awt.MediaTracker(param1);
          var4.addImage(var3, 0);
          var4.waitForAll();
          this.field_r = var3.getWidth((java.awt.image.ImageObserver) ((Object) param1));
          this.field_n = var3.getHeight((java.awt.image.ImageObserver) ((Object) param1));
          this.field_v = this.field_r;
          this.field_q = this.field_n;
          this.field_u = 0;
          this.field_p = 0;
          this.field_x = new int[this.field_r * this.field_n];
          var5 = new java.awt.image.PixelGrabber(var3, 0, 0, this.field_r, this.field_n, this.field_x, 0, this.field_r);
          var5.grabPixels();
        } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = (InterruptedException) (Object) decompiledCaughtException;
        }
    }

    private final static void b(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var10 = 0;
        int var9;
        int var11;
        int var11Lifetime1;
        var9 = -(param5 >> 2);
        param5 = -(param5 & 3);
        for (var10 = -param6; var10 < 0; var10++) {
          for (var11 = var9; var11 < 0; var11++) {
            param2 = param1[param3++];
            if (param2 == 0) {
              param4++;
            } else {
              param0[param4++] = param2;
            }
            param2 = param1[param3++];
            if (param2 == 0) {
              param4++;
            } else {
              param0[param4++] = param2;
            }
            param2 = param1[param3++];
            if (param2 == 0) {
              param4++;
            } else {
              param0[param4++] = param2;
            }
            param2 = param1[param3++];
            if (param2 == 0) {
              param4++;
            } else {
              param0[param4++] = param2;
            }
          }
          for (var11Lifetime1 = param5; var11Lifetime1 < 0; var11Lifetime1++) {
            param2 = param1[param3++];
            if (param2 == 0) {
              param4++;
            } else {
              param0[param4++] = param2;
            }
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
        }
    }

    private final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int dupTemp$3 = 0;
        int incrementValue$4 = 0;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        var8 = 0;
        while (var8 < param7) {
          var9 = 0;
          while (var9 < param6) {
            var11 = vp.field_j[param2] & 16711935;
            var12 = vp.field_j[param2] & 65280;
            var13 = 0;
            var14 = 0;
            dupTemp$0 = param0[param1];
            var10 = dupTemp$0;
            if (dupTemp$0 != 0) {
              var13 = var13 + (var10 & 16711935);
              var14 = var14 + (var10 & 65280);
            } else {
              var13 = var13 + var11;
              var14 = var14 + var12;
            }
            dupTemp$1 = param0[param1 + 1];
            var10Lifetime1 = dupTemp$1;
            if (dupTemp$1 != 0) {
              var13 = var13 + (var10Lifetime1 & 16711935);
              var14 = var14 + (var10Lifetime1 & 65280);
            } else {
              var13 = var13 + var11;
              var14 = var14 + var12;
            }
            dupTemp$2 = param0[param1 + param5];
            var10Lifetime2 = dupTemp$2;
            if (dupTemp$2 != 0) {
              var13 = var13 + (var10Lifetime2 & 16711935);
              var14 = var14 + (var10Lifetime2 & 65280);
            } else {
              var13 = var13 + var11;
              var14 = var14 + var12;
            }
            dupTemp$3 = param0[param1 + param5 + 1];
            var10Lifetime3 = dupTemp$3;
            if (dupTemp$3 != 0) {
              var13 = var13 + (var10Lifetime3 & 16711935);
              var14 = var14 + (var10Lifetime3 & 65280);
            } else {
              var13 = var13 + var11;
              var14 = var14 + var12;
            }
            incrementValue$4 = param2;
            param2++;
            vp.field_j[incrementValue$4] = (var13 & 66847740 | var14 & 261120) >> 2;
            var9++;
            param1 += 2;
          }
          var8++;
          param1 = param1 + param3;
          param2 = param2 + param4;
        }
    }

    void c(int param0, int param1) {
        int var9 = 0;
        int var9Lifetime1;
        int var9Lifetime2;
        param0 = param0 + this.field_u;
        param1 = param1 + this.field_p;
        int var3 = param0 + param1 * vp.field_i;
        int var4 = 0;
        int var5 = this.field_n;
        int var6 = this.field_r;
        int var7 = vp.field_i - var6;
        int var8 = 0;
        if (param1 < vp.field_f) {
          var9 = vp.field_f - param1;
          var5 = var5 - var9;
          param1 = vp.field_f;
          var4 = var4 + var9 * var6;
          var3 = var3 + var9 * vp.field_i;
        }
        if (param1 + var5 > vp.field_d) {
          var5 = var5 - (param1 + var5 - vp.field_d);
        }
        if (param0 < vp.field_b) {
          var9Lifetime1 = vp.field_b - param0;
          var6 = var6 - var9Lifetime1;
          param0 = vp.field_b;
          var4 = var4 + var9Lifetime1;
          var3 = var3 + var9Lifetime1;
          var8 = var8 + var9Lifetime1;
          var7 = var7 + var9Lifetime1;
        }
        if (param0 + var6 > vp.field_k) {
          var9Lifetime2 = param0 + var6 - vp.field_k;
          var6 = var6 - var9Lifetime2;
          var8 = var8 + var9Lifetime2;
          var7 = var7 + var9Lifetime2;
        }
        if (var6 > 0) {
          if (var5 <= 0) {
            return;
          }
          ll.a(vp.field_j, this.field_x, var4, var3, var6, var5, var7, var8);
          return;
        }
    }

    void a(int param0, int param1, int param2) {
        int var10 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        param0 = param0 + this.field_u;
        param1 = param1 + this.field_p;
        int var4 = param0 + param1 * vp.field_i;
        int var5 = 0;
        int var6 = this.field_n;
        int var7 = this.field_r;
        int var8 = vp.field_i - var7;
        int var9 = 0;
        if (param1 < vp.field_f) {
          var10 = vp.field_f - param1;
          var6 = var6 - var10;
          param1 = vp.field_f;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * vp.field_i;
        }
        if (param1 + var6 > vp.field_d) {
          var6 = var6 - (param1 + var6 - vp.field_d);
        }
        if (param0 < vp.field_b) {
          var10Lifetime1 = vp.field_b - param0;
          var7 = var7 - var10Lifetime1;
          param0 = vp.field_b;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (param0 + var7 > vp.field_k) {
          var10Lifetime2 = param0 + var7 - vp.field_k;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 > 0) {
          if (var6 <= 0) {
            return;
          }
          ll.b(vp.field_j, this.field_x, 0, var5, var4, var7, var6, var8, var9, param2);
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        double var7;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        double var25;
        int var27;
        int var28;
        int var29;
        int var30;
        int var31;
        int var32;
        int var33;
        int var34;
        int var35;
        int var36;
        int var37;
        int var38;
        int var39;
        int var40;
        int var33Lifetime1;
        int var33Lifetime2;
        int var34Lifetime1;
        int var34Lifetime2;
        int var35Lifetime1;
        int var35Lifetime2;
        int var36Lifetime1;
        int var36Lifetime2;
        int var37Lifetime1;
        int var37Lifetime2;
        int var38Lifetime1;
        int var38Lifetime2;
        int var39Lifetime1;
        int var39Lifetime2;
        int var40Lifetime1;
        int var40Lifetime2;
        int var33Lifetime3;
        int var34Lifetime3;
        int var35Lifetime3;
        int var36Lifetime3;
        int var37Lifetime3;
        int var38Lifetime3;
        int var39Lifetime3;
        int var40Lifetime3;
        int var35Lifetime1Lifetime1;
        int var35Lifetime2Lifetime1;
        int var35Lifetime4;
        int var35Lifetime3Lifetime1;
        if (param5 == 0) {
          return;
        }
        param0 = param0 - (this.field_u << 4);
        param1 = param1 - (this.field_p << 4);
        var7 = (double)(param4 & 65535) * 0.00009587379924285257;
        var9 = (int)Math.floor(Math.sin(var7) * (double)param5 + 0.5);
        var10 = (int)Math.floor(Math.cos(var7) * (double)param5 + 0.5);
        var11 = -param0 * var10 + -param1 * var9;
        var12 = -(-param0) * var9 + -param1 * var10;
        var13 = ((this.field_r << 4) - param0) * var10 + -param1 * var9;
        var14 = -((this.field_r << 4) - param0) * var9 + -param1 * var10;
        var15 = -param0 * var10 + ((this.field_n << 4) - param1) * var9;
        var16 = -(-param0) * var9 + ((this.field_n << 4) - param1) * var10;
        var17 = ((this.field_r << 4) - param0) * var10 + ((this.field_n << 4) - param1) * var9;
        var18 = -((this.field_r << 4) - param0) * var9 + ((this.field_n << 4) - param1) * var10;
        if (var11 >= var13) {
          var19 = var13;
          var20 = var11;
        } else {
          var19 = var11;
          var20 = var13;
        }
        if (var15 < var19) {
          var19 = var15;
        }
        if (var17 < var19) {
          var19 = var17;
        }
        if (var15 > var20) {
          var20 = var15;
        }
        if (var17 > var20) {
          var20 = var17;
        }
        if (var12 >= var14) {
          var21 = var14;
          var22 = var12;
        } else {
          var21 = var12;
          var22 = var14;
        }
        if (var16 < var21) {
          var21 = var16;
        }
        if (var18 < var21) {
          var21 = var18;
        }
        if (var16 > var22) {
          var22 = var16;
        }
        if (var18 > var22) {
          var22 = var18;
        }
        var19 = var19 >> 12;
        var20 = var20 + 4095 >> 12;
        var21 = var21 >> 12;
        var22 = var22 + 4095 >> 12;
        var19 = var19 + param2;
        var20 = var20 + param2;
        var21 = var21 + param3;
        var22 = var22 + param3;
        var19 = var19 >> 4;
        var20 = var20 + 15 >> 4;
        var21 = var21 >> 4;
        var22 = var22 + 15 >> 4;
        if (var19 < vp.field_b) {
          var19 = vp.field_b;
        }
        if (var20 > vp.field_k) {
          var20 = vp.field_k;
        }
        if (var21 < vp.field_f) {
          var21 = vp.field_f;
        }
        if (var22 > vp.field_d) {
          var22 = vp.field_d;
        }
        var20 = var19 - var20;
        if (var20 >= 0) {
          return;
        }
        var22 = var21 - var22;
        if (var22 >= 0) {
          return;
        }
        var23 = var21 * vp.field_i + var19;
        var24 = vp.field_i + var20;
        var25 = 16777216.0 / (double)param5;
        var27 = (int)Math.floor(Math.sin(var7) * var25 + 0.5);
        var28 = (int)Math.floor(Math.cos(var7) * var25 + 0.5);
        var29 = (var19 << 4) + 8 - param2;
        var30 = (var21 << 4) + 8 - param3;
        var31 = (param0 << 8) - 2048 - (var30 * var27 >> 4);
        var32 = (param1 << 8) - 2048 + (var30 * var28 >> 4);
        if (var28 >= 0) {
          if (var27 >= 0) {
            var36 = var22;
            while (var36 < 0) {
              var37 = var31 + (var29 * var28 >> 4);
              var38 = var32 + (var29 * var27 >> 4);
              var39 = var20;
              var40 = 0;
              var35 = var37 + 4096;
              if (var35 < 0) {
                if (var28 != 0) {
                  var35 = (var28 - 1 - var35) / var28;
                  var39 = var39 + var35;
                  var37 = var37 + var28 * var35;
                  var38 = var38 + var27 * var35;
                  var23 = var23 + var35;
                  var40 = 1;
                } else {
                  var23 = var23 - var39;
                }
              } else {
                var40 = 1;
              }
              if (var40 != 0) {
                var40 = 0;
                var35Lifetime4 = var38 + 4096;
                if (var35Lifetime4 < 0) {
                  if (var27 != 0) {
                    var35Lifetime4 = (var27 - 1 - var35Lifetime4) / var27;
                    var39 = var39 + var35Lifetime4;
                    var37 = var37 + var28 * var35Lifetime4;
                    var38 = var38 + var27 * var35Lifetime4;
                    var23 = var23 + var35Lifetime4;
                    var40 = 1;
                  } else {
                    var23 = var23 - var39;
                  }
                } else {
                  var40 = 1;
                }
                if (var40 != 0) {
                  while (var39 < 0) {
                    var33 = var37 >> 12;
                    if (var37 >> 12 < this.field_r) {
                      var34 = var38 >> 12;
                      if (var38 >> 12 < this.field_n) {
                        this.a(var23, var33, var34, var37, var38);
                        var39++;
                        var37 = var37 + var28;
                        var38 = var38 + var27;
                        var23++;
                        continue;
                      }
                    }
                    break;
                  }
                  var23 = var23 - var39;
                }
              }
              var36++;
              var31 = var31 - var27;
              var32 = var32 + var28;
              var23 = var23 + var24;
            }
            return;
          }
          var36Lifetime3 = var22;
          while (var36Lifetime3 < 0) {
            var37Lifetime3 = var31 + (var29 * var28 >> 4);
            var38Lifetime3 = var32 + (var29 * var27 >> 4);
            var39Lifetime3 = var20;
            var40Lifetime3 = 0;
            var35Lifetime3 = var37Lifetime3 + 4096;
            if (var35Lifetime3 < 0) {
              if (var28 != 0) {
                var35Lifetime3 = (var28 - 1 - var35Lifetime3) / var28;
                var39Lifetime3 = var39Lifetime3 + var35Lifetime3;
                var37Lifetime3 = var37Lifetime3 + var28 * var35Lifetime3;
                var38Lifetime3 = var38Lifetime3 + var27 * var35Lifetime3;
                var23 = var23 + var35Lifetime3;
                var40Lifetime3 = 1;
              } else {
                var23 = var23 - var39Lifetime3;
              }
            } else {
              var40Lifetime3 = 1;
            }
            if (var40Lifetime3 != 0) {
              var40Lifetime3 = 0;
              var35Lifetime3Lifetime1 = var38Lifetime3 - (this.field_n << 12);
              if (var35Lifetime3Lifetime1 >= 0) {
                if (var27 != 0) {
                  var35Lifetime3Lifetime1 = (var27 - var35Lifetime3Lifetime1) / var27;
                  var39Lifetime3 = var39Lifetime3 + var35Lifetime3Lifetime1;
                  var37Lifetime3 = var37Lifetime3 + var28 * var35Lifetime3Lifetime1;
                  var38Lifetime3 = var38Lifetime3 + var27 * var35Lifetime3Lifetime1;
                  var23 = var23 + var35Lifetime3Lifetime1;
                  var40Lifetime3 = 1;
                } else {
                  var23 = var23 - var39Lifetime3;
                }
              } else {
                var40Lifetime3 = 1;
              }
              if (var40Lifetime3 != 0) {
                while (var39Lifetime3 < 0) {
                  if (var38Lifetime3 >= -4096) {
                    var33Lifetime3 = var37Lifetime3 >> 12;
                    if (var37Lifetime3 >> 12 < this.field_r) {
                      var34Lifetime3 = var38Lifetime3 >> 12;
                      this.a(var23, var33Lifetime3, var34Lifetime3, var37Lifetime3, var38Lifetime3);
                      var39Lifetime3++;
                      var37Lifetime3 = var37Lifetime3 + var28;
                      var38Lifetime3 = var38Lifetime3 + var27;
                      var23++;
                      continue;
                    }
                  }
                  break;
                }
                var23 = var23 - var39Lifetime3;
              }
            }
            var36Lifetime3++;
            var31 = var31 - var27;
            var32 = var32 + var28;
            var23 = var23 + var24;
          }
          return;
        }
        if (var27 >= 0) {
          var36Lifetime1 = var22;
          while (var36Lifetime1 < 0) {
            var37Lifetime1 = var31 + (var29 * var28 >> 4);
            var38Lifetime1 = var32 + (var29 * var27 >> 4);
            var39Lifetime1 = var20;
            var40Lifetime1 = 0;
            var35Lifetime1 = var37Lifetime1 - (this.field_r << 12);
            if (var35Lifetime1 >= 0) {
              if (var28 != 0) {
                var35Lifetime1 = (var28 - var35Lifetime1) / var28;
                var39Lifetime1 = var39Lifetime1 + var35Lifetime1;
                var37Lifetime1 = var37Lifetime1 + var28 * var35Lifetime1;
                var38Lifetime1 = var38Lifetime1 + var27 * var35Lifetime1;
                var23 = var23 + var35Lifetime1;
                var40Lifetime1 = 1;
              } else {
                var23 = var23 - var39Lifetime1;
              }
            } else {
              var40Lifetime1 = 1;
            }
            if (var40Lifetime1 != 0) {
              var40Lifetime1 = 0;
              var35Lifetime1Lifetime1 = var38Lifetime1 + 4096;
              if (var35Lifetime1Lifetime1 < 0) {
                if (var27 != 0) {
                  var35Lifetime1Lifetime1 = (var27 - 1 - var35Lifetime1Lifetime1) / var27;
                  var39Lifetime1 = var39Lifetime1 + var35Lifetime1Lifetime1;
                  var37Lifetime1 = var37Lifetime1 + var28 * var35Lifetime1Lifetime1;
                  var38Lifetime1 = var38Lifetime1 + var27 * var35Lifetime1Lifetime1;
                  var23 = var23 + var35Lifetime1Lifetime1;
                  var40Lifetime1 = 1;
                } else {
                  var23 = var23 - var39Lifetime1;
                }
              } else {
                var40Lifetime1 = 1;
              }
              if (var40Lifetime1 != 0) {
                while (var39Lifetime1 < 0) {
                  if (var37Lifetime1 >= -4096) {
                    var34Lifetime1 = var38Lifetime1 >> 12;
                    if (var38Lifetime1 >> 12 < this.field_n) {
                      var33Lifetime1 = var37Lifetime1 >> 12;
                      this.a(var23, var33Lifetime1, var34Lifetime1, var37Lifetime1, var38Lifetime1);
                      var39Lifetime1++;
                      var37Lifetime1 = var37Lifetime1 + var28;
                      var38Lifetime1 = var38Lifetime1 + var27;
                      var23++;
                      continue;
                    }
                  }
                  break;
                }
                var23 = var23 - var39Lifetime1;
              }
            }
            var36Lifetime1++;
            var31 = var31 - var27;
            var32 = var32 + var28;
            var23 = var23 + var24;
          }
          return;
        }
        var36Lifetime2 = var22;
        while (var36Lifetime2 < 0) {
          var37Lifetime2 = var31 + (var29 * var28 >> 4);
          var38Lifetime2 = var32 + (var29 * var27 >> 4);
          var39Lifetime2 = var20;
          var40Lifetime2 = 0;
          var35Lifetime2 = var37Lifetime2 - (this.field_r << 12);
          if (var35Lifetime2 >= 0) {
            if (var28 != 0) {
              var35Lifetime2 = (var28 - var35Lifetime2) / var28;
              var39Lifetime2 = var39Lifetime2 + var35Lifetime2;
              var37Lifetime2 = var37Lifetime2 + var28 * var35Lifetime2;
              var38Lifetime2 = var38Lifetime2 + var27 * var35Lifetime2;
              var23 = var23 + var35Lifetime2;
              var40Lifetime2 = 1;
            } else {
              var23 = var23 - var39Lifetime2;
            }
          } else {
            var40Lifetime2 = 1;
          }
          if (var40Lifetime2 != 0) {
            var40Lifetime2 = 0;
            var35Lifetime2Lifetime1 = var38Lifetime2 - (this.field_n << 12);
            if (var35Lifetime2Lifetime1 >= 0) {
              if (var27 != 0) {
                var35Lifetime2Lifetime1 = (var27 - var35Lifetime2Lifetime1) / var27;
                var39Lifetime2 = var39Lifetime2 + var35Lifetime2Lifetime1;
                var37Lifetime2 = var37Lifetime2 + var28 * var35Lifetime2Lifetime1;
                var38Lifetime2 = var38Lifetime2 + var27 * var35Lifetime2Lifetime1;
                var23 = var23 + var35Lifetime2Lifetime1;
                var40Lifetime2 = 1;
              } else {
                var23 = var23 - var39Lifetime2;
              }
            } else {
              var40Lifetime2 = 1;
            }
            if (var40Lifetime2 != 0) {
              while (var39Lifetime2 < 0) {
                if (var37Lifetime2 >= -4096 &&
                  var38Lifetime2 >= -4096) {
                  var33Lifetime2 = var37Lifetime2 >> 12;
                  var34Lifetime2 = var38Lifetime2 >> 12;
                  this.a(var23, var33Lifetime2, var34Lifetime2, var37Lifetime2, var38Lifetime2);
                  var39Lifetime2++;
                  var37Lifetime2 = var37Lifetime2 + var28;
                  var38Lifetime2 = var38Lifetime2 + var27;
                  var23++;
                  continue;
                }
                break;
              }
              var23 = var23 - var39Lifetime2;
            }
          }
          var36Lifetime2++;
          var31 = var31 - var27;
          var32 = var32 + var28;
          var23 = var23 + var24;
        }
        return;
    }

    final void b() {
        vp.a(this.field_x, this.field_r, this.field_n);
    }

    void d(int param0, int param1, int param2) {
        int var10 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        param0 = param0 + this.field_u;
        param1 = param1 + this.field_p;
        int var4 = param0 + param1 * vp.field_i;
        int var5 = 0;
        int var6 = this.field_n;
        int var7 = this.field_r;
        int var8 = vp.field_i - var7;
        int var9 = 0;
        if (param1 < vp.field_f) {
          var10 = vp.field_f - param1;
          var6 = var6 - var10;
          param1 = vp.field_f;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * vp.field_i;
        }
        if (param1 + var6 > vp.field_d) {
          var6 = var6 - (param1 + var6 - vp.field_d);
        }
        if (param0 < vp.field_b) {
          var10Lifetime1 = vp.field_b - param0;
          var7 = var7 - var10Lifetime1;
          param0 = vp.field_b;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (param0 + var7 > vp.field_k) {
          var10Lifetime2 = param0 + var7 - vp.field_k;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 > 0) {
          if (var6 <= 0) {
            return;
          }
          if (param2 == 256) {
            ll.a(0, 0, 0, vp.field_j, this.field_x, var5, 0, var4, 0, var7, var6, var8, var9);
          } else {
            ll.a(0, 0, 0, vp.field_j, this.field_x, var5, 0, var4, 0, var7, var6, var8, var9, param2);
          }
          return;
        }
    }

    final void c(int param0, int param1, int param2) {
        int var10 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        param0 = param0 + this.field_u;
        param1 = param1 + this.field_p;
        int var4 = param0 + param1 * vp.field_i;
        int var5 = 0;
        int var6 = this.field_n;
        int var7 = this.field_r;
        int var8 = vp.field_i - var7;
        int var9 = 0;
        if (param1 < vp.field_f) {
          var10 = vp.field_f - param1;
          var6 = var6 - var10;
          param1 = vp.field_f;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * vp.field_i;
        }
        if (param1 + var6 > vp.field_d) {
          var6 = var6 - (param1 + var6 - vp.field_d);
        }
        if (param0 < vp.field_b) {
          var10Lifetime1 = vp.field_b - param0;
          var7 = var7 - var10Lifetime1;
          param0 = vp.field_b;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (param0 + var7 > vp.field_k) {
          var10Lifetime2 = param0 + var7 - vp.field_k;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 > 0) {
          if (var6 <= 0) {
            return;
          }
          ll.a(vp.field_j, this.field_x, param2, var5, var4, var7, var6, var8, var9);
          return;
        }
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var8 = 0;
        int var9 = 0;
        for (var8 = -param5; var8 < 0; var8++) {
          var9 = param3 + param4 - 3;
          while (param3 < var9) {
            param0[param3++] = param1[param2++];
            param0[param3++] = param1[param2++];
            param0[param3++] = param1[param2++];
            param0[param3++] = param1[param2++];
          }
          var9 += 3;
          while (param3 < var9) {
            param0[param3++] = param1[param2++];
          }
          param3 = param3 + param6;
          param2 = param2 + param7;
        }
    }

    final void a(int param0, int param1) {
        int var9 = 0;
        int var9Lifetime1;
        int var9Lifetime2;
        param0 = param0 + this.field_u;
        param1 = param1 + this.field_p;
        int var3 = param0 + param1 * vp.field_i;
        int var4 = 0;
        int var5 = this.field_n;
        int var6 = this.field_r;
        int var7 = vp.field_i - var6;
        int var8 = 0;
        if (param1 < vp.field_f) {
          var9 = vp.field_f - param1;
          var5 = var5 - var9;
          param1 = vp.field_f;
          var4 = var4 + var9 * var6;
          var3 = var3 + var9 * vp.field_i;
        }
        if (param1 + var5 > vp.field_d) {
          var5 = var5 - (param1 + var5 - vp.field_d);
        }
        if (param0 < vp.field_b) {
          var9Lifetime1 = vp.field_b - param0;
          var6 = var6 - var9Lifetime1;
          param0 = vp.field_b;
          var4 = var4 + var9Lifetime1;
          var3 = var3 + var9Lifetime1;
          var8 = var8 + var9Lifetime1;
          var7 = var7 + var9Lifetime1;
        }
        if (param0 + var6 > vp.field_k) {
          var9Lifetime2 = param0 + var6 - vp.field_k;
          var6 = var6 - var9Lifetime2;
          var8 = var8 + var9Lifetime2;
          var7 = var7 + var9Lifetime2;
        }
        if (var6 > 0) {
          if (var5 <= 0) {
            return;
          }
          ll.a(0, vp.field_j, this.field_x, 0, var4, var3, var6, var5, var7, var8);
          return;
        }
    }

    void d(int param0, int param1) {
        param0 = param0 + (this.field_u >> 1);
        param1 = param1 + (this.field_p >> 1);
        int var3 = param0 < vp.field_b ? vp.field_b - param0 << 1 : 0;
        int var4 = param0 + (this.field_r >> 1) > vp.field_k ? vp.field_k - param0 << 1 : this.field_r;
        int var5 = param1 < vp.field_f ? vp.field_f - param1 << 1 : 0;
        int var6 = param1 + (this.field_n >> 1) > vp.field_d ? vp.field_d - param1 << 1 : this.field_n;
        ll.a(this.field_x, var5 * this.field_r + var3, (param1 + (var5 >> 1)) * vp.field_i + (param0 + (var3 >> 1)), (this.field_r << 1) - (var4 - var3) + (this.field_r & 1), vp.field_i - (var4 - var3 >> 1), this.field_r, var4 - var3 >> 1, var6 - var5 >> 1);
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var10 = 0;
        int var9;
        int var11;
        int var11Lifetime1;
        var9 = -(param5 >> 2);
        param5 = -(param5 & 3);
        for (var10 = -param6; var10 < 0; var10++) {
          for (var11 = var9; var11 < 0; var11++) {
            if (param1[param3++] == 0) {
              param4++;
            } else {
              param0[param4++] = param2;
            }
            if (param1[param3++] == 0) {
              param4++;
            } else {
              param0[param4++] = param2;
            }
            if (param1[param3++] == 0) {
              param4++;
            } else {
              param0[param4++] = param2;
            }
            if (param1[param3++] == 0) {
              param4++;
            } else {
              param0[param4++] = param2;
            }
          }
          for (var11Lifetime1 = param5; var11Lifetime1 < 0; var11Lifetime1++) {
            if (param1[param3++] == 0) {
              param4++;
            } else {
              param0[param4++] = param2;
            }
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
        }
    }
}
