/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class po {
    static ut field_e;
    static ut field_h;
    static String field_b;
    static String[] field_a;
    static String field_d;
    static boolean field_f;
    static String field_g;
    static String field_c;

    public static void a(int param0) {
        if (param0 != 0) {
          po.a(23);
          field_g = null;
          field_b = null;
          field_a = null;
          field_h = null;
          field_c = null;
          field_e = null;
          field_d = null;
          return;
        } else {
          field_g = null;
          field_b = null;
          field_a = null;
          field_h = null;
          field_c = null;
          field_e = null;
          field_d = null;
          return;
        }
    }

    final static boolean a(gg param0, byte param1, gg param2) {
        int var3 = 0;
        int var4 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        var4 = Kickabout.field_G;
        var3 = param2.field_Cb + -param0.field_Cb;
        if (param1 == -21) {
          L0: {
            if (param2.field_zb != bh.field_h) {
              if (null == param2.field_zb) {
                // wide iinc 3 200
                break L0;
              } else {
                break L0;
              }
            } else {
              // wide iinc 3 -200
              break L0;
            }
          }
          if (bh.field_h != param0.field_zb) {
            if (null == param0.field_zb) {
              L1: {
                // wide iinc 3 -200
                if (var3 <= 0) {
                  stackOut_19_0 = 0;
                  stackIn_20_0 = stackOut_19_0;
                  break L1;
                } else {
                  stackOut_18_0 = 1;
                  stackIn_20_0 = stackOut_18_0;
                  break L1;
                }
              }
              return stackIn_20_0 != 0;
            } else {
              L2: {
                if (var3 <= 0) {
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L2;
                } else {
                  stackOut_14_0 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  break L2;
                }
              }
              return stackIn_16_0 != 0;
            }
          } else {
            L3: {
              // wide iinc 3 200
              if (var3 <= 0) {
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                break L3;
              } else {
                stackOut_9_0 = 1;
                stackIn_11_0 = stackOut_9_0;
                break L3;
              }
            }
            return stackIn_11_0 != 0;
          }
        } else {
          return true;
        }
    }

    final static int a(js param0, int param1) {
        if ((param0.field_c ^ -1) == -24) {
          return 680;
        } else {
          if (24 == param0.field_c) {
            return 440;
          } else {
            if (param0.field_c != -26) {
              if (param0.field_c == 16) {
                return 680;
              } else {
                if (-19 == param0.field_c) {
                  return 680;
                } else {
                  if ((param0.field_c ^ -1) != 4) {
                    if (param0.field_c != param1) {
                      if ((param0.field_c ^ -1) != -20) {
                        if (20 == param0.field_c) {
                          return 680;
                        } else {
                          if (param0.field_c == -22) {
                            return 680;
                          } else {
                            if (-23 == param0.field_c) {
                              return 680;
                            } else {
                              if (0 != param0.field_c) {
                                if (-3 != param0.field_c) {
                                  if (1 != param0.field_c) {
                                    if ((param0.field_c ^ -1) == -27) {
                                      return 0;
                                    } else {
                                      return 423;
                                    }
                                  } else {
                                    return 0;
                                  }
                                } else {
                                  return 0;
                                }
                              } else {
                                return 0;
                              }
                            }
                          }
                        }
                      } else {
                        return 680;
                      }
                    } else {
                      return 680;
                    }
                  } else {
                    return 680;
                  }
                }
              }
            } else {
              return 680;
            }
          }
        }
    }

    final static void a(int param0, boolean param1) {
        Object var3 = null;
        if (fb.field_J != null) {
          if (fb.field_J.a((byte) -122, param1)) {
            fb.field_J = null;
            if (param0 != -27) {
              var3 = null;
              int discarded$6 = po.a((js) null, 65);
              return;
            } else {
              return;
            }
          } else {
            if (param0 != -27) {
              var3 = null;
              int discarded$7 = po.a((js) null, 65);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param0 != -27) {
            var3 = null;
            int discarded$8 = po.a((js) null, 65);
            return;
          } else {
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Invite players";
        field_d = "Orb coins: ";
        field_a = new String[]{"Detach", "Zoom"};
        field_g = "Your player sold successfully! The Auction House takes 10% of your bid of <%0>, giving you <%1>.";
        field_c = "The following settings need to be changed:  ";
    }
}
