/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qh {
    static hh field_i;
    static String field_e;
    static int field_m;
    private boolean field_b;
    static int[] field_k;
    static ed field_l;
    static String[] field_j;
    private int field_f;
    private String field_h;
    private mf field_d;
    private String field_a;
    private int[] field_g;
    private ed field_c;

    final ed b(int param0) {
        int var2 = 0;
        Object var3 = null;
        byte[] var3_array = null;
        if (((qh) this).field_c == null) {
          if (((qh) this).field_b) {
            if (((qh) this).field_d.a(0, ((qh) this).field_a)) {
              var2 = 5 % ((-30 - param0) / 48);
              if (((qh) this).field_f != 0) {
                if ((((qh) this).field_f ^ -1) == -2) {
                  L0: {
                    var3_array = null;
                    if (((qh) this).field_g == null) {
                      var3_array = ((qh) this).field_d.a(-4, ((qh) this).field_h, ((qh) this).field_a);
                      break L0;
                    } else {
                      var3_array = ((qh) this).field_d.a((byte) 78, ((qh) this).field_a, ((qh) this).field_h, ((qh) this).field_g);
                      break L0;
                    }
                  }
                  ((qh) this).field_c = new ed(var3_array, (java.awt.Component) (Object) of.field_d);
                  return ((qh) this).field_c;
                } else {
                  return ((qh) this).field_c;
                }
              } else {
                ((qh) this).field_c = fe.a(((qh) this).field_a, ((qh) this).field_d, ((qh) this).field_h, true);
                return ((qh) this).field_c;
              }
            } else {
              return null;
            }
          } else {
            var2 = 5 % ((-30 - param0) / 48);
            if (((qh) this).field_f != 0) {
              if ((((qh) this).field_f ^ -1) != -2) {
                return ((qh) this).field_c;
              } else {
                L1: {
                  var3_array = null;
                  if (((qh) this).field_g == null) {
                    var3_array = ((qh) this).field_d.a(-4, ((qh) this).field_h, ((qh) this).field_a);
                    break L1;
                  } else {
                    var3_array = ((qh) this).field_d.a((byte) 78, ((qh) this).field_a, ((qh) this).field_h, ((qh) this).field_g);
                    break L1;
                  }
                }
                ((qh) this).field_c = new ed(var3_array, (java.awt.Component) (Object) of.field_d);
                return ((qh) this).field_c;
              }
            } else {
              ((qh) this).field_c = fe.a(((qh) this).field_a, ((qh) this).field_d, ((qh) this).field_h, true);
              return ((qh) this).field_c;
            }
          }
        } else {
          return ((qh) this).field_c;
        }
    }

    final static void a(mf param0, byte param1) {
        int var2 = 0;
        int var6 = 0;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        String var10 = null;
        String var11 = null;
        String var12 = null;
        var6 = EscapeVector.field_A;
        hb.field_b = new ed[7][3];
        qi.field_M = new ed[7][3];
        if (param1 != -23) {
          L0: {
            qh.a(-112);
            var2 = 0;
            if (on.field_f.length <= var2) {
              break L0;
            } else {
              L1: {
                var7 = on.field_f[var2];
                if (var7 == null) {
                  var2++;
                  break L1;
                } else {
                  L2: {
                    L3: {
                      L4: {
                        if (var7.length() == 0) {
                          var2++;
                          break L4;
                        } else {
                          var8 = "";
                          hb.field_b[var2] = kh.a(param0, (byte) -112, var8, var7);
                          var9 = lm.field_b[var2];
                          if (var9 == null) {
                            break L4;
                          } else {
                            if (var9.length() == 0) {
                              break L3;
                            } else {
                              qi.field_M[var2] = kh.a(param0, (byte) -10, var8, var9);
                              break L2;
                            }
                          }
                        }
                      }
                      var2++;
                      break L3;
                    }
                    var2++;
                    break L2;
                  }
                  var2++;
                  break L1;
                }
              }
              var2++;
              var2++;
              var2++;
              var2++;
              var2++;
              var2++;
              break L0;
            }
          }
          return;
        } else {
          var2 = 0;
          L5: while (true) {
            if (on.field_f.length <= var2) {
              return;
            } else {
              var10 = on.field_f[var2];
              if (var10 != null) {
                if (var10.length() != 0) {
                  var11 = "";
                  hb.field_b[var2] = kh.a(param0, (byte) -112, var11, var10);
                  var12 = lm.field_b[var2];
                  if (var12 != null) {
                    if (var12.length() != 0) {
                      qi.field_M[var2] = kh.a(param0, (byte) -10, var11, var12);
                      var2++;
                      continue L5;
                    } else {
                      var2++;
                      continue L5;
                    }
                  } else {
                    var2++;
                    var2++;
                    continue L5;
                  }
                } else {
                  var2++;
                  var2++;
                  continue L5;
                }
              } else {
                var2++;
                var2++;
                continue L5;
              }
            }
          }
        }
    }

    final static void a(rl param0, boolean param1, int param2) {
        c var3 = om.field_c;
        var3.a(param2, param1);
        var3.f(param0.field_i, -123);
        var3.f(param0.field_g, -123);
    }

    public static void a(int param0) {
        if (param0 != 7) {
            return;
        }
        field_j = null;
        field_i = null;
        field_k = null;
        field_e = null;
        field_l = null;
    }

    qh(mf param0, String param1, String param2, int param3, boolean param4, int[] param5) {
        ((qh) this).field_b = param4 ? true : false;
        ((qh) this).field_d = param0;
        ((qh) this).field_f = param3;
        ((qh) this).field_a = param2;
        ((qh) this).field_h = param1;
        ((qh) this).field_g = param5;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new String[]{"Sit down, commander. Prepare for mission briefing.", "As you know, aliens broke into Earth's most advanced <photo>weapons and technology installation.<br>They used <photo>cloaking devices and would have made good their escape...", "...had our most powerful items not had tracking devices fitted,<br>allowing us to <photo>track the aliens to their home system.", "Your mission is to take your ship, the OSS Katsuro, into the caves where our equipment is being stored.<br><photo>You must overcome the aliens' defences and recover the equipment.", "Our emergency rescue teleporter has enough power for two transmissions.<br>The aliens will attempt to stop you and we can only save your life twice...", "...so we are relying on your skills as a pilot to win the <title>day for Earth."};
        field_e = "Shield recharged";
    }
}
