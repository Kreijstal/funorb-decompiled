/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class r implements Runnable {
    private ob field_k;
    private qb field_l;
    static String field_f;
    static int field_c;
    private pb field_b;
    static int[] field_j;
    private DataInputStream field_g;
    private int field_h;
    private java.net.URL field_e;
    private pb field_a;
    static boolean field_d;
    private pb field_i;

    final static void a(byte param0) {
        String[][] dupTemp$2 = null;
        int[][] dupTemp$3 = null;
        RuntimeException var1 = null;
        int var2 = 0;
        gr var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        String[][] var7 = null;
        int[][] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        sl var16 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var16 = sa.field_a;
            var2 = var16.j(-102);
            var3 = (gr) ((Object) qa.field_r.d(0));
            L1: while (true) {
              L2: {
                if (var3 == null) {
                  break L2;
                } else {
                  if (var3.field_k != var2) {
                    var3 = (gr) ((Object) qa.field_r.a((byte) -71));
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (var3 == null) {
                q.g(-119);
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                L3: {
                  var4 = -122 % ((14 - param0) / 34);
                  var5 = var16.j(-87);
                  if (var5 != 0) {
                    var6 = var3.field_j;
                    wb.field_a[0] = ln.field_o;
                    var7_int = 1;
                    L4: while (true) {
                      if (var5 <= var7_int) {
                        vd.a(var6, var5, (byte) 18);
                        var7_int = 0;
                        L5: while (true) {
                          if (var5 <= var7_int) {
                            bh.a(var6, (byte) -111);
                            dupTemp$2 = new String[2][var6];
                            var3.field_n = dupTemp$2;
                            var7 = dupTemp$2;
                            dupTemp$3 = new int[2][4 * var6];
                            var3.field_m = dupTemp$3;
                            var8 = dupTemp$3;
                            var9 = wm.field_c;
                            var10 = 0;
                            var11 = 0;
                            L6: while (true) {
                              if (var9 <= var10) {
                                var14 = 0;
                                var10 = var14;
                                var15 = 0;
                                var11 = var15;
                                L7: while (true) {
                                  if (var9 <= var14) {
                                    break L3;
                                  } else {
                                    L8: {
                                      var12 = lg.field_d[var14 + var6];
                                      var7[1][var15] = wb.field_a[var12];
                                      var8[1][4 * var15] = kf.field_f[var12];
                                      var8[1][4 * var15 + 1] = fb.field_zb[var12];
                                      var8[1][var15 * 4 + 2] = aj.field_d[var12];
                                      var8[1][var15 * 4 - -3] = f.field_y[var12];
                                      if (!jp.a(wb.field_a[var12], (byte) -105)) {
                                        break L8;
                                      } else {
                                        if (0 != fb.field_zb[var12] + aj.field_d[var12] + f.field_y[var12]) {
                                          break L8;
                                        } else {
                                          var7[1][var15] = null;
                                          var15--;
                                          break L8;
                                        }
                                      }
                                    }
                                    var14++;
                                    var15++;
                                    continue L7;
                                  }
                                }
                              } else {
                                L9: {
                                  var12 = lg.field_d[var10];
                                  var7[0][var11] = wb.field_a[var12];
                                  var8[0][4 * var11] = kf.field_f[var12];
                                  var8[0][var11 * 4 - -1] = fb.field_zb[var12];
                                  var8[0][2 + var11 * 4] = aj.field_d[var12];
                                  var8[0][var11 * 4 - -3] = f.field_y[var12];
                                  if (!jp.a(wb.field_a[var12], (byte) -105)) {
                                    break L9;
                                  } else {
                                    if (f.field_y[var12] + aj.field_d[var12] + fb.field_zb[var12] != 0) {
                                      break L9;
                                    } else {
                                      var7[0][var11] = null;
                                      var11--;
                                      break L9;
                                    }
                                  }
                                }
                                var11++;
                                var10++;
                                continue L6;
                              }
                            }
                          } else {
                            L10: {
                              qg.a(var16, false);
                              if (var7_int != 0) {
                                ul.a(0, na.field_L, np.field_j, gp.field_c, var7_int, ig.field_d);
                                break L10;
                              } else {
                                var3.field_i = np.field_j;
                                var3.field_l = na.field_L;
                                var3.field_h = ig.field_d;
                                var3.field_r = gp.field_c;
                                ul.a(0, na.field_L, np.field_j, gp.field_c, var7_int, ig.field_d);
                                break L10;
                              }
                            }
                            var7_int++;
                            continue L5;
                          }
                        }
                      } else {
                        wb.field_a[var7_int] = var16.e(-1);
                        var7_int++;
                        continue L4;
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                var3.field_q = true;
                var3.b((byte) -106);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1), "r.E(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    protected final void finalize() {
        if (null != this.field_b) {
            if (!(null == this.field_b.field_e)) {
                try {
                    ((DataInputStream) (this.field_b.field_e)).close();
                } catch (Exception exception) {
                }
            }
            this.field_b = null;
        }
        if (!(this.field_i == null)) {
            if (!(null == this.field_i.field_e)) {
                try {
                    ((java.net.Socket) (this.field_i.field_e)).close();
                } catch (Exception exception) {
                }
            }
            this.field_i = null;
        }
        if (this.field_g != null) {
            try {
                this.field_g.close();
            } catch (Exception exception) {
            }
            this.field_g = null;
        }
        this.field_a = null;
    }

    final static void b(byte param0) {
        bi var1 = null;
        bi var2 = null;
        int var3 = 0;
        int var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
            var1 = new bi(540, 140);
            aq.a((byte) 117, var1);
            wn.c();
            gf.b();
            js.field_j = 0;
            gq.e(-65);
            var2 = var1.g();
            int var4 = 11 / ((31 - param0) / 62);
            for (var3 = 0; 15 > var3; var3++) {
                var2.e(-2, -2, 16777215);
                gf.b(4, 4, 0, 0, 540, 140);
            }
            rf.field_h.e();
            var1.d(0, 0);
            ln.f((byte) -70);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "r.D(" + param0 + ')');
        }
    }

    final static void a(byte param0, boolean param1) {
        if (null == lg.field_e) {
          if (param0 > -81) {
            field_j = (int[]) null;
            return;
          } else {
            return;
          }
        } else {
          lg.field_e.b(param1, 125);
          if (param0 <= -81) {
            return;
          } else {
            field_j = (int[]) null;
            return;
          }
        }
    }

    final static fk a(byte[] param0, byte param1, int param2) {
        fk var3 = null;
        RuntimeException var3_ref = null;
        fk stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        fk stackOut_2_0 = null;
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
            L1: {
              if (param1 <= -9) {
                break L1;
              } else {
                r.a((byte) 30, false);
                break L1;
              }
            }
            var3 = new fk(param0);
            tr.field_vb.a((byte) -113, var3);
            dn.a(param2, var3, (byte) 13);
            stackOut_2_0 = (fk) (var3);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3_ref);
            stackOut_4_1 = new StringBuilder().append("r.B(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    public final void run() {
        try {
            int var1_int = 0;
            Object var1 = null;
            Object var2 = null;
            Throwable var3 = null;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            var4 = ShatteredPlansClient.field_F ? 1 : 0;
            try {
              L0: while (true) {
                L1: {
                  if (this.field_k.field_h.length <= this.field_k.field_j) {
                    break L1;
                  } else {
                    var1_int = this.field_g.read(this.field_k.field_h, this.field_k.field_j, this.field_k.field_h.length + -this.field_k.field_j);
                    if ((var1_int ^ -1) <= -1) {
                      this.field_k.field_j = this.field_k.field_j + var1_int;
                      continue L0;
                    } else {
                      break L1;
                    }
                  }
                }
                if (this.field_k.field_j != this.field_k.field_h.length) {
                  var1 = this;
                  synchronized (var1) {
                    L2: {
                      this.finalize();
                      this.field_h = 3;
                      break L2;
                    }
                  }
                  return;
                } else {
                  throw r.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_k.field_h.length + " " + this.field_e));
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = (Exception) (Object) decompiledCaughtException;
              var2 = this;
              synchronized (var2) {
                L3: {
                  this.finalize();
                  this.field_h = this.field_h + 1;
                  break L3;
                }
              }
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final ob a(boolean param0) {
        if (!(3 != this.field_h)) {
            return this.field_k;
        }
        if (param0) {
            return null;
        }
        return (ob) null;
    }

    final synchronized boolean b(int param0) {
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        if (-3 >= (this.field_h ^ -1)) {
          return true;
        } else {
          L0: {
            if (-1 != (this.field_h ^ -1)) {
              break L0;
            } else {
              L1: {
                if (null == this.field_b) {
                  this.field_b = this.field_l.a(this.field_e, false);
                  break L1;
                } else {
                  break L1;
                }
              }
              if (this.field_b.field_d != 0) {
                if (this.field_b.field_d != 1) {
                  this.field_h = this.field_h + 1;
                  this.field_b = null;
                  return false;
                } else {
                  break L0;
                }
              } else {
                return false;
              }
            }
          }
          L2: {
            if (param0 == 10000) {
              break L2;
            } else {
              this.field_h = 77;
              break L2;
            }
          }
          L3: {
            if (this.field_h == 1) {
              L4: {
                if (this.field_i == null) {
                  this.field_i = this.field_l.a(65535, 443, this.field_e.getHost());
                  break L4;
                } else {
                  break L4;
                }
              }
              if (this.field_i.field_d != 0) {
                if ((this.field_i.field_d ^ -1) == -2) {
                  break L3;
                } else {
                  this.field_h = this.field_h + 1;
                  this.field_i = null;
                  return false;
                }
              } else {
                return false;
              }
            } else {
              break L3;
            }
          }
          L5: {
            if (this.field_g != null) {
              break L5;
            } else {
              try {
                L6: {
                  L7: {
                    if (this.field_h == 0) {
                      this.field_g = (DataInputStream) (this.field_b.field_e);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (1 == this.field_h) {
                      var4 = (java.net.Socket) (this.field_i.field_e);
                      var4.setSoTimeout(10000);
                      var3 = var4.getOutputStream();
                      var3.write(17);
                      var5 = (CharSequence) ((Object) ("JAGGRAB " + this.field_e.getFile() + "\n\n"));
                      var3.write(se.a((byte) 80, var5));
                      this.field_g = new DataInputStream(var4.getInputStream());
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  this.field_k.field_j = 0;
                  decompiledRegionSelector0 = 0;
                  break L6;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L9: {
                  var2 = (IOException) (Object) decompiledCaughtException;
                  this.finalize();
                  this.field_h = this.field_h + 1;
                  decompiledRegionSelector0 = 1;
                  break L9;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                L10: {
                  if (null != this.field_a) {
                    break L10;
                  } else {
                    this.field_a = this.field_l.a(true, 5, (Runnable) (this));
                    break L10;
                  }
                }
                if (-1 != (this.field_a.field_d ^ -1)) {
                  if (1 == this.field_a.field_d) {
                    return false;
                  } else {
                    this.finalize();
                    this.field_h = this.field_h + 1;
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                break L5;
              }
            }
          }
          if (null != this.field_a) {
            if (-1 == (this.field_a.field_d ^ -1)) {
              return false;
            } else {
              L11: {
                if (1 != this.field_a.field_d) {
                  this.finalize();
                  this.field_h = this.field_h + 1;
                  break L11;
                } else {
                  break L11;
                }
              }
              return false;
            }
          } else {
            this.field_a = this.field_l.a(true, 5, (Runnable) (this));
            if (-1 == (this.field_a.field_d ^ -1)) {
              return false;
            } else {
              L12: {
                if (1 != this.field_a.field_d) {
                  this.finalize();
                  this.field_h = this.field_h + 1;
                  break L12;
                } else {
                  break L12;
                }
              }
              return false;
            }
          }
        }
    }

    final static rg a(Throwable param0, String param1) {
        rg var2 = null;
        if (param0 instanceof rg) {
            var2 = (rg) ((Object) param0);
            var2.field_b = var2.field_b + ' ' + param1;
        } else {
            var2 = new rg(param0, param1);
        }
        return var2;
    }

    r(qb param0, java.net.URL param1, int param2) {
        try {
            this.field_e = param1;
            this.field_l = param0;
            this.field_k = new ob(param2);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "r.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        field_j = null;
        field_f = null;
        if (param0 != 0) {
            r.a((byte) 121, false);
        }
    }

    static {
        field_j = new int[]{-65536, -65536, -65536, 0, -65536};
        field_f = "Invite more players, or alternatively try changing the '<%0>' setting.";
        field_d = false;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
