/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ra extends u {
    static ci field_Z;
    static String field_fb;
    static int[] field_cb;
    private String field_gb;
    private boolean field_db;
    private String field_eb;
    static hj[] field_X;
    private boolean field_Y;
    static long field_bb;
    private ea field_jb;
    static int field_ab;
    static String field_ib;
    static hj field_hb;

    final void i(byte param0) {
        ((ra) this).field_jb.field_K = false;
        ((ra) this).field_db = true;
        int var2 = -107 % ((param0 - -20) / 43);
    }

    final static void m(int param0) {
        if (bl.field_r == null) {
          if (param0 < 95) {
            field_cb = null;
            return;
          } else {
            return;
          }
        } else {
          bl.field_r.f(-38);
          if (param0 >= 95) {
            return;
          } else {
            field_cb = null;
            return;
          }
        }
    }

    final static boolean a(CharSequence param0, boolean param1, boolean param2) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        var8 = HoldTheLine.field_D;
        if (param0 != null) {
          var3 = param0.length();
          if (-2 >= (var3 ^ -1)) {
            if (var3 <= 12) {
              L0: {
                var4 = kf.a(param0, (byte) 122);
                if (var4 == null) {
                  break L0;
                } else {
                  if ((var4.length() ^ -1) > -2) {
                    break L0;
                  } else {
                    if (ag.a(-2821, var4.charAt(0))) {
                      return false;
                    } else {
                      if (!ag.a(-2821, var4.charAt(var4.length() + -1))) {
                        if (!param1) {
                          var5 = 0;
                          var6 = 0;
                          L1: while (true) {
                            if (param0.length() <= var6) {
                              if (-1 <= (var5 ^ -1)) {
                                return true;
                              } else {
                                return false;
                              }
                            } else {
                              L2: {
                                var7 = param0.charAt(var6);
                                if (ag.a(-2821, (char) var7)) {
                                  var5++;
                                  break L2;
                                } else {
                                  var5 = 0;
                                  break L2;
                                }
                              }
                              if (var5 < 2) {
                                var6++;
                                var6++;
                                continue L1;
                              } else {
                                if (!param2) {
                                  return false;
                                } else {
                                  var6++;
                                  continue L1;
                                }
                              }
                            }
                          }
                        } else {
                          var9 = null;
                          boolean discarded$1 = ra.a((String) null, false);
                          var5 = 0;
                          var6 = 0;
                          L3: while (true) {
                            if (param0.length() <= var6) {
                              if (-1 <= (var5 ^ -1)) {
                                return true;
                              } else {
                                return false;
                              }
                            } else {
                              L4: {
                                var7 = param0.charAt(var6);
                                if (ag.a(-2821, (char) var7)) {
                                  var5++;
                                  break L4;
                                } else {
                                  var5 = 0;
                                  break L4;
                                }
                              }
                              if (var5 < 2) {
                                var6++;
                                var6++;
                                continue L3;
                              } else {
                                if (!param2) {
                                  return false;
                                } else {
                                  var6++;
                                  continue L3;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        return false;
                      }
                    }
                  }
                }
              }
              return false;
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

    public static void h(byte param0) {
        field_ib = null;
        if (param0 > -104) {
          field_fb = null;
          field_fb = null;
          field_Z = null;
          field_cb = null;
          field_hb = null;
          field_X = null;
          return;
        } else {
          field_fb = null;
          field_Z = null;
          field_cb = null;
          field_hb = null;
          field_X = null;
          return;
        }
    }

    final void a(int param0, int param1, byte param2) {
        super.a(param0, param1, param2);
        de.field_I.b(((ra) this).field_eb, (((ra) this).field_x >> -2116198719) + param0, param1 - -103, 16777215, -1);
        if (!(null == ((ra) this).field_gb)) {
            tc.b(20 + param0, -7 + (param1 + 120), 260, 8421504);
            int discarded$0 = de.field_I.a(((ra) this).field_gb, 20 + param0, 120 + param1 + 8, 260, 100, 16777215, -1, 1, 0, de.field_I.field_G);
        }
    }

    final void a(float param0, int param1, boolean param2, String param3) {
        Object var6 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        if (((ra) this).field_Y != param2) {
          L0: {
            stackOut_5_0 = this;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (!param2) {
              stackOut_7_0 = this;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L0;
            } else {
              stackOut_6_0 = this;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
          }
          ((ra) this).field_Y = stackIn_8_1 != 0;
          if (((ra) this).field_Y) {
            ((ra) this).field_jb.a(8405024, 4210752, false);
            ((ra) this).field_jb.field_K = true;
            if (param1 >= -43) {
              var6 = null;
              fi discarded$4 = ra.a((String) null, 66);
              ((ra) this).field_jb.field_B = (int)(param0 / 100.0f * 65536.0f);
              ((ra) this).field_eb = param3;
              return;
            } else {
              ((ra) this).field_jb.field_B = (int)(param0 / 100.0f * 65536.0f);
              ((ra) this).field_eb = param3;
              return;
            }
          } else {
            ((ra) this).field_jb.a(2113632, 4210752, false);
            if (!((ra) this).field_db) {
              if (param1 >= -43) {
                var6 = null;
                fi discarded$5 = ra.a((String) null, 66);
                ((ra) this).field_jb.field_B = (int)(param0 / 100.0f * 65536.0f);
                ((ra) this).field_eb = param3;
                return;
              } else {
                ((ra) this).field_jb.field_B = (int)(param0 / 100.0f * 65536.0f);
                ((ra) this).field_eb = param3;
                return;
              }
            } else {
              ((ra) this).field_jb.field_K = false;
              if (param1 < -43) {
                ((ra) this).field_jb.field_B = (int)(param0 / 100.0f * 65536.0f);
                ((ra) this).field_eb = param3;
                return;
              } else {
                var6 = null;
                fi discarded$6 = ra.a((String) null, 66);
                ((ra) this).field_jb.field_B = (int)(param0 / 100.0f * 65536.0f);
                ((ra) this).field_eb = param3;
                return;
              }
            }
          }
        } else {
          if (param1 < -43) {
            ((ra) this).field_jb.field_B = (int)(param0 / 100.0f * 65536.0f);
            ((ra) this).field_eb = param3;
            return;
          } else {
            var6 = null;
            fi discarded$7 = ra.a((String) null, 66);
            ((ra) this).field_jb.field_B = (int)(param0 / 100.0f * 65536.0f);
            ((ra) this).field_eb = param3;
            return;
          }
        }
    }

    ra(qj param0, String param1) {
        super(param0, 300, 120);
        int var3 = 0;
        ((ra) this).field_gb = param1;
        if (null != ((ra) this).field_gb) {
            var3 = de.field_I.b(((ra) this).field_gb, 260, de.field_I.field_G);
            ((ra) this).b(537342017, 300, var3 + 150);
        }
        ((ra) this).field_jb = new ea(13, 50, 274, 30, 15, 2113632, 4210752);
        ((ra) this).field_jb.field_K = true;
        ((ra) this).field_Y = false;
        ((ra) this).field_db = false;
        ((ra) this).a(true, (n) (Object) ((ra) this).field_jb);
    }

    final static boolean a(String param0, boolean param1) {
        Object var3 = null;
        CharSequence var4 = null;
        CharSequence var5 = null;
        if (param1) {
          var3 = null;
          fi discarded$2 = ra.a((String) null, -94);
          var4 = (CharSequence) (Object) param0;
          return co.field_e.equals((Object) (Object) kf.a(var4, (byte) -102));
        } else {
          var5 = (CharSequence) (Object) param0;
          return co.field_e.equals((Object) (Object) kf.a(var5, (byte) -102));
        }
    }

    final static fi a(String param0, int param1) {
        String var2 = null;
        fi var3 = null;
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        var6 = HoldTheLine.field_D;
        if (jo.field_b != null) {
          if (param0 != null) {
            if (param0.length() != 0) {
              var7 = (CharSequence) (Object) param0;
              var2 = kf.a(var7, (byte) 99);
              if (var2 != null) {
                var4 = 70 % ((param1 - 9) / 33);
                var3 = (fi) (Object) jo.field_b.a(-25839, (long)var2.hashCode());
                L0: while (true) {
                  if (var3 != null) {
                    var8 = (CharSequence) (Object) var3.field_mb;
                    var5 = kf.a(var8, (byte) 123);
                    if (!var5.equals((Object) (Object) var2)) {
                      var3 = (fi) (Object) jo.field_b.a(20240);
                      continue L0;
                    } else {
                      return var3;
                    }
                  } else {
                    return null;
                  }
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_fb = "<img=4>";
        field_cb = new int[]{3, 3, 4};
        field_ab = -1;
        field_ib = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
    }
}
