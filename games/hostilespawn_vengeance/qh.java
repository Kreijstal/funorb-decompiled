/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qh {
    private boolean field_r;
    private int field_b;
    static int field_e;
    private int field_a;
    static boolean[] field_m;
    private int field_t;
    static int field_q;
    static bd field_l;
    private int field_v;
    private boolean[][] field_n;
    private int[][] field_h;
    static int field_s;
    private int field_i;
    static int field_u;
    private int[][] field_o;
    static String field_x;
    private int field_p;
    static int field_k;
    private int[][] field_w;
    static bd field_g;
    private int field_f;
    static String field_c;
    private boolean[][] field_d;
    private int field_j;

    private final byte[] c(int param0) {
        int var6 = 0;
        int var2 = 0;
        int var3 = 0;
        int var7 = HostileSpawn.field_I ? 1 : 0;
        int var4 = param0;
        byte[] var5 = new byte[60000];
        for (var6 = 0; var6 < 10000; var6++) {
            var2 = var6 % 100;
            var3 = var6 / 100;
            int incrementValue$0 = var4;
            var4++;
            var5[incrementValue$0] = (byte)(((qh) this).field_o[var2][var3] % 64);
            int incrementValue$1 = var4;
            var4++;
            var5[incrementValue$1] = (byte)(((qh) this).field_o[var2][var3] / 64);
            int incrementValue$2 = var4;
            var4++;
            var5[incrementValue$2] = (byte)(!((qh) this).field_n[var2][var3] ? 0 : 1);
            int incrementValue$3 = var4;
            var4++;
            var5[incrementValue$3] = (byte)(((qh) this).field_h[var2][var3] + 5);
            int incrementValue$4 = var4;
            var4++;
            var5[incrementValue$4] = (byte)((qh) this).field_w[var2][var3];
            int incrementValue$5 = var4;
            var4++;
            var5[incrementValue$5] = (byte)(!((qh) this).field_d[var2][var3] ? 0 : 1);
        }
        return var5;
    }

    final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = HostileSpawn.field_I ? 1 : 0;
          var4 = 1;
          var5 = 1;
          if (0 == ((qh) this).field_i) {
            var4 = 1;
            var5 = 1;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (((qh) this).field_i != 1) {
            break L1;
          } else {
            var5 = 2;
            var4 = 2;
            break L1;
          }
        }
        L2: {
          if (((qh) this).field_i == 2) {
            var5 = 2;
            var4 = 3;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (3 == ((qh) this).field_i) {
            var5 = 3;
            var4 = 3;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (((qh) this).field_i != 4) {
            break L4;
          } else {
            var5 = 4;
            var4 = 4;
            break L4;
          }
        }
        L5: {
          if (param0 == -99) {
            break L5;
          } else {
            ((qh) this).b((byte) 53);
            break L5;
          }
        }
        L6: {
          if (5 != ((qh) this).field_i) {
            break L6;
          } else {
            var4 = 5;
            var5 = 5;
            break L6;
          }
        }
        L7: {
          if (0 <= ((qh) this).field_a) {
            var6 = 0;
            L8: while (true) {
              if (100 <= var6) {
                break L7;
              } else {
                var7 = 0;
                L9: while (true) {
                  if (100 <= var7) {
                    var6++;
                    continue L8;
                  } else {
                    L10: {
                      L11: {
                        L12: {
                          var2 = 16 * var6 + -((qh) this).field_t;
                          var3 = 16 * var7 - ((qh) this).field_f;
                          pk.field_d[((qh) this).field_o[var6][var7] % 320].e(var2, var3);
                          if (0 != ((qh) this).field_a) {
                            break L12;
                          } else {
                            if (((qh) this).field_w[var6][var7] == 0) {
                              break L11;
                            } else {
                              break L12;
                            }
                          }
                        }
                        if (((qh) this).field_w[var6][var7] != 3) {
                          break L10;
                        } else {
                          if (((qh) this).field_n[var6][var7]) {
                            break L11;
                          } else {
                            break L10;
                          }
                        }
                      }
                      si.c(var2, var3, 16, 16, 0);
                      break L10;
                    }
                    var7++;
                    continue L9;
                  }
                }
              }
            }
          } else {
            break L7;
          }
        }
        var6 = 0;
        L13: while (true) {
          if (var6 >= 100) {
            L14: {
              if (((qh) this).field_a == 1) {
                var6 = 0;
                L15: while (true) {
                  if (100 <= var6) {
                    break L14;
                  } else {
                    var7 = 0;
                    L16: while (true) {
                      if (var7 >= 100) {
                        var6++;
                        continue L15;
                      } else {
                        L17: {
                          L18: {
                            var2 = -((qh) this).field_t + var6 * 16;
                            var3 = -((qh) this).field_f + var7 * 16;
                            if (((qh) this).field_w[var6][var7] == 0) {
                              break L18;
                            } else {
                              if (((qh) this).field_w[var6][var7] != 3) {
                                break L17;
                              } else {
                                if (((qh) this).field_n[var6][var7]) {
                                  break L18;
                                } else {
                                  break L17;
                                }
                              }
                            }
                          }
                          si.c(var2, var3, 16, 16, 0);
                          break L17;
                        }
                        L19: {
                          if (((qh) this).field_n[var6][var7]) {
                            si.a(var2, var3, 16, 16, 16711680, 128);
                            break L19;
                          } else {
                            break L19;
                          }
                        }
                        var7++;
                        continue L16;
                      }
                    }
                  }
                }
              } else {
                break L14;
              }
            }
            L20: {
              if (((qh) this).field_a != 2) {
                break L20;
              } else {
                var6 = 0;
                L21: while (true) {
                  if (var6 >= 100) {
                    break L20;
                  } else {
                    var7 = 0;
                    L22: while (true) {
                      if (var7 >= 100) {
                        var6++;
                        continue L21;
                      } else {
                        L23: {
                          var3 = 16 * var7 - ((qh) this).field_f;
                          var2 = 16 * var6 - ((qh) this).field_t;
                          if (((qh) this).field_w[var6][var7] != 0) {
                            break L23;
                          } else {
                            si.a(var2, var3, 16, 16, 16711680, 128);
                            break L23;
                          }
                        }
                        L24: {
                          if (((qh) this).field_w[var6][var7] != 1) {
                            break L24;
                          } else {
                            si.a(var2, var3, 16, 16, 16776960, 128);
                            break L24;
                          }
                        }
                        L25: {
                          if (((qh) this).field_w[var6][var7] == 2) {
                            si.a(var2, var3, 16, 16, 65280, 128);
                            break L25;
                          } else {
                            break L25;
                          }
                        }
                        L26: {
                          if (((qh) this).field_w[var6][var7] != 3) {
                            break L26;
                          } else {
                            si.a(var2, var3, 16, 16, 255, 128);
                            break L26;
                          }
                        }
                        var7++;
                        continue L22;
                      }
                    }
                  }
                }
              }
            }
            L27: {
              if (3 == ((qh) this).field_a) {
                var6 = 0;
                L28: while (true) {
                  if (var6 >= 100) {
                    break L27;
                  } else {
                    var7 = 0;
                    L29: while (true) {
                      if (var7 >= 100) {
                        var6++;
                        continue L28;
                      } else {
                        L30: {
                          var2 = -((qh) this).field_t + 16 * var6;
                          var3 = 16 * var7 + -((qh) this).field_f;
                          if (((qh) this).field_w[var6][var7] != 0) {
                            break L30;
                          } else {
                            si.c(var2, var3, 16, 16, 0);
                            break L30;
                          }
                        }
                        L31: {
                          L32: {
                            if (((qh) this).field_w[var6][var7] == 0) {
                              break L32;
                            } else {
                              if (((qh) this).field_w[var6][var7] != 3) {
                                break L31;
                              } else {
                                if (((qh) this).field_n[var6][var7]) {
                                  break L32;
                                } else {
                                  break L31;
                                }
                              }
                            }
                          }
                          si.c(var2, var3, 16, 16, 0);
                          break L31;
                        }
                        L33: {
                          if (!((qh) this).field_d[var6][var7]) {
                            break L33;
                          } else {
                            si.a(var2, var3, 16, 16, 65535, 128);
                            break L33;
                          }
                        }
                        var7++;
                        continue L29;
                      }
                    }
                  }
                }
              } else {
                break L27;
              }
            }
            L34: {
              var3 = ((qh) this).field_p * 16 + -((qh) this).field_f;
              var2 = -((qh) this).field_t + ((qh) this).field_j * 16;
              si.a(var2, var3, 16 * var4, var5 * 16, 16777215);
              if (((qh) this).field_r) {
                si.a(0, 0, 640, 480, 0, 128);
                var6 = 0;
                L35: while (true) {
                  if (var6 >= 8) {
                    var2 = 16 * ((qh) this).field_j;
                    var3 = ((qh) this).field_p * 16;
                    si.a(var2, var3, var4 * 16, var5 * 16, 16777215);
                    break L34;
                  } else {
                    var7 = 0;
                    L36: while (true) {
                      if (var7 >= 20) {
                        var6++;
                        continue L35;
                      } else {
                        L37: {
                          var2 = 16 * var6;
                          var3 = var7 * 16;
                          if (var7 * 8 + var6 >= 160) {
                            break L37;
                          } else {
                            pk.field_d[var6 + 8 * var7].e(var2, var3);
                            break L37;
                          }
                        }
                        L38: {
                          var2 += 144;
                          if (var7 * 8 + var6 < 160) {
                            pk.field_d[160 + 8 * var7 + var6].e(var2, var3);
                            break L38;
                          } else {
                            break L38;
                          }
                        }
                        var7++;
                        continue L36;
                      }
                    }
                  }
                }
              } else {
                break L34;
              }
            }
            return;
          } else {
            var7 = 0;
            L39: while (true) {
              if (100 <= var7) {
                var6++;
                continue L13;
              } else {
                L40: {
                  var2 = (int)((double)(var6 * 16 - ((qh) this).field_t) + Math.random() * 3.0 - 1.0);
                  var3 = (int)((double)(-((qh) this).field_f + 16 * var7) + Math.random() * 3.0 - 1.0);
                  var8 = -1;
                  if (((qh) this).field_h[var6][var7] < 1) {
                    break L40;
                  } else {
                    if (((qh) this).field_h[var6][var7] > 6) {
                      break L40;
                    } else {
                      var8 = -1 + (((qh) this).field_h[var6][var7] + 128);
                      break L40;
                    }
                  }
                }
                L41: {
                  if (((qh) this).field_h[var6][var7] == 7) {
                    var8 = 134;
                    break L41;
                  } else {
                    break L41;
                  }
                }
                L42: {
                  if (((qh) this).field_h[var6][var7] == 8) {
                    var8 = 135;
                    break L42;
                  } else {
                    break L42;
                  }
                }
                L43: {
                  if (((qh) this).field_h[var6][var7] == 9) {
                    var8 = 142;
                    break L43;
                  } else {
                    break L43;
                  }
                }
                L44: {
                  if (10 != ((qh) this).field_h[var6][var7]) {
                    break L44;
                  } else {
                    var8 = 143;
                    break L44;
                  }
                }
                L45: {
                  if (13 != ((qh) this).field_h[var6][var7]) {
                    break L45;
                  } else {
                    var8 = 121;
                    break L45;
                  }
                }
                L46: {
                  if (((qh) this).field_h[var6][var7] != 14) {
                    break L46;
                  } else {
                    var8 = 154;
                    break L46;
                  }
                }
                L47: {
                  if (((qh) this).field_h[var6][var7] == 15) {
                    var8 = 138;
                    break L47;
                  } else {
                    break L47;
                  }
                }
                L48: {
                  if (19 != ((qh) this).field_h[var6][var7]) {
                    break L48;
                  } else {
                    var8 = 98;
                    break L48;
                  }
                }
                L49: {
                  if (((qh) this).field_h[var6][var7] == 20) {
                    var8 = 106;
                    break L49;
                  } else {
                    break L49;
                  }
                }
                L50: {
                  if (((qh) this).field_h[var6][var7] != 21) {
                    break L50;
                  } else {
                    var8 = 158;
                    break L50;
                  }
                }
                L51: {
                  if (((qh) this).field_h[var6][var7] >= 0) {
                    break L51;
                  } else {
                    var8 = 29;
                    break L51;
                  }
                }
                L52: {
                  if (((qh) this).field_h[var6][var7] != 22) {
                    break L52;
                  } else {
                    var8 = 150;
                    break L52;
                  }
                }
                L53: {
                  if (((qh) this).field_h[var6][var7] == 11) {
                    var8 = 114;
                    break L53;
                  } else {
                    break L53;
                  }
                }
                L54: {
                  if (((qh) this).field_h[var6][var7] != 12) {
                    break L54;
                  } else {
                    var8 = 120;
                    break L54;
                  }
                }
                L55: {
                  if (16 == ((qh) this).field_h[var6][var7]) {
                    var8 = 137;
                    break L55;
                  } else {
                    break L55;
                  }
                }
                L56: {
                  if (((qh) this).field_h[var6][var7] != 17) {
                    break L56;
                  } else {
                    var8 = 136;
                    break L56;
                  }
                }
                L57: {
                  if (((qh) this).field_h[var6][var7] == 18) {
                    var8 = 122;
                    break L57;
                  } else {
                    break L57;
                  }
                }
                L58: {
                  if (23 != ((qh) this).field_h[var6][var7]) {
                    break L58;
                  } else {
                    var8 = 151;
                    break L58;
                  }
                }
                L59: {
                  if (((qh) this).field_h[var6][var7] == 24) {
                    var8 = 159;
                    break L59;
                  } else {
                    break L59;
                  }
                }
                L60: {
                  if (var8 == -1) {
                    break L60;
                  } else {
                    pk.field_d[var8].b(var2, var3, 128);
                    break L60;
                  }
                }
                var7++;
                continue L39;
              }
            }
          }
        }
    }

    private final int a(int param0) {
        int var2 = 0;
        L0: {
          if (param0 == 28222) {
            break L0;
          } else {
            boolean discarded$1 = qh.a('(', -94);
            break L0;
          }
        }
        L1: {
          var2 = -1;
          if (((qh) this).field_b == 128) {
            var2 = 1;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (((qh) this).field_b == 129) {
            var2 = 2;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (130 != ((qh) this).field_b) {
            break L3;
          } else {
            var2 = 3;
            break L3;
          }
        }
        L4: {
          if (131 != ((qh) this).field_b) {
            break L4;
          } else {
            var2 = 4;
            break L4;
          }
        }
        L5: {
          if (((qh) this).field_b != 132) {
            break L5;
          } else {
            var2 = 5;
            break L5;
          }
        }
        L6: {
          if (((qh) this).field_b == 133) {
            var2 = 6;
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          if (((qh) this).field_b == 134) {
            var2 = 7;
            break L7;
          } else {
            break L7;
          }
        }
        L8: {
          if (((qh) this).field_b != 135) {
            break L8;
          } else {
            var2 = 8;
            break L8;
          }
        }
        L9: {
          if (((qh) this).field_b != 142) {
            break L9;
          } else {
            var2 = 9;
            break L9;
          }
        }
        L10: {
          if (((qh) this).field_b != 143) {
            break L10;
          } else {
            var2 = 10;
            break L10;
          }
        }
        L11: {
          if (((qh) this).field_b == 121) {
            var2 = 13;
            break L11;
          } else {
            break L11;
          }
        }
        L12: {
          if (154 != ((qh) this).field_b) {
            break L12;
          } else {
            var2 = 14;
            break L12;
          }
        }
        L13: {
          if (((qh) this).field_b != 138) {
            break L13;
          } else {
            var2 = 15;
            break L13;
          }
        }
        L14: {
          if (((qh) this).field_b != 98) {
            break L14;
          } else {
            var2 = 19;
            break L14;
          }
        }
        L15: {
          if (106 != ((qh) this).field_b) {
            break L15;
          } else {
            var2 = 20;
            break L15;
          }
        }
        L16: {
          if (((qh) this).field_b == 158) {
            var2 = 21;
            break L16;
          } else {
            break L16;
          }
        }
        L17: {
          if (((qh) this).field_b != 150) {
            break L17;
          } else {
            var2 = 22;
            break L17;
          }
        }
        L18: {
          if (114 != ((qh) this).field_b) {
            break L18;
          } else {
            var2 = 11;
            break L18;
          }
        }
        L19: {
          if (((qh) this).field_b == 120) {
            var2 = 12;
            break L19;
          } else {
            break L19;
          }
        }
        L20: {
          if (((qh) this).field_b == 137) {
            var2 = 16;
            break L20;
          } else {
            break L20;
          }
        }
        L21: {
          if (136 != ((qh) this).field_b) {
            break L21;
          } else {
            var2 = 17;
            break L21;
          }
        }
        L22: {
          if (((qh) this).field_b != 122) {
            break L22;
          } else {
            var2 = 18;
            break L22;
          }
        }
        L23: {
          if (((qh) this).field_b == 151) {
            var2 = 23;
            break L23;
          } else {
            break L23;
          }
        }
        L24: {
          if (((qh) this).field_b == 159) {
            var2 = 24;
            break L24;
          } else {
            break L24;
          }
        }
        return var2;
    }

    final static void a(int param0, int param1, int param2) {
        int var3 = 0;
        L0: {
          L1: {
            if (rg.field_d == null) {
              break L1;
            } else {
              if (param0 > rg.field_d.length) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          rg.field_d = new int[2 * param0];
          break L0;
        }
        L2: {
          L3: {
            var3 = 0;
            if (qa.field_d == null) {
              break L3;
            } else {
              if (qa.field_d.length >= param0) {
                break L2;
              } else {
                break L3;
              }
            }
          }
          qa.field_d = new int[param0 * 2];
          break L2;
        }
        L4: {
          L5: {
            if (null == ta.field_mb) {
              break L5;
            } else {
              if (ta.field_mb.length < param0) {
                break L5;
              } else {
                break L4;
              }
            }
          }
          ta.field_mb = new int[param0 * 2];
          break L4;
        }
        L6: {
          L7: {
            if (og.field_b == null) {
              break L7;
            } else {
              if (param0 <= og.field_b.length) {
                break L6;
              } else {
                break L7;
              }
            }
          }
          og.field_b = new int[param0 * 2];
          break L6;
        }
        L8: {
          L9: {
            if (null == db.field_t) {
              break L9;
            } else {
              if (db.field_t.length < param0) {
                break L9;
              } else {
                break L8;
              }
            }
          }
          db.field_t = new int[param0 * 2];
          break L8;
        }
        L10: {
          L11: {
            if (hi.field_n == null) {
              break L11;
            } else {
              if (param0 <= hi.field_n.length) {
                break L10;
              } else {
                break L11;
              }
            }
          }
          hi.field_n = new int[param0 * 2];
          break L10;
        }
        L12: {
          L13: {
            if (null == db.field_s) {
              break L13;
            } else {
              if (db.field_s.length >= param1 + param0) {
                break L12;
              } else {
                break L13;
              }
            }
          }
          db.field_s = new int[2 * (param0 + param1)];
          break L12;
        }
        L14: {
          L15: {
            if (null == ve.field_c) {
              break L15;
            } else {
              if (param0 <= ve.field_c.length) {
                break L14;
              } else {
                break L15;
              }
            }
          }
          ve.field_c = new boolean[2 * param0];
          break L14;
        }
        i.field_f = 2147483647;
        rf.field_c = -2147483648;
        bh.field_e = 2147483647;
        kl.field_a = -2147483648;
        fc.field_z = 0;
    }

    final static boolean a(char param0, int param1) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param1 == -49) {
          L0: {
            L1: {
              if (param0 < 48) {
                break L1;
              } else {
                if (57 < param0) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return false;
        }
    }

    public static void a(byte param0) {
        field_x = null;
        field_l = null;
        field_g = null;
        field_m = null;
        field_c = null;
    }

    private final void a(byte[] param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        boolean[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        boolean[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        boolean[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        boolean[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        boolean[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var8 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            var6 = 1;
            var7 = 0;
            L1: while (true) {
              if (var7 >= 10000) {
                break L0;
              } else {
                L2: {
                  var5 = var7 / 100;
                  var4 = var7 % 100;
                  int incrementValue$5 = var3_int;
                  var3_int++;
                  ((qh) this).field_o[var4][var5] = param0[incrementValue$5];
                  if (0 > ((qh) this).field_o[var4][var5]) {
                    ((qh) this).field_o[var4][var5] = 256 + ((qh) this).field_o[var4][var5];
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  int incrementValue$6 = var3_int;
                  var3_int++;
                  ((qh) this).field_o[var4][var5] = ((qh) this).field_o[var4][var5] + param0[incrementValue$6] * 64;
                  int incrementValue$7 = var3_int;
                  var3_int++;
                  stackOut_6_0 = ((qh) this).field_n[var4];
                  stackOut_6_1 = var5;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_8_1 = stackOut_6_1;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  if (0 == param0[incrementValue$7]) {
                    stackOut_8_0 = (boolean[]) (Object) stackIn_8_0;
                    stackOut_8_1 = stackIn_8_1;
                    stackOut_8_2 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    stackIn_9_2 = stackOut_8_2;
                    break L3;
                  } else {
                    stackOut_7_0 = (boolean[]) (Object) stackIn_7_0;
                    stackOut_7_1 = stackIn_7_1;
                    stackOut_7_2 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    stackIn_9_2 = stackOut_7_2;
                    break L3;
                  }
                }
                L4: {
                  stackIn_9_0[stackIn_9_1] = stackIn_9_2 != 0;
                  int incrementValue$8 = var3_int;
                  var3_int++;
                  ((qh) this).field_h[var4][var5] = param0[incrementValue$8] - 5;
                  int incrementValue$9 = var3_int;
                  var3_int++;
                  ((qh) this).field_w[var4][var5] = param0[incrementValue$9];
                  if (var6 == 0) {
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var7++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("qh.E(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + 256 + ')');
        }
    }

    final void b(int param0) {
        try {
            int var2 = 0;
            int var3 = 0;
            int var4 = 0;
            int var5 = 0;
            int var6_int = 0;
            bd var6 = null;
            byte[] var6_array = null;
            int var7_int = 0;
            byte[] var7 = null;
            int var8_int = 0;
            int var9 = 0;
            byte[] var10 = null;
            int var11 = 0;
            byte[] var12 = null;
            byte[] var13 = null;
            byte[] var14 = null;
            byte[] var15 = null;
            byte[] var16 = null;
            byte[] var17 = null;
            byte[] var18 = null;
            byte[] var19 = null;
            Object stackIn_33_0 = null;
            Object stackIn_34_0 = null;
            Object stackIn_35_0 = null;
            int stackIn_35_1 = 0;
            Object stackOut_32_0 = null;
            Object stackOut_34_0 = null;
            int stackOut_34_1 = 0;
            Object stackOut_33_0 = null;
            int stackOut_33_1 = 0;
            L0: {
              var9 = HostileSpawn.field_I ? 1 : 0;
              ((qh) this).field_p = (rb.field_m - -((qh) this).field_f) / 16;
              ((qh) this).field_j = (((qh) this).field_t + j.field_c) / 16;
              if (!((qh) this).field_r) {
                break L0;
              } else {
                ((qh) this).field_p = rb.field_m / 16;
                ((qh) this).field_j = j.field_c / 16;
                break L0;
              }
            }
            L1: {
              var2 = 1;
              if (param0 == 32) {
                break L1;
              } else {
                ((qh) this).field_b = 33;
                break L1;
              }
            }
            L2: {
              var3 = 1;
              if (((qh) this).field_i != 0) {
                break L2;
              } else {
                var2 = 1;
                var3 = 1;
                break L2;
              }
            }
            L3: {
              if (((qh) this).field_i != 1) {
                break L3;
              } else {
                var3 = 2;
                var2 = 2;
                break L3;
              }
            }
            L4: {
              if (((qh) this).field_i != 2) {
                break L4;
              } else {
                var3 = 2;
                var2 = 3;
                break L4;
              }
            }
            L5: {
              if (((qh) this).field_i == 3) {
                var3 = 3;
                var2 = 3;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (((qh) this).field_i != 4) {
                break L6;
              } else {
                var2 = 4;
                var3 = 4;
                break L6;
              }
            }
            L7: {
              if (((qh) this).field_i == 5) {
                var3 = 5;
                var2 = 5;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (((qh) this).field_j < 0) {
                ((qh) this).field_j = 0;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              if (0 <= ((qh) this).field_p) {
                break L9;
              } else {
                ((qh) this).field_p = 0;
                break L9;
              }
            }
            L10: {
              if (99 - var2 < ((qh) this).field_j) {
                ((qh) this).field_j = 99 - var2;
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              if (~((qh) this).field_p >= ~(99 - var3)) {
                break L11;
              } else {
                ((qh) this).field_p = -var3 + 99;
                break L11;
              }
            }
            L12: {
              L13: {
                if (pf.field_o == 2) {
                  break L13;
                } else {
                  L14: {
                    if (pf.field_o != 1) {
                      break L14;
                    } else {
                      if (!((qh) this).field_r) {
                        break L14;
                      } else {
                        break L13;
                      }
                    }
                  }
                  if (pf.field_o != 1) {
                    break L12;
                  } else {
                    var4 = this.a(28222);
                    if (var4 != -1) {
                      ((qh) this).field_h[((qh) this).field_j][((qh) this).field_p] = var4;
                      break L12;
                    } else {
                      var5 = 0;
                      L15: while (true) {
                        if (var5 >= var2) {
                          ((qh) this).field_a = 0;
                          break L12;
                        } else {
                          var6_int = 0;
                          L16: while (true) {
                            if (~var3 >= ~var6_int) {
                              var5++;
                              continue L15;
                            } else {
                              L17: {
                                ((qh) this).field_o[var5 + ((qh) this).field_j][((qh) this).field_p - -var6_int] = var6_int * 8 + (var5 + ((qh) this).field_b);
                                if (((qh) this).field_w[((qh) this).field_j + var5][((qh) this).field_p + var6_int] == 0) {
                                  ((qh) this).field_w[var5 + ((qh) this).field_j][var6_int + ((qh) this).field_p] = 2;
                                  break L17;
                                } else {
                                  break L17;
                                }
                              }
                              ((qh) this).field_h[((qh) this).field_j + var5][((qh) this).field_p - -var6_int] = 0;
                              var6_int++;
                              continue L16;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              L18: {
                stackOut_32_0 = this;
                stackIn_34_0 = stackOut_32_0;
                stackIn_33_0 = stackOut_32_0;
                if (((qh) this).field_r) {
                  stackOut_34_0 = this;
                  stackOut_34_1 = 0;
                  stackIn_35_0 = stackOut_34_0;
                  stackIn_35_1 = stackOut_34_1;
                  break L18;
                } else {
                  stackOut_33_0 = this;
                  stackOut_33_1 = 1;
                  stackIn_35_0 = stackOut_33_0;
                  stackIn_35_1 = stackOut_33_1;
                  break L18;
                }
              }
              ((qh) this).field_r = stackIn_35_1 != 0;
              if (((qh) this).field_r) {
                break L12;
              } else {
                if (8 > j.field_c / 16) {
                  ((qh) this).field_b = j.field_c / 16 + 8 * (rb.field_m / 16);
                  break L12;
                } else {
                  ((qh) this).field_b = 8 * (20 + rb.field_m / 16) + -9 + j.field_c / 16;
                  break L12;
                }
              }
            }
            L19: {
              if (!field_m[96]) {
                break L19;
              } else {
                ((qh) this).field_t = ((qh) this).field_t - 32;
                break L19;
              }
            }
            L20: {
              if (!field_m[98]) {
                break L20;
              } else {
                ((qh) this).field_f = ((qh) this).field_f - 32;
                break L20;
              }
            }
            L21: {
              if (!field_m[97]) {
                break L21;
              } else {
                ((qh) this).field_t = ((qh) this).field_t + 32;
                break L21;
              }
            }
            L22: {
              if (!field_m[99]) {
                break L22;
              } else {
                ((qh) this).field_f = ((qh) this).field_f + 32;
                break L22;
              }
            }
            L23: {
              if (field_m[83]) {
                var4 = this.a(param0 ^ 28190);
                if (var4 != -1) {
                  ((qh) this).field_h[((qh) this).field_j][((qh) this).field_p] = var4;
                  break L23;
                } else {
                  var5 = 0;
                  L24: while (true) {
                    if (~var5 <= ~var2) {
                      ((qh) this).field_a = 0;
                      break L23;
                    } else {
                      var11 = 0;
                      var6_int = var11;
                      L25: while (true) {
                        if (var11 >= var3) {
                          var5++;
                          continue L24;
                        } else {
                          L26: {
                            ((qh) this).field_o[((qh) this).field_j - -var5][var11 + ((qh) this).field_p] = ((qh) this).field_b - -var5 - -(8 * var11);
                            if (((qh) this).field_w[((qh) this).field_j - -var5][((qh) this).field_p + var11] != 0) {
                              break L26;
                            } else {
                              ((qh) this).field_w[var5 + ((qh) this).field_j][((qh) this).field_p + var11] = 2;
                              break L26;
                            }
                          }
                          ((qh) this).field_h[((qh) this).field_j + var5][((qh) this).field_p + var11] = 0;
                          var11++;
                          continue L25;
                        }
                      }
                    }
                  }
                }
              } else {
                break L23;
              }
            }
            L27: {
              if (field_m[64]) {
                var4 = 0;
                L28: while (true) {
                  if (~var2 >= ~var4) {
                    ((qh) this).field_a = 1;
                    break L27;
                  } else {
                    var5 = 0;
                    L29: while (true) {
                      if (~var5 <= ~var3) {
                        var4++;
                        continue L28;
                      } else {
                        ((qh) this).field_n[var4 + ((qh) this).field_j][var5 + ((qh) this).field_p] = true;
                        var5++;
                        continue L29;
                      }
                    }
                  }
                }
              } else {
                break L27;
              }
            }
            L30: {
              if (field_m[65]) {
                var4 = 0;
                L31: while (true) {
                  if (var4 >= var2) {
                    ((qh) this).field_a = 1;
                    break L30;
                  } else {
                    var5 = 0;
                    L32: while (true) {
                      if (var5 >= var3) {
                        var4++;
                        continue L31;
                      } else {
                        ((qh) this).field_n[var4 + ((qh) this).field_j][var5 + ((qh) this).field_p] = false;
                        var5++;
                        continue L32;
                      }
                    }
                  }
                }
              } else {
                break L30;
              }
            }
            L33: {
              if (!field_m[48]) {
                break L33;
              } else {
                var4 = 0;
                L34: while (true) {
                  if (~var4 <= ~var2) {
                    ((qh) this).field_a = 2;
                    break L33;
                  } else {
                    var5 = 0;
                    L35: while (true) {
                      if (~var3 >= ~var5) {
                        var4++;
                        continue L34;
                      } else {
                        ((qh) this).field_n[var4 + ((qh) this).field_j][((qh) this).field_p + var5] = true;
                        ((qh) this).field_w[var4 + ((qh) this).field_j][var5 + ((qh) this).field_p] = 0;
                        var5++;
                        continue L35;
                      }
                    }
                  }
                }
              }
            }
            L36: {
              if (field_m[49]) {
                var4 = 0;
                L37: while (true) {
                  if (~var4 <= ~var2) {
                    ((qh) this).field_a = 2;
                    break L36;
                  } else {
                    var5 = 0;
                    L38: while (true) {
                      if (var3 <= var5) {
                        var4++;
                        continue L37;
                      } else {
                        ((qh) this).field_w[((qh) this).field_j - -var4][((qh) this).field_p + var5] = 1;
                        var5++;
                        continue L38;
                      }
                    }
                  }
                }
              } else {
                break L36;
              }
            }
            L39: {
              if (!field_m[50]) {
                break L39;
              } else {
                var4 = 0;
                L40: while (true) {
                  if (~var2 >= ~var4) {
                    ((qh) this).field_a = 2;
                    break L39;
                  } else {
                    var5 = 0;
                    L41: while (true) {
                      if (var5 >= var3) {
                        var4++;
                        continue L40;
                      } else {
                        ((qh) this).field_w[var4 + ((qh) this).field_j][((qh) this).field_p - -var5] = 2;
                        var5++;
                        continue L41;
                      }
                    }
                  }
                }
              }
            }
            L42: {
              if (!field_m[51]) {
                break L42;
              } else {
                var4 = 0;
                L43: while (true) {
                  if (~var4 <= ~var2) {
                    ((qh) this).field_a = 2;
                    break L42;
                  } else {
                    var5 = 0;
                    L44: while (true) {
                      if (~var3 >= ~var5) {
                        var4++;
                        continue L43;
                      } else {
                        ((qh) this).field_w[var4 + ((qh) this).field_j][((qh) this).field_p - -var5] = 3;
                        var5++;
                        continue L44;
                      }
                    }
                  }
                }
              }
            }
            L45: {
              if (!field_m[67]) {
                break L45;
              } else {
                var4 = 0;
                L46: while (true) {
                  if (~var4 <= ~var2) {
                    ((qh) this).field_a = 3;
                    break L45;
                  } else {
                    var5 = 0;
                    L47: while (true) {
                      if (var5 >= var3) {
                        var4++;
                        continue L46;
                      } else {
                        ((qh) this).field_d[((qh) this).field_j + var4][var5 + ((qh) this).field_p] = false;
                        var5++;
                        continue L47;
                      }
                    }
                  }
                }
              }
            }
            L48: {
              if (field_m[68]) {
                var4 = 0;
                L49: while (true) {
                  if (var2 <= var4) {
                    ((qh) this).field_a = 3;
                    break L48;
                  } else {
                    var5 = 0;
                    L50: while (true) {
                      if (var3 <= var5) {
                        var4++;
                        continue L49;
                      } else {
                        ((qh) this).field_d[((qh) this).field_j - -var4][((qh) this).field_p - -var5] = true;
                        var5++;
                        continue L50;
                      }
                    }
                  }
                }
              } else {
                break L48;
              }
            }
            L51: while (true) {
              if (!jn.e((byte) 75)) {
                return;
              } else {
                L52: {
                  if (32 != pj.field_e) {
                    break L52;
                  } else {
                    if (0 >= ((qh) this).field_a) {
                      break L52;
                    } else {
                      ((qh) this).field_a = ((qh) this).field_a - 1;
                      break L52;
                    }
                  }
                }
                L53: {
                  if (33 != pj.field_e) {
                    break L53;
                  } else {
                    if (((qh) this).field_a >= 3) {
                      break L53;
                    } else {
                      ((qh) this).field_a = ((qh) this).field_a + 1;
                      break L53;
                    }
                  }
                }
                L54: {
                  if (pj.field_e != 34) {
                    break L54;
                  } else {
                    if (((qh) this).field_i > 0) {
                      ((qh) this).field_i = ((qh) this).field_i - 1;
                      break L54;
                    } else {
                      break L54;
                    }
                  }
                }
                L55: {
                  if (pj.field_e != 35) {
                    break L55;
                  } else {
                    if (((qh) this).field_i < 5) {
                      ((qh) this).field_i = ((qh) this).field_i + 1;
                      break L55;
                    } else {
                      break L55;
                    }
                  }
                }
                L56: {
                  var4 = 0;
                  if (pj.field_e != 16) {
                    break L56;
                  } else {
                    var4 = 1;
                    ((qh) this).field_v = 1;
                    break L56;
                  }
                }
                L57: {
                  var5 = 0;
                  if (17 == pj.field_e) {
                    ((qh) this).field_v = 2;
                    var4 = 1;
                    break L57;
                  } else {
                    break L57;
                  }
                }
                L58: {
                  if (18 == pj.field_e) {
                    ((qh) this).field_v = 3;
                    var4 = 1;
                    break L58;
                  } else {
                    break L58;
                  }
                }
                L59: {
                  if (pj.field_e == 19) {
                    var4 = 1;
                    ((qh) this).field_v = 4;
                    break L59;
                  } else {
                    break L59;
                  }
                }
                L60: {
                  if (20 == pj.field_e) {
                    ((qh) this).field_v = 5;
                    var4 = 1;
                    break L60;
                  } else {
                    break L60;
                  }
                }
                L61: {
                  if (pj.field_e == 21) {
                    ((qh) this).field_v = 6;
                    var4 = 1;
                    break L61;
                  } else {
                    break L61;
                  }
                }
                L62: {
                  if (pj.field_e == 22) {
                    var4 = 1;
                    ((qh) this).field_v = 7;
                    break L62;
                  } else {
                    break L62;
                  }
                }
                L63: {
                  if (pj.field_e == 23) {
                    var4 = 1;
                    ((qh) this).field_v = 9;
                    break L63;
                  } else {
                    break L63;
                  }
                }
                L64: {
                  if (24 != pj.field_e) {
                    break L64;
                  } else {
                    ((qh) this).field_v = 10;
                    var4 = 1;
                    break L64;
                  }
                }
                L65: {
                  if (pj.field_e != 41) {
                    break L65;
                  } else {
                    var5 = 1;
                    break L65;
                  }
                }
                L66: {
                  if (25 == pj.field_e) {
                    ((qh) this).field_v = 11;
                    var4 = 1;
                    break L66;
                  } else {
                    break L66;
                  }
                }
                L67: {
                  if (var4 != 0) {
                    L68: {
                      var6 = ci.field_e[13];
                      if (((qh) this).field_v < 8) {
                        break L68;
                      } else {
                        var6 = ci.field_e[14];
                        break L68;
                      }
                    }
                    L69: {
                      if (1 != ((qh) this).field_v) {
                        break L69;
                      } else {
                        var6 = ci.field_e[15];
                        break L69;
                      }
                    }
                    var7_int = 0;
                    L70: while (true) {
                      if (5 <= var7_int) {
                        o.field_n.b((byte) 113);
                        var18 = new byte[60000];
                        var16 = var18;
                        var14 = var16;
                        var12 = var14;
                        var7 = var12;
                        var8_int = 60000;
                        d.a((byte) -115, var7, new File(uk.a(param0 + 9362, ((qh) this).field_v)), var8_int);
                        this.a(var18, (byte) -80);
                        break L67;
                      } else {
                        var8_int = 0;
                        L71: while (true) {
                          if (var8_int >= 5) {
                            var7_int++;
                            continue L70;
                          } else {
                            pk.field_d[var7_int + (var8_int + 24) * 8].a();
                            var6.c(16 * -var7_int, 16 * -var8_int);
                            var8_int++;
                            continue L71;
                          }
                        }
                      }
                    }
                  } else {
                    break L67;
                  }
                }
                if (var5 != 0) {
                  var19 = this.c(param0 ^ 32);
                  var17 = var19;
                  var15 = var17;
                  var13 = var15;
                  var10 = var13;
                  var6_array = var10;
                  oc.field_h[0][((qh) this).field_v] = var19;
                  fj.a(var6_array, 15445, var19.length, new File(uk.a(9394, ((qh) this).field_v)));
                  continue L51;
                } else {
                  continue L51;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(byte[] param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            this.a(param0, 256);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("qh.D(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + -80 + ')');
        }
    }

    private qh() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = -1;
        field_s = -1;
        field_m = new boolean[112];
        field_x = "Password: ";
        field_c = "What an unusual place to park.";
        field_k = 0;
        field_u = 0;
    }
}
