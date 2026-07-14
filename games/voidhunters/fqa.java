/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fqa extends rqa {
    final nc a(nc[] param0, int param1) {
        si.a(102, 62, param0[0].a(68));
        if (param1 > -119) {
          return null;
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    fqa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static boolean a(boolean param0, String param1, String param2) {
        String var3 = null;
        String var4 = null;
        Object var5 = null;
        CharSequence var6 = null;
        CharSequence var7 = null;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var6 = (CharSequence) (Object) param1;
          var3 = jwa.a(false, var6);
          if (param0) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var7 = (CharSequence) (Object) param2;
        var4 = jwa.a(stackIn_3_0 != 0, var7);
        if (var3 == null) {
          if (var4 != null) {
            if (param0) {
              if (var3 != null) {
                if (var4 != null) {
                  return var3.equals((Object) (Object) var4);
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              var5 = null;
              boolean discarded$2 = fqa.a(false, (String) null, (String) null);
              if (var3 != null) {
                if (var4 == null) {
                  return false;
                } else {
                  return var3.equals((Object) (Object) var4);
                }
              } else {
                return false;
              }
            }
          } else {
            return true;
          }
        } else {
          if (param0) {
            if (var3 != null) {
              if (var4 == null) {
                return false;
              } else {
                return var3.equals((Object) (Object) var4);
              }
            } else {
              return false;
            }
          } else {
            var5 = null;
            boolean discarded$3 = fqa.a(false, (String) null, (String) null);
            if (var3 != null) {
              if (var4 == null) {
                return false;
              } else {
                return var3.equals((Object) (Object) var4);
              }
            } else {
              return false;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        etb discarded$0 = new etb();
    }
}
