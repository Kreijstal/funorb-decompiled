/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class od {
    static nc field_f;
    private re field_l;
    private int[] field_i;
    private int[] field_c;
    static String field_a;
    static String field_h;
    private int field_e;
    private int[] field_m;
    private int[] field_n;
    static char field_k;
    private int field_o;
    static int[] field_j;
    private int[] field_d;
    private int field_g;
    private int[] field_b;

    private final void a(byte param0) {
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var6 = OrbDefence.field_D ? 1 : 0;
          var7 = ul.field_b;
          var2 = var7;
          var3 = ul.field_f;
          this.field_o = 0;
          this.field_m = new int[200];
          this.field_e = 0;
          if (param0 <= -58) {
            break L0;
          } else {
            od.b((byte) -52);
            break L0;
          }
        }
        var4 = ul.field_l;
        this.field_d = new int[200];
        this.field_b = new int[200];
        this.field_g = 320;
        this.field_c = new int[200];
        this.field_l = new re(new int[]{1, 2, 3, 4, 5});
        this.field_i = new int[64];
        var5 = 0;
        L1: while (true) {
          L2: {
            L3: {
              L4: {
                if (-65 >= (var5 ^ -1)) {
                  break L4;
                } else {
                  this.field_i[var5] = 65537 * var5;
                  var9 = -33;
                  var8 = var5 ^ -1;
                  if (var6 != 0) {
                    if (var8 > var9) {
                      L5: while (true) {
                        this.field_n[var5] = var5 * 262660;
                        this.field_n[31 + -var5] = var5 * 262660;
                        var5++;
                        if (var6 == 0) {
                          if ((var5 ^ -1) > -17) {
                            continue L5;
                          } else {
                            break L3;
                          }
                        } else {
                          break L2;
                        }
                      }
                    } else {
                      ul.field_f = var3;
                      ul.field_b = var7;
                      ul.field_l = var4;
                      ul.c();
                      return;
                    }
                  } else {
                    L6: {
                      if (var8 >= var9) {
                        break L6;
                      } else {
                        this.field_i[var5] = ge.a(this.field_i[var5], -8192 + 256 * var5);
                        break L6;
                      }
                    }
                    var5++;
                    if (var6 == 0) {
                      continue L1;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              this.field_n = new int[32];
              var5 = 0;
              L7: while (true) {
                if ((var5 ^ -1) > -17) {
                  this.field_n[var5] = var5 * 262660;
                  this.field_n[31 + -var5] = var5 * 262660;
                  var5++;
                  if (var6 == 0) {
                    continue L7;
                  } else {
                    break L2;
                  }
                } else {
                  break L3;
                }
              }
            }
            ul.field_f = var3;
            ul.field_b = var7;
            ul.field_l = var4;
            ul.c();
            return;
          }
          return;
        }
    }

    final void a(boolean param0) {
        if (-26 < (this.field_e ^ -1)) {
          this.a((byte) -119, 25 * cc.field_f.field_e / 25);
          if (param0) {
            return;
          } else {
            this.a((byte) -53, -57);
            return;
          }
        } else {
          this.a((byte) -124, 25);
          if (!OrbDefence.field_D) {
            if (!param0) {
              this.a((byte) -53, -57);
              return;
            } else {
              return;
            }
          } else {
            this.a((byte) -119, 25 * cc.field_f.field_e / 25);
            if (param0) {
              return;
            } else {
              this.a((byte) -53, -57);
              return;
            }
          }
        }
    }

    final static void a(int param0) {
        int fieldTemp$5 = 0;
        se var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 192) {
                break L1;
              } else {
                od.b((byte) 41);
                break L1;
              }
            }
            var1 = uk.field_b;
            L2: while (true) {
              if (!wl.a(-1)) {
                break L0;
              } else {
                var1.i(8, -44);
                fieldTemp$5 = var1.field_i + 1;
                var1.field_i = var1.field_i + 1;
                var2 = fieldTemp$5;
                dk.a((byte) 15, var1);
                uk.field_b.c((byte) 115, var1.field_i - var2);
                if (var3 == 0) {
                  continue L2;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var1_ref), "od.D(" + param0 + ')');
        }
    }

    public static void b(byte param0) {
        if (param0 != -87) {
          od.a(31);
          field_j = null;
          field_f = null;
          field_a = null;
          field_h = null;
          return;
        } else {
          field_j = null;
          field_f = null;
          field_a = null;
          field_h = null;
          return;
        }
    }

    private final void a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var11 = OrbDefence.field_D ? 1 : 0;
          var3 = -120 - -(2 * lc.field_o);
          this.field_g = 75;
          if (wj.field_m == 3) {
            this.field_g = this.field_g + 370;
            break L0;
          } else {
            break L0;
          }
        }
        var4 = 108;
        ul.f(this.field_g, var3, var4 >> -1644137087, 0);
        ul.g(this.field_g, var3, var4 >> 720140225, 7798903);
        var6 = -102 / ((param0 - -55) / 63);
        var10 = 0;
        L1: while (true) {
          L2: {
            if ((var10 ^ -1) <= -201) {
              break L2;
            } else {
              var8 = ((this.field_d[var10] >> 732925668) * (this.field_d[var10] >> -1614043100) + (this.field_c[var10] >> 1847670244) * (this.field_c[var10] >> -2002186652)) / 3;
              var13 = var8 ^ -1;
              var12 = -1;
              if (var11 != 0) {
                if (var12 < var13) {
                  ul.i(this.field_g, var3, 48, 0, 250 - 10 * param1);
                  ul.b(this.field_g << 170556708, var3 << -959401948, 2 + var4 << -247191452 >> -573841791, 192, this.field_n);
                  ul.b(this.field_g << -304367900, var3 << 1793011716, 2 + var4 << -1739466108 >> 1560146497, 192, this.field_n);
                  ul.b(this.field_g << -1611454780, var3 << 1527287428, 2 + var4 << -1919723388 >> -1529704223, 192, this.field_n);
                  return;
                } else {
                  ul.b(this.field_g << 170556708, var3 << -959401948, 2 + var4 << -247191452 >> -573841791, 192, this.field_n);
                  ul.b(this.field_g << -304367900, var3 << 1793011716, 2 + var4 << -1739466108 >> 1560146497, 192, this.field_n);
                  ul.b(this.field_g << -1611454780, var3 << 1527287428, 2 + var4 << -1919723388 >> -1529704223, 192, this.field_n);
                  return;
                }
              } else {
                L3: {
                  if (var12 > var13) {
                    L4: {
                      var9 = var8 >> 1553684068;
                      var5 = (int)((double)(var4 * this.field_d[var10]) / Math.sqrt((double)(var8 * 3)));
                      var7 = (int)((double)(var4 * this.field_c[var10]) / Math.sqrt((double)(var8 * 3)));
                      if ((param1 ^ -1) < -26) {
                        var8 = var8 + (10 * param1 + -250);
                        var9 = var9 + (-25 + param1);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if (var9 > 63) {
                        var9 = 63;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    ul.a((var5 >> 1592781025) - -(this.field_g << -2130156444), (var3 << 709311908) + (var7 >> 1581001889), var8 >> -1761747486 >> 1733067201, var9, this.field_i);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var10++;
                if (var11 == 0) {
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
          }
          ul.i(this.field_g, var3, var4 >> 2110462369, 0, 50);
          ul.b(this.field_g << 995427908, var3 << 1244985412, 2 + var4 << -996124 >> -1274580319, 192, this.field_n);
          if (-26 < (param1 ^ -1)) {
            ul.i(this.field_g, var3, 48, 0, 250 - 10 * param1);
            ul.b(this.field_g << 170556708, var3 << -959401948, 2 + var4 << -247191452 >> -573841791, 192, this.field_n);
            ul.b(this.field_g << -304367900, var3 << 1793011716, 2 + var4 << -1739466108 >> 1560146497, 192, this.field_n);
            ul.b(this.field_g << -1611454780, var3 << 1527287428, 2 + var4 << -1919723388 >> -1529704223, 192, this.field_n);
            return;
          } else {
            ul.b(this.field_g << 170556708, var3 << -959401948, 2 + var4 << -247191452 >> -573841791, 192, this.field_n);
            ul.b(this.field_g << -304367900, var3 << 1793011716, 2 + var4 << -1739466108 >> 1560146497, 192, this.field_n);
            ul.b(this.field_g << -1611454780, var3 << 1527287428, 2 + var4 << -1919723388 >> -1529704223, 192, this.field_n);
            return;
          }
        }
    }

    final void b(int param0) {
        int var2 = 0;
        double var3 = 0.0;
        int var5 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        var5 = OrbDefence.field_D ? 1 : 0;
        if (vj.a(52)) {
          return;
        } else {
          this.field_e = this.field_e + 1;
          if (param0 >= 4) {
            var2 = 0;
            L0: while (true) {
              L1: {
                if (var2 >= 200) {
                  var2 = 864 + this.field_l.a(128) % 160;
                  stackOut_37_0 = this.field_l.a(128);
                  stackOut_37_1 = 214;
                  stackIn_38_0 = stackOut_37_0;
                  stackIn_38_1 = stackOut_37_1;
                  break L1;
                } else {
                  stackOut_25_0 = this.field_m[var2] ^ -1;
                  stackOut_25_1 = this.field_d[var2] ^ -1;
                  stackIn_38_0 = stackOut_25_0;
                  stackIn_38_1 = stackOut_25_1;
                  stackIn_26_0 = stackOut_25_0;
                  stackIn_26_1 = stackOut_25_1;
                  if (var5 != 0) {
                    break L1;
                  } else {
                    L2: {
                      if (stackIn_26_0 >= stackIn_26_1) {
                        break L2;
                      } else {
                        this.field_d[var2] = this.field_d[var2] + 6;
                        break L2;
                      }
                    }
                    L3: {
                      if (this.field_d[var2] > this.field_m[var2]) {
                        this.field_d[var2] = this.field_d[var2] - 3;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    L4: {
                      if (this.field_c[var2] < this.field_b[var2]) {
                        this.field_c[var2] = this.field_c[var2] + 3;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if (this.field_b[var2] >= this.field_c[var2]) {
                        break L5;
                      } else {
                        this.field_c[var2] = this.field_c[var2] - 6;
                        break L5;
                      }
                    }
                    var2++;
                    continue L0;
                  }
                }
              }
              var3 = (double)(stackIn_38_0 % stackIn_38_1) + (double)(this.field_l.a(128) % 100) * 0.01;
              this.field_m[this.field_o] = (int)((double)var2 * Math.sin(var3));
              this.field_b[this.field_o] = (int)((double)var2 * Math.cos(var3));
              this.field_o = this.field_o + 1;
              if (200 <= this.field_o) {
                this.field_o = 0;
                return;
              } else {
                return;
              }
            }
          } else {
            this.field_m = (int[]) null;
            var2 = 0;
            L6: while (true) {
              L7: {
                if (var2 >= 200) {
                  var2 = 864 + this.field_l.a(128) % 160;
                  stackOut_18_0 = this.field_l.a(128);
                  stackOut_18_1 = 214;
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  break L7;
                } else {
                  stackOut_6_0 = this.field_m[var2] ^ -1;
                  stackOut_6_1 = this.field_d[var2] ^ -1;
                  stackIn_19_0 = stackOut_6_0;
                  stackIn_19_1 = stackOut_6_1;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  if (var5 != 0) {
                    break L7;
                  } else {
                    L8: {
                      if (stackIn_7_0 >= stackIn_7_1) {
                        break L8;
                      } else {
                        this.field_d[var2] = this.field_d[var2] + 6;
                        break L8;
                      }
                    }
                    L9: {
                      if (this.field_d[var2] > this.field_m[var2]) {
                        this.field_d[var2] = this.field_d[var2] - 3;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      if (this.field_c[var2] < this.field_b[var2]) {
                        this.field_c[var2] = this.field_c[var2] + 3;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (this.field_b[var2] >= this.field_c[var2]) {
                        break L11;
                      } else {
                        this.field_c[var2] = this.field_c[var2] - 6;
                        break L11;
                      }
                    }
                    var2++;
                    continue L6;
                  }
                }
              }
              var3 = (double)(stackIn_19_0 % stackIn_19_1) + (double)(this.field_l.a(128) % 100) * 0.01;
              this.field_m[this.field_o] = (int)((double)var2 * Math.sin(var3));
              this.field_b[this.field_o] = (int)((double)var2 * Math.cos(var3));
              this.field_o = this.field_o + 1;
              if (200 > this.field_o) {
                return;
              } else {
                this.field_o = 0;
                return;
              }
            }
          }
        }
    }

    od() {
        this.a((byte) -116);
    }

    static {
        field_h = "This is a hidden Achievement";
        field_a = "PANICO";
    }
}
