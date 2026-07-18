/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hd {
    private int field_d;
    private int field_l;
    private long field_k;
    private byte[] field_n;
    static java.lang.reflect.Constructor field_h;
    private long field_a;
    private long field_c;
    private long field_b;
    private qp field_f;
    static int[] field_j;
    private long field_i;
    private long field_p;
    private byte[] field_o;
    static java.lang.reflect.Method field_e;
    static String[] field_m;
    static od field_g;

    final void c(byte param0) throws IOException {
        this.d((byte) -117);
        int var2 = 44 % ((19 - param0) / 58);
        ((hd) this).field_f.a(0);
    }

    private final void d(byte param0) throws IOException {
        int var2 = 0;
        long var3 = 0L;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = DungeonAssault.field_K;
          var2 = 81 % ((param0 - 50) / 55);
          if (-1L != ((hd) this).field_c) {
            L1: {
              if (~((hd) this).field_a == ~((hd) this).field_c) {
                break L1;
              } else {
                ((hd) this).field_f.a(((hd) this).field_c, 18);
                ((hd) this).field_a = ((hd) this).field_c;
                break L1;
              }
            }
            L2: {
              ((hd) this).field_f.a(0, 105, ((hd) this).field_n, ((hd) this).field_d);
              ((hd) this).field_a = ((hd) this).field_a + (long)((hd) this).field_d;
              if (~((hd) this).field_i <= ~((hd) this).field_a) {
                break L2;
              } else {
                ((hd) this).field_i = ((hd) this).field_a;
                break L2;
              }
            }
            L3: {
              L4: {
                var3 = -1L;
                if (((hd) this).field_c < ((hd) this).field_b) {
                  break L4;
                } else {
                  if (~((long)((hd) this).field_l + ((hd) this).field_b) >= ~((hd) this).field_c) {
                    break L4;
                  } else {
                    var3 = ((hd) this).field_c;
                    break L3;
                  }
                }
              }
              if (((hd) this).field_b < ((hd) this).field_c) {
                break L3;
              } else {
                if (~((hd) this).field_b <= ~((long)((hd) this).field_d + ((hd) this).field_c)) {
                  break L3;
                } else {
                  var3 = ((hd) this).field_b;
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                var5 = -1L;
                if (~((hd) this).field_b <= ~((long)((hd) this).field_d + ((hd) this).field_c)) {
                  break L6;
                } else {
                  if (~((long)((hd) this).field_l + ((hd) this).field_b) <= ~((long)((hd) this).field_d + ((hd) this).field_c)) {
                    var5 = ((hd) this).field_c + (long)((hd) this).field_d;
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              if (~((long)((hd) this).field_l + ((hd) this).field_b) >= ~((hd) this).field_c) {
                break L5;
              } else {
                if (~((long)((hd) this).field_l + ((hd) this).field_b) < ~((long)((hd) this).field_d + ((hd) this).field_c)) {
                  break L5;
                } else {
                  var5 = (long)((hd) this).field_l + ((hd) this).field_b;
                  break L5;
                }
              }
            }
            L7: {
              if (var3 <= -1L) {
                break L7;
              } else {
                if (~var5 >= ~var3) {
                  break L7;
                } else {
                  var7 = (int)(var5 + -var3);
                  cj.a(((hd) this).field_n, (int)(var3 + -((hd) this).field_c), ((hd) this).field_o, (int)(var3 - ((hd) this).field_b), var7);
                  break L7;
                }
              }
            }
            ((hd) this).field_d = 0;
            ((hd) this).field_c = -1L;
            break L0;
          } else {
            break L0;
          }
        }
    }

    public static void b(byte param0) {
        field_h = null;
        int var1 = 0;
        field_e = null;
        field_j = null;
        field_m = null;
        field_g = null;
    }

    final static void a(String param0, java.awt.Color param1, boolean param2, byte param3, int param4) {
        Exception var5 = null;
        RuntimeException var5_ref = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  var9 = c.field_h.getGraphics();
                  if (td.field_a != null) {
                    break L2;
                  } else {
                    td.field_a = new java.awt.Font("Helvetica", 1, 13);
                    break L2;
                  }
                }
                L3: {
                  if (param2) {
                    var9.setColor(java.awt.Color.black);
                    var9.fillRect(0, 0, up.field_d, eg.field_d);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (param1 == null) {
                    param1 = new java.awt.Color(140, 17, 17);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                try {
                  L5: {
                    L6: {
                      if (bb.field_e != null) {
                        break L6;
                      } else {
                        bb.field_e = c.field_h.createImage(304, 34);
                        break L6;
                      }
                    }
                    var10 = bb.field_e.getGraphics();
                    var10.setColor(param1);
                    var10.drawRect(0, 0, 303, 33);
                    var10.fillRect(2, 2, param4 * 3, 30);
                    var10.setColor(java.awt.Color.black);
                    var10.drawRect(1, 1, 301, 31);
                    var10.fillRect(2 + param4 * 3, 2, 300 + -(param4 * 3), 30);
                    var10.setFont(td.field_a);
                    var10.setColor(java.awt.Color.white);
                    var10.drawString(param0, (304 - param0.length() * 6) / 2, 22);
                    boolean discarded$1 = var9.drawImage(bb.field_e, up.field_d / 2 + -152, eg.field_d / 2 - 18, (java.awt.image.ImageObserver) null);
                    break L5;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L7: {
                    var6 = (Exception) (Object) decompiledCaughtException;
                    var7 = -152 + up.field_d / 2;
                    var8 = eg.field_d / 2 - 18;
                    var9.setColor(param1);
                    var9.drawRect(var7, var8, 303, 33);
                    var9.fillRect(2 + var7, var8 + 2, param4 * 3, 30);
                    var9.setColor(java.awt.Color.black);
                    var9.drawRect(var7 - -1, var8 + 1, 301, 31);
                    var9.fillRect(2 + (var7 + param4 * 3), var8 + 2, -(param4 * 3) + 300, 30);
                    var9.setFont(td.field_a);
                    var9.setColor(java.awt.Color.white);
                    var9.drawString(param0, var7 + (-(6 * param0.length()) + 304) / 2, 22 + var8);
                    break L7;
                  }
                }
                L8: {
                  if (bb.field_f != null) {
                    var9.setFont(td.field_a);
                    var9.setColor(java.awt.Color.white);
                    var9.drawString(bb.field_f, up.field_d / 2 - 6 * bb.field_f.length() / 2, -26 + eg.field_d / 2);
                    break L8;
                  } else {
                    break L8;
                  }
                }
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L9: {
                var5 = (Exception) (Object) decompiledCaughtException;
                c.field_h.repaint();
                break L9;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          L10: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var5_ref;
            stackOut_19_1 = new StringBuilder().append("hd.M(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L10;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L10;
            }
          }
          L11: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L11;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L11;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + param2 + ',' + 105 + ',' + param4 + ')');
        }
    }

    final static void a(int param0, boolean param1, String param2, boolean param3) {
        tn.a(-1);
        lg.field_w.h(1);
        wo.field_e = new dn(co.field_C, (String) null, qc.field_t, param3, param1);
        if (param0 != 8192) {
            return;
        }
        try {
            ta.field_a = new jk(lg.field_w, (lm) (Object) wo.field_e);
            lg.field_w.a((lm) (Object) ta.field_a, -1);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "hd.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void a(boolean param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        kj var4_ref_kj = null;
        int var4 = 0;
        mm var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        wj var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                field_j = null;
                break L1;
              }
            }
            L2: {
              var9 = ra.field_c;
              var2 = var9.c(true);
              var3 = var9.c(true);
              if (var2 != 0) {
                if (1 != var2) {
                  sm.a((Throwable) null, 1, "LR1: " + sj.l(192));
                  tl.a(-51);
                  break L2;
                } else {
                  var4 = var9.l(0);
                  var5 = (mm) (Object) m.field_a.e(-24172);
                  L3: while (true) {
                    L4: {
                      if (var5 == null) {
                        break L4;
                      } else {
                        L5: {
                          if (var3 != var5.field_p) {
                            break L5;
                          } else {
                            if (var5.field_r != var4) {
                              break L5;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var5 = (mm) (Object) m.field_a.a(4);
                        continue L3;
                      }
                    }
                    if (var5 == null) {
                      tl.a(-23);
                      return;
                    } else {
                      var5.a(false);
                      break L2;
                    }
                  }
                }
              } else {
                var4_ref_kj = (kj) (Object) cc.field_i.e(-24172);
                if (var4_ref_kj != null) {
                  L6: {
                    var5_int = nj.field_b + -var9.field_o;
                    var13 = var4_ref_kj.field_l;
                    var12 = var13;
                    var11 = var12;
                    var10 = var11;
                    var6 = var10;
                    if (var5_int <= var13.length << 2) {
                      break L6;
                    } else {
                      var5_int = var13.length << 2;
                      break L6;
                    }
                  }
                  var7 = 0;
                  L7: while (true) {
                    if (var5_int <= var7) {
                      var4_ref_kj.a(false);
                      break L2;
                    } else {
                      var6[var7 >> 2] = var6[var7 >> 2] + (var9.c(true) << nb.a(768, var7 << 8));
                      var7++;
                      continue L7;
                    }
                  }
                } else {
                  tl.a(-21);
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var1, "hd.H(" + param0 + ')');
        }
    }

    final void a(long param0, int param1) throws IOException {
        if (param1 != -26296) {
            return;
        }
        if (0L > param0) {
            throw new IOException();
        }
        ((hd) this).field_k = param0;
    }

    private final void a(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = DungeonAssault.field_K;
          ((hd) this).field_l = 0;
          var2 = 89;
          if (~((hd) this).field_k != ~((hd) this).field_a) {
            ((hd) this).field_f.a(((hd) this).field_k, 18);
            ((hd) this).field_a = ((hd) this).field_k;
            break L0;
          } else {
            break L0;
          }
        }
        ((hd) this).field_b = ((hd) this).field_k;
        L1: while (true) {
          L2: {
            if (((hd) this).field_l >= ((hd) this).field_o.length) {
              break L2;
            } else {
              L3: {
                var3 = -((hd) this).field_l + ((hd) this).field_o.length;
                if (200000000 >= var3) {
                  break L3;
                } else {
                  var3 = 200000000;
                  break L3;
                }
              }
              var4 = ((hd) this).field_f.a(((hd) this).field_l, -11274, var3, ((hd) this).field_o);
              if (var4 == -1) {
                break L2;
              } else {
                ((hd) this).field_l = ((hd) this).field_l + var4;
                ((hd) this).field_a = ((hd) this).field_a + (long)var4;
                continue L1;
              }
            }
          }
          return;
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        IOException var5 = null;
        RuntimeException var5_ref = null;
        long var5_long = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        long var9 = 0L;
        long var11 = 0L;
        int var13 = 0;
        int var14 = 0;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_61_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        var14 = DungeonAssault.field_K;
        try {
          L0: {
            if (param2.length < param0 + param3) {
              throw new ArrayIndexOutOfBoundsException(-param2.length + (param3 + param0));
            } else {
              L1: {
                if ((long)param1 == ((hd) this).field_c) {
                  break L1;
                } else {
                  if (~((hd) this).field_k > ~((hd) this).field_c) {
                    break L1;
                  } else {
                    if (((hd) this).field_k + (long)param3 <= (long)((hd) this).field_d + ((hd) this).field_c) {
                      cj.a(((hd) this).field_n, (int)(((hd) this).field_k - ((hd) this).field_c), param2, param0, param3);
                      ((hd) this).field_k = ((hd) this).field_k + (long)param3;
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                var5_long = ((hd) this).field_k;
                var7 = param0;
                var8 = param3;
                if (((hd) this).field_k < ((hd) this).field_b) {
                  break L2;
                } else {
                  if (((hd) this).field_k >= (long)((hd) this).field_l + ((hd) this).field_b) {
                    break L2;
                  } else {
                    L3: {
                      var9_int = (int)((long)((hd) this).field_l + (-((hd) this).field_k - -((hd) this).field_b));
                      if (param3 < var9_int) {
                        var9_int = param3;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    cj.a(((hd) this).field_o, (int)(-((hd) this).field_b + ((hd) this).field_k), param2, param0, var9_int);
                    param0 = param0 + var9_int;
                    ((hd) this).field_k = ((hd) this).field_k + (long)var9_int;
                    param3 = param3 - var9_int;
                    break L2;
                  }
                }
              }
              L4: {
                if (param3 > ((hd) this).field_o.length) {
                  ((hd) this).field_f.a(((hd) this).field_k, param1 + 19);
                  ((hd) this).field_a = ((hd) this).field_k;
                  L5: while (true) {
                    if (param3 <= 0) {
                      break L4;
                    } else {
                      var9_int = ((hd) this).field_f.a(param0, -11274, param3, param2);
                      if (var9_int != -1) {
                        ((hd) this).field_a = ((hd) this).field_a + (long)var9_int;
                        param3 = param3 - var9_int;
                        ((hd) this).field_k = ((hd) this).field_k + (long)var9_int;
                        param0 = param0 + var9_int;
                        continue L5;
                      } else {
                        break L4;
                      }
                    }
                  }
                } else {
                  if (param3 > 0) {
                    L6: {
                      this.a(-57);
                      var9_int = param3;
                      if (var9_int > ((hd) this).field_l) {
                        var9_int = ((hd) this).field_l;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    cj.a(((hd) this).field_o, 0, param2, param0, var9_int);
                    ((hd) this).field_k = ((hd) this).field_k + (long)var9_int;
                    param3 = param3 - var9_int;
                    param0 = param0 + var9_int;
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
              L7: {
                if (((hd) this).field_c == -1L) {
                  break L7;
                } else {
                  L8: {
                    if (((hd) this).field_k >= ((hd) this).field_c) {
                      break L8;
                    } else {
                      if (param3 <= 0) {
                        break L8;
                      } else {
                        L9: {
                          var9_int = param0 - -(int)(-((hd) this).field_k + ((hd) this).field_c);
                          if (var9_int > param0 + param3) {
                            var9_int = param0 + param3;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        L10: while (true) {
                          if (var9_int <= param0) {
                            break L8;
                          } else {
                            param3--;
                            int incrementValue$1 = param0;
                            param0++;
                            param2[incrementValue$1] = (byte) 0;
                            ((hd) this).field_k = ((hd) this).field_k + 1L;
                            continue L10;
                          }
                        }
                      }
                    }
                  }
                  L11: {
                    L12: {
                      var9 = -1L;
                      if (((hd) this).field_c < var5_long) {
                        break L12;
                      } else {
                        if ((long)var8 + var5_long <= ((hd) this).field_c) {
                          break L12;
                        } else {
                          var9 = ((hd) this).field_c;
                          break L11;
                        }
                      }
                    }
                    if (var5_long < ((hd) this).field_c) {
                      break L11;
                    } else {
                      if (~var5_long <= ~(((hd) this).field_c + (long)((hd) this).field_d)) {
                        break L11;
                      } else {
                        var9 = var5_long;
                        break L11;
                      }
                    }
                  }
                  L13: {
                    L14: {
                      var11 = -1L;
                      if (~var5_long <= ~(((hd) this).field_c - -(long)((hd) this).field_d)) {
                        break L14;
                      } else {
                        if ((long)var8 + var5_long < (long)((hd) this).field_d + ((hd) this).field_c) {
                          break L14;
                        } else {
                          var11 = (long)((hd) this).field_d + ((hd) this).field_c;
                          break L13;
                        }
                      }
                    }
                    if (~(var5_long + (long)var8) >= ~((hd) this).field_c) {
                      break L13;
                    } else {
                      if (~((long)((hd) this).field_d + ((hd) this).field_c) > ~(var5_long - -(long)var8)) {
                        break L13;
                      } else {
                        var11 = (long)var8 + var5_long;
                        break L13;
                      }
                    }
                  }
                  if (var9 <= -1L) {
                    break L7;
                  } else {
                    if (~var9 <= ~var11) {
                      break L7;
                    } else {
                      var13 = (int)(var11 + -var9);
                      cj.a(((hd) this).field_n, (int)(var9 + -((hd) this).field_c), param2, var7 + (int)(var9 - var5_long), var13);
                      if (~var11 >= ~((hd) this).field_k) {
                        break L7;
                      } else {
                        param3 = (int)((long)param3 - (-((hd) this).field_k + var11));
                        ((hd) this).field_k = var11;
                        break L7;
                      }
                    }
                  }
                }
              }
              if (param3 > 0) {
                throw new EOFException();
              } else {
                break L0;
              }
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((hd) this).field_a = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L15: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_58_0 = (RuntimeException) var5_ref;
            stackOut_58_1 = new StringBuilder().append("hd.L(").append(param0).append(',').append(param1).append(',');
            stackIn_60_0 = stackOut_58_0;
            stackIn_60_1 = stackOut_58_1;
            stackIn_59_0 = stackOut_58_0;
            stackIn_59_1 = stackOut_58_1;
            if (param2 == null) {
              stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
              stackOut_60_1 = (StringBuilder) (Object) stackIn_60_1;
              stackOut_60_2 = "null";
              stackIn_61_0 = stackOut_60_0;
              stackIn_61_1 = stackOut_60_1;
              stackIn_61_2 = stackOut_60_2;
              break L15;
            } else {
              stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
              stackOut_59_1 = (StringBuilder) (Object) stackIn_59_1;
              stackOut_59_2 = "{...}";
              stackIn_61_0 = stackOut_59_0;
              stackIn_61_1 = stackOut_59_1;
              stackIn_61_2 = stackOut_59_2;
              break L15;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_61_0, stackIn_61_2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, byte[] param1) throws IOException {
        try {
            ((hd) this).a(param0, ~param0, param1, param1.length);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "hd.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static cf a(boolean param0, int param1, String param2) {
        va var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        Object stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            var3 = ci.a(param2, -10396);
            if (var3 != null) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (cf) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3_ref;
            stackOut_6_1 = new StringBuilder().append("hd.G(").append(false).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
        return (cf) (Object) stackIn_4_0;
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        IOException var5 = null;
        RuntimeException var5_ref = null;
        int var5_int = 0;
        long var5_long = 0L;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        var10 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              if (((hd) this).field_k - -(long)param2 > ((hd) this).field_p) {
                ((hd) this).field_p = (long)param2 + ((hd) this).field_k;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 < -75) {
                break L2;
              } else {
                hd.a(true);
                break L2;
              }
            }
            L3: {
              if (-1L == ((hd) this).field_c) {
                break L3;
              } else {
                L4: {
                  if (~((hd) this).field_c < ~((hd) this).field_k) {
                    break L4;
                  } else {
                    if (((hd) this).field_k > ((hd) this).field_c + (long)((hd) this).field_d) {
                      break L4;
                    } else {
                      break L3;
                    }
                  }
                }
                this.d((byte) 115);
                break L3;
              }
            }
            L5: {
              if (((hd) this).field_c == -1L) {
                break L5;
              } else {
                if (~(((hd) this).field_k - -(long)param2) < ~((long)((hd) this).field_n.length + ((hd) this).field_c)) {
                  var5_int = (int)(((hd) this).field_c + -((hd) this).field_k + (long)((hd) this).field_n.length);
                  cj.a(param3, param0, ((hd) this).field_n, (int)(((hd) this).field_k + -((hd) this).field_c), var5_int);
                  param0 = param0 + var5_int;
                  ((hd) this).field_k = ((hd) this).field_k + (long)var5_int;
                  param2 = param2 - var5_int;
                  ((hd) this).field_d = ((hd) this).field_n.length;
                  this.d((byte) -92);
                  break L5;
                } else {
                  break L5;
                }
              }
            }
            if (((hd) this).field_n.length >= param2) {
              if (param2 <= 0) {
                break L0;
              } else {
                L6: {
                  if (((hd) this).field_c == -1L) {
                    ((hd) this).field_c = ((hd) this).field_k;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  cj.a(param3, param0, ((hd) this).field_n, (int)(-((hd) this).field_c + ((hd) this).field_k), param2);
                  ((hd) this).field_k = ((hd) this).field_k + (long)param2;
                  if (-((hd) this).field_c + ((hd) this).field_k > (long)((hd) this).field_d) {
                    ((hd) this).field_d = (int)(((hd) this).field_k - ((hd) this).field_c);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                return;
              }
            } else {
              L8: {
                if (~((hd) this).field_k == ~((hd) this).field_a) {
                  break L8;
                } else {
                  ((hd) this).field_f.a(((hd) this).field_k, 18);
                  ((hd) this).field_a = ((hd) this).field_k;
                  break L8;
                }
              }
              L9: {
                ((hd) this).field_f.a(param0, 102, param3, param2);
                ((hd) this).field_a = ((hd) this).field_a + (long)param2;
                if (((hd) this).field_a > ((hd) this).field_i) {
                  ((hd) this).field_i = ((hd) this).field_a;
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                L11: {
                  var5_long = -1L;
                  var7 = -1L;
                  if (~((hd) this).field_k > ~((hd) this).field_b) {
                    break L11;
                  } else {
                    if (((hd) this).field_k < (long)((hd) this).field_l + ((hd) this).field_b) {
                      var5_long = ((hd) this).field_k;
                      break L10;
                    } else {
                      break L11;
                    }
                  }
                }
                if (~((hd) this).field_k < ~((hd) this).field_b) {
                  break L10;
                } else {
                  if (~((hd) this).field_b <= ~(((hd) this).field_k + (long)param2)) {
                    break L10;
                  } else {
                    var5_long = ((hd) this).field_b;
                    break L10;
                  }
                }
              }
              L12: {
                L13: {
                  if (~((long)param2 + ((hd) this).field_k) >= ~((hd) this).field_b) {
                    break L13;
                  } else {
                    if ((long)param2 + ((hd) this).field_k > ((hd) this).field_b - -(long)((hd) this).field_l) {
                      break L13;
                    } else {
                      var7 = ((hd) this).field_k + (long)param2;
                      break L12;
                    }
                  }
                }
                if (((hd) this).field_k >= ((hd) this).field_b - -(long)((hd) this).field_l) {
                  break L12;
                } else {
                  if (~(((hd) this).field_b - -(long)((hd) this).field_l) >= ~((long)param2 + ((hd) this).field_k)) {
                    var7 = (long)((hd) this).field_l + ((hd) this).field_b;
                    break L12;
                  } else {
                    break L12;
                  }
                }
              }
              L14: {
                if (var5_long <= -1L) {
                  break L14;
                } else {
                  if (~var5_long > ~var7) {
                    var9 = (int)(var7 - var5_long);
                    cj.a(param3, (int)(-((hd) this).field_k + (var5_long + (long)param0)), ((hd) this).field_o, (int)(var5_long + -((hd) this).field_b), var9);
                    break L14;
                  } else {
                    break L14;
                  }
                }
              }
              ((hd) this).field_k = ((hd) this).field_k + (long)param2;
              return;
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((hd) this).field_a = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L15: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_52_0 = (RuntimeException) var5_ref;
            stackOut_52_1 = new StringBuilder().append("hd.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_54_0 = stackOut_52_0;
            stackIn_54_1 = stackOut_52_1;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            if (param3 == null) {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "null";
              stackIn_55_0 = stackOut_54_0;
              stackIn_55_1 = stackOut_54_1;
              stackIn_55_2 = stackOut_54_2;
              break L15;
            } else {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "{...}";
              stackIn_55_0 = stackOut_53_0;
              stackIn_55_1 = stackOut_53_1;
              stackIn_55_2 = stackOut_53_2;
              break L15;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_55_0, stackIn_55_2 + ')');
        }
    }

    hd(qp param0, int param1, int param2) throws IOException {
        ((hd) this).field_b = -1L;
        ((hd) this).field_d = 0;
        ((hd) this).field_c = -1L;
        try {
            ((hd) this).field_f = param0;
            long dupTemp$0 = param0.a((byte) 91);
            ((hd) this).field_i = dupTemp$0;
            ((hd) this).field_p = dupTemp$0;
            ((hd) this).field_n = new byte[param2];
            ((hd) this).field_o = new byte[param1];
            ((hd) this).field_k = 0L;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "hd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final long a(byte param0) {
        if (param0 != -92) {
            return -92L;
        }
        return ((hd) this).field_p;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        Class var2 = null;
        Class var0 = null;
        field_j = new int[8192];
        field_m = new String[]{"<%0> the Fierce", "<%0> the Cruel", "<%0> the Fell", "<%0> the Terrible", "<%0> the Savage", "<%0> the Raging", "<%0>, Bringer of Wrath", "<%0>, Lord of Chaos", "<%0> the Undefeated"};
        try {
            var2 = Class.forName("java.lang.ref.SoftReference");
            var0 = var2;
            field_h = var2.getConstructor(new Class[1]);
            Object var1 = null;
            field_e = var0.getMethod("get", (Class[]) null);
        } catch (ClassNotFoundException classNotFoundException) {
            field_h = null;
        } catch (NoSuchMethodException noSuchMethodException) {
            field_h = null;
        }
        field_g = new od();
    }
}
