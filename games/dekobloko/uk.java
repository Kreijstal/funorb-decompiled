/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class uk extends bh {
    int field_v;
    static java.math.BigInteger field_p;
    int field_o;
    int field_n;
    int field_r;
    int field_t;
    int field_w;
    int field_A;
    int field_u;
    pi[] field_q;
    static long[] field_x;
    static int[] field_z;
    static long[][] field_s;
    static String field_y;

    final void b(int param0, int param1) {
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
        int var14 = 0;
        pi var15_ref_pi = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        pi var19_ref_pi = null;
        pi var20 = null;
        int var21 = 0;
        uk var22 = null;
        pi var23 = null;
        pi var24 = null;
        pi var25 = null;
        pi var26 = null;
        var21 = client.field_A ? 1 : 0;
        if (param1 < this.field_n) {
          L0: {
            var22 = new uk();
            var22.field_v = this.field_v;
            var22.field_u = this.field_u;
            var22.field_A = this.field_A;
            var22.field_w = this.field_w;
            var22.field_r = this.field_r;
            var22.field_t = this.field_t;
            var22.field_q = new pi[this.field_t * this.field_A];
            if (this.field_A <= this.field_t) {
              var4 = ka.a((byte) 51, this.field_A * this.field_v, tf.field_cb) + this.field_v * (this.field_t - this.field_A) / 2;
              var5 = this.field_v * this.field_t - 1 + -var4;
              var6 = ka.a((byte) 56, this.field_A * (this.field_v * 2) - -1, tf.field_cb) + -(this.field_v * this.field_A);
              var22.field_n = (-(var6 / 6) + this.field_t * this.field_v / 2) * this.field_n / (this.field_t * this.field_v);
              this.field_n = this.field_n - var22.field_n;
              var7 = this.field_A * this.field_w;
              var8 = var7 * var7;
              var9 = 0;
              var10 = 0;
              L1: while (true) {
                if (this.field_A <= var10) {
                  break L0;
                } else {
                  var11 = this.field_t;
                  var12 = 0;
                  var13 = 0;
                  L2: while (true) {
                    if (this.field_w <= var13) {
                      L3: {
                        if (var12 <= this.field_t) {
                          break L3;
                        } else {
                          var12 = this.field_t;
                          break L3;
                        }
                      }
                      L4: {
                        if (var11 >= 0) {
                          break L4;
                        } else {
                          var11 = 0;
                          break L4;
                        }
                      }
                      var13 = var10;
                      var14 = this.field_A * var11;
                      L5: while (true) {
                        if (var13 >= var14) {
                          var14 = this.field_A * var12;
                          L6: while (true) {
                            if (var13 >= var14) {
                              var14 = this.field_A * this.field_t;
                              L7: while (true) {
                                if (var14 <= var13) {
                                  var15 = 0;
                                  L8: while (true) {
                                    if (var15 >= this.field_w) {
                                      var10++;
                                      continue L1;
                                    } else {
                                      var16 = ub.field_d[var15];
                                      var17 = var11 * this.field_v;
                                      var18 = var11;
                                      var19 = 0;
                                      L9: while (true) {
                                        L10: {
                                          if (var17 >= var16) {
                                            break L10;
                                          } else {
                                            var20 = var22.field_q[this.field_A * var18 + var10];
                                            L11: while (true) {
                                              if (this.field_v <= var19) {
                                                var18++;
                                                var19 = 0;
                                                continue L9;
                                              } else {
                                                if (var16 <= var17) {
                                                  break L10;
                                                } else {
                                                  if (me.field_J != var20) {
                                                    L12: {
                                                      if (var20 == null) {
                                                        var25 = new pi(this.field_w, this.field_v, 0);
                                                        var20 = var25;
                                                        an.a(var25.field_k, 0, this.field_w * this.field_v, (byte) 1);
                                                        var22.field_q[this.field_A * var18 + var10] = var25;
                                                        break L12;
                                                      } else {
                                                        break L12;
                                                      }
                                                    }
                                                    var20.field_k[var19 * this.field_w - -var15] = (byte) 0;
                                                    var19++;
                                                    var17++;
                                                    continue L11;
                                                  } else {
                                                    var19++;
                                                    var17++;
                                                    continue L11;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                        L13: while (true) {
                                          if (var12 <= var18) {
                                            var15++;
                                            continue L8;
                                          } else {
                                            var20 = this.field_q[var10 + this.field_A * var18];
                                            L14: while (true) {
                                              if (this.field_v <= var19) {
                                                var18++;
                                                var19 = 0;
                                                continue L13;
                                              } else {
                                                if (var20 != me.field_J) {
                                                  L15: {
                                                    if (var20 == null) {
                                                      var26 = new pi(this.field_w, this.field_v, 0);
                                                      var20 = var26;
                                                      an.a(var26.field_k, 0, this.field_w * this.field_v, (byte) 1);
                                                      this.field_q[var10 + var18 * this.field_A] = var26;
                                                      break L15;
                                                    } else {
                                                      break L15;
                                                    }
                                                  }
                                                  var20.field_k[var15 + this.field_w * var19] = (byte) 0;
                                                  var17++;
                                                  var19++;
                                                  continue L14;
                                                } else {
                                                  var17++;
                                                  var19++;
                                                  continue L14;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  var22.field_q[var13] = this.field_q[var13];
                                  this.field_q[var13] = me.field_J;
                                  var13 = var13 + this.field_A;
                                  continue L7;
                                }
                              }
                            } else {
                              L16: {
                                var15_ref_pi = this.field_q[var13];
                                if (var15_ref_pi == null) {
                                  break L16;
                                } else {
                                  if (me.field_J == var15_ref_pi) {
                                    break L16;
                                  } else {
                                    var15_ref_pi = var15_ref_pi.b();
                                    break L16;
                                  }
                                }
                              }
                              var22.field_q[var13] = var15_ref_pi;
                              var13 = var13 + this.field_A;
                              continue L6;
                            }
                          }
                        } else {
                          var22.field_q[var13] = me.field_J;
                          var13 = var13 + this.field_A;
                          continue L5;
                        }
                      }
                    } else {
                      L17: {
                        var14 = var4 - (-(var9 * (-var4 + var5) / var7) - var9 * var6 * (var7 - var9) / var8);
                        ub.field_d[var13] = var14;
                        if (var11 <= var14 / this.field_v) {
                          break L17;
                        } else {
                          var11 = var14 / this.field_v;
                          break L17;
                        }
                      }
                      var9++;
                      if ((this.field_v + var14 - 1) / this.field_v > var12) {
                        var12 = (-1 + this.field_v + var14) / this.field_v;
                        var13++;
                        continue L2;
                      } else {
                        var13++;
                        continue L2;
                      }
                    }
                  }
                }
              }
            } else {
              var4 = ka.a((byte) 53, this.field_w * this.field_t, tf.field_cb) - -(this.field_w * (this.field_A + -this.field_t) / 2);
              var5 = -1 + (this.field_A * this.field_w - var4);
              var6 = ka.a((byte) 117, 1 + 2 * this.field_t * this.field_w, tf.field_cb) - this.field_t * this.field_w;
              var22.field_n = (this.field_A * this.field_w / 2 - var6 / 6) * this.field_n / (this.field_w * this.field_A);
              this.field_n = this.field_n - var22.field_n;
              var7 = this.field_t * this.field_v;
              var8 = var7 * var7;
              var9 = 0;
              var10 = 0;
              L18: while (true) {
                if (this.field_t <= var10) {
                  break L0;
                } else {
                  var11 = this.field_A;
                  var12 = 0;
                  var13 = 0;
                  L19: while (true) {
                    if (this.field_v <= var13) {
                      L20: {
                        if (var11 >= 0) {
                          break L20;
                        } else {
                          var11 = 0;
                          break L20;
                        }
                      }
                      L21: {
                        if (var12 <= this.field_A) {
                          break L21;
                        } else {
                          var12 = this.field_A;
                          break L21;
                        }
                      }
                      var13 = var10 * this.field_A;
                      var14 = 0;
                      L22: while (true) {
                        if (var11 <= var14) {
                          var14 = var11;
                          L23: while (true) {
                            if (var12 <= var14) {
                              var14 = var12;
                              L24: while (true) {
                                if (this.field_A <= var14) {
                                  var14 = 0;
                                  L25: while (true) {
                                    if (this.field_v <= var14) {
                                      var10++;
                                      continue L18;
                                    } else {
                                      var15 = ub.field_d[var14];
                                      var16 = this.field_w * var11;
                                      var17 = var11;
                                      var18 = 0;
                                      L26: while (true) {
                                        L27: {
                                          if (var16 >= var15) {
                                            break L27;
                                          } else {
                                            var19_ref_pi = var22.field_q[var10 * this.field_A + var17];
                                            L28: while (true) {
                                              if (var18 >= this.field_w) {
                                                var17++;
                                                var18 = 0;
                                                continue L26;
                                              } else {
                                                if (var16 < var15) {
                                                  if (var19_ref_pi != me.field_J) {
                                                    L29: {
                                                      if (var19_ref_pi == null) {
                                                        var23 = new pi(this.field_w, this.field_v, 0);
                                                        var19_ref_pi = var23;
                                                        an.a(var23.field_k, 0, this.field_w * this.field_v, (byte) 1);
                                                        var22.field_q[var17 + this.field_A * var10] = var23;
                                                        break L29;
                                                      } else {
                                                        break L29;
                                                      }
                                                    }
                                                    var19_ref_pi.field_k[var18 + var14 * this.field_w] = (byte) 0;
                                                    var16++;
                                                    var18++;
                                                    continue L28;
                                                  } else {
                                                    var16++;
                                                    var18++;
                                                    continue L28;
                                                  }
                                                } else {
                                                  break L27;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        L30: while (true) {
                                          if (var17 >= var12) {
                                            var14++;
                                            continue L25;
                                          } else {
                                            var19_ref_pi = this.field_q[var17 + this.field_A * var10];
                                            L31: while (true) {
                                              if (this.field_w <= var18) {
                                                var17++;
                                                var18 = 0;
                                                continue L30;
                                              } else {
                                                if (me.field_J != var19_ref_pi) {
                                                  L32: {
                                                    if (var19_ref_pi != null) {
                                                      break L32;
                                                    } else {
                                                      var24 = new pi(this.field_w, this.field_v, 0);
                                                      var19_ref_pi = var24;
                                                      an.a(var24.field_k, 0, this.field_w * this.field_v, (byte) 1);
                                                      this.field_q[this.field_A * var10 + var17] = var24;
                                                      break L32;
                                                    }
                                                  }
                                                  var19_ref_pi.field_k[var14 * this.field_w + var18] = (byte) 0;
                                                  var18++;
                                                  var16++;
                                                  continue L31;
                                                } else {
                                                  var18++;
                                                  var16++;
                                                  continue L31;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  var22.field_q[var13 + var14] = this.field_q[var14 + var13];
                                  this.field_q[var14 + var13] = me.field_J;
                                  var14++;
                                  continue L24;
                                }
                              }
                            } else {
                              L33: {
                                var15_ref_pi = this.field_q[var13 - -var14];
                                if (var15_ref_pi == null) {
                                  break L33;
                                } else {
                                  if (me.field_J != var15_ref_pi) {
                                    var15_ref_pi = var15_ref_pi.b();
                                    break L33;
                                  } else {
                                    break L33;
                                  }
                                }
                              }
                              var22.field_q[var14 + var13] = var15_ref_pi;
                              var14++;
                              continue L23;
                            }
                          }
                        } else {
                          var22.field_q[var13 - -var14] = me.field_J;
                          var14++;
                          continue L22;
                        }
                      }
                    } else {
                      L34: {
                        var14 = var4 + (var9 * (var5 - var4) / var7 - -((var7 + -var9) * (var9 * var6) / var8));
                        ub.field_d[var13] = var14;
                        var9++;
                        if (var11 > var14 / this.field_w) {
                          var11 = var14 / this.field_w;
                          break L34;
                        } else {
                          break L34;
                        }
                      }
                      if ((this.field_w + var14 + -1) / this.field_w > var12) {
                        var12 = (var14 - (-this.field_w + 1)) / this.field_w;
                        var13++;
                        continue L19;
                      } else {
                        var13++;
                        continue L19;
                      }
                    }
                  }
                }
              }
            }
          }
          this.d((byte) 116);
          var22.d((byte) -110);
          var22.field_b = this.field_b;
          var22.field_a = (bh) (this);
          var22.field_a.field_b = (bh) ((Object) var22);
          var22.field_b.field_a = (bh) ((Object) var22);
          this.b(11976, param1);
          var22.b(param0, param1);
          return;
        } else {
          return;
        }
    }

    final static boolean c(byte param0) {
        boolean discarded$0 = false;
        if (param0 != -17) {
            discarded$0 = uk.c((byte) 22);
        }
        return pa.field_V == ka.field_P ? true : false;
    }

    public static void c(int param0) {
        field_x = null;
        field_z = null;
        field_s = (long[][]) null;
        field_y = null;
        field_p = null;
    }

    final static boolean a(int param0) {
        return u.field_i != null && u.field_i.g((byte) -104) != null;
    }

    private final void d(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        pi[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = client.field_A ? 1 : 0;
        var2 = 0;
        var3 = this.field_A;
        var4 = 0;
        var5 = this.field_t;
        L0: while (true) {
          L1: {
            if (var4 >= var5) {
              break L1;
            } else {
              var5--;
              var6 = var2;
              L2: while (true) {
                if (var6 >= var3) {
                  continue L0;
                } else {
                  if (this.field_q[var5 * this.field_A + var6] == me.field_J) {
                    var6++;
                    continue L2;
                  } else {
                    var5++;
                    break L1;
                  }
                }
              }
            }
          }
          var6 = 32 / ((-48 - param0) / 43);
          L3: while (true) {
            L4: {
              if (var5 <= var4) {
                break L4;
              } else {
                var7 = var2;
                L5: while (true) {
                  if (var7 >= var3) {
                    var4++;
                    continue L3;
                  } else {
                    if (me.field_J != this.field_q[var4 * this.field_A + var7]) {
                      break L4;
                    } else {
                      var7++;
                      continue L5;
                    }
                  }
                }
              }
            }
            L6: while (true) {
              L7: {
                if (var3 <= var2) {
                  break L7;
                } else {
                  var3--;
                  var7 = var4;
                  L8: while (true) {
                    if (var7 >= var5) {
                      continue L6;
                    } else {
                      if (this.field_q[var3 + this.field_A * var7] == me.field_J) {
                        var7++;
                        continue L8;
                      } else {
                        var3++;
                        break L7;
                      }
                    }
                  }
                }
              }
              L9: while (true) {
                L10: {
                  if (var2 >= var3) {
                    break L10;
                  } else {
                    var7 = var4;
                    L11: while (true) {
                      if (var7 >= var5) {
                        var2++;
                        continue L9;
                      } else {
                        if (me.field_J == this.field_q[var2 + this.field_A * var7]) {
                          var7++;
                          continue L11;
                        } else {
                          break L10;
                        }
                      }
                    }
                  }
                }
                L12: {
                  L13: {
                    if (0 < var2) {
                      break L13;
                    } else {
                      if (this.field_A > var3) {
                        break L13;
                      } else {
                        if (0 < var4) {
                          break L13;
                        } else {
                          if (this.field_t <= var5) {
                            break L12;
                          } else {
                            break L13;
                          }
                        }
                      }
                    }
                  }
                  var7 = var3 - var2;
                  var8 = -var4 + var5;
                  var9 = new pi[var7 * var8];
                  var10 = 0;
                  L14: while (true) {
                    if (var8 <= var10) {
                      this.field_u = this.field_u + var4;
                      this.field_A = var7;
                      this.field_t = var8;
                      this.field_r = this.field_r + var2;
                      this.field_q = var9;
                      break L12;
                    } else {
                      var11 = 0;
                      L15: while (true) {
                        if (var7 <= var11) {
                          var10++;
                          continue L14;
                        } else {
                          var9[var11 + var10 * var7] = this.field_q[(var10 + var4) * this.field_A - (-var2 + -var11)];
                          var11++;
                          continue L15;
                        }
                      }
                    }
                  }
                }
                return;
              }
            }
          }
        }
    }

    uk() {
    }

    static {
        $cfr$clinit: {
            int var0 = 0;
            int var1 = 0;
            long var2 = 0L;
            long var4 = 0L;
            long var6 = 0L;
            long var8 = 0L;
            long var10 = 0L;
            long var12 = 0L;
            int var14 = 0;
            long stackIn_5_0 = 0L;
            long stackOut_4_0 = 0L;
            long stackOut_3_0 = 0L;
            field_p = new java.math.BigInteger("5310912063297495478553641123693449235360468751811777390870270963987710371224156884502621501050200179816961688682009016606074804867537391338554395920568991");
            field_z = new int[8192];
            field_x = new long[11];
            field_s = new long[8][256];
            var0 = 0;
            L0: while (true) {
              if (256 <= var0) {
                field_x[0] = 0L;
                var0 = 1;
                L1: while (true) {
                  if (10 < var0) {
                    field_y = "Passwords can only contain letters and numbers";
                    break $cfr$clinit;
                  } else {
                    var1 = (-1 + var0) * 8;
                    field_x[var0] = pj.a(jg.a(255L, field_s[7][7 + var1]), pj.a(pj.a(pj.a(pj.a(pj.a(pj.a(jg.a(field_s[1][var1 - -1], 71776119061217280L), jg.a(field_s[0][var1], -72057594037927936L)), jg.a(field_s[2][2 + var1], 280375465082880L)), jg.a(1095216660480L, field_s[3][var1 - -3])), jg.a(4278190080L, field_s[4][var1 - -4])), jg.a(16711680L, field_s[5][var1 - -5])), jg.a(65280L, field_s[6][var1 - -6])));
                    var0++;
                    continue L1;
                  }
                }
              } else {
                L2: {
                  var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
                  if (0 != (1 & var0)) {
                    stackOut_4_0 = (long)(var1 & 255);
                    stackIn_5_0 = stackOut_4_0;
                    break L2;
                  } else {
                    stackOut_3_0 = (long)(var1 >>> 8);
                    stackIn_5_0 = stackOut_3_0;
                    break L2;
                  }
                }
                L3: {
                  var2 = stackIn_5_0;
                  var4 = var2 << 1;
                  if (var4 >= 256L) {
                    var4 = var4 ^ 285L;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  var6 = var4 << 1;
                  if (var6 < 256L) {
                    break L4;
                  } else {
                    var6 = var6 ^ 285L;
                    break L4;
                  }
                }
                L5: {
                  var8 = var2 ^ var6;
                  var10 = var6 << 1;
                  if (var10 < 256L) {
                    break L5;
                  } else {
                    var10 = var10 ^ 285L;
                    break L5;
                  }
                }
                var12 = var10 ^ var2;
                field_s[0][var0] = jj.a(jj.a(jj.a(var8 << 16, jj.a(var10 << 24, jj.a(jj.a(var6 << 40, jj.a(var2 << 48, var2 << 56)), var2 << 32))), var4 << 8), var12);
                var14 = 1;
                L6: while (true) {
                  if (var14 >= 8) {
                    var0++;
                    continue L0;
                  } else {
                    field_s[var14][var0] = jj.a(field_s[var14 + -1][var0] >>> 8, field_s[var14 + -1][var0] << 56);
                    var14++;
                    continue L6;
                  }
                }
              }
            }
        }
    }
}
