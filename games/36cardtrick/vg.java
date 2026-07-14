/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vg {
    static String field_c;
    static boolean field_d;
    static cc field_a;
    private kc[] field_b;

    final void a(byte param0, int param1, int param2, int param3, int param4) {
        uk.a(((vg) this).field_b, (byte) -104, param2, param1, param4, param3);
        if (param0 > -69) {
            vk var7 = (vk) null;
            vg.a((vk) null, 11);
        }
    }

    vg(kc[] param0) {
        ((vg) this).field_b = (kc[]) param0;
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 != -72) {
            return;
        }
        field_c = null;
    }

    final static void a(vk param0, int param1) {
        int var2 = 0;
        int var4 = 0;
        vk var5 = null;
        vk var6 = null;
        var4 = Main.field_T;
        if (null == ((vk) param0).field_i) {
          return;
        } else {
          if ((((vk) param0).field_c ^ -1) != param1) {
            var2 = 0;
            L0: while (true) {
              if (jh.field_c > var2) {
                var6 = me.field_b[var2];
                if ((((vk) var6).field_k ^ -1) == -3) {
                  if (((vk) param0).field_c == ((vk) var6).field_c) {
                    if (((vk) var6).field_h == ((vk) param0).field_h) {
                      return;
                    } else {
                      var2++;
                      var2++;
                      continue L0;
                    }
                  } else {
                    var2++;
                    var2++;
                    continue L0;
                  }
                } else {
                  var2++;
                  var2++;
                  continue L0;
                }
              } else {
                L1: {
                  if (null != ((vk) param0).field_a) {
                    break L1;
                  } else {
                    break L1;
                  }
                }
                lh.a(7743, param0);
                return;
              }
            }
          } else {
            if (((vk) param0).field_h != 0) {
              var2 = 0;
              if (jh.field_c > var2) {
                var5 = me.field_b[var2];
                if ((((vk) var5).field_k ^ -1) == -3) {
                  if (((vk) param0).field_c == ((vk) var5).field_c) {
                    if (((vk) var5).field_h == ((vk) param0).field_h) {
                      return;
                    } else {
                      L2: {
                        var2++;
                        var2++;
                        var2++;
                        var2++;
                        var2++;
                        if (null != ((vk) param0).field_a) {
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      lh.a(7743, param0);
                      return;
                    }
                  } else {
                    L3: {
                      var2++;
                      var2++;
                      var2++;
                      var2++;
                      var2++;
                      var2++;
                      if (null != ((vk) param0).field_a) {
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    lh.a(7743, param0);
                    return;
                  }
                } else {
                  var2++;
                  L4: {
                    var2++;
                    var2++;
                    var2++;
                    var2++;
                    if (null != ((vk) param0).field_a) {
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  lh.a(7743, param0);
                  return;
                }
              } else {
                L5: {
                  if (null != ((vk) param0).field_a) {
                    break L5;
                  } else {
                    break L5;
                  }
                }
                lh.a(7743, param0);
                return;
              }
            } else {
              L6: {
                if (null != ((vk) param0).field_a) {
                  break L6;
                } else {
                  break L6;
                }
              }
              lh.a(7743, param0);
              return;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = true;
        field_c = "Warning: if you quit, you will lose any game you are in the middle of!";
        field_a = new cc();
    }
}
