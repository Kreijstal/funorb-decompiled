/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sn {
    int field_a;
    boolean field_b;
    int field_d;
    static long field_c;

    final static void a(hc param0, int param1, int param2, hc param3) {
        nh.field_c = param0;
        qk.field_g = param1;
        pk.field_e = param3;
        mb.a(vp.field_c / 2, vp.field_i / 2, (byte) 74);
        if (param2 != 24097) {
            return;
        }
        hh.a(((hc) param3).field_C - -((hc) param3).field_D, ((hc) param0).field_D + ((hc) param0).field_C, -79, ((hc) param3).field_C, ((hc) param0).field_C);
    }

    final boolean a(vu param0, int param1) {
        if (param1 != 0) {
            return false;
        }
        return true;
    }

    final static String a(String param0, int param1, String[] param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        String var7_ref = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        var11 = AceOfSkies.field_G ? 1 : 0;
        var3 = param0.length();
        var4 = var3;
        var5 = 0;
        L0: while (true) {
          var6_int = param0.indexOf("<%", var5);
          if ((var6_int ^ -1) <= -1) {
            var5 = var6_int + 2;
            L1: while (true) {
              L2: {
                if (var5 >= var3) {
                  break L2;
                } else {
                  if (!oj.a(param0.charAt(var5), (byte) -45)) {
                    break L2;
                  } else {
                    var5++;
                    continue L1;
                  }
                }
              }
              var7_ref = param0.substring(2 + var6_int, var5);
              if (vl.a(10, (CharSequence) (Object) var7_ref)) {
                if (var5 >= var3) {
                  continue L0;
                } else {
                  if (62 == param0.charAt(var5)) {
                    var5++;
                    var8 = td.a((CharSequence) (Object) var7_ref, (byte) 38);
                    var4 = var4 + (param2[var8].length() + var6_int + -var5);
                    continue L0;
                  } else {
                    continue L0;
                  }
                }
              } else {
                continue L0;
              }
            }
          } else {
            L3: {
              var6 = new StringBuilder(var4);
              var5 = 0;
              var7 = 0;
              if (param1 > 104) {
                break L3;
              } else {
                field_c = 115L;
                break L3;
              }
            }
            L4: while (true) {
              var8 = param0.indexOf("<%", var5);
              if (0 <= var8) {
                var5 = 2 + var8;
                L5: while (true) {
                  L6: {
                    if (var3 <= var5) {
                      break L6;
                    } else {
                      if (!oj.a(param0.charAt(var5), (byte) -116)) {
                        break L6;
                      } else {
                        var5++;
                        continue L5;
                      }
                    }
                  }
                  var9 = param0.substring(var8 - -2, var5);
                  if (!vl.a(10, (CharSequence) (Object) var9)) {
                    continue L4;
                  } else {
                    if (var5 >= var3) {
                      continue L4;
                    } else {
                      if (param0.charAt(var5) == 62) {
                        var5++;
                        var10 = td.a((CharSequence) (Object) var9, (byte) 38);
                        StringBuilder discarded$3 = var6.append(param0.substring(var7, var8));
                        var7 = var5;
                        StringBuilder discarded$4 = var6.append(param2[var10]);
                        continue L4;
                      } else {
                        continue L4;
                      }
                    }
                  }
                }
              } else {
                StringBuilder discarded$5 = var6.append(param0.substring(var7));
                return var6.toString();
              }
            }
          }
        }
    }

    public final String toString() {
        return this.toString();
    }

    final boolean a(byte param0, sn param1) {
        if (param0 != -73) {
            vu var4 = (vu) null;
            boolean discarded$0 = ((sn) this).a((vu) null, 115);
        }
        return ((sn) this).field_d == ((sn) param1).field_d ? true : false;
    }

    sn(int param0, int param1) {
        ((sn) this).field_b = true;
        ((sn) this).field_d = param0;
        ((sn) this).field_a = param1;
    }

    static {
    }
}
