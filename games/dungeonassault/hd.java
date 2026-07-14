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
              if ((((hd) this).field_a ^ -1L) == (((hd) this).field_c ^ -1L)) {
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
              if ((((hd) this).field_i ^ -1L) <= (((hd) this).field_a ^ -1L)) {
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
                  if (((long)((hd) this).field_l + ((hd) this).field_b ^ -1L) >= (((hd) this).field_c ^ -1L)) {
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
                if ((((hd) this).field_b ^ -1L) <= ((long)((hd) this).field_d + ((hd) this).field_c ^ -1L)) {
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
                if ((((hd) this).field_b ^ -1L) <= ((long)((hd) this).field_d + ((hd) this).field_c ^ -1L)) {
                  break L6;
                } else {
                  if (((long)((hd) this).field_l + ((hd) this).field_b ^ -1L) <= ((long)((hd) this).field_d + ((hd) this).field_c ^ -1L)) {
                    var5 = ((hd) this).field_c + (long)((hd) this).field_d;
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              if (((long)((hd) this).field_l + ((hd) this).field_b ^ -1L) >= (((hd) this).field_c ^ -1L)) {
                break L5;
              } else {
                if (((long)((hd) this).field_l + ((hd) this).field_b ^ -1L) < ((long)((hd) this).field_d + ((hd) this).field_c ^ -1L)) {
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
                if ((var5 ^ -1L) >= (var3 ^ -1L)) {
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
        int var1 = 33 % ((param0 - 52) / 62);
        field_e = null;
        field_j = null;
        field_m = null;
        field_g = null;
    }

    final static void a(String param0, java.awt.Color param1, boolean param2, byte param3, int param4) {
        Exception var5 = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        Throwable decompiledCaughtException = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var9 = c.field_h.getGraphics();
                        if (td.field_a != null) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        td.field_a = new java.awt.Font("Helvetica", 1, 13);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param2) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var9.setColor(java.awt.Color.black);
                        var9.fillRect(0, 0, up.field_d, eg.field_d);
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (param1 == null) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        param1 = new java.awt.Color(140, 17, 17);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (bb.field_e != null) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        bb.field_e = c.field_h.createImage(304, 34);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var10 = bb.field_e.getGraphics();
                        var10.setColor(param1);
                        var10.drawRect(0, 0, 303, 33);
                        var10.fillRect(2, 2, param4 * 3, 30);
                        var10.setColor(java.awt.Color.black);
                        var10.drawRect(1, 1, 301, 31);
                        var10.fillRect(2 + param4 * 3, 2, 300 + -(param4 * 3), 30);
                        var10.setFont(td.field_a);
                        if (param3 == 105) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        field_g = null;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var10.setColor(java.awt.Color.white);
                        var10.drawString(param0, (304 - param0.length() * 6) / 2, 22);
                        boolean discarded$2 = var9.drawImage(bb.field_e, up.field_d / 2 + -152, eg.field_d / 2 - 18, (java.awt.image.ImageObserver) null);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var6 = (Exception) (Object) caughtException;
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
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (bb.field_f != null) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var9.setFont(td.field_a);
                        var9.setColor(java.awt.Color.white);
                        var9.drawString(bb.field_f, up.field_d / 2 - 6 * bb.field_f.length() / 2, -26 + eg.field_d / 2);
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 19: {
                    var5 = (Exception) (Object) caughtException;
                    c.field_h.repaint();
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, boolean param1, String param2, boolean param3) {
        tn.a(-1);
        lg.field_w.h(1);
        wo.field_e = new dn(co.field_C, (String) null, qc.field_t, param3, param1);
        if (param0 != 8192) {
          return;
        } else {
          ta.field_a = new jk(lg.field_w, (lm) (Object) wo.field_e);
          lg.field_w.a((lm) (Object) ta.field_a, -1);
          return;
        }
    }

    final static void a(boolean param0) {
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
        L0: {
          var8 = DungeonAssault.field_K;
          if (!param0) {
            break L0;
          } else {
            field_j = null;
            break L0;
          }
        }
        L1: {
          var9 = ra.field_c;
          var2 = var9.c(true);
          var3 = var9.c(true);
          if (-1 != (var2 ^ -1)) {
            if (1 == var2) {
              var4 = var9.l(0);
              var5 = (mm) (Object) m.field_a.e(-24172);
              L2: while (true) {
                L3: {
                  if (var5 == null) {
                    break L3;
                  } else {
                    L4: {
                      if (var3 != var5.field_p) {
                        break L4;
                      } else {
                        if (var5.field_r != var4) {
                          break L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var5 = (mm) (Object) m.field_a.a(4);
                    continue L2;
                  }
                }
                if (var5 == null) {
                  tl.a(-23);
                  return;
                } else {
                  var5.a(false);
                  break L1;
                }
              }
            } else {
              sm.a((Throwable) null, 1, "LR1: " + sj.l(192));
              tl.a(-51);
              return;
            }
          } else {
            var4_ref_kj = (kj) (Object) cc.field_i.e(-24172);
            if (var4_ref_kj != null) {
              L5: {
                var5_int = nj.field_b + -var9.field_o;
                var13 = var4_ref_kj.field_l;
                var12 = var13;
                var11 = var12;
                var10 = var11;
                var6 = var10;
                if (var5_int <= var13.length << 1063189954) {
                  break L5;
                } else {
                  var5_int = var13.length << -213987646;
                  break L5;
                }
              }
              var7 = 0;
              L6: while (true) {
                if (var5_int <= var7) {
                  var4_ref_kj.a(false);
                  break L1;
                } else {
                  var6[var7 >> -1345301182] = var6[var7 >> -1345301182] + (var9.c(true) << nb.a(768, var7 << 1826925032));
                  var7++;
                  continue L6;
                }
              }
            } else {
              tl.a(-21);
              return;
            }
          }
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
        int var3 = 0;
        int var4 = 0;
        int var5 = DungeonAssault.field_K;
        ((hd) this).field_l = 0;
        int var2 = -89 / ((param0 - 3) / 56);
        if (!((((hd) this).field_k ^ -1L) == (((hd) this).field_a ^ -1L))) {
            ((hd) this).field_f.a(((hd) this).field_k, 18);
            ((hd) this).field_a = ((hd) this).field_k;
        }
        ((hd) this).field_b = ((hd) this).field_k;
        while (((hd) this).field_l < ((hd) this).field_o.length) {
            var3 = -((hd) this).field_l + ((hd) this).field_o.length;
            if (200000000 < var3) {
                var3 = 200000000;
            }
            var4 = ((hd) this).field_f.a(((hd) this).field_l, -11274, var3, ((hd) this).field_o);
            // if_icmpeq L162
            ((hd) this).field_l = ((hd) this).field_l + var4;
            ((hd) this).field_a = ((hd) this).field_a + (long)var4;
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        IOException var5 = null;
        long var5_long = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        long var9 = 0L;
        long var11 = 0L;
        int var13 = 0;
        int var14 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var14 = DungeonAssault.field_K;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param2.length < param0 + param3) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        throw new ArrayIndexOutOfBoundsException(-param2.length + (param3 + param0));
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((long)param1 == ((hd) this).field_c) {
                            statePc = 10;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((((hd) this).field_k ^ -1L) > (((hd) this).field_c ^ -1L)) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (((hd) this).field_k + (long)param3 <= (long)((hd) this).field_d + ((hd) this).field_c) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        cj.a(((hd) this).field_n, (int)(((hd) this).field_k - ((hd) this).field_c), param2, param0, param3);
                        ((hd) this).field_k = ((hd) this).field_k + (long)param3;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return;
                }
                case 10: {
                    try {
                        var5_long = ((hd) this).field_k;
                        var7 = param0;
                        var8 = param3;
                        if (((hd) this).field_k < ((hd) this).field_b) {
                            statePc = 16;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (((hd) this).field_k >= (long)((hd) this).field_l + ((hd) this).field_b) {
                            statePc = 16;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var9_int = (int)((long)((hd) this).field_l + (-((hd) this).field_k - -((hd) this).field_b));
                        if (param3 < var9_int) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var9_int = param3;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        cj.a(((hd) this).field_o, (int)(-((hd) this).field_b + ((hd) this).field_k), param2, param0, var9_int);
                        param0 = param0 + var9_int;
                        ((hd) this).field_k = ((hd) this).field_k + (long)var9_int;
                        param3 = param3 - var9_int;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (param3 > ((hd) this).field_o.length) {
                            statePc = 23;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (param3 > 0) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        this.a(-57);
                        var9_int = param3;
                        if (var9_int > ((hd) this).field_l) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var9_int = ((hd) this).field_l;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        cj.a(((hd) this).field_o, 0, param2, param0, var9_int);
                        ((hd) this).field_k = ((hd) this).field_k + (long)var9_int;
                        param3 = param3 - var9_int;
                        param0 = param0 + var9_int;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        ((hd) this).field_f.a(((hd) this).field_k, param1 + 19);
                        ((hd) this).field_a = ((hd) this).field_k;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (-1 <= (param3 ^ -1)) {
                            statePc = 28;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var9_int = ((hd) this).field_f.a(param0, -11274, param3, param2);
                        if ((var9_int ^ -1) != 0) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        ((hd) this).field_a = ((hd) this).field_a + (long)var9_int;
                        param3 = param3 - var9_int;
                        ((hd) this).field_k = ((hd) this).field_k + (long)var9_int;
                        param0 = param0 + var9_int;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if ((((hd) this).field_c ^ -1L) == 0L) {
                            statePc = 54;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (((hd) this).field_k >= ((hd) this).field_c) {
                            statePc = 36;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (param3 <= 0) {
                            statePc = 36;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var9_int = param0 - -(int)(-((hd) this).field_k + ((hd) this).field_c);
                        if (var9_int > param0 + param3) {
                            statePc = 33;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var9_int = param0 + param3;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (var9_int <= param0) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        param3--;
                        param0++;
                        param2[param0] = (byte) 0;
                        ((hd) this).field_k = ((hd) this).field_k + 1L;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var9 = -1L;
                        if (((hd) this).field_c < var5_long) {
                            statePc = 39;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if ((long)var8 + var5_long <= ((hd) this).field_c) {
                            statePc = 39;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var9 = ((hd) this).field_c;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (var5_long < ((hd) this).field_c) {
                            statePc = 42;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if ((var5_long ^ -1L) <= (((hd) this).field_c + (long)((hd) this).field_d ^ -1L)) {
                            statePc = 42;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var9 = var5_long;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var11 = -1L;
                        if ((var5_long ^ -1L) <= (((hd) this).field_c - -(long)((hd) this).field_d ^ -1L)) {
                            statePc = 45;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if ((long)var8 + var5_long < (long)((hd) this).field_d + ((hd) this).field_c) {
                            statePc = 45;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var11 = (long)((hd) this).field_d + ((hd) this).field_c;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if ((var5_long + (long)var8 ^ -1L) >= (((hd) this).field_c ^ -1L)) {
                            statePc = 48;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (((long)((hd) this).field_d + ((hd) this).field_c ^ -1L) > (var5_long - -(long)var8 ^ -1L)) {
                            statePc = 48;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var11 = (long)var8 + var5_long;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (0L <= (var9 ^ -1L)) {
                            statePc = 54;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if ((var9 ^ -1L) <= (var11 ^ -1L)) {
                            statePc = 54;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var13 = (int)(var11 + -var9);
                        cj.a(((hd) this).field_n, (int)(var9 + -((hd) this).field_c), param2, var7 + (int)(var9 - var5_long), var13);
                        if ((var11 ^ -1L) >= (((hd) this).field_k ^ -1L)) {
                            statePc = 54;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        param3 = (int)((long)param3 - (-((hd) this).field_k + var11));
                        ((hd) this).field_k = var11;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 53: {
                    var5 = (IOException) (Object) caughtException;
                    ((hd) this).field_a = -1L;
                    throw var5;
                }
                case 54: {
                    if (param3 > 0) {
                        statePc = 56;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 56: {
                    throw new EOFException();
                }
                case 57: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, byte[] param1) throws IOException {
        ((hd) this).a(param0, param0 ^ -1, param1, param1.length);
    }

    final static cf a(boolean param0, int param1, String param2) {
        va var3 = null;
        var3 = ci.a(param2, -10396);
        if (var3 != null) {
          if (param0) {
            return null;
          } else {
            return new cf(var3, param1);
          }
        } else {
          return null;
        }
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        IOException var5 = null;
        int var5_int = 0;
        long var5_long = 0L;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = DungeonAssault.field_K;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (((hd) this).field_k - -(long)param2 > ((hd) this).field_p) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ((hd) this).field_p = (long)param2 + ((hd) this).field_k;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param1 < -75) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        hd.a(true);
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (-1L == ((hd) this).field_c) {
                            statePc = 11;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if ((((hd) this).field_c ^ -1L) < (((hd) this).field_k ^ -1L)) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (((hd) this).field_k > ((hd) this).field_c + (long)((hd) this).field_d) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        this.d((byte) 115);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if ((((hd) this).field_c ^ -1L) == 0L) {
                            statePc = 15;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if ((((hd) this).field_k - -(long)param2 ^ -1L) < ((long)((hd) this).field_n.length + ((hd) this).field_c ^ -1L)) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var5_int = (int)(((hd) this).field_c + -((hd) this).field_k + (long)((hd) this).field_n.length);
                        cj.a(param3, param0, ((hd) this).field_n, (int)(((hd) this).field_k + -((hd) this).field_c), var5_int);
                        param0 = param0 + var5_int;
                        ((hd) this).field_k = ((hd) this).field_k + (long)var5_int;
                        param2 = param2 - var5_int;
                        ((hd) this).field_d = ((hd) this).field_n.length;
                        this.d((byte) -92);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (((hd) this).field_n.length >= param2) {
                            statePc = 41;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if ((((hd) this).field_k ^ -1L) == (((hd) this).field_a ^ -1L)) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        ((hd) this).field_f.a(((hd) this).field_k, 18);
                        ((hd) this).field_a = ((hd) this).field_k;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        ((hd) this).field_f.a(param0, 102, param3, param2);
                        ((hd) this).field_a = ((hd) this).field_a + (long)param2;
                        if (((hd) this).field_a > ((hd) this).field_i) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        ((hd) this).field_i = ((hd) this).field_a;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var5_long = -1L;
                        var7 = -1L;
                        if ((((hd) this).field_k ^ -1L) > (((hd) this).field_b ^ -1L)) {
                            statePc = 24;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (((hd) this).field_k < (long)((hd) this).field_l + ((hd) this).field_b) {
                            statePc = 27;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if ((((hd) this).field_k ^ -1L) < (((hd) this).field_b ^ -1L)) {
                            statePc = 28;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if ((((hd) this).field_b ^ -1L) <= (((hd) this).field_k + (long)param2 ^ -1L)) {
                            statePc = 28;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var5_long = ((hd) this).field_b;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var5_long = ((hd) this).field_k;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (((long)param2 + ((hd) this).field_k ^ -1L) >= (((hd) this).field_b ^ -1L)) {
                            statePc = 31;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if ((long)param2 + ((hd) this).field_k > ((hd) this).field_b - -(long)((hd) this).field_l) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var7 = ((hd) this).field_k + (long)param2;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (((hd) this).field_k >= ((hd) this).field_b - -(long)((hd) this).field_l) {
                            statePc = 35;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if ((((hd) this).field_b - -(long)((hd) this).field_l ^ -1L) >= ((long)param2 + ((hd) this).field_k ^ -1L)) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var7 = (long)((hd) this).field_l + ((hd) this).field_b;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (0L <= (var5_long ^ -1L)) {
                            statePc = 39;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if ((var5_long ^ -1L) > (var7 ^ -1L)) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var9 = (int)(var7 - var5_long);
                        cj.a(param3, (int)(-((hd) this).field_k + (var5_long + (long)param0)), ((hd) this).field_o, (int)(var5_long + -((hd) this).field_b), var9);
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        ((hd) this).field_k = ((hd) this).field_k + (long)param2;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 40: {
                    return;
                }
                case 41: {
                    try {
                        if (param2 <= 0) {
                            statePc = 50;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if ((((hd) this).field_c ^ -1L) == 0L) {
                            statePc = 44;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        ((hd) this).field_c = ((hd) this).field_k;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        cj.a(param3, param0, ((hd) this).field_n, (int)(-((hd) this).field_c + ((hd) this).field_k), param2);
                        ((hd) this).field_k = ((hd) this).field_k + (long)param2;
                        if (-((hd) this).field_c + ((hd) this).field_k > (long)((hd) this).field_d) {
                            statePc = 47;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        ((hd) this).field_d = (int)(((hd) this).field_k - ((hd) this).field_c);
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 48: {
                    return;
                }
                case 49: {
                    var5 = (IOException) (Object) caughtException;
                    ((hd) this).field_a = -1L;
                    throw var5;
                }
                case 50: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    hd(qp param0, int param1, int param2) throws IOException {
        ((hd) this).field_b = -1L;
        ((hd) this).field_d = 0;
        ((hd) this).field_c = -1L;
        ((hd) this).field_f = param0;
        ((hd) this).field_i = param0.a((byte) 91);
        ((hd) this).field_p = param0.a((byte) 91);
        ((hd) this).field_n = new byte[param2];
        ((hd) this).field_o = new byte[param1];
        ((hd) this).field_k = 0L;
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
