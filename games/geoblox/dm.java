/*
 * Decompiled by CFR-JS 0.4.0.
 */
class dm extends wh {
    int[] field_v;

    private final void c(int param0, int param1, int param2, int param3, int param4) {
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
            var7 = this.field_v[var6];
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
            var8 = this.field_v[var6 + 1];
            if (var8 == 0) {
              stackIn_11_0 = 0;
            } else {
              stackIn_11_0 = param3 * (4096 - param4);
            }
            var12 = stackIn_11_0;
          }
        }
        if (param2 >= this.field_m - 1) {
          var14 = 0;
          var13 = 0;
          var10 = 0;
          var9 = 0;
        } else {
          if (param1 < 0) {
            var13 = 0;
            var9 = 0;
          } else {
            var9 = this.field_v[var6 + this.field_r];
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
            var10 = this.field_v[var6 + this.field_r + 1];
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
          vb.field_c[param0] = var18;
        } else {
          var16 = (var7 & 16711935) * var11 + (var8 & 16711935) * var12;
          var16 = var16 + ((var9 & 16711935) * var13 + (var10 & 16711935) * var14);
          var17 = (var7 & 65280) * var11 + (var8 & 65280) * var12;
          var17 = var17 + ((var9 & 65280) * var13 + (var10 & 65280) * var14);
          var18 = (var16 >>> 8 & 16711935) + (var17 >>> 8 & 65280);
          if (var18 == 0) {
            var18 = 1;
          }
          vb.field_c[param0] = var18;
        }
    }

    final void a(int param0, int param1, int param2) {
        int var10 = 0;
        param0 = param0 + this.field_u;
        param1 = param1 + this.field_p;
        int var4 = param0 + param1 * vb.field_f;
        int var5 = 0;
        int var6 = this.field_m;
        int var7 = this.field_r;
        int var8 = vb.field_f - var7;
        int var9 = 0;
        if (param1 < vb.field_i) {
            var10 = vb.field_i - param1;
            var6 = var6 - var10;
            param1 = vb.field_i;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * vb.field_f;
        }
        if (param1 + var6 > vb.field_d) {
            var6 = var6 - (param1 + var6 - vb.field_d);
        }
        if (param0 < vb.field_e) {
            var10 = vb.field_e - param0;
            var7 = var7 - var10;
            param0 = vb.field_e;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (param0 + var7 > vb.field_k) {
            var10 = param0 + var7 - vb.field_k;
            var7 = var7 - var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (var7 > 0) {
            if (var6 <= 0) {
                return;
            }
            dm.a(vb.field_c, this.field_v, param2, var5, var4, var7, var6, var8, var9);
            return;
        }
    }

    void b(int param0, int param1, int param2, int param3, int param4, int param5) {
        int incrementValue$8 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$2 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$5 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
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
        double var24;
        int var26;
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
        var15 = -param0 * var10 + ((this.field_m << 4) - param1) * var9;
        var16 = -(-param0) * var9 + ((this.field_m << 4) - param1) * var10;
        var17 = ((this.field_r << 4) - param0) * var10 + ((this.field_m << 4) - param1) * var9;
        var18 = -((this.field_r << 4) - param0) * var9 + ((this.field_m << 4) - param1) * var10;
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
        if (var19 < vb.field_e) {
          var19 = vb.field_e;
        }
        if (var20 > vb.field_k) {
          var20 = vb.field_k;
        }
        if (var21 < vb.field_i) {
          var21 = vb.field_i;
        }
        if (var22 > vb.field_d) {
          var22 = vb.field_d;
        }
        var20 = var19 - var20;
        if (var20 >= 0) {
          return;
        }
        var22 = var21 - var22;
        if (var22 >= 0) {
          return;
        }
        var23 = var21 * vb.field_f + var19;
        var24 = 16777216.0 / (double)param5;
        var26 = (int)Math.floor(Math.sin(var7) * var24 + 0.5);
        var27 = (int)Math.floor(Math.cos(var7) * var24 + 0.5);
        var28 = (var19 << 4) + 8 - param2;
        var29 = (var21 << 4) + 8 - param3;
        var30 = (param0 << 8) - (var29 * var26 >> 4);
        var31 = (param1 << 8) + (var29 * var27 >> 4);
        if (var27 == 0) {
          if (var26 == 0) {
            var33 = var22;
            while (var33 < 0) {
              var34 = var23;
              var35 = var30;
              var36 = var31;
              var37 = var20;
              if (var35 < 0) {
                var33++;
                var23 = var23 + vb.field_f;
                continue;
              }
              L68: {
                if ((var36 >= 0) &&
                    (var35 - (this.field_r << 12) < 0) &&
                    (var36 - (this.field_m << 12) < 0)) {
                  while (true) {
                    if (var37 >= 0) {
                      break L68;
                    }
                    var38 = this.field_v[(var36 >> 12) * this.field_r + (var35 >> 12)];
                    if (var38 == 0) {
                      var34++;
                      var37++;
                      continue;
                    }
                    incrementValue$8 = var34;
                    var34++;
                    vb.field_c[incrementValue$8] = var38;
                    var37++;
                    continue;
                  }
                }
              }
              var33++;
              var23 = var23 + vb.field_f;
            }
            return;
          }
          if (var26 >= 0) {
            var33 = var22;
            while (var33 < 0) {
              L56: {
                var34 = var23;
                var35 = var30;
                var36 = var31 + (var28 * var26 >> 4);
                var37 = var20;
                if ((var35 >= 0) &&
                    (var35 - (this.field_r << 12) < 0)) {
                  if (var36 < 0) {
                    var32 = (var26 - 1 - var36) / var26;
                    var37 = var37 + var32;
                    var36 = var36 + var26 * var32;
                    var34 = var34 + var32;
                  }
                  var32 = (1 + var36 - (this.field_m << 12) - var26) / var26;
                  if ((1 + var36 - (this.field_m << 12) - var26) / var26 > var37) {
                    var37 = var32;
                  }
                  while (var37 < 0) {
                    var38 = this.field_v[(var36 >> 12) * this.field_r + (var35 >> 12)];
                    if (var38 == 0) {
                      var34++;
                    } else {
                      incrementValue$6 = var34;
                      var34++;
                      vb.field_c[incrementValue$6] = var38;
                    }
                    var36 = var36 + var26;
                    var37++;
                  }
                  break L56;
                }
              }
              var33++;
              var30 = var30 - var26;
              var23 = var23 + vb.field_f;
            }
            return;
          }
          var33 = var22;
          while (var33 < 0) {
            L62: {
              var34 = var23;
              var35 = var30;
              var36 = var31 + (var28 * var26 >> 4);
              var37 = var20;
              if (var35 >= 0) {
                if (var35 - (this.field_r << 12) >= 0) {
                  var33++;
                  var30 = var30 - var26;
                  var23 = var23 + vb.field_f;
                  continue;
                }
                var32 = var36 - (this.field_m << 12);
                if (var36 - (this.field_m << 12) >= 0) {
                  var32 = (var26 - var32) / var26;
                  var37 = var37 + var32;
                  var36 = var36 + var26 * var32;
                  var34 = var34 + var32;
                }
                var32 = (var36 - var26) / var26;
                if ((var36 - var26) / var26 > var37) {
                  var37 = var32;
                }
                while (var37 < 0) {
                  var38 = this.field_v[(var36 >> 12) * this.field_r + (var35 >> 12)];
                  if (var38 == 0) {
                    var34++;
                  } else {
                    incrementValue$7 = var34;
                    var34++;
                    vb.field_c[incrementValue$7] = var38;
                  }
                  var36 = var36 + var26;
                  var37++;
                }
                break L62;
              }
            }
            var33++;
            var30 = var30 - var26;
            var23 = var23 + vb.field_f;
          }
          return;
        }
        if (var27 >= 0) {
          if (var26 == 0) {
            var33 = var22;
            while (var33 < 0) {
              L30: {
                var34 = var23;
                var35 = var30 + (var28 * var27 >> 4);
                var36 = var31;
                var37 = var20;
                if ((var36 >= 0) &&
                    (var36 - (this.field_m << 12) < 0)) {
                  if (var35 < 0) {
                    var32 = (var27 - 1 - var35) / var27;
                    var37 = var37 + var32;
                    var35 = var35 + var27 * var32;
                    var34 = var34 + var32;
                  }
                  var32 = (1 + var35 - (this.field_r << 12) - var27) / var27;
                  if ((1 + var35 - (this.field_r << 12) - var27) / var27 > var37) {
                    var37 = var32;
                  }
                  while (var37 < 0) {
                    var38 = this.field_v[(var36 >> 12) * this.field_r + (var35 >> 12)];
                    if (var38 == 0) {
                      var34++;
                    } else {
                      incrementValue$2 = var34;
                      var34++;
                      vb.field_c[incrementValue$2] = var38;
                    }
                    var35 = var35 + var27;
                    var37++;
                  }
                  break L30;
                }
              }
              var33++;
              var31 = var31 + var27;
              var23 = var23 + vb.field_f;
            }
            return;
          }
          if (var26 >= 0) {
            var33 = var22;
            while (var33 < 0) {
              var34 = var23;
              var35 = var30 + (var28 * var27 >> 4);
              var36 = var31 + (var28 * var26 >> 4);
              var37 = var20;
              if (var35 < 0) {
                var32 = (var27 - 1 - var35) / var27;
                var37 = var37 + var32;
                var35 = var35 + var27 * var32;
                var36 = var36 + var26 * var32;
                var34 = var34 + var32;
              }
              var32 = (1 + var35 - (this.field_r << 12) - var27) / var27;
              if ((1 + var35 - (this.field_r << 12) - var27) / var27 > var37) {
                var37 = var32;
              }
              if (var36 < 0) {
                var32 = (var26 - 1 - var36) / var26;
                var37 = var37 + var32;
                var35 = var35 + var27 * var32;
                var36 = var36 + var26 * var32;
                var34 = var34 + var32;
              }
              var32 = (1 + var36 - (this.field_m << 12) - var26) / var26;
              if ((1 + var36 - (this.field_m << 12) - var26) / var26 > var37) {
                var37 = var32;
              }
              while (var37 < 0) {
                var38 = this.field_v[(var36 >> 12) * this.field_r + (var35 >> 12)];
                if (var38 == 0) {
                  var34++;
                } else {
                  incrementValue$0 = var34;
                  var34++;
                  vb.field_c[incrementValue$0] = var38;
                }
                var35 = var35 + var27;
                var36 = var36 + var26;
                var37++;
              }
              var33++;
              var30 = var30 - var26;
              var31 = var31 + var27;
              var23 = var23 + vb.field_f;
            }
            return;
          }
          var33 = var22;
          while (var33 < 0) {
            var34 = var23;
            var35 = var30 + (var28 * var27 >> 4);
            var36 = var31 + (var28 * var26 >> 4);
            var37 = var20;
            if (var35 < 0) {
              var32 = (var27 - 1 - var35) / var27;
              var37 = var37 + var32;
              var35 = var35 + var27 * var32;
              var36 = var36 + var26 * var32;
              var34 = var34 + var32;
            }
            var32 = (1 + var35 - (this.field_r << 12) - var27) / var27;
            if ((1 + var35 - (this.field_r << 12) - var27) / var27 > var37) {
              var37 = var32;
            }
            var32 = var36 - (this.field_m << 12);
            if (var36 - (this.field_m << 12) >= 0) {
              var32 = (var26 - var32) / var26;
              var37 = var37 + var32;
              var35 = var35 + var27 * var32;
              var36 = var36 + var26 * var32;
              var34 = var34 + var32;
            }
            var32 = (var36 - var26) / var26;
            if ((var36 - var26) / var26 > var37) {
              var37 = var32;
            }
            while (var37 < 0) {
              var38 = this.field_v[(var36 >> 12) * this.field_r + (var35 >> 12)];
              if (var38 == 0) {
                var34++;
              } else {
                incrementValue$1 = var34;
                var34++;
                vb.field_c[incrementValue$1] = var38;
              }
              var35 = var35 + var27;
              var36 = var36 + var26;
              var37++;
            }
            var33++;
            var30 = var30 - var26;
            var31 = var31 + var27;
            var23 = var23 + vb.field_f;
          }
          return;
        }
        if (var26 == 0) {
          var33 = var22;
          while (var33 < 0) {
            L50: {
              var34 = var23;
              var35 = var30 + (var28 * var27 >> 4);
              var36 = var31;
              var37 = var20;
              if ((var36 >= 0) &&
                  (var36 - (this.field_m << 12) < 0)) {
                var32 = var35 - (this.field_r << 12);
                if (var35 - (this.field_r << 12) >= 0) {
                  var32 = (var27 - var32) / var27;
                  var37 = var37 + var32;
                  var35 = var35 + var27 * var32;
                  var34 = var34 + var32;
                }
                var32 = (var35 - var27) / var27;
                if ((var35 - var27) / var27 > var37) {
                  var37 = var32;
                }
                while (var37 < 0) {
                  var38 = this.field_v[(var36 >> 12) * this.field_r + (var35 >> 12)];
                  if (var38 == 0) {
                    var34++;
                  } else {
                    incrementValue$5 = var34;
                    var34++;
                    vb.field_c[incrementValue$5] = var38;
                  }
                  var35 = var35 + var27;
                  var37++;
                }
                break L50;
              }
            }
            var33++;
            var31 = var31 + var27;
            var23 = var23 + vb.field_f;
          }
          return;
        }
        if (var26 >= 0) {
          var33 = var22;
          while (var33 < 0) {
            var34 = var23;
            var35 = var30 + (var28 * var27 >> 4);
            var36 = var31 + (var28 * var26 >> 4);
            var37 = var20;
            var32 = var35 - (this.field_r << 12);
            if (var35 - (this.field_r << 12) >= 0) {
              var32 = (var27 - var32) / var27;
              var37 = var37 + var32;
              var35 = var35 + var27 * var32;
              var36 = var36 + var26 * var32;
              var34 = var34 + var32;
            }
            var32 = (var35 - var27) / var27;
            if ((var35 - var27) / var27 > var37) {
              var37 = var32;
            }
            if (var36 < 0) {
              var32 = (var26 - 1 - var36) / var26;
              var37 = var37 + var32;
              var35 = var35 + var27 * var32;
              var36 = var36 + var26 * var32;
              var34 = var34 + var32;
            }
            var32 = (1 + var36 - (this.field_m << 12) - var26) / var26;
            if ((1 + var36 - (this.field_m << 12) - var26) / var26 > var37) {
              var37 = var32;
            }
            while (var37 < 0) {
              var38 = this.field_v[(var36 >> 12) * this.field_r + (var35 >> 12)];
              if (var38 == 0) {
                var34++;
              } else {
                incrementValue$3 = var34;
                var34++;
                vb.field_c[incrementValue$3] = var38;
              }
              var35 = var35 + var27;
              var36 = var36 + var26;
              var37++;
            }
            var33++;
            var30 = var30 - var26;
            var31 = var31 + var27;
            var23 = var23 + vb.field_f;
          }
          return;
        }
        var33 = var22;
        while (var33 < 0) {
          var34 = var23;
          var35 = var30 + (var28 * var27 >> 4);
          var36 = var31 + (var28 * var26 >> 4);
          var37 = var20;
          var32 = var35 - (this.field_r << 12);
          if (var35 - (this.field_r << 12) >= 0) {
            var32 = (var27 - var32) / var27;
            var37 = var37 + var32;
            var35 = var35 + var27 * var32;
            var36 = var36 + var26 * var32;
            var34 = var34 + var32;
          }
          var32 = (var35 - var27) / var27;
          if ((var35 - var27) / var27 > var37) {
            var37 = var32;
          }
          var32 = var36 - (this.field_m << 12);
          if (var36 - (this.field_m << 12) >= 0) {
            var32 = (var26 - var32) / var26;
            var37 = var37 + var32;
            var35 = var35 + var27 * var32;
            var36 = var36 + var26 * var32;
            var34 = var34 + var32;
          }
          var32 = (var36 - var26) / var26;
          if ((var36 - var26) / var26 > var37) {
            var37 = var32;
          }
          while (var37 < 0) {
            var38 = this.field_v[(var36 >> 12) * this.field_r + (var35 >> 12)];
            if (var38 == 0) {
              var34++;
            } else {
              incrementValue$4 = var34;
              var34++;
              vb.field_c[incrementValue$4] = var38;
            }
            var35 = var35 + var27;
            var36 = var36 + var26;
            var37++;
          }
          var33++;
          var30 = var30 - var26;
          var31 = var31 + var27;
          var23 = var23 + vb.field_f;
        }
        return;
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11) {
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int incrementValue$1 = 0;
        int var12 = param3;
        for (var13 = -param8; var13 < 0; var13++) {
            var14 = (param4 >> 16) * param11;
            for (var15 = -param7; var15 < 0; var15++) {
                param2 = param1[(param3 >> 16) + var14];
                if (param2 != 0) {
                    incrementValue$1 = param5;
                    param5++;
                    param0[incrementValue$1] = param2;
                } else {
                    param5++;
                }
                param3 = param3 + param9;
            }
            param4 = param4 + param10;
            param3 = var12;
            param5 = param5 + param6;
        }
    }

    final void d() {
        int var8 = 0;
        int var9 = 0;
        int var1;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int[] var7;
        var1 = this.field_m - 1;
        while (true) {
          L1: {
            if (var1 >= 0) {
              var2 = var1 * this.field_r;
              for (var3 = 0; var3 < this.field_r; var3++) {
                if (this.field_v[var2 + var3] != 0) {
                  break L1;
                }
              }
              var1--;
              continue;
            }
          }
          var2 = 0;
          while (true) {
            L4: {
              if (var2 < var1) {
                var3 = var2 * this.field_r;
                for (var4 = 0; var4 < this.field_r; var4++) {
                  if (this.field_v[var3 + var4] != 0) {
                    break L4;
                  }
                }
                var2++;
                continue;
              }
            }
            var3 = this.field_r - 1;
            while (true) {
              L7: {
                if (var3 >= 0) {
                  for (var4 = var2; var4 <= var1; var4++) {
                    if (this.field_v[var4 * this.field_r + var3] != 0) {
                      break L7;
                    }
                  }
                  var3--;
                  continue;
                }
              }
              var4 = 0;
              while (true) {
                L10: {
                  if (var4 < var3) {
                    for (var5 = var2; var5 <= var1; var5++) {
                      if (this.field_v[var5 * this.field_r + var4] != 0) {
                        break L10;
                      }
                    }
                    var4++;
                    continue;
                  }
                }
                if ((var4 == 0) &&
                    (var3 == this.field_r - 1) &&
                    (var2 == 0) &&
                    (var1 == this.field_m - 1)) {
                  return;
                }
                var5 = var3 + 1 - var4;
                var6 = var1 + 1 - var2;
                var7 = new int[var5 * var6];
                for (var8 = 0; var8 < var6; var8++) {
                  for (var9 = 0; var9 < var5; var9++) {
                    var7[var8 * var5 + var9] = this.field_v[(var8 + var2) * this.field_r + (var9 + var4)];
                  }
                }
                this.field_v = var7;
                this.field_r = var5;
                this.field_m = var6;
                this.field_u = this.field_u + var4;
                this.field_p = this.field_p + var2;
                return;
              }
            }
          }
        }
    }

    final void g(int param0) {
        int var4 = 0;
        int var5 = 0;
        int incrementValue$1 = 0;
        int[] var2;
        int var3;
        int var6;
        var2 = new int[this.field_r * this.field_m];
        var3 = 0;
        for (var4 = 0; var4 < this.field_m; var4++) {
          for (var5 = 0; var5 < this.field_r; var5++) {
            L2: {
              var6 = this.field_v[var3];
              if (var6 == 0) {
                if ((var5 > 0) &&
                    (this.field_v[var3 - 1] != 0)) {
                  var6 = param0;
                  break L2;
                }
                if ((var4 > 0) &&
                    (this.field_v[var3 - this.field_r] != 0)) {
                  var6 = param0;
                  break L2;
                }
                if ((var5 < this.field_r - 1) &&
                    (this.field_v[var3 + 1] != 0)) {
                  var6 = param0;
                  break L2;
                }
                if ((var4 < this.field_m - 1) &&
                    (this.field_v[var3 + this.field_r] != 0)) {
                  var6 = param0;
                }
              }
            }
            incrementValue$1 = var3;
            var3++;
            var2[incrementValue$1] = var6;
          }
        }
        this.field_v = var2;
    }

    private final static void b(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int var10;
        int var11;
        int var12;
        int var13;
        var10 = 256 - param9;
        var11 = -param6;
        L0: while (true) {
          if (var11 >= 0) {
            return;
          }
          var12 = -param5;
          while (true) {
            if (var12 >= 0) {
              param4 = param4 + param7;
              param3 = param3 + param8;
              var11++;
              continue L0;
            }
            incrementValue$11 = param3;
            param3++;
            param2 = param1[incrementValue$11];
            if (param2 == 0) {
              param4++;
              var12++;
              continue;
            }
            var13 = param0[param4];
            incrementValue$12 = param4;
            param4++;
            param0[incrementValue$12] = ((param2 & 16711935) * param9 + (var13 & 16711935) * var10 & -16711936) + ((param2 & 65280) * param9 + (var13 & 65280) * var10 & 16711680) >> 8;
            var12++;
            continue;
          }
        }
    }

    final void e(int param0, int param1) {
        int var9 = 0;
        param0 = param0 + this.field_u;
        param1 = param1 + this.field_p;
        int var3 = param0 + param1 * vb.field_f;
        int var4 = 0;
        int var5 = this.field_m;
        int var6 = this.field_r;
        int var7 = vb.field_f - var6;
        int var8 = 0;
        if (param1 < vb.field_i) {
            var9 = vb.field_i - param1;
            var5 = var5 - var9;
            param1 = vb.field_i;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * vb.field_f;
        }
        if (param1 + var5 > vb.field_d) {
            var5 = var5 - (param1 + var5 - vb.field_d);
        }
        if (param0 < vb.field_e) {
            var9 = vb.field_e - param0;
            var6 = var6 - var9;
            param0 = vb.field_e;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
        }
        if (param0 + var6 > vb.field_k) {
            var9 = param0 + var6 - vb.field_k;
            var6 = var6 - var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
        }
        if (var6 > 0) {
            if (var5 <= 0) {
                return;
            }
            dm.a(0, vb.field_c, this.field_v, 0, var4, var3, var6, var5, var7, var8);
            return;
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        int var13 = 0;
        int var15 = 0;
        if (param2 > 0) {
            if (param3 <= 0) {
                return;
            }
            var5 = this.field_r;
            var6 = this.field_m;
            var7 = 0;
            var8 = 0;
            var9 = this.field_s;
            var10 = this.field_o;
            var11 = (var9 << 16) / param2;
            var12 = (var10 << 16) / param3;
            if (this.field_u > 0) {
                var13 = ((this.field_u << 16) + var11 - 1) / var11;
                param0 = param0 + var13;
                var7 = var7 + (var13 * var11 - (this.field_u << 16));
            }
            if (this.field_p > 0) {
                var13 = ((this.field_p << 16) + var12 - 1) / var12;
                param1 = param1 + var13;
                var8 = var8 + (var13 * var12 - (this.field_p << 16));
            }
            if (var5 < var9) {
                param2 = ((var5 << 16) - var7 + var11 - 1) / var11;
            }
            if (var6 < var10) {
                param3 = ((var6 << 16) - var8 + var12 - 1) / var12;
            }
            var13 = param0 + param1 * vb.field_f;
            var14 = vb.field_f - param2;
            if (param1 + param3 > vb.field_d) {
                param3 = param3 - (param1 + param3 - vb.field_d);
            }
            if (param1 < vb.field_i) {
                var15 = vb.field_i - param1;
                param3 = param3 - var15;
                var13 = var13 + var15 * vb.field_f;
                var8 = var8 + var12 * var15;
            }
            if (param0 + param2 > vb.field_k) {
                var15 = param0 + param2 - vb.field_k;
                param2 = param2 - var15;
                var14 = var14 + var15;
            }
            if (param0 < vb.field_e) {
                var15 = vb.field_e - param0;
                param2 = param2 - var15;
                var13 = var13 + var15;
                var7 = var7 + var11 * var15;
                var14 = var14 + var15;
            }
            dm.a(vb.field_c, this.field_v, 0, var7, var8, var13, var14, param2, param3, var11, var12, var5);
            return;
        }
    }

    void b(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var15 = 0;
        int var14 = 0;
        int var16 = 0;
        if (param2 > 0) {
            if (param3 <= 0) {
                return;
            }
            var6 = this.field_r;
            var7 = this.field_m;
            var8 = 0;
            var9 = 0;
            var10 = this.field_s;
            var11 = this.field_o;
            var12 = (var10 << 16) / param2;
            var13 = (var11 << 16) / param3;
            if (this.field_u > 0) {
                var14 = ((this.field_u << 16) + var12 - 1) / var12;
                param0 = param0 + var14;
                var8 = var8 + (var14 * var12 - (this.field_u << 16));
            }
            if (this.field_p > 0) {
                var14 = ((this.field_p << 16) + var13 - 1) / var13;
                param1 = param1 + var14;
                var9 = var9 + (var14 * var13 - (this.field_p << 16));
            }
            if (var6 < var10) {
                param2 = ((var6 << 16) - var8 + var12 - 1) / var12;
            }
            if (var7 < var11) {
                param3 = ((var7 << 16) - var9 + var13 - 1) / var13;
            }
            var14 = param0 + param1 * vb.field_f;
            var15 = vb.field_f - param2;
            if (param1 + param3 > vb.field_d) {
                param3 = param3 - (param1 + param3 - vb.field_d);
            }
            if (param1 < vb.field_i) {
                var16 = vb.field_i - param1;
                param3 = param3 - var16;
                var14 = var14 + var16 * vb.field_f;
                var9 = var9 + var13 * var16;
            }
            if (param0 + param2 > vb.field_k) {
                var16 = param0 + param2 - vb.field_k;
                param2 = param2 - var16;
                var15 = var15 + var16;
            }
            if (param0 < vb.field_e) {
                var16 = vb.field_e - param0;
                param2 = param2 - var16;
                var14 = var14 + var16;
                var8 = var8 + var12 * var16;
                var15 = var15 + var16;
            }
            dm.a(vb.field_c, this.field_v, 0, var8, var9, var14, var15, param2, param3, var12, var13, var6, param4);
            return;
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        int var5 = this.field_s << 3;
        int var6 = this.field_o << 3;
        param0 = (param0 << 4) + (var5 & 15);
        param1 = (param1 << 4) + (var6 & 15);
        this.a(var5, var6, param0, param1, param2, param3);
    }

    private final static void a(int param0, int[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        var10 = -param7;
        L0: while (true) {
          if (var10 >= 0) {
            return;
          }
          var11 = -param6;
          while (true) {
            if (var11 >= 0) {
              param5 = param5 + param8;
              param4 = param4 + param9;
              var10++;
              continue L0;
            }
            incrementValue$4 = param4;
            param4++;
            param3 = param2[incrementValue$4];
            if (param3 == 0) {
              param5++;
              var11++;
              continue;
            }
            param0 = param1[param5];
            if (param0 == 0) {
              param5++;
              var11++;
              continue;
            }
            var12 = ((param3 & 16711680) >>> 16) * ((param0 & 16711680) >>> 16) >>> 8;
            var13 = (param3 & 65280) * (param0 & 65280) >>> 24;
            var14 = (param3 & 255) * (param0 & 255) >>> 8;
            incrementValue$5 = param5;
            param5++;
            param1[incrementValue$5] = (var12 << 16) + (var13 << 8) + var14;
            var11++;
            continue;
          }
        }
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12) {
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int incrementValue$0 = 0;
        int var18 = 0;
        int var13 = 256 - param12;
        int var14 = param3;
        for (var15 = -param8; var15 < 0; var15++) {
            var16 = (param4 >> 16) * param11;
            for (var17 = -param7; var17 < 0; var17++) {
                param2 = param1[(param3 >> 16) + var16];
                if (param2 != 0) {
                    var18 = param0[param5];
                    incrementValue$0 = param5;
                    param5++;
                    param0[incrementValue$0] = ((param2 & 16711935) * param12 + (var18 & 16711935) * var13 & -16711936) + ((param2 & 65280) * param12 + (var18 & 65280) * var13 & 16711680) >> 8;
                } else {
                    param5++;
                }
                param3 = param3 + param9;
            }
            param4 = param4 + param10;
            param3 = var14;
            param5 = param5 + param6;
        }
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
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
        var10 = param9 >> 16 & 255;
        var11 = param9 >> 8 & 255;
        var12 = param9 & 255;
        var13 = -(param5 >> 2);
        param5 = -(param5 & 3);
        var14 = var13 + var13 + var13 + var13 + param5;
        var15 = -param6;
        L0: while (true) {
          if (var15 >= 0) {
            return;
          }
          var16 = var14;
          while (true) {
            if (var16 >= 0) {
              param4 = param4 + param7;
              param3 = param3 + param8;
              var15++;
              continue L0;
            }
            incrementValue$0 = param3;
            param3++;
            param2 = param1[incrementValue$0];
            if (param2 == 0) {
              param4++;
              var16++;
              continue;
            }
            var17 = param2 >> 16 & 255;
            var18 = param2 >> 8 & 255;
            var19 = param2 & 255;
            if ((var17 == var18) &&
                (var18 == var19)) {
              if (var17 > 128) {
                incrementValue$1 = param4;
                param4++;
                param0[incrementValue$1] = (var10 * (256 - var17) + 255 * (var17 - 128) >> 7 << 16) + (var11 * (256 - var18) + 255 * (var18 - 128) >> 7 << 8) + (var12 * (256 - var19) + 255 * (var19 - 128) >> 7);
                var16++;
                continue;
              }
              incrementValue$2 = param4;
              param4++;
              param0[incrementValue$2] = (var17 * var10 >> 7 << 16) + (var18 * var11 >> 7 << 8) + (var19 * var12 >> 7);
              var16++;
              continue;
            }
            incrementValue$3 = param4;
            param4++;
            param0[incrementValue$3] = param2;
            var16++;
            continue;
          }
        }
    }

    void c(int param0, int param1, int param2) {
        int var10 = 0;
        param0 = param0 + this.field_u;
        param1 = param1 + this.field_p;
        int var4 = param0 + param1 * vb.field_f;
        int var5 = 0;
        int var6 = this.field_m;
        int var7 = this.field_r;
        int var8 = vb.field_f - var7;
        int var9 = 0;
        if (param1 < vb.field_i) {
            var10 = vb.field_i - param1;
            var6 = var6 - var10;
            param1 = vb.field_i;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * vb.field_f;
        }
        if (param1 + var6 > vb.field_d) {
            var6 = var6 - (param1 + var6 - vb.field_d);
        }
        if (param0 < vb.field_e) {
            var10 = vb.field_e - param0;
            var7 = var7 - var10;
            param0 = vb.field_e;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (param0 + var7 > vb.field_k) {
            var10 = param0 + var7 - vb.field_k;
            var7 = var7 - var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (var7 > 0) {
            if (var6 <= 0) {
                return;
            }
            if (param2 == 256) {
                dm.a(0, 0, 0, vb.field_c, this.field_v, var5, 0, var4, 0, var7, var6, var8, var9);
            } else {
                dm.a(0, 0, 0, vb.field_c, this.field_v, var5, 0, var4, 0, var7, var6, var8, var9, param2);
            }
            return;
        }
    }

    final void a() {
        int var4 = 0;
        int incrementValue$0 = 0;
        int var3 = 0;
        int[] var1 = new int[this.field_r * this.field_m];
        int var2 = 0;
        for (var3 = 0; var3 < this.field_r; var3++) {
            for (var4 = this.field_m - 1; var4 >= 0; var4--) {
                incrementValue$0 = var2;
                var2++;
                var1[incrementValue$0] = this.field_v[var3 + var4 * this.field_r];
            }
        }
        this.field_v = var1;
        var3 = this.field_p;
        this.field_p = this.field_u;
        this.field_u = this.field_o - this.field_m - var3;
        var3 = this.field_m;
        this.field_m = this.field_r;
        this.field_r = var3;
        var3 = this.field_o;
        this.field_o = this.field_s;
        this.field_s = var3;
    }

    final void e() {
        vb.a(this.field_v, this.field_r, this.field_m);
    }

    final dm c() {
        int var2 = 0;
        int var3 = 0;
        dm var1 = new dm(this.field_r, this.field_m);
        var1.field_s = this.field_s;
        var1.field_o = this.field_o;
        var1.field_u = this.field_s - this.field_r - this.field_u;
        var1.field_p = this.field_p;
        for (var2 = 0; var2 < this.field_m; var2++) {
            for (var3 = 0; var3 < this.field_r; var3++) {
                var1.field_v[var2 * this.field_r + var3] = this.field_v[var2 * this.field_r + this.field_r - 1 - var3];
            }
        }
        return var1;
    }

    void d(int param0, int param1) {
        param0 = param0 + (this.field_u >> 1);
        param1 = param1 + (this.field_p >> 1);
        int var3 = param0 < vb.field_e ? vb.field_e - param0 << 1 : 0;
        int var4 = param0 + (this.field_r >> 1) > vb.field_k ? vb.field_k - param0 << 1 : this.field_r;
        int var5 = param1 < vb.field_i ? vb.field_i - param1 << 1 : 0;
        int var6 = param1 + (this.field_m >> 1) > vb.field_d ? vb.field_d - param1 << 1 : this.field_m;
        dm.a(this.field_v, var5 * this.field_r + var3, (param1 + (var5 >> 1)) * vb.field_f + (param0 + (var3 >> 1)), (this.field_r << 1) - (var4 - var3) + (this.field_r & 1), vb.field_f - (var4 - var3 >> 1), this.field_r, var4 - var3 >> 1, var6 - var5 >> 1);
    }

    void b(int param0, int param1) {
        int var9 = 0;
        param0 = param0 + this.field_u;
        param1 = param1 + this.field_p;
        int var3 = param0 + param1 * vb.field_f;
        int var4 = 0;
        int var5 = this.field_m;
        int var6 = this.field_r;
        int var7 = vb.field_f - var6;
        int var8 = 0;
        if (param1 < vb.field_i) {
            var9 = vb.field_i - param1;
            var5 = var5 - var9;
            param1 = vb.field_i;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * vb.field_f;
        }
        if (param1 + var5 > vb.field_d) {
            var5 = var5 - (param1 + var5 - vb.field_d);
        }
        if (param0 < vb.field_e) {
            var9 = vb.field_e - param0;
            var6 = var6 - var9;
            param0 = vb.field_e;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
        }
        if (param0 + var6 > vb.field_k) {
            var9 = param0 + var6 - vb.field_k;
            var6 = var6 - var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
        }
        if (var6 > 0) {
            if (var5 <= 0) {
                return;
            }
            dm.b(vb.field_c, this.field_v, 0, var4, var3, var6, var5, var7, var8);
            return;
        }
    }

    void e(int param0, int param1, int param2) {
        int var10 = 0;
        param0 = param0 + this.field_u;
        param1 = param1 + this.field_p;
        int var4 = param0 + param1 * vb.field_f;
        int var5 = 0;
        int var6 = this.field_m;
        int var7 = this.field_r;
        int var8 = vb.field_f - var7;
        int var9 = 0;
        if (param1 < vb.field_i) {
            var10 = vb.field_i - param1;
            var6 = var6 - var10;
            param1 = vb.field_i;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * vb.field_f;
        }
        if (param1 + var6 > vb.field_d) {
            var6 = var6 - (param1 + var6 - vb.field_d);
        }
        if (param0 < vb.field_e) {
            var10 = vb.field_e - param0;
            var7 = var7 - var10;
            param0 = vb.field_e;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (param0 + var7 > vb.field_k) {
            var10 = param0 + var7 - vb.field_k;
            var7 = var7 - var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (var7 > 0) {
            if (var6 <= 0) {
                return;
            }
            dm.a(vb.field_c, this.field_v, 0, var5, var4, var7, var6, var8, var9, param2);
            return;
        }
    }

    private final static void b(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int var9;
        int var10;
        int var11;
        var9 = -(param5 >> 2);
        param5 = -(param5 & 3);
        var10 = -param6;
        L0: while (true) {
          if (var10 >= 0) {
            return;
          }
          var11 = var9;
          while (true) {
            if (var11 >= 0) {
              var11 = param5;
              while (true) {
                if (var11 >= 0) {
                  param4 = param4 + param7;
                  param3 = param3 + param8;
                  var10++;
                  continue L0;
                }
                incrementValue$0 = param3;
                param3++;
                param2 = param1[incrementValue$0];
                if (param2 == 0) {
                  param4++;
                  var11++;
                  continue;
                }
                incrementValue$1 = param4;
                param4++;
                param0[incrementValue$1] = param2;
                var11++;
                continue;
              }
            }
            incrementValue$2 = param3;
            param3++;
            param2 = param1[incrementValue$2];
            if (param2 == 0) {
              param4++;
            } else {
              incrementValue$3 = param4;
              param4++;
              param0[incrementValue$3] = param2;
            }
            incrementValue$4 = param3;
            param3++;
            param2 = param1[incrementValue$4];
            if (param2 == 0) {
              param4++;
            } else {
              incrementValue$5 = param4;
              param4++;
              param0[incrementValue$5] = param2;
            }
            incrementValue$6 = param3;
            param3++;
            param2 = param1[incrementValue$6];
            if (param2 == 0) {
              param4++;
            } else {
              incrementValue$7 = param4;
              param4++;
              param0[incrementValue$7] = param2;
            }
            incrementValue$8 = param3;
            param3++;
            param2 = param1[incrementValue$8];
            if (param2 == 0) {
              param4++;
              var11++;
              continue;
            }
            incrementValue$9 = param4;
            param4++;
            param0[incrementValue$9] = param2;
            var11++;
            continue;
          }
        }
    }

    void f(int param0, int param1) {
        int var9 = 0;
        int var16 = 0;
        int var17 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        var3 = this.field_r >> 2;
        var4 = this.field_m >> 2;
        param0 = param0 + this.field_u / 4;
        param1 = param1 + this.field_p / 4;
        if (param0 >= vb.field_e) {
          stackIn_3_0 = 0;
        } else {
          stackIn_3_0 = vb.field_e - param0 << 2;
        }
        var5 = stackIn_3_0;
        if (param0 + var3 <= vb.field_k) {
          stackIn_6_0 = this.field_r - 4;
        } else {
          stackIn_6_0 = (vb.field_k - param0 << 2) - 4;
        }
        var6 = stackIn_6_0;
        if (param1 >= vb.field_i) {
          stackIn_9_0 = 0;
        } else {
          stackIn_9_0 = vb.field_i - param1 << 2;
        }
        var7 = stackIn_9_0;
        if (param1 + var4 <= vb.field_d) {
          stackIn_12_0 = this.field_m - 4;
        } else {
          stackIn_12_0 = (vb.field_d - param1 << 2) - 4;
        }
        var8 = stackIn_12_0;
        for (var9 = var7; var9 <= var8; var9 += 4) {
          var10 = var9 * this.field_r + var5;
          var11 = (param1 + (var9 >> 2)) * vb.field_f + (param0 + (var5 >> 2));
          var12 = var5;
          while (var12 <= var6) {
            var13 = 0;
            var14 = 0;
            var15 = 0;
            for (var16 = 0; var16 < 4; var16++) {
              for (var17 = 0; var17 < 4; var17++) {
                var13 = this.field_v[var10 + var16 * this.field_r + var17];
                if (var13 == 0) {
                  var13 = vb.field_c[var11];
                }
                var14 = var14 + (var13 & 16711935);
                var15 = var15 + (var13 & 65280);
              }
            }
            vb.field_c[var11] = (var14 & 267390960 | var15 & 1044480) >> 4;
            var12 += 4;
            var10 += 4;
            var11++;
          }
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
        var8 = 0;
        while (var8 < param7) {
          var9 = 0;
          while (var9 < param6) {
            var11 = vb.field_c[param2] & 16711935;
            var12 = vb.field_c[param2] & 65280;
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
            var10 = dupTemp$1;
            if (dupTemp$1 != 0) {
              var13 = var13 + (var10 & 16711935);
              var14 = var14 + (var10 & 65280);
            } else {
              var13 = var13 + var11;
              var14 = var14 + var12;
            }
            dupTemp$2 = param0[param1 + param5];
            var10 = dupTemp$2;
            if (dupTemp$2 != 0) {
              var13 = var13 + (var10 & 16711935);
              var14 = var14 + (var10 & 65280);
            } else {
              var13 = var13 + var11;
              var14 = var14 + var12;
            }
            dupTemp$3 = param0[param1 + param5 + 1];
            var10 = dupTemp$3;
            if (dupTemp$3 != 0) {
              var13 = var13 + (var10 & 16711935);
              var14 = var14 + (var10 & 65280);
            } else {
              var13 = var13 + var11;
              var14 = var14 + var12;
            }
            incrementValue$4 = param2;
            param2++;
            vb.field_c[incrementValue$4] = (var13 & 66847740 | var14 & 261120) >> 2;
            var9++;
            param1 += 2;
          }
          var8++;
          param1 = param1 + param3;
          param2 = param2 + param4;
        }
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int var9;
        int var10;
        int var11;
        var9 = -(param5 >> 2);
        param5 = -(param5 & 3);
        var10 = -param6;
        L0: while (true) {
          if (var10 >= 0) {
            return;
          }
          var11 = var9;
          while (true) {
            if (var11 >= 0) {
              var11 = param5;
              while (true) {
                if (var11 >= 0) {
                  param4 = param4 + param7;
                  param3 = param3 + param8;
                  var10++;
                  continue L0;
                }
                incrementValue$0 = param3;
                param3++;
                if (param1[incrementValue$0] == 0) {
                  param4++;
                  var11++;
                  continue;
                }
                incrementValue$1 = param4;
                param4++;
                param0[incrementValue$1] = param2;
                var11++;
                continue;
              }
            }
            incrementValue$2 = param3;
            param3++;
            if (param1[incrementValue$2] == 0) {
              param4++;
            } else {
              incrementValue$3 = param4;
              param4++;
              param0[incrementValue$3] = param2;
            }
            incrementValue$4 = param3;
            param3++;
            if (param1[incrementValue$4] == 0) {
              param4++;
            } else {
              incrementValue$5 = param4;
              param4++;
              param0[incrementValue$5] = param2;
            }
            incrementValue$6 = param3;
            param3++;
            if (param1[incrementValue$6] == 0) {
              param4++;
            } else {
              incrementValue$7 = param4;
              param4++;
              param0[incrementValue$7] = param2;
            }
            incrementValue$8 = param3;
            param3++;
            if (param1[incrementValue$8] == 0) {
              param4++;
              var11++;
              continue;
            }
            incrementValue$9 = param4;
            param4++;
            param0[incrementValue$9] = param2;
            var11++;
            continue;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var15 = 0;
        int var14 = 0;
        int var16 = 0;
        if (param2 > 0) {
            if (param3 <= 0) {
                return;
            }
            if (param2 == this.field_r && param3 == this.field_m) {
                this.a(param0, param1, param4);
                return;
            }
            var6 = this.field_r;
            var7 = this.field_m;
            var8 = 0;
            var9 = 0;
            var10 = this.field_s;
            var11 = this.field_o;
            var12 = (var10 << 16) / param2;
            var13 = (var11 << 16) / param3;
            if (this.field_u > 0) {
                var14 = ((this.field_u << 16) + var12 - 1) / var12;
                param0 = param0 + var14;
                var8 = var8 + (var14 * var12 - (this.field_u << 16));
            }
            if (this.field_p > 0) {
                var14 = ((this.field_p << 16) + var13 - 1) / var13;
                param1 = param1 + var14;
                var9 = var9 + (var14 * var13 - (this.field_p << 16));
            }
            if (var6 < var10) {
                param2 = ((var6 << 16) - var8 + var12 - 1) / var12;
            }
            if (var7 < var11) {
                param3 = ((var7 << 16) - var9 + var13 - 1) / var13;
            }
            var14 = param0 + param1 * vb.field_f;
            var15 = vb.field_f - param2;
            if (param1 + param3 > vb.field_d) {
                param3 = param3 - (param1 + param3 - vb.field_d);
            }
            if (param1 < vb.field_i) {
                var16 = vb.field_i - param1;
                param3 = param3 - var16;
                var14 = var14 + var16 * vb.field_f;
                var9 = var9 + var13 * var16;
            }
            if (param0 + param2 > vb.field_k) {
                var16 = param0 + param2 - vb.field_k;
                param2 = param2 - var16;
                var15 = var15 + var16;
            }
            if (param0 < vb.field_e) {
                var16 = vb.field_e - param0;
                param2 = param2 - var16;
                var14 = var14 + var16;
                var8 = var8 + var12 * var16;
                var15 = var15 + var16;
            }
            dm.b(vb.field_c, this.field_v, 0, var8, var9, var14, var15, param2, param3, var12, var13, var6, param4);
            return;
        }
    }

    private final static void a(int param0, int param1, int param2, int[] param3, int[] param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13) {
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        param8 = -param10;
        L0: while (true) {
          if (param8 >= 0) {
            return;
          }
          param6 = -param9;
          while (true) {
            if (param6 >= 0) {
              param7 = param7 + param11;
              param5 = param5 + param12;
              param8++;
              continue L0;
            }
            incrementValue$11 = param5;
            param5++;
            param0 = param4[incrementValue$11];
            if (param0 == 0) {
              param7++;
              param6++;
              continue;
            }
            param1 = (param0 & 16711935) * param13;
            param0 = (param1 & -16711936) + (param0 * param13 - param1 & 16711680) >>> 8;
            param1 = param3[param7];
            param2 = param0 + param1;
            param0 = (param0 & 16711935) + (param1 & 16711935);
            param1 = (param0 & 16777472) + (param2 - param0 & 65536);
            incrementValue$12 = param7;
            param7++;
            param3[incrementValue$12] = param2 - param1 | param1 - (param1 >>> 8);
            param6++;
            continue;
          }
        }
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var8 = 0;
        int var9 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        for (var8 = -param5; var8 < 0; var8++) {
            var9 = param3 + param4 - 3;
            while (param3 < var9) {
                incrementValue$0 = param3;
                param3++;
                incrementValue$1 = param2;
                param2++;
                param0[incrementValue$0] = param1[incrementValue$1];
                incrementValue$2 = param3;
                param3++;
                incrementValue$3 = param2;
                param2++;
                param0[incrementValue$2] = param1[incrementValue$3];
                incrementValue$4 = param3;
                param3++;
                incrementValue$5 = param2;
                param2++;
                param0[incrementValue$4] = param1[incrementValue$5];
                incrementValue$6 = param3;
                param3++;
                incrementValue$7 = param2;
                param2++;
                param0[incrementValue$6] = param1[incrementValue$7];
            }
            var9 += 3;
            while (param3 < var9) {
                incrementValue$8 = param3;
                param3++;
                incrementValue$9 = param2;
                param2++;
                param0[incrementValue$8] = param1[incrementValue$9];
            }
            param3 = param3 + param6;
            param2 = param2 + param7;
        }
    }

    void c(int param0, int param1) {
        int var9 = 0;
        param0 = param0 + this.field_u;
        param1 = param1 + this.field_p;
        int var3 = param0 + param1 * vb.field_f;
        int var4 = 0;
        int var5 = this.field_m;
        int var6 = this.field_r;
        int var7 = vb.field_f - var6;
        int var8 = 0;
        if (param1 < vb.field_i) {
            var9 = vb.field_i - param1;
            var5 = var5 - var9;
            param1 = vb.field_i;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * vb.field_f;
        }
        if (param1 + var5 > vb.field_d) {
            var5 = var5 - (param1 + var5 - vb.field_d);
        }
        if (param0 < vb.field_e) {
            var9 = vb.field_e - param0;
            var6 = var6 - var9;
            param0 = vb.field_e;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
        }
        if (param0 + var6 > vb.field_k) {
            var9 = param0 + var6 - vb.field_k;
            var6 = var6 - var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
        }
        if (var6 > 0) {
            if (var5 <= 0) {
                return;
            }
            dm.a(vb.field_c, this.field_v, var4, var3, var6, var5, var7, var8);
            return;
        }
    }

    private final static void b(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11) {
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int var12;
        int var13;
        var12 = param11 & 16711935;
        var13 = param11 >> 8 & 255;
        param6 = -param8;
        L0: while (true) {
          if (param6 >= 0) {
            return;
          }
          param5 = -param7;
          while (true) {
            if (param5 >= 0) {
              param4 = param4 + param9;
              param3 = param3 + param10;
              param6++;
              continue L0;
            }
            incrementValue$12 = param3;
            param3++;
            param2 = param1[incrementValue$12];
            if (param2 == 0) {
              param4++;
              param5++;
              continue;
            }
            if (param2 >> 8 != (param2 & 65535)) {
              incrementValue$13 = param4;
              param4++;
              param0[incrementValue$13] = param2;
              param5++;
              continue;
            }
            param2 = param2 & 255;
            incrementValue$14 = param4;
            param4++;
            param0[incrementValue$14] = (param2 * var12 >> 8 & 16711934) + (param2 * var13 & 65280) + 1;
            param5++;
            continue;
          }
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
        var15 = -param0 * var10 + ((this.field_m << 4) - param1) * var9;
        var16 = -(-param0) * var9 + ((this.field_m << 4) - param1) * var10;
        var17 = ((this.field_r << 4) - param0) * var10 + ((this.field_m << 4) - param1) * var9;
        var18 = -((this.field_r << 4) - param0) * var9 + ((this.field_m << 4) - param1) * var10;
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
        if (var19 < vb.field_e) {
          var19 = vb.field_e;
        }
        if (var20 > vb.field_k) {
          var20 = vb.field_k;
        }
        if (var21 < vb.field_i) {
          var21 = vb.field_i;
        }
        if (var22 > vb.field_d) {
          var22 = vb.field_d;
        }
        var20 = var19 - var20;
        if (var20 >= 0) {
          return;
        }
        var22 = var21 - var22;
        if (var22 >= 0) {
          return;
        }
        var23 = var21 * vb.field_f + var19;
        var24 = vb.field_f + var20;
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
              L17: {
                if (var40 != 0) {
                  var40 = 0;
                  var35 = var38 + 4096;
                  if (var35 < 0) {
                    if (var27 != 0) {
                      var35 = (var27 - 1 - var35) / var27;
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
                    while (var39 < 0) {
                      var33 = var37 >> 12;
                      if (var37 >> 12 < this.field_r) {
                        var34 = var38 >> 12;
                        if (var38 >> 12 < this.field_m) {
                          this.c(var23, var33, var34, var37, var38);
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
                    break L17;
                  }
                }
              }
              var36++;
              var31 = var31 - var27;
              var32 = var32 + var28;
              var23 = var23 + var24;
            }
            return;
          }
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
            L23: {
              if (var40 != 0) {
                var40 = 0;
                var35 = var38 - (this.field_m << 12);
                if (var35 >= 0) {
                  if (var27 != 0) {
                    var35 = (var27 - var35) / var27;
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
                  while (var39 < 0) {
                    if (var38 >= -4096) {
                      var33 = var37 >> 12;
                      if (var37 >> 12 < this.field_r) {
                        var34 = var38 >> 12;
                        this.c(var23, var33, var34, var37, var38);
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
                  break L23;
                }
              }
            }
            var36++;
            var31 = var31 - var27;
            var32 = var32 + var28;
            var23 = var23 + var24;
          }
          return;
        }
        if (var27 >= 0) {
          var36 = var22;
          while (var36 < 0) {
            var37 = var31 + (var29 * var28 >> 4);
            var38 = var32 + (var29 * var27 >> 4);
            var39 = var20;
            var40 = 0;
            var35 = var37 - (this.field_r << 12);
            if (var35 >= 0) {
              if (var28 != 0) {
                var35 = (var28 - var35) / var28;
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
            L29: {
              if (var40 != 0) {
                var40 = 0;
                var35 = var38 + 4096;
                if (var35 < 0) {
                  if (var27 != 0) {
                    var35 = (var27 - 1 - var35) / var27;
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
                  while (var39 < 0) {
                    if (var37 >= -4096) {
                      var34 = var38 >> 12;
                      if (var38 >> 12 < this.field_m) {
                        var33 = var37 >> 12;
                        this.c(var23, var33, var34, var37, var38);
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
                  break L29;
                }
              }
            }
            var36++;
            var31 = var31 - var27;
            var32 = var32 + var28;
            var23 = var23 + var24;
          }
          return;
        }
        var36 = var22;
        while (var36 < 0) {
          var37 = var31 + (var29 * var28 >> 4);
          var38 = var32 + (var29 * var27 >> 4);
          var39 = var20;
          var40 = 0;
          var35 = var37 - (this.field_r << 12);
          if (var35 >= 0) {
            if (var28 != 0) {
              var35 = (var28 - var35) / var28;
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
          L35: {
            if (var40 != 0) {
              var40 = 0;
              var35 = var38 - (this.field_m << 12);
              if (var35 >= 0) {
                if (var27 != 0) {
                  var35 = (var27 - var35) / var27;
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
                while (var39 < 0) {
                  if ((var37 >= -4096) &&
                      (var38 >= -4096)) {
                    var33 = var37 >> 12;
                    var34 = var38 >> 12;
                    this.c(var23, var33, var34, var37, var38);
                    var39++;
                    var37 = var37 + var28;
                    var38 = var38 + var27;
                    var23++;
                    continue;
                  }
                  break;
                }
                var23 = var23 - var39;
                break L35;
              }
            }
          }
          var36++;
          var31 = var31 - var27;
          var32 = var32 + var28;
          var23 = var23 + var24;
        }
        return;
    }

    void b(int param0, int param1, int param2) {
        int var10 = 0;
        param0 = param0 + this.field_u;
        param1 = param1 + this.field_p;
        int var4 = param0 + param1 * vb.field_f;
        int var5 = 0;
        int var6 = this.field_m;
        int var7 = this.field_r;
        int var8 = vb.field_f - var7;
        int var9 = 0;
        if (param1 < vb.field_i) {
            var10 = vb.field_i - param1;
            var6 = var6 - var10;
            param1 = vb.field_i;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * vb.field_f;
        }
        if (param1 + var6 > vb.field_d) {
            var6 = var6 - (param1 + var6 - vb.field_d);
        }
        if (param0 < vb.field_e) {
            var10 = vb.field_e - param0;
            var7 = var7 - var10;
            param0 = vb.field_e;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (param0 + var7 > vb.field_k) {
            var10 = param0 + var7 - vb.field_k;
            var7 = var7 - var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (var7 > 0) {
            if (var6 <= 0) {
                return;
            }
            dm.b(vb.field_c, this.field_v, 0, var5, var4, 0, 0, var7, var6, var8, var9, param2);
            return;
        }
    }

    final dm b() {
        int var3 = 0;
        dm var1 = new dm(this.field_r, this.field_m);
        var1.field_s = this.field_s;
        var1.field_o = this.field_o;
        var1.field_u = this.field_u;
        var1.field_p = this.field_p;
        int var2 = this.field_v.length;
        for (var3 = 0; var3 < var2; var3++) {
            var1.field_v[var3] = this.field_v[var3];
        }
        return var1;
    }

    dm(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        this.field_s = param0;
        this.field_o = param1;
        this.field_u = param2;
        this.field_p = param3;
        this.field_r = param4;
        this.field_m = param5;
        this.field_v = param6;
    }

    private final static void a(int param0, int param1, int param2, int[] param3, int[] param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12) {
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        param8 = -param10;
        L0: while (true) {
          if (param8 >= 0) {
            return;
          }
          param6 = -param9;
          while (true) {
            if (param6 >= 0) {
              param7 = param7 + param11;
              param5 = param5 + param12;
              param8++;
              continue L0;
            }
            incrementValue$11 = param5;
            param5++;
            param0 = param4[incrementValue$11];
            if (param0 == 0) {
              param7++;
              param6++;
              continue;
            }
            param1 = param3[param7];
            param2 = param0 + param1;
            param0 = (param0 & 16711935) + (param1 & 16711935);
            param1 = (param0 & 16777472) + (param2 - param0 & 65536);
            incrementValue$12 = param7;
            param7++;
            param3[incrementValue$12] = param2 - param1 | param1 - (param1 >>> 8);
            param6++;
            continue;
          }
        }
    }

    void d(int param0, int param1, int param2) {
        int var10 = 0;
        param0 = param0 + this.field_u;
        param1 = param1 + this.field_p;
        int var4 = param0 + param1 * vb.field_f;
        int var5 = 0;
        int var6 = this.field_m;
        int var7 = this.field_r;
        int var8 = vb.field_f - var7;
        int var9 = 0;
        if (param1 < vb.field_i) {
            var10 = vb.field_i - param1;
            var6 = var6 - var10;
            param1 = vb.field_i;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * vb.field_f;
        }
        if (param1 + var6 > vb.field_d) {
            var6 = var6 - (param1 + var6 - vb.field_d);
        }
        if (param0 < vb.field_e) {
            var10 = vb.field_e - param0;
            var7 = var7 - var10;
            param0 = vb.field_e;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (param0 + var7 > vb.field_k) {
            var10 = param0 + var7 - vb.field_k;
            var7 = var7 - var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (var7 > 0) {
            if (var6 <= 0) {
                return;
            }
            dm.b(vb.field_c, this.field_v, 0, var5, var4, var7, var6, var8, var9, param2);
            return;
        }
    }

    private final static void b(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12) {
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int incrementValue$1 = 0;
        int var13 = param3;
        for (var14 = -param8; var14 < 0; var14++) {
            var15 = (param4 >> 16) * param11;
            for (var16 = -param7; var16 < 0; var16++) {
                param2 = param1[(param3 >> 16) + var15];
                if (param2 != 0) {
                    incrementValue$1 = param5;
                    param5++;
                    param0[incrementValue$1] = param12;
                } else {
                    param5++;
                }
                param3 = param3 + param9;
            }
            param4 = param4 + param10;
            param3 = var13;
            param5 = param5 + param6;
        }
    }

    dm(int param0, int param1) {
        this.field_v = new int[param0 * param1];
        this.field_s = param0;
        this.field_r = param0;
        this.field_o = param1;
        this.field_m = param1;
        this.field_p = 0;
        this.field_u = 0;
    }

    dm(byte[] param0, java.awt.Component param1) {
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
          this.field_m = var3.getHeight((java.awt.image.ImageObserver) ((Object) param1));
          this.field_s = this.field_r;
          this.field_o = this.field_m;
          this.field_u = 0;
          this.field_p = 0;
          this.field_v = new int[this.field_r * this.field_m];
          var5 = new java.awt.image.PixelGrabber(var3, 0, 0, this.field_r, this.field_m, this.field_v, 0, this.field_r);
          var5.grabPixels();
        } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = (InterruptedException) (Object) decompiledCaughtException;
        }
    }
}
