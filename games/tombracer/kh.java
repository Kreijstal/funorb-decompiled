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
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        if (param0 >= -25) {
          this.field_i = 127;
          fieldTemp$4 = this.field_h;
          this.field_h = this.field_h + 1;
          return 255 & this.field_g[fieldTemp$4] + -this.field_n.b(104);
        } else {
          fieldTemp$5 = this.field_h;
          this.field_h = this.field_h + 1;
          return 255 & this.field_g[fieldTemp$5] + -this.field_n.b(104);
        }
    }

    final void a(byte param0, int param1, int param2) {
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        var4 = 9 / ((-85 - param0) / 40);
        param1 = param1 & fca.field_b[param2];
        L0: while (true) {
          if (this.field_k >= param2) {
            if (this.field_k != param2) {
              this.field_k = this.field_k - param2;
              this.field_g[this.field_h] = (byte)(this.field_g[this.field_h] + (param1 << this.field_k));
              if (var5 != 0) {
                fieldTemp$3 = this.field_h;
                this.field_h = this.field_h + 1;
                this.field_g[fieldTemp$3] = (byte)(this.field_g[fieldTemp$3] + param1);
                this.field_g[this.field_h] = (byte) 0;
                this.field_k = 8;
                return;
              } else {
                return;
              }
            } else {
              fieldTemp$4 = this.field_h;
              this.field_h = this.field_h + 1;
              this.field_g[fieldTemp$4] = (byte)(this.field_g[fieldTemp$4] + param1);
              this.field_g[this.field_h] = (byte) 0;
              this.field_k = 8;
              return;
            }
          } else {
            param2 = param2 - this.field_k;
            fieldTemp$5 = this.field_h;
            this.field_h = this.field_h + 1;
            this.field_g[fieldTemp$5] = (byte)(this.field_g[fieldTemp$5] + (param1 >>> param2));
            this.field_g[this.field_h] = (byte) 0;
            this.field_k = 8;
            if (var5 == 0) {
              continue L0;
            } else {
              this.field_k = 8;
              return;
            }
          }
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
        int discarded$2 = 0;
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.field_n = new qea(param1);
              if (param0 == -26185) {
                break L1;
              } else {
                discarded$2 = this.b((byte) -116, 2);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("kh.G(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final int b(byte param0, int param1) {
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        var3 = this.field_i >> -579569853;
        var4 = 8 - (this.field_i & 7);
        var5 = 0;
        this.field_i = this.field_i + param1;
        if (param0 != 44) {
          field_m = (String) null;
          L0: while (true) {
            if (var4 < param1) {
              incrementValue$2 = var3;
              var3++;
              var5 = var5 + ((fca.field_b[var4] & this.field_g[incrementValue$2]) << -var4 + param1);
              param1 = param1 - var4;
              var4 = 8;
              if (var6 == 0) {
                continue L0;
              } else {
                var5 = var5 + (this.field_g[var3] >> -param1 + var4 & fca.field_b[param1]);
                return var5;
              }
            } else {
              L1: {
                L2: {
                  if (var4 != param1) {
                    break L2;
                  } else {
                    var5 = var5 + (fca.field_b[var4] & this.field_g[var3]);
                    if (var6 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var5 = var5 + (this.field_g[var3] >> -param1 + var4 & fca.field_b[param1]);
                break L1;
              }
              return var5;
            }
          }
        } else {
          L3: while (true) {
            if (var4 < param1) {
              incrementValue$3 = var3;
              var3++;
              var5 = var5 + ((fca.field_b[var4] & this.field_g[incrementValue$3]) << -var4 + param1);
              param1 = param1 - var4;
              var4 = 8;
              if (var6 == 0) {
                continue L3;
              } else {
                var5 = var5 + (this.field_g[var3] >> -param1 + var4 & fca.field_b[param1]);
                return var5;
              }
            } else {
              L4: {
                L5: {
                  if (var4 != param1) {
                    break L5;
                  } else {
                    var5 = var5 + (fca.field_b[var4] & this.field_g[var3]);
                    if (var6 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                var5 = var5 + (this.field_g[var3] >> -param1 + var4 & fca.field_b[param1]);
                break L4;
              }
              return var5;
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
        int fieldTemp$14 = 0;
        int fieldTemp$15 = 0;
        int fieldTemp$16 = 0;
        int fieldTemp$17 = 0;
        int fieldTemp$18 = 0;
        int fieldTemp$19 = 0;
        int fieldTemp$20 = 0;
        int fieldTemp$21 = 0;
        int fieldTemp$22 = 0;
        int fieldTemp$23 = 0;
        int fieldTemp$24 = 0;
        int fieldTemp$25 = 0;
        int fieldTemp$26 = 0;
        int fieldTemp$27 = 0;
        int var3 = 0;
        param0 = param0 & 15;
        if (param1 == 4) {
          var3 = this.field_k;
          if ((var3 ^ -1) != -5) {
            if ((var3 ^ -1) != -4) {
              if (var3 != 2) {
                if (-2 != (var3 ^ -1)) {
                  if (var3 == 0) {
                    fieldTemp$14 = this.field_h;
                    this.field_h = this.field_h + 1;
                    this.field_g[fieldTemp$14] = (byte)(param0 << -572710012);
                    this.field_k = 4;
                    return;
                  } else {
                    this.field_k = this.field_k - 4;
                    this.field_g[this.field_h] = (byte)(this.field_g[this.field_h] + (param0 << this.field_k));
                    return;
                  }
                } else {
                  fieldTemp$15 = this.field_h;
                  this.field_h = this.field_h + 1;
                  this.field_g[fieldTemp$15] = (byte)(this.field_g[fieldTemp$15] + (param0 >>> -676205885));
                  this.field_g[this.field_h] = (byte)(param0 << -140099131);
                  this.field_k = 5;
                  return;
                }
              } else {
                if (TombRacer.field_G) {
                  if (-2 != (var3 ^ -1)) {
                    if (var3 == 0) {
                      fieldTemp$16 = this.field_h;
                      this.field_h = this.field_h + 1;
                      this.field_g[fieldTemp$16] = (byte)(param0 << -572710012);
                      this.field_k = 4;
                      return;
                    } else {
                      this.field_k = this.field_k - 4;
                      this.field_g[this.field_h] = (byte)(this.field_g[this.field_h] + (param0 << this.field_k));
                      return;
                    }
                  } else {
                    fieldTemp$17 = this.field_h;
                    this.field_h = this.field_h + 1;
                    this.field_g[fieldTemp$17] = (byte)(this.field_g[fieldTemp$17] + (param0 >>> -676205885));
                    this.field_g[this.field_h] = (byte)(param0 << -140099131);
                    this.field_k = 5;
                    return;
                  }
                } else {
                  fieldTemp$18 = this.field_h;
                  this.field_h = this.field_h + 1;
                  this.field_g[fieldTemp$18] = (byte)(this.field_g[fieldTemp$18] + (param0 >>> -1826190686));
                  this.field_g[this.field_h] = (byte)(param0 << -498940954);
                  this.field_k = 6;
                  return;
                }
              }
            } else {
              fieldTemp$19 = this.field_h;
              this.field_h = this.field_h + 1;
              this.field_g[fieldTemp$19] = (byte)(this.field_g[fieldTemp$19] + (param0 >>> 2057430785));
              this.field_g[this.field_h] = (byte)(param0 << 1646486855);
              this.field_k = 7;
              return;
            }
          } else {
            fieldTemp$20 = this.field_h;
            this.field_h = this.field_h + 1;
            this.field_g[fieldTemp$20] = (byte)(this.field_g[fieldTemp$20] + param0);
            this.field_g[this.field_h] = (byte) 0;
            this.field_k = 8;
            return;
          }
        } else {
          field_p = (String) null;
          var3 = this.field_k;
          if ((var3 ^ -1) != -5) {
            if ((var3 ^ -1) != -4) {
              if (var3 == 2) {
                if (TombRacer.field_G) {
                  if (-2 != (var3 ^ -1)) {
                    if (var3 != 0) {
                      this.field_k = this.field_k - 4;
                      this.field_g[this.field_h] = (byte)(this.field_g[this.field_h] + (param0 << this.field_k));
                      return;
                    } else {
                      fieldTemp$21 = this.field_h;
                      this.field_h = this.field_h + 1;
                      this.field_g[fieldTemp$21] = (byte)(param0 << -572710012);
                      this.field_k = 4;
                      return;
                    }
                  } else {
                    fieldTemp$22 = this.field_h;
                    this.field_h = this.field_h + 1;
                    this.field_g[fieldTemp$22] = (byte)(this.field_g[fieldTemp$22] + (param0 >>> -676205885));
                    this.field_g[this.field_h] = (byte)(param0 << -140099131);
                    this.field_k = 5;
                    return;
                  }
                } else {
                  fieldTemp$23 = this.field_h;
                  this.field_h = this.field_h + 1;
                  this.field_g[fieldTemp$23] = (byte)(this.field_g[fieldTemp$23] + (param0 >>> -1826190686));
                  this.field_g[this.field_h] = (byte)(param0 << -498940954);
                  this.field_k = 6;
                  return;
                }
              } else {
                if (-2 != (var3 ^ -1)) {
                  if (var3 != 0) {
                    this.field_k = this.field_k - 4;
                    this.field_g[this.field_h] = (byte)(this.field_g[this.field_h] + (param0 << this.field_k));
                    return;
                  } else {
                    fieldTemp$24 = this.field_h;
                    this.field_h = this.field_h + 1;
                    this.field_g[fieldTemp$24] = (byte)(param0 << -572710012);
                    this.field_k = 4;
                    return;
                  }
                } else {
                  fieldTemp$25 = this.field_h;
                  this.field_h = this.field_h + 1;
                  this.field_g[fieldTemp$25] = (byte)(this.field_g[fieldTemp$25] + (param0 >>> -676205885));
                  this.field_g[this.field_h] = (byte)(param0 << -140099131);
                  this.field_k = 5;
                  return;
                }
              }
            } else {
              fieldTemp$26 = this.field_h;
              this.field_h = this.field_h + 1;
              this.field_g[fieldTemp$26] = (byte)(this.field_g[fieldTemp$26] + (param0 >>> 2057430785));
              this.field_g[this.field_h] = (byte)(param0 << 1646486855);
              this.field_k = 7;
              return;
            }
          } else {
            fieldTemp$27 = this.field_h;
            this.field_h = this.field_h + 1;
            this.field_g[fieldTemp$27] = (byte)(this.field_g[fieldTemp$27] + param0);
            this.field_g[this.field_h] = (byte) 0;
            this.field_k = 8;
            return;
          }
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3) {
        int fieldTemp$5 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            var6 = 80 / ((70 - param1) / 50);
            L1: while (true) {
              if (var5_int >= param3) {
                break L0;
              } else {
                fieldTemp$5 = this.field_h;
                this.field_h = this.field_h + 1;
                param2[param0 + var5_int] = (byte)(this.field_g[fieldTemp$5] + -this.field_n.b(120));
                var5_int++;
                if (var7 == 0) {
                  continue L1;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var5);
            stackOut_8_1 = new StringBuilder().append("kh.M(").append(param0).append(',').append(param1).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ')');
        }
    }

    final static void a(boolean param0, kia param1, kea param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
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
                L3: {
                  qla.field_f = param2;
                  la.field_k = param1;
                  if (ska.field_r == la.field_k) {
                    break L3;
                  } else {
                    L4: {
                      if (qla.field_f != baa.field_e) {
                        break L4;
                      } else {
                        baa.field_d.a(0, new ei[]{(ei) ((Object) nj.field_t)});
                        if (var4 == 0) {
                          break L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (qla.field_f == tia.field_d) {
                        break L5;
                      } else {
                        if (qla.field_f == kva.field_s) {
                          baa.field_d.a(0, new ei[]{(ei) ((Object) daa.field_d)});
                          if (var4 == 0) {
                            break L2;
                          } else {
                            break L5;
                          }
                        } else {
                          break L2;
                        }
                      }
                    }
                    baa.field_d.a(0, new ei[]{(ei) ((Object) vea.field_c)});
                    if (var4 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L6: {
                  if (qla.field_f == baa.field_e) {
                    break L6;
                  } else {
                    L7: {
                      if (tia.field_d == qla.field_f) {
                        break L7;
                      } else {
                        if (qla.field_f == kva.field_s) {
                          baa.field_d.a(0, new ei[]{(ei) ((Object) laa.field_x)});
                          if (var4 == 0) {
                            break L2;
                          } else {
                            break L7;
                          }
                        } else {
                          break L2;
                        }
                      }
                    }
                    baa.field_d.a(0, new ei[]{(ei) ((Object) paa.field_z)});
                    if (var4 == 0) {
                      break L2;
                    } else {
                      break L6;
                    }
                  }
                }
                baa.field_d.a(0, new ei[]{(ei) ((Object) kra.field_a)});
                break L2;
              }
              L8: {
                if (null != mq.field_e) {
                  mq.field_e.field_g = aia.e(5);
                  break L8;
                } else {
                  break L8;
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
          L9: {
            var3 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) (var3);
            stackOut_29_1 = new StringBuilder().append("kh.I(").append(param0).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L9;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L9;
            }
          }
          L10: {
            stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
            stackOut_32_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',');
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param2 == null) {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L10;
            } else {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L10;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ')');
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
        int fieldTemp$2 = 0;
        if (param1 != -2988) {
          return;
        } else {
          fieldTemp$2 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_g[fieldTemp$2] = (byte)(this.field_n.b(104) + param0);
          return;
        }
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
        if (8 <= this.field_k) {
          if (param0 == -1826190686) {
            return;
          } else {
            field_o = (String) null;
            return;
          }
        } else {
          this.field_k = 8;
          this.field_h = this.field_h + 1;
          if (param0 == -1826190686) {
            return;
          } else {
            field_o = (String) null;
            return;
          }
        }
    }

    static {
        field_p = "Game";
        field_j = "Close";
        field_m = "Rumour has it these bags o' loot were abandoned by ancient smugglers. Now you can smuggle them out for points.";
        field_o = "Some players haven't unlocked the currently selected game options.<br>Please see the player list on the left for details.";
    }
}
