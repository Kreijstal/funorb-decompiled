/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kh extends uia {
    static String[][] field_l;
    private int field_i;
    private qea field_n;
    static String field_p;
    static String field_j;
    static String field_m;
    private int field_k;
    static String field_o;

    kh(byte[] param0) {
        super(param0);
    }

    final int j(int param0) {
        int fieldTemp$0 = 0;
        if (param0 >= -25) {
            this.field_i = 127;
            fieldTemp$0 = this.field_h;
            this.field_h = this.field_h + 1;
            return 255 & this.field_g[fieldTemp$0] + -this.field_n.b(104);
        }
        int fieldTemp$1 = this.field_h;
        this.field_h = this.field_h + 1;
        return 255 & this.field_g[fieldTemp$1] + -this.field_n.b(104);
    }

    final void a(byte param0, int param1, int param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int var5 = TombRacer.field_G ? 1 : 0;
        int var4 = 9 / ((-85 - param0) / 40);
        param1 = param1 & fca.field_b[param2];
        while (this.field_k < param2) {
            param2 = param2 - this.field_k;
            fieldTemp$0 = this.field_h;
            this.field_h = this.field_h + 1;
            this.field_g[fieldTemp$0] = (byte)(this.field_g[fieldTemp$0] + (param1 >>> param2));
            this.field_g[this.field_h] = (byte) 0;
            this.field_k = 8;
        }
        if (this.field_k != param2) {
            this.field_k = this.field_k - param2;
            this.field_g[this.field_h] = (byte)(this.field_g[this.field_h] + (param1 << this.field_k));
        } else {
            fieldTemp$1 = this.field_h;
            this.field_h = this.field_h + 1;
            this.field_g[fieldTemp$1] = (byte)(this.field_g[fieldTemp$1] + param1);
            this.field_g[this.field_h] = (byte) 0;
            this.field_k = 8;
            return;
        }
    }

    kh(int param0) {
        super(param0);
    }

    final void h(byte param0) {
        this.field_i = this.field_h * 8;
        int var2 = -117 % ((61 - param0) / 49);
    }

    final void i(int param0) {
        this.field_g[this.field_h] = (byte) 0;
        this.field_k = param0;
    }

    final void a(int param0, int[] param1) {
        try {
            this.field_n = new qea(param1);
            if (param0 != -26185) {
                this.b((byte) -116, 2);
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "kh.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int b(byte param0, int param1) {
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = TombRacer.field_G ? 1 : 0;
        var3 = this.field_i >> -579569853;
        var4 = 8 - (this.field_i & 7);
        var5 = 0;
        this.field_i = this.field_i + param1;
        if (param0 != 44) {
          field_m = (String) null;
          L0: while (true) {
            if (var4 >= param1) {
              L1: {
                if (var4 != param1) {
                  var5 = var5 + (this.field_g[var3] >> -param1 + var4 & fca.field_b[param1]);
                  break L1;
                } else {
                  var5 = var5 + (fca.field_b[var4] & this.field_g[var3]);
                  break L1;
                }
              }
              return var5;
            } else {
              incrementValue$2 = var3;
              var3++;
              var5 = var5 + ((fca.field_b[var4] & this.field_g[incrementValue$2]) << -var4 + param1);
              param1 = param1 - var4;
              var4 = 8;
              continue L0;
            }
          }
        } else {
          L2: while (true) {
            if (var4 >= param1) {
              L3: {
                if (var4 != param1) {
                  var5 = var5 + (this.field_g[var3] >> -param1 + var4 & fca.field_b[param1]);
                  break L3;
                } else {
                  var5 = var5 + (fca.field_b[var4] & this.field_g[var3]);
                  break L3;
                }
              }
              return var5;
            } else {
              incrementValue$3 = var3;
              var3++;
              var5 = var5 + ((fca.field_b[var4] & this.field_g[incrementValue$3]) << -var4 + param1);
              param1 = param1 - var4;
              var4 = 8;
              continue L2;
            }
          }
        }
    }

    final void i(byte param0) {
        this.field_h = (this.field_i + 7) / 8;
        if (param0 == 98) {
            return;
        }
        this.k(-21, -101);
    }

    final void j(int param0, int param1) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int fieldTemp$8 = 0;
        int fieldTemp$9 = 0;
        int var3;
        param0 = param0 & 15;
        if (param1 == 4) {
          var3 = this.field_k;
          if ((var3 ^ -1) == -5) {
            fieldTemp$0 = this.field_h;
            this.field_h = this.field_h + 1;
            this.field_g[fieldTemp$0] = (byte)(this.field_g[fieldTemp$0] + param0);
            this.field_g[this.field_h] = (byte) 0;
            this.field_k = 8;
            return;
          } else {
            if ((var3 ^ -1) == -4) {
              fieldTemp$1 = this.field_h;
              this.field_h = this.field_h + 1;
              this.field_g[fieldTemp$1] = (byte)(this.field_g[fieldTemp$1] + (param0 >>> 2057430785));
              this.field_g[this.field_h] = (byte)(param0 << 1646486855);
              this.field_k = 7;
              return;
            } else {
              if (var3 != 2) {
                if (-2 == (var3 ^ -1)) {
                  fieldTemp$2 = this.field_h;
                  this.field_h = this.field_h + 1;
                  this.field_g[fieldTemp$2] = (byte)(this.field_g[fieldTemp$2] + (param0 >>> -676205885));
                  this.field_g[this.field_h] = (byte)(param0 << -140099131);
                  this.field_k = 5;
                  return;
                } else {
                  if (var3 == 0) {
                    fieldTemp$3 = this.field_h;
                    this.field_h = this.field_h + 1;
                    this.field_g[fieldTemp$3] = (byte)(param0 << -572710012);
                    this.field_k = 4;
                    return;
                  } else {
                    this.field_k = this.field_k - 4;
                    this.field_g[this.field_h] = (byte)(this.field_g[this.field_h] + (param0 << this.field_k));
                    return;
                  }
                }
              } else {
                fieldTemp$4 = this.field_h;
                this.field_h = this.field_h + 1;
                this.field_g[fieldTemp$4] = (byte)(this.field_g[fieldTemp$4] + (param0 >>> -1826190686));
                this.field_g[this.field_h] = (byte)(param0 << -498940954);
                this.field_k = 6;
                return;
              }
            }
          }
        } else {
          field_p = (String) null;
          var3 = this.field_k;
          if ((var3 ^ -1) == -5) {
            fieldTemp$5 = this.field_h;
            this.field_h = this.field_h + 1;
            this.field_g[fieldTemp$5] = (byte)(this.field_g[fieldTemp$5] + param0);
            this.field_g[this.field_h] = (byte) 0;
            this.field_k = 8;
            return;
          } else {
            if ((var3 ^ -1) == -4) {
              fieldTemp$6 = this.field_h;
              this.field_h = this.field_h + 1;
              this.field_g[fieldTemp$6] = (byte)(this.field_g[fieldTemp$6] + (param0 >>> 2057430785));
              this.field_g[this.field_h] = (byte)(param0 << 1646486855);
              this.field_k = 7;
              return;
            } else {
              if (var3 != 2) {
                if (-2 == (var3 ^ -1)) {
                  fieldTemp$7 = this.field_h;
                  this.field_h = this.field_h + 1;
                  this.field_g[fieldTemp$7] = (byte)(this.field_g[fieldTemp$7] + (param0 >>> -676205885));
                  this.field_g[this.field_h] = (byte)(param0 << -140099131);
                  this.field_k = 5;
                  return;
                } else {
                  if (var3 == 0) {
                    fieldTemp$8 = this.field_h;
                    this.field_h = this.field_h + 1;
                    this.field_g[fieldTemp$8] = (byte)(param0 << -572710012);
                    this.field_k = 4;
                    return;
                  } else {
                    this.field_k = this.field_k - 4;
                    this.field_g[this.field_h] = (byte)(this.field_g[this.field_h] + (param0 << this.field_k));
                    return;
                  }
                }
              } else {
                fieldTemp$9 = this.field_h;
                this.field_h = this.field_h + 1;
                this.field_g[fieldTemp$9] = (byte)(this.field_g[fieldTemp$9] + (param0 >>> -1826190686));
                this.field_g[this.field_h] = (byte)(param0 << -498940954);
                this.field_k = 6;
                return;
              }
            }
          }
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3) {
        int fieldTemp$2 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            var6 = 80 / ((70 - param1) / 50);
            L1: while (true) {
              if (var5_int >= param3) {
                break L0;
              } else {
                fieldTemp$2 = this.field_h;
                this.field_h = this.field_h + 1;
                param2[param0 + var5_int] = (byte)(this.field_g[fieldTemp$2] + -this.field_n.b(120));
                var5_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("kh.M(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param3 + ')');
        }
    }

    final static void a(boolean param0, kia param1, kea param2) {
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 != qla.field_f) {
                break L1;
              } else {
                if (la.field_k == param1) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (param0) {
              L2: {
                qla.field_f = param2;
                la.field_k = param1;
                if (ska.field_r == la.field_k) {
                  if (qla.field_f == baa.field_e) {
                    baa.field_d.a(0, new ei[]{(ei) ((Object) kra.field_a)});
                    break L2;
                  } else {
                    if (tia.field_d == qla.field_f) {
                      baa.field_d.a(0, new ei[]{(ei) ((Object) paa.field_z)});
                      break L2;
                    } else {
                      if (qla.field_f == kva.field_s) {
                        baa.field_d.a(0, new ei[]{(ei) ((Object) laa.field_x)});
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                } else {
                  if (qla.field_f != baa.field_e) {
                    if (qla.field_f == tia.field_d) {
                      baa.field_d.a(0, new ei[]{(ei) ((Object) vea.field_c)});
                      break L2;
                    } else {
                      if (qla.field_f == kva.field_s) {
                        baa.field_d.a(0, new ei[]{(ei) ((Object) daa.field_d)});
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  } else {
                    baa.field_d.a(0, new ei[]{(ei) ((Object) nj.field_t)});
                    break L2;
                  }
                }
              }
              L3: {
                if (null != mq.field_e) {
                  mq.field_e.field_g = aia.e(5);
                  break L3;
                } else {
                  break L3;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var3);

            stackIn_28_1 = new StringBuilder().append("kh.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L4;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_31_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',');

            if (param2 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L5;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_29_0), stackIn_32_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final void k(int param0, int param1) {
        if (param1 != -2988) {
            return;
        }
        int fieldTemp$0 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$0] = (byte)(this.field_n.b(104) + param0);
    }

    public static void g(byte param0) {
        field_j = null;
        field_m = null;
        field_l = (String[][]) null;
        field_p = null;
        field_o = null;
        if (param0 == 0) {
            return;
        }
        field_j = (String) null;
    }

    final void k(int param0) {
        if (8 > this.field_k) {
            this.field_k = 8;
            this.field_h = this.field_h + 1;
            if (param0 == -1826190686) {
                return;
            }
            field_o = (String) null;
            return;
        }
        if (param0 == -1826190686) {
            return;
        }
        field_o = (String) null;
    }

    static {
        field_p = "Game";
        field_j = "Close";
        field_m = "Rumour has it these bags o' loot were abandoned by ancient smugglers. Now you can smuggle them out for points.";
        field_o = "Some players haven't unlocked the currently selected game options.<br>Please see the player list on the left for details.";
    }
}
