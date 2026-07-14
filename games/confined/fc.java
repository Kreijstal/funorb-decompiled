/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fc {
    private int field_c;
    static mn field_a;
    private int[] field_e;
    private int field_i;
    private int field_g;
    private int[] field_b;
    static od field_d;
    static volatile boolean field_f;
    private int field_h;

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Confined.field_J ? 1 : 0;
        var4 = 46 / ((param0 - -56) / 40);
        ((fc) this).field_c = ((fc) this).field_c + 1;
        ((fc) this).field_h = ((fc) this).field_h + (((fc) this).field_c + 1);
        var2 = 0;
        L0: while (true) {
          if (var2 <= -257) {
            return;
          } else {
            L1: {
              var3 = ((fc) this).field_e[var2];
              if (-1 != (var2 & 2)) {
                if (0 == (var2 & 1)) {
                  ((fc) this).field_i = ((fc) this).field_i ^ ((fc) this).field_i << 586757698;
                  break L1;
                } else {
                  ((fc) this).field_i = ((fc) this).field_i ^ ((fc) this).field_i >>> 921568144;
                  break L1;
                }
              } else {
                if ((1 & var2) != 0) {
                  ((fc) this).field_i = ((fc) this).field_i ^ ((fc) this).field_i >>> 2117997638;
                  break L1;
                } else {
                  ((fc) this).field_i = ((fc) this).field_i ^ ((fc) this).field_i << -1888705811;
                  break L1;
                }
              }
            }
            ((fc) this).field_i = ((fc) this).field_i + ((fc) this).field_e[255 & 128 + var2];
            var5 = ((fc) this).field_e[va.a(255, var3 >> 247630498)] - (-((fc) this).field_i + -((fc) this).field_h);
            ((fc) this).field_e[var2] = ((fc) this).field_e[va.a(255, var3 >> 247630498)] - (-((fc) this).field_i + -((fc) this).field_h);
            ((fc) this).field_h = ((fc) this).field_e[va.a(var5 >> 1964197960 >> -20768638, 255)] + var3;
            ((fc) this).field_b[var2] = ((fc) this).field_e[va.a(var5 >> 1964197960 >> -20768638, 255)] + var3;
            var2++;
            continue L0;
          }
        }
    }

    final static void a(boolean param0, mn param1) {
        oi var2 = null;
        oi var2_ref = null;
        oi var3 = null;
        oi var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        var5 = Confined.field_J ? 1 : 0;
        if (param0) {
          L0: while (true) {
            var2 = (oi) (Object) param1.a(false);
            if (var2 != null) {
              var3 = (oi) (Object) param1.a((byte) -124);
              var4 = 1;
              L1: while (true) {
                if (var3 == null) {
                  if (var4 != 0) {
                    return;
                  } else {
                    var3 = (oi) (Object) param1.a(-113);
                    var2 = (oi) (Object) param1.d(2123);
                    var4 = 1;
                    L2: while (true) {
                      if (var2 == null) {
                        if (var4 != 0) {
                          return;
                        } else {
                          continue L0;
                        }
                      } else {
                        L3: {
                          if (var2.field_n + var2.field_p > var3.field_n + var3.field_p) {
                            var4 = 0;
                            ri.a((rk) (Object) var3_ref, 0, (rk) (Object) var2);
                            break L3;
                          } else {
                            var3_ref = var2;
                            break L3;
                          }
                        }
                        var2 = (oi) (Object) param1.d(2123);
                        continue L2;
                      }
                    }
                  }
                } else {
                  L4: {
                    if (var3.field_p + var3.field_n < var2.field_n + var2.field_p) {
                      var4 = 0;
                      ri.a((rk) (Object) var3, 0, (rk) (Object) var2_ref);
                      break L4;
                    } else {
                      var2_ref = var3;
                      break L4;
                    }
                  }
                  var3 = (oi) (Object) param1.a((byte) -127);
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, int[] param2, int param3, byte[] param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = Confined.field_J ? 1 : 0;
        if (param0 != -1257536924) {
            return;
        }
        for (var5 = 0; var5 < vb.field_e.length; var5++) {
            param3 = vb.field_e[var5];
            var6 = var5 << -1257536924;
            while (true) {
                param3--;
                if (param3 == 0) {
                    break;
                }
                var6++;
                param1 = tl.field_i[var6];
                param2[param4[param1]] = param2[param4[param1]] + 1;
                tl.field_i[param2[param4[param1]]] = param1;
            }
        }
    }

    final static String a(CharSequence[] param0, int param1, int param2, int param3) {
        CharSequence var4_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        int var7 = 0;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        var9 = Confined.field_J ? 1 : 0;
        if (-1 != param3) {
          if (param1 != param3) {
            var4 = param3 - -param2;
            var5 = 0;
            var6_int = param2;
            L0: while (true) {
              if (var4 <= var6_int) {
                var6 = new StringBuilder(var5);
                var7 = param2;
                L1: while (true) {
                  if (var4 <= var7) {
                    return var6.toString();
                  } else {
                    var8 = param0[var7];
                    if (var8 != null) {
                      StringBuilder discarded$2 = var6.append(var8);
                      var7++;
                      continue L1;
                    } else {
                      StringBuilder discarded$3 = var6.append("null");
                      var7++;
                      continue L1;
                    }
                  }
                }
              } else {
                var7_ref_CharSequence = param0[var6_int];
                if (var7_ref_CharSequence == null) {
                  var5 += 4;
                  var6_int++;
                  continue L0;
                } else {
                  var5 = var5 + var7_ref_CharSequence.length();
                  var6_int++;
                  continue L0;
                }
              }
            }
          } else {
            var10 = param0[param2];
            var4_ref = var10;
            if (var4_ref != null) {
              return ((Object) (Object) var10).toString();
            } else {
              return "null";
            }
          }
        } else {
          return "";
        }
    }

    private final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Confined.field_J ? 1 : 0;
        var3 = -1640531527;
        var10 = -1640531527;
        var4 = -1640531527;
        var8 = -1640531527;
        var5 = -1640531527;
        var7 = -1640531527;
        var9 = -1640531527;
        var6 = -1640531527;
        if (param0 == -4) {
          var2 = 0;
          L0: while (true) {
            if ((var2 ^ -1) <= -5) {
              var2 = 0;
              L1: while (true) {
                if (var2 >= 256) {
                  var2 = 0;
                  L2: while (true) {
                    if (-257 >= (var2 ^ -1)) {
                      this.a((byte) -118);
                      ((fc) this).field_g = 256;
                      return;
                    } else {
                      var4 = var4 + ((fc) this).field_e[var2 - -1];
                      var3 = var3 + ((fc) this).field_e[var2];
                      var7 = var7 + ((fc) this).field_e[4 + var2];
                      var6 = var6 + ((fc) this).field_e[3 + var2];
                      var10 = var10 + ((fc) this).field_e[var2 + 7];
                      var5 = var5 + ((fc) this).field_e[var2 + 2];
                      var9 = var9 + ((fc) this).field_e[6 + var2];
                      var8 = var8 + ((fc) this).field_e[var2 - -5];
                      var3 = var3 ^ var4 << -1787013205;
                      var6 = var6 + var3;
                      var4 = var4 + var5;
                      var4 = var4 ^ var5 >>> 1115036258;
                      var7 = var7 + var4;
                      var5 = var5 + var6;
                      var5 = var5 ^ var6 << -1845440664;
                      var6 = var6 + var7;
                      var8 = var8 + var5;
                      var6 = var6 ^ var7 >>> -355437744;
                      var7 = var7 + var8;
                      var9 = var9 + var6;
                      var7 = var7 ^ var8 << -1156872726;
                      var8 = var8 + var9;
                      var10 = var10 + var7;
                      var8 = var8 ^ var9 >>> -843278108;
                      var3 = var3 + var8;
                      var9 = var9 + var10;
                      var9 = var9 ^ var10 << 1987222120;
                      var10 = var10 + var3;
                      var4 = var4 + var9;
                      var10 = var10 ^ var3 >>> -1122962391;
                      var5 = var5 + var10;
                      var3 = var3 + var4;
                      ((fc) this).field_e[var2] = var3;
                      ((fc) this).field_e[1 + var2] = var4;
                      ((fc) this).field_e[var2 - -2] = var5;
                      ((fc) this).field_e[3 + var2] = var6;
                      ((fc) this).field_e[var2 - -4] = var7;
                      ((fc) this).field_e[var2 + 5] = var8;
                      ((fc) this).field_e[var2 - -6] = var9;
                      ((fc) this).field_e[var2 - -7] = var10;
                      var2 += 8;
                      continue L2;
                    }
                  }
                } else {
                  var8 = var8 + ((fc) this).field_b[var2 + 5];
                  var3 = var3 + ((fc) this).field_b[var2];
                  var5 = var5 + ((fc) this).field_b[var2 + 2];
                  var4 = var4 + ((fc) this).field_b[1 + var2];
                  var7 = var7 + ((fc) this).field_b[var2 + 4];
                  var10 = var10 + ((fc) this).field_b[var2 - -7];
                  var6 = var6 + ((fc) this).field_b[3 + var2];
                  var9 = var9 + ((fc) this).field_b[var2 + 6];
                  var3 = var3 ^ var4 << -1864628629;
                  var6 = var6 + var3;
                  var4 = var4 + var5;
                  var4 = var4 ^ var5 >>> -115193118;
                  var7 = var7 + var4;
                  var5 = var5 + var6;
                  var5 = var5 ^ var6 << 912736200;
                  var8 = var8 + var5;
                  var6 = var6 + var7;
                  var6 = var6 ^ var7 >>> -895527152;
                  var7 = var7 + var8;
                  var9 = var9 + var6;
                  var7 = var7 ^ var8 << 419714410;
                  var10 = var10 + var7;
                  var8 = var8 + var9;
                  var8 = var8 ^ var9 >>> 198577188;
                  var3 = var3 + var8;
                  var9 = var9 + var10;
                  var9 = var9 ^ var10 << -281224280;
                  var4 = var4 + var9;
                  var10 = var10 + var3;
                  var10 = var10 ^ var3 >>> 1226148361;
                  var3 = var3 + var4;
                  var5 = var5 + var10;
                  ((fc) this).field_e[var2] = var3;
                  ((fc) this).field_e[var2 + 1] = var4;
                  ((fc) this).field_e[var2 + 2] = var5;
                  ((fc) this).field_e[var2 - -3] = var6;
                  ((fc) this).field_e[var2 + 4] = var7;
                  ((fc) this).field_e[var2 - -5] = var8;
                  ((fc) this).field_e[6 + var2] = var9;
                  ((fc) this).field_e[7 + var2] = var10;
                  var2 += 8;
                  continue L1;
                }
              }
            } else {
              var3 = var3 ^ var4 << -259644469;
              var4 = var4 + var5;
              var6 = var6 + var3;
              var4 = var4 ^ var5 >>> 312474274;
              var7 = var7 + var4;
              var5 = var5 + var6;
              var5 = var5 ^ var6 << 1859667368;
              var6 = var6 + var7;
              var8 = var8 + var5;
              var6 = var6 ^ var7 >>> -1877819920;
              var7 = var7 + var8;
              var9 = var9 + var6;
              var7 = var7 ^ var8 << 450261322;
              var10 = var10 + var7;
              var8 = var8 + var9;
              var8 = var8 ^ var9 >>> 1357912068;
              var9 = var9 + var10;
              var3 = var3 + var8;
              var9 = var9 ^ var10 << 1842914536;
              var10 = var10 + var3;
              var4 = var4 + var9;
              var10 = var10 ^ var3 >>> 1719400713;
              var5 = var5 + var10;
              var3 = var3 + var4;
              var2++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    final static void a(mn param0, byte param1) {
        oi var2 = null;
        oi var3 = null;
        int var4 = 0;
        int var5 = Confined.field_J ? 1 : 0;
        if (param1 < 13) {
            return;
        }
        do {
            var2 = (oi) (Object) param0.a(false);
            if (!(var2 != null)) {
                return;
            }
            var3 = (oi) (Object) param0.a((byte) -30);
            var4 = 1;
            while (var3 != null) {
                if (var3.field_p - var3.field_n < -var2.field_n + var2.field_p) {
                    ri.a((rk) (Object) var3, 0, (rk) (Object) var2);
                    var4 = 0;
                } else {
                    oi var2_ref = var3;
                }
                var3 = (oi) (Object) param0.a((byte) -96);
            }
            if (var4 != 0) {
                return;
            }
            var3 = (oi) (Object) param0.a(59);
            var2 = (oi) (Object) param0.d(2123);
            var4 = 1;
            while (var2 != null) {
                if (var3.field_p - var3.field_n < -var2.field_n + var2.field_p) {
                    var4 = 0;
                    ri.a((rk) (Object) var3, 0, (rk) (Object) var2);
                } else {
                    oi var3_ref = var2;
                }
                var2 = (oi) (Object) param0.d(2123);
            }
        } while (var4 == 0);
    }

    public static void a(int param0) {
        field_a = null;
        field_d = null;
        if (param0 != -1) {
            field_f = false;
        }
    }

    final int c(int param0) {
        if (param0 != 256) {
            return 2;
        }
        if (!(((fc) this).field_g != 0)) {
            this.a((byte) -105);
            ((fc) this).field_g = 256;
        }
        ((fc) this).field_g = ((fc) this).field_g - 1;
        return ((fc) this).field_b[((fc) this).field_g - 1];
    }

    final static void a(int param0, String[] param1) {
        if (param0 != -7212) {
            field_f = false;
        }
        if (!(null == ki.field_b)) {
            ki.field_b.field_O.a((byte) -127, param1);
        }
        if (!(null == hb.field_u)) {
            hb.field_u.field_H.a((byte) -127, param1);
        }
    }

    fc(int[] param0) {
        int var2 = 0;
        ((fc) this).field_b = new int[256];
        ((fc) this).field_e = new int[256];
        for (var2 = 0; param0.length > var2; var2++) {
            ((fc) this).field_b[var2] = param0[var2];
        }
        this.b(-4);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new mn();
        field_f = true;
    }
}
