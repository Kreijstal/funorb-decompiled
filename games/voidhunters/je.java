/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je {
    static aba field_c;
    private mkb field_a;
    private mkb field_d;
    private vca field_b;

    final void a(boolean param0) {
        ((je) this).field_a.a(-108);
        if (param0) {
            je.b((byte) -55);
        }
    }

    final static boolean a(byte param0, CharSequence param1, boolean param2) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = VoidHunters.field_G;
        if (param1 == null) {
          return false;
        } else {
          L0: {
            var3 = param1.length();
            if (-2 < (var3 ^ -1)) {
              break L0;
            } else {
              if (12 < var3) {
                break L0;
              } else {
                L1: {
                  var4 = jwa.a(false, param1);
                  if (var4 == null) {
                    break L1;
                  } else {
                    if ((var4.length() ^ -1) > -2) {
                      break L1;
                    } else {
                      if (fg.a(var4.charAt(0), 104)) {
                        return false;
                      } else {
                        if (!fg.a(var4.charAt(var4.length() - 1), 26)) {
                          var5 = 0;
                          var6 = 0;
                          L2: while (true) {
                            if (param1.length() <= var6) {
                              if (0 < var5) {
                                return false;
                              } else {
                                L3: {
                                  if (param0 == -31) {
                                    break L3;
                                  } else {
                                    je.a((byte) 82);
                                    break L3;
                                  }
                                }
                                return true;
                              }
                            } else {
                              L4: {
                                var7 = param1.charAt(var6);
                                if (!fg.a((char) var7, 46)) {
                                  var5 = 0;
                                  break L4;
                                } else {
                                  var5++;
                                  break L4;
                                }
                              }
                              if (-3 >= (var5 ^ -1)) {
                                if (!param2) {
                                  return false;
                                } else {
                                  var6++;
                                  continue L2;
                                }
                              } else {
                                var6++;
                                continue L2;
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
              }
            }
          }
          return false;
        }
    }

    public static void b(byte param0) {
        field_c = null;
        if (param0 != 117) {
            je.b((byte) -3);
        }
    }

    final static void a(byte param0) {
        lsa var1 = (lsa) (Object) vfa.field_p.d(0);
        if (param0 <= 108) {
            je.b((byte) -96);
        }
        if (var1 == null) {
            ifb.l(-116);
            return;
        }
        faa var2 = qga.field_b;
        int discarded$0 = var2.h(62);
        int discarded$1 = var2.h(90);
        int discarded$2 = var2.h(60);
        int discarded$3 = var2.h(93);
        var1.b(-3846);
    }

    final void a(int param0, pf param1) {
        boolean discarded$0 = ((je) this).field_a.a(param0, 786336, 97);
    }

    je(pf param0) {
        jaclib.memory.Stream var4 = null;
        int var4_int = 0;
        int var5 = 0;
        jaclib.memory.Buffer var7 = null;
        jaclib.memory.Stream var8 = null;
        jaclib.memory.Buffer var9 = null;
        L0: {
          vmb discarded$4 = param0.a(10, new qma[2]);
          ((je) this).field_a = param0.a(true, 3);
          ((je) this).field_d = param0.a(false, 3);
          boolean discarded$5 = ((je) this).field_d.a(12, 393168, 119);
          ((je) this).field_b = param0.a((byte) -19, false);
          ((je) this).field_b.a(25427, 49146);
          var7 = ((je) this).field_b.a((byte) -30, true);
          if (var7 == null) {
            break L0;
          } else {
            L1: {
              var8 = param0.a(var7, false);
              if (jaclib.memory.Stream.a()) {
                var4_int = 0;
                L2: while (true) {
                  if (-8192 >= (var4_int ^ -1)) {
                    break L1;
                  } else {
                    var5 = var4_int * 4;
                    var8.b(var5);
                    var8.b(var5 - -1);
                    var8.b(var5 + 2);
                    var8.b(var5 + 2);
                    var8.b(3 + var5);
                    var8.b(var5);
                    var4_int++;
                    continue L2;
                  }
                }
              } else {
                var4_int = 0;
                L3: while (true) {
                  if (8191 <= var4_int) {
                    break L1;
                  } else {
                    var5 = 4 * var4_int;
                    var8.a(var5);
                    var8.a(var5 - -1);
                    var8.a(var5 + 2);
                    var8.a(2 + var5);
                    var8.a(var5 + 3);
                    var8.a(var5);
                    var4_int++;
                    continue L3;
                  }
                }
              }
            }
            var8.b();
            boolean discarded$6 = ((je) this).field_b.b(-93);
            break L0;
          }
        }
        L4: {
          var9 = ((je) this).field_d.a(true, (byte) 41);
          if (var9 == null) {
            break L4;
          } else {
            L5: {
              var4 = param0.a(var9, false);
              if (jaclib.memory.Stream.a()) {
                var5 = 0;
                L6: while (true) {
                  if (-8192 >= (var5 ^ -1)) {
                    break L5;
                  } else {
                    var4.b(0.0f);
                    var4.b(-1.0f);
                    var4.b(0.0f);
                    var4.b(0.0f);
                    var4.b(-1.0f);
                    var4.b(0.0f);
                    var4.b(0.0f);
                    var4.b(-1.0f);
                    var4.b(0.0f);
                    var4.b(0.0f);
                    var4.b(-1.0f);
                    var4.b(0.0f);
                    var5++;
                    continue L6;
                  }
                }
              } else {
                var5 = 0;
                L7: while (true) {
                  if (var5 >= 8191) {
                    break L5;
                  } else {
                    var4.a(0.0f);
                    var4.a(-1.0f);
                    var4.a(0.0f);
                    var4.a(0.0f);
                    var4.a(-1.0f);
                    var4.a(0.0f);
                    var4.a(0.0f);
                    var4.a(-1.0f);
                    var4.a(0.0f);
                    var4.a(0.0f);
                    var4.a(-1.0f);
                    var4.a(0.0f);
                    var5++;
                    continue L7;
                  }
                }
              }
            }
            var4.b();
            boolean discarded$7 = ((je) this).field_d.b(-20836);
            break L4;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new aba();
    }
}
