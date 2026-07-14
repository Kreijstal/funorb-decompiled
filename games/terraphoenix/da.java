/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class da {
    private il field_j;
    static int field_d;
    static boolean field_f;
    static he field_g;
    static String[] field_i;
    static pk field_h;
    static int field_b;
    private fa field_a;
    private fa field_c;
    private il field_e;

    private final gg a(int param0, int param1, int[] param2, int param3) {
        int var5 = 0;
        long var6 = 0L;
        gg var8 = null;
        gg var8_ref = null;
        tl var9 = null;
        tl var9_ref = null;
        var5 = param0 ^ ((-536866817 & param3) << 372521252 | param3 >>> 1796733292);
        var5 = var5 | param3 << 1765084976;
        var6 = (long)var5 ^ 4294967296L;
        if (param1 == 0) {
          var8 = (gg) (Object) ((da) this).field_e.a((byte) 46, var6);
          if (var8 == null) {
            if (param2 != null) {
              if (-1 > (param2[0] ^ -1)) {
                L0: {
                  var9 = (tl) (Object) ((da) this).field_j.a((byte) 46, var6);
                  if (var9 != null) {
                    break L0;
                  } else {
                    var9_ref = tl.a(((da) this).field_c, param3, param0);
                    if (var9_ref != null) {
                      ((da) this).field_j.a((uf) (Object) var9_ref, var6, (byte) -123);
                      break L0;
                    } else {
                      return null;
                    }
                  }
                }
                var8_ref = var9_ref.a(param2);
                if (var8_ref == null) {
                  return null;
                } else {
                  var9_ref.b((byte) 12);
                  ((da) this).field_e.a((uf) (Object) var8_ref, var6, (byte) -117);
                  return var8_ref;
                }
              } else {
                return null;
              }
            } else {
              L1: {
                var9 = (tl) (Object) ((da) this).field_j.a((byte) 46, var6);
                if (var9 != null) {
                  break L1;
                } else {
                  var9_ref = tl.a(((da) this).field_c, param3, param0);
                  if (var9_ref != null) {
                    ((da) this).field_j.a((uf) (Object) var9_ref, var6, (byte) -123);
                    break L1;
                  } else {
                    return null;
                  }
                }
              }
              var8_ref = var9_ref.a(param2);
              if (var8_ref == null) {
                return null;
              } else {
                var9_ref.b((byte) 12);
                ((da) this).field_e.a((uf) (Object) var8_ref, var6, (byte) -117);
                return var8_ref;
              }
            }
          } else {
            return var8;
          }
        } else {
          return null;
        }
    }

    private final gg a(int param0, String param1, int[] param2) {
        if (param0 <= -121) {
          if (((da) this).field_c.d(-1, "")) {
            return this.a(param1, "", (byte) 119, param2);
          } else {
            return this.a("", param1, (byte) -62, param2);
          }
        } else {
          return null;
        }
    }

    private final gg a(String param0, byte param1, int[] param2, String param3) {
        int var5 = 0;
        int var6 = 0;
        var5 = ((da) this).field_a.c(param1 + 28, param3);
        if (param1 == -29) {
          if (var5 >= 0) {
            var6 = ((da) this).field_a.a(-88, var5, param0);
            if (-1 < (var6 ^ -1)) {
              return null;
            } else {
              return this.a(var5, (byte) 18, param2, var6);
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final gg a(int param0, String param1) {
        Object var4 = null;
        if (param0 != -1) {
          var4 = null;
          gg discarded$2 = this.a(86, (byte) 74, (int[]) null, -114);
          return this.a(param0 + -122, param1, (int[]) null);
        } else {
          return this.a(param0 + -122, param1, (int[]) null);
        }
    }

    final static void a(int param0, int param1) {
        uc var2 = di.field_l;
        var2.k(-17410, param1);
        var2.i(1, 24);
        var2.i(param0, -123);
    }

    private final gg a(String param0, String param1, byte param2, int[] param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var5 = ((da) this).field_c.c(-1, param1);
        if (var5 >= 0) {
          var6 = ((da) this).field_c.a(-124, var5, param0);
          if (0 > var6) {
            return null;
          } else {
            var7 = -78 % ((param2 - 26) / 50);
            return this.a(var6, 0, param3, var5);
          }
        } else {
          return null;
        }
    }

    private final gg a(int[] param0, String param1, int param2) {
        int var4 = 7 % ((70 - param2) / 46);
        if (!(!((da) this).field_a.d(-1, ""))) {
            return this.a(param1, (byte) -29, param0, "");
        }
        return this.a("", (byte) -29, param0, param1);
    }

    public static void a(int param0) {
        field_g = null;
        field_h = null;
        if (param0 != 18210) {
            da.a(-45, 102);
            field_i = null;
            return;
        }
        field_i = null;
    }

    final gg a(byte param0, int[] param1, int param2) {
        if (!(-2 != (((da) this).field_c.c(param0 + 20) ^ -1))) {
            return this.a(param2, 0, param1, 0);
        }
        if (param0 != -21) {
            Object var5 = null;
            gg discarded$6 = ((da) this).a((String) null, -114);
            if (!(1 != ((da) this).field_c.c(param0 + -519, param2))) {
                return this.a(0, param0 ^ -21, param1, param2);
            }
            throw new RuntimeException();
        }
        if (!(1 != ((da) this).field_c.c(param0 + -519, param2))) {
            return this.a(0, param0 ^ -21, param1, param2);
        }
        throw new RuntimeException();
    }

    final gg a(String param0, int param1) {
        Object var4 = null;
        if (param1 != 0) {
          var4 = null;
          gg discarded$2 = this.a((String) null, (String) null, (byte) -60, (int[]) null);
          return this.a((int[]) null, param0, -127);
        } else {
          return this.a((int[]) null, param0, -127);
        }
    }

    private final gg a(int param0, byte param1, int[] param2, int param3) {
        int var5 = 0;
        long var6 = 0L;
        gg var8 = null;
        gg var8_ref = null;
        gg var10 = null;
        oc var11 = null;
        gg var12 = null;
        gg var13 = null;
        oc var14 = null;
        gg var15 = null;
        gg var16 = null;
        var5 = param3 ^ ((param0 & -805302273) << -1960145340 | param0 >>> 1024726604);
        var5 = var5 | param0 << -725463216;
        var6 = (long)var5;
        var8 = (gg) (Object) ((da) this).field_e.a((byte) 46, var6);
        if (var8 != null) {
          return var8;
        } else {
          if (param2 != null) {
            if (-1 > (param2[0] ^ -1)) {
              var14 = oc.a(((da) this).field_a, param0, param3);
              if (var14 != null) {
                if (param1 != 18) {
                  L0: {
                    ((da) this).field_j = null;
                    var15 = var14.a();
                    var8_ref = var15;
                    ((da) this).field_e.a((uf) (Object) var8_ref, var6, (byte) -82);
                    if (param2 != null) {
                      param2[0] = param2[0] - var15.field_k.length;
                      break L0;
                    } else {
                      break L0;
                    }
                  }
                  return var8_ref;
                } else {
                  L1: {
                    var16 = var14.a();
                    var10 = var16;
                    var8_ref = var16;
                    ((da) this).field_e.a((uf) (Object) var8_ref, var6, (byte) -82);
                    if (param2 != null) {
                      param2[0] = param2[0] - var16.field_k.length;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  return var8_ref;
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          } else {
            var11 = oc.a(((da) this).field_a, param0, param3);
            if (var11 != null) {
              if (param1 != 18) {
                L2: {
                  ((da) this).field_j = null;
                  var12 = var11.a();
                  var8_ref = var12;
                  ((da) this).field_e.a((uf) (Object) var8_ref, var6, (byte) -82);
                  if (param2 != null) {
                    param2[0] = param2[0] - var12.field_k.length;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                return var8_ref;
              } else {
                L3: {
                  var13 = var11.a();
                  var8_ref = var13;
                  ((da) this).field_e.a((uf) (Object) var8_ref, var6, (byte) -82);
                  if (param2 != null) {
                    param2[0] = param2[0] - var13.field_k.length;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                return var8_ref;
              }
            } else {
              return null;
            }
          }
        }
    }

    final gg a(byte param0, int param1, int[] param2) {
        if (param0 >= -37) {
            Object var5 = null;
            gg discarded$1 = this.a(21, 68, (int[]) null, -32);
            if ((((da) this).field_a.c(-1) ^ -1) == -2) {
                return this.a(0, (byte) 18, param2, param1);
            }
            if (!(1 != ((da) this).field_a.c(-540, param1))) {
                return this.a(param1, (byte) 18, param2, 0);
            }
            throw new RuntimeException();
        }
        if ((((da) this).field_a.c(-1) ^ -1) == -2) {
            return this.a(0, (byte) 18, param2, param1);
        }
        if (!(1 != ((da) this).field_a.c(-540, param1))) {
            return this.a(param1, (byte) 18, param2, 0);
        }
        throw new RuntimeException();
    }

    da(fa param0, fa param1) {
        ((da) this).field_j = new il(256);
        ((da) this).field_e = new il(256);
        ((da) this).field_a = param0;
        ((da) this).field_c = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 100;
        field_i = new String[]{"", "", "", "", "", "", "The Americans have sent us the designs for an experimental laser cannon that they tell us is effective against these aliens we have been told about. It would be prudent to build a prototype and see how it fares in combat situations.", "Our scientists feel that they might be able to improve the size of the laser cannon so that it is less bulky for our soldiers.", "The aliens utilise a strange weapon that seems to contain a small maggot like creature. When agitated this creature expels a highly reactive liquid that is subsequently propelled forwards towards the target. With a few modifications we should be able to get the hang of how to use this weaponry against its creators.", "The aliens utilise a strange weapon that seems to contain a small maggot like creature. When agitated this creature expels a highly reactive liquid that is subsequently propelled forwards towards the target. With a few modifications we should be able to get the hang of how to use this weaponry against its creators.", "Using what we have learned of pulse technology, we feel that it will be possible to build our own version of a pulse weapon that is better suited for human use.", "The aliens seem to use what appear to be grenades with the pulse maggots within to power them.", "The aliens have started using a new type of weapon against us. It still seems to use a pulse maggot for power but the projectiles it fires seem to be different.", "The aliens have started using a new type of weapon against us. It still seems to use a pulse maggot for power but the projectiles it fires seem to be different.", "The aliens have brought out the big guns now; this heavy fusion gun can fire heavy tungsten slugs at alarming speeds. As it is so bulky, we will need to spend some time working out how to modify it for human use.", "The aliens have started using powerful explosive rocket launchers against us. We need to figure out the targeting system in order for our troops to use it.", "We should convert the aliens' fusion technology for our own use to use against the alien invaders.", "The aliens are using these pods to help protect against attacks. If we look into how to turn them on we could supply our own soldiers with the devices.", "", "", ""};
    }
}
