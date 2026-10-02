/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class cm extends cj {
    private long field_e;
    static String checkingText;
    private long field_i;
    private int field_g;
    private long[] field_f;
    private int field_d;
    static int[] field_j;
    private long field_c;

    final static void c(int param0) {
        int var8_int = 0;
        String[][] dupTemp$0 = null;
        int[][] dupTemp$1 = null;
        int var19 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        mg var4 = null;
        ai var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        int[][] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        pk var27 = null;
        long[][] var31 = null;
        var26 = Geoblox.field_C;
        try {
          L0: {
            if (param0 != -24839) {
              cm.a(false);
            }
            L2: {
              var27 = eh.field_d;
              var2 = var27.c((byte) 34);
              if (var2 == 0) {
                var3 = var27.b(true);
                var4 = (mg) ((Object) rh.field_d.firstForIteration(0));
                L3: while (var4 != null) {
                  if (var4.field_i != var3) {
                    var4 = (mg) ((Object) rh.field_d.nextForIteration(1));
                    continue L3;
                  }
                  break;
                }
                if (var4 != null) {
                  L5: {
                    var5 = var27.c((byte) 34);
                    if (var5 != 0) {
                      var6 = var4.field_f;
                      var7 = var4.field_l;
                      id.field_b[0].field_c = false;
                      id.field_b[0].field_d = SecondaryDeque.field_f;
                      id.field_b[0].field_a = null;
                      for (var8_int = 1; var5 > var8_int; var8_int++) {
                        id.field_b[var8_int].field_d = var27.e((byte) 104);
                        id.field_b[var8_int].field_c = false;
                        if (var27.c((byte) 34) == 1) {
                          id.field_b[var8_int].field_a = var27.e((byte) 122);
                        } else {
                          id.field_b[var8_int].field_a = null;
                        }
                      }
                      dupTemp$0 = new String[3][var6];
                      var4.field_k = dupTemp$0;
                      var8 = dupTemp$0;
                      var9 = new String[3][var6];
                      var31 = new long[3][var6];
                      dupTemp$1 = new int[3][var6 * var7];
                      var4.field_h = dupTemp$1;
                      var11 = dupTemp$1;
                      var12 = 0;
                      var13 = 0;
                      var14 = 0;
                      var15 = 0;
                      var16 = 0;
                      var17 = 0;
                      var18 = var27.c((byte) 34);
                      if (0 >= var18) {
                        break L5;
                      } else {
                        for (var19 = 0; var19 < var18; var19++) {
                          L8: {
                            var20 = var27.c((byte) 34);
                            var21 = id.field_b[var20].field_d;
                            var22 = var27.b(2901);
                            var24 = var27.field_f;
                            if (var6 > var19) {
                              var8[0][var12] = var21;
                              var9[0][var12] = id.field_b[var20].field_a;
                              var31[0][var12] = var22;
                              for (var25 = 0; var25 < var7; var25++) {
                                incrementValue$2 = var15;
                                var15++;
                                var11[0][incrementValue$2] = var27.a((byte) -76);
                              }
                              var12++;
                              break L8;
                            }
                          }
                          L10: {
                            if (var21 != null) {
                              if (ge.a(var21, (byte) 12)) {
                                var8[1][var13] = SecondaryDeque.field_f;
                                var9[1][var13] = null;
                                var31[1][var13] = var22;
                                var13++;
                                var27.field_f = var24;
                                for (var25 = 0; var25 < var7; var25++) {
                                  incrementValue$3 = var16;
                                  var16++;
                                  var11[1][incrementValue$3] = var27.a((byte) -122);
                                }
                                break L10;
                              }
                            }
                          }
                          L12: {
                            if (var14 < var6) {
                              if (!id.field_b[var20].field_c) {
                                id.field_b[var20].field_c = true;
                                var8[2][var14] = var21;
                                var9[2][var14] = id.field_b[var20].field_a;
                                var31[2][var14] = var22;
                                var14++;
                                var27.field_f = var24;
                                for (var25 = 0; var7 > var25; var25++) {
                                  incrementValue$4 = var17;
                                  var17++;
                                  var11[2][incrementValue$4] = var27.a((byte) -101);
                                }
                                break L12;
                              }
                            }
                          }
                        }
                        break L5;
                      }
                    }
                  }
                  var4.field_j = true;
                  var4.unlinkNode(false);
                  break L2;
                } else {
                  jl.a((byte) -115);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                if (1 == var2) {
                  var3 = var27.b(true);
                  var27.b(param0 + 27740);
                  var4_ref = (ai) ((Object) nf.field_j.firstForIteration(0));
                  L15: while (var4_ref != null) {
                    if (var3 != var4_ref.field_q) {
                      var4_ref = (ai) ((Object) nf.field_j.nextForIteration(1));
                      continue L15;
                    }
                    break;
                  }
                  if (var4_ref != null) {
                    var4_ref.unlinkNode(false);
                    break L2;
                  } else {
                    jl.a((byte) -117);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  gi.a((Throwable) null, "HS1: " + og.e(param0 + 24894), (byte) 125);
                  jl.a((byte) -117);
                }
              }
            }
            decompiledRegionSelector0 = 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "cm.F(" + param0 + ')');
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

    public static void a(boolean param0) {
        field_j = null;
        if (param0) {
            cm.a(false);
        }
        checkingText = null;
    }

    final static void a(int param0, int param1) {
        try {
            IOException iOException = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (null != oc.field_e) {
                if (param1 >= 0) {
                  if (pk.field_l != eh.field_b) {
                    break L0;
                  }
                }
                if (0 == fj.field_q.field_f) {
                  if (~oa.a(-12520) < ~(10000L + v.field_r)) {
                    fj.field_q.a(param1, (byte) -76);
                  }
                }
                if (param0 > ~fj.field_q.field_f) {
                  try {
                    oc.field_e.a(100, 0, fj.field_q.field_f, fj.field_q.field_j);
                    v.field_r = oa.a(-12520);
                  } catch (java.io.IOException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    iOException = (IOException) (Object) decompiledCaughtException;
                    jl.a((byte) -117);
                  }
                  fj.field_q.field_f = 0;
                }
                return;
              }
            }
            fj.field_q.field_f = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0) {
        if (~this.field_e > ~this.field_c) {
            this.field_e = this.field_e + (this.field_c + -this.field_e);
        }
        if (param0 < 60) {
            return;
        }
        this.field_i = 0L;
    }

    final int a(boolean param0, long param1) {
        int var4;
        int var5;
        var5 = Geoblox.field_C;
        if (!param0) {
          cm.a(true);
        }
        if (this.field_c <= this.field_e) {
          var4 = 0;
          L1: while (true) {
            var4++;
            this.field_c = this.field_c + param1;
            if (var4 < 10) {
              if (~this.field_c > ~this.field_e) {
                continue L1;
              }
            }
            if (this.field_e > this.field_c) {
              this.field_c = this.field_e;
            }
            return var4;
          }
        } else {
          this.field_i = this.field_i + (-this.field_e + this.field_c);
          this.field_e = this.field_e + (-this.field_e + this.field_c);
          this.field_c = this.field_c + param1;
          return 1;
        }
    }

    private final long d(int param0) {
        int var8 = 0;
        int var9 = Geoblox.field_C;
        long var2 = System.nanoTime();
        long var4 = -this.field_i + var2;
        this.field_i = var2;
        if (-5000000000L < var4) {
            if (!(5000000000L <= var4)) {
                this.field_f[this.field_d] = var4;
                if (this.field_g < 1) {
                    this.field_g = this.field_g + 1;
                }
                this.field_d = (this.field_d - -1) % 10;
            }
        }
        long var6 = (long)param0;
        for (var8 = 1; var8 <= this.field_g; var8++) {
            var6 = var6 + this.field_f[(-var8 + (this.field_d + 10)) % 10];
        }
        return var6 / (long)this.field_g;
    }

    final long a(byte param0) {
        this.field_e = this.field_e + this.d(0);
        if (param0 != -49) {
            this.a(false, 97L);
        }
        if (~this.field_c < ~this.field_e) {
            return (this.field_c + -this.field_e) / 1000000L;
        }
        return 0L;
    }

    cm() {
        this.field_g = 1;
        this.field_f = new long[10];
        this.field_d = 0;
        this.field_i = 0L;
        this.field_e = 0L;
        this.field_c = 0L;
        this.field_e = System.nanoTime();
        this.field_c = System.nanoTime();
    }

    static {
        checkingText = "Checking";
    }
}
