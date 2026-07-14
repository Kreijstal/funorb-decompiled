/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kg extends pm {
    private tb field_h;
    static int[] field_g;
    private tb field_j;
    static int field_f;
    static volatile boolean field_l;
    static int field_i;
    static int field_k;

    public static void d(int param0) {
        if (param0 != -2314) {
            field_l = true;
            field_g = null;
            return;
        }
        field_g = null;
    }

    final String a(String param0, byte param1) {
        String var4 = null;
        String var5 = null;
        String var6 = null;
        var6 = ((kg) this).field_h.field_o.toLowerCase();
        var4 = param0.toLowerCase();
        if (var4.length() != 0) {
          var5 = var4;
          if (tk.a((byte) 84, var5)) {
            return ci.field_a;
          } else {
            if (param1 < -94) {
              if (!cj.a((byte) 15, var5)) {
                if (!tb.a(-10723, var5)) {
                  if (this.b(param0, 1)) {
                    return dl.field_e;
                  } else {
                    if ((var6.length() ^ -1) < -1) {
                      if (!lf.a(var6, var5, -7235)) {
                        if (!ic.a(var5, var6, 0)) {
                          if (t.a(var5, (byte) 96, var6)) {
                            return kb.field_h;
                          } else {
                            return ci.field_a;
                          }
                        } else {
                          return uo.field_a;
                        }
                      } else {
                        return kb.field_h;
                      }
                    } else {
                      return dp.field_g;
                    }
                  }
                } else {
                  return eo.field_i;
                }
              } else {
                return dj.field_a;
              }
            } else {
              ((kg) this).field_h = null;
              if (!cj.a((byte) 15, var5)) {
                if (!tb.a(-10723, var5)) {
                  if (this.b(param0, 1)) {
                    return dl.field_e;
                  } else {
                    if ((var6.length() ^ -1) < -1) {
                      if (!lf.a(var6, var5, -7235)) {
                        if (!ic.a(var5, var6, 0)) {
                          if (t.a(var5, (byte) 96, var6)) {
                            return kb.field_h;
                          } else {
                            return ci.field_a;
                          }
                        } else {
                          return uo.field_a;
                        }
                      } else {
                        return kb.field_h;
                      }
                    } else {
                      return dp.field_g;
                    }
                  }
                } else {
                  return eo.field_i;
                }
              } else {
                return dj.field_a;
              }
            }
          }
        } else {
          return null;
        }
    }

    private final boolean b(String param0, int param1) {
        String var4 = null;
        int var5 = 0;
        Object var8 = null;
        String var9 = null;
        String var10 = null;
        String var25 = null;
        String var30 = null;
        String var31 = null;
        String var32 = null;
        String var33 = null;
        String var34 = null;
        String var35 = null;
        if (param1 == 1) {
          var32 = ((kg) this).field_j.field_o.toLowerCase();
          var33 = param0.toLowerCase();
          if (var32.length() > 0) {
            if (-1 > (var33.length() ^ -1)) {
              var5 = var32.lastIndexOf("@");
              if (0 <= var5) {
                if (var5 < var32.length() - 1) {
                  var34 = var32.substring(0, var5);
                  var35 = var32.substring(var5 + 1);
                  if (-1 >= var33.indexOf(var34)) {
                    return true;
                  } else {
                    if (-1 <= var33.indexOf(var35)) {
                      return true;
                    } else {
                      return false;
                    }
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          var8 = null;
          String discarded$1 = ((kg) this).a((String) null, (byte) 125);
          var10 = ((kg) this).field_j.field_o.toLowerCase();
          var9 = var10;
          var25 = param0.toLowerCase();
          var4 = var25;
          if (var10.length() > 0) {
            if (-1 > (var25.length() ^ -1)) {
              var5 = var10.lastIndexOf("@");
              if (0 <= var5) {
                if (var5 < var10.length() - 1) {
                  var30 = var10.substring(0, var5);
                  var31 = var10.substring(var5 + 1);
                  if (-1 >= var25.indexOf(var30)) {
                    return true;
                  } else {
                    if (-1 <= var25.indexOf(var31)) {
                      return true;
                    } else {
                      return false;
                    }
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    kg(tb param0, tb param1, tb param2) {
        super(param0);
        ((kg) this).field_h = param1;
        ((kg) this).field_j = param2;
    }

    final rh a(String param0, int param1) {
        String var3 = ((kg) this).field_h.field_o.toLowerCase();
        String var4 = param0.toLowerCase();
        if (var4.length() == 0) {
            return uc.field_b;
        }
        if (param1 != 2) {
            return null;
        }
        if (!on.a((byte) -23, var4, var3)) {
            return uc.field_b;
        }
        if (!(!this.b(param0, 1))) {
            return uc.field_b;
        }
        return mc.field_g;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = ae.a(14821);
        field_l = false;
    }
}
