/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class um extends d implements ih {
    static String field_m;
    static ah field_k;
    static hl field_n;
    static hl field_l;
    private nn field_p;
    static boolean field_o;

    public final void a(nn param0, byte param1) {
        if (param1 != 101) {
            Object var4 = null;
            String discarded$0 = um.a((String) null, ' ', false, (String) null);
        }
    }

    abstract jk a(int param0, String param1);

    abstract String a(String param0, int param1);

    final static String a(String param0, char param1, boolean param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        StringBuilder var12 = null;
        StringBuilder var13 = null;
        var11 = TetraLink.field_J;
        var4 = param0.length();
        var5 = param3.length();
        var6 = var4;
        var7 = -1 + var5;
        if (var7 == 0) {
          var12 = new StringBuilder(var6);
          var9 = 0;
          L0: while (true) {
            var10 = param0.indexOf((int) param1, var9);
            if (-1 < (var10 ^ -1)) {
              if (param2) {
                return null;
              } else {
                StringBuilder discarded$6 = var12.append(param0.substring(var9));
                return var12.toString();
              }
            } else {
              StringBuilder discarded$7 = var12.append(param0.substring(var9, var10));
              var9 = var10 + 1;
              StringBuilder discarded$8 = var12.append(param3);
              continue L0;
            }
          }
        } else {
          var8_int = 0;
          L1: while (true) {
            var8_int = param0.indexOf((int) param1, var8_int);
            if (var8_int >= 0) {
              var6 = var6 + var7;
              var8_int++;
              continue L1;
            } else {
              var13 = new StringBuilder(var6);
              var8 = var13;
              var9 = 0;
              L2: while (true) {
                var10 = param0.indexOf((int) param1, var9);
                if (-1 < (var10 ^ -1)) {
                  if (param2) {
                    return null;
                  } else {
                    StringBuilder discarded$9 = var13.append(param0.substring(var9));
                    return var13.toString();
                  }
                } else {
                  StringBuilder discarded$10 = var13.append(param0.substring(var9, var10));
                  var9 = var10 + 1;
                  StringBuilder discarded$11 = var13.append(param3);
                  continue L2;
                }
              }
            }
          }
        }
    }

    final jk a(boolean param0) {
        Object var3 = null;
        if (param0) {
          var3 = null;
          ((um) this).a((byte) 77, (nn) null);
          return ((um) this).a(0, ((um) this).field_p.field_A);
        } else {
          return ((um) this).a(0, ((um) this).field_p.field_A);
        }
    }

    public final boolean b(int param0) {
        int stackIn_5_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == 13074) {
          if (null != ((um) this).field_p.field_A) {
            if (((um) this).field_p.field_A.length() == 0) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_3_0 = 1;
            stackIn_5_0 = stackOut_3_0;
            return stackIn_5_0 != 0;
          }
        } else {
          return false;
        }
    }

    public final void a(byte param0, nn param1) {
        ((um) this).a(127);
        int var3 = 33 / ((-18 - param0) / 63);
    }

    final String e(int param0) {
        if (param0 != 0) {
            return null;
        }
        return ((um) this).a(((um) this).field_p.field_A, 26202);
    }

    public static void f(int param0) {
        Object var2 = null;
        field_m = null;
        if (param0 != 0) {
          var2 = null;
          String discarded$2 = um.a((String) null, 'w', false, (String) null);
          field_k = null;
          field_n = null;
          field_l = null;
          return;
        } else {
          field_k = null;
          field_n = null;
          field_l = null;
          return;
        }
    }

    um(nn param0) {
        ((um) this).field_p = param0;
    }

    static {
    }
}
