/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ls extends IOException {
    ls(String param0) {
        super(param0);
    }

    final static void a(boolean param0, byte param1) {
        ul.a(param0, true, param1 + -7358);
        if (param1 != -37) {
            ls.a(false, (byte) -113);
        }
    }

    final static String a(CharSequence param0, boolean param1, byte param2) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        CharSequence var9 = null;
        Object var16 = null;
        var16 = null;
        var8 = AceOfSkies.field_G ? 1 : 0;
        if (param0 == null) {
          return rn.field_c;
        } else {
          var3 = ((CharSequence) param0).length();
          if (-2 >= var3) {
            if (-13 >= var3) {
              var4 = vu.a(param2 + 104, param0);
              if (var4 != null) {
                if (var4.length() >= 1) {
                  L0: {
                    if (za.a((byte) 117, var4.charAt(0))) {
                      break L0;
                    } else {
                      if (za.a((byte) 117, var4.charAt(-1 + var4.length()))) {
                        break L0;
                      } else {
                        var5 = 0;
                        var6 = 0;
                        L1: while (true) {
                          if (((CharSequence) param0).length() <= var6) {
                            if (param2 == 21) {
                              if (var5 > 0) {
                                return hd.field_a;
                              } else {
                                return null;
                              }
                            } else {
                              var9 = (CharSequence) null;
                              String discarded$1 = ls.a((CharSequence) null, true, (byte) -120);
                              if (var5 > 0) {
                                return hd.field_a;
                              } else {
                                return null;
                              }
                            }
                          } else {
                            L2: {
                              var7 = ((CharSequence) param0).charAt(var6);
                              if (!za.a((byte) 117, (char) var7)) {
                                var5 = 0;
                                break L2;
                              } else {
                                var5++;
                                break L2;
                              }
                            }
                            if ((var5 ^ -1) > -3) {
                              var6++;
                              var6++;
                              continue L1;
                            } else {
                              if (!param1) {
                                return jn.field_u;
                              } else {
                                var6++;
                                continue L1;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  return hd.field_a;
                } else {
                  return rn.field_c;
                }
              } else {
                return rn.field_c;
              }
            } else {
              return rn.field_c;
            }
          } else {
            return rn.field_c;
          }
        }
    }

    static {
    }
}
