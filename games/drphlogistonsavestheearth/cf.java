/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf {
    static String field_a;
    private tg field_e;
    static cf field_c;
    private vj field_h;
    static he[] field_g;
    static byte[] field_b;
    private vj field_d;
    private tg field_f;

    final static void a(byte param0) {
        sg.field_a = false;
        oi.field_c = false;
        sf.a(-1, 11649);
        lc.field_h = pj.field_D;
        fk.field_q = pj.field_D;
        if (param0 == -107) {
            return;
        }
        field_g = null;
    }

    private final vk a(int param0, int param1, int[] param2, int param3) {
        int var5 = 0;
        long var6 = 0L;
        vk var8 = null;
        vk var8_ref = null;
        tk var9 = null;
        tk var9_ref = null;
        var5 = (param1 >>> -2142639316 | (4095 & param1) << -120048764) ^ param0;
        var5 = var5 | param1 << -1752186320;
        if (param3 < -88) {
          var6 = (long)var5 ^ 4294967296L;
          var8 = (vk) (Object) ((cf) this).field_f.a(true, var6);
          if (var8 != null) {
            return var8;
          } else {
            L0: {
              if (param2 == null) {
                break L0;
              } else {
                if (0 < param2[0]) {
                  break L0;
                } else {
                  return null;
                }
              }
            }
            L1: {
              var9 = (tk) (Object) ((cf) this).field_e.a(true, var6);
              if (var9 == null) {
                var9_ref = tk.a(((cf) this).field_h, param1, param0);
                if (var9_ref != null) {
                  ((cf) this).field_e.a((gi) (Object) var9_ref, var6, -1);
                  break L1;
                } else {
                  return null;
                }
              } else {
                break L1;
              }
            }
            var8_ref = var9_ref.a(param2);
            if (var8_ref != null) {
              var9_ref.a(-16175);
              ((cf) this).field_f.a((gi) (Object) var8_ref, var6, -1);
              return var8_ref;
            } else {
              return null;
            }
          }
        } else {
          cf.a((byte) -46);
          var6 = (long)var5 ^ 4294967296L;
          var8 = (vk) (Object) ((cf) this).field_f.a(true, var6);
          if (var8 != null) {
            return var8;
          } else {
            if (param2 != null) {
              if (0 >= param2[0]) {
                return null;
              } else {
                L2: {
                  var9 = (tk) (Object) ((cf) this).field_e.a(true, var6);
                  if (var9 == null) {
                    var9_ref = tk.a(((cf) this).field_h, param1, param0);
                    if (var9_ref != null) {
                      ((cf) this).field_e.a((gi) (Object) var9_ref, var6, -1);
                      break L2;
                    } else {
                      return null;
                    }
                  } else {
                    break L2;
                  }
                }
                var8_ref = var9_ref.a(param2);
                if (var8_ref != null) {
                  var9_ref.a(-16175);
                  ((cf) this).field_f.a((gi) (Object) var8_ref, var6, -1);
                  return var8_ref;
                } else {
                  return null;
                }
              }
            } else {
              L3: {
                var9 = (tk) (Object) ((cf) this).field_e.a(true, var6);
                if (var9 == null) {
                  var9_ref = tk.a(((cf) this).field_h, param1, param0);
                  if (var9_ref != null) {
                    ((cf) this).field_e.a((gi) (Object) var9_ref, var6, -1);
                    break L3;
                  } else {
                    return null;
                  }
                } else {
                  break L3;
                }
              }
              var8_ref = var9_ref.a(param2);
              if (var8_ref != null) {
                var9_ref.a(-16175);
                ((cf) this).field_f.a((gi) (Object) var8_ref, var6, -1);
                return var8_ref;
              } else {
                return null;
              }
            }
          }
        }
    }

    final static void a(boolean param0) {
        int var1 = 0;
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (!param0) {
            uc.b();
            break L0;
          } else {
            field_g = null;
            break L0;
          }
        }
        uc.b();
        uc.b();
        b.field_m = 11;
        fc.field_b = new int[260];
        var1 = 0;
        L1: while (true) {
          if (256 <= var1) {
            var5 = 256;
            var1 = var5;
            L2: while (true) {
              if (var5 < fc.field_b.length) {
                fc.field_b[var5] = 255;
                var5++;
                continue L2;
              } else {
                return;
              }
            }
          } else {
            var2 = 15.0;
            fc.field_b[var1] = (int)(Math.pow((double)((float)var1 / 256.0f), var2) * 255.0);
            var1++;
            continue L1;
          }
        }
    }

    private final vk b(int param0, int param1, int[] param2, int param3) {
        int var5 = 0;
        long var6 = 0L;
        vk var8 = null;
        vk var8_ref = null;
        Object var10 = null;
        vk var11 = null;
        kb var12 = null;
        vk var13 = null;
        kb var14 = null;
        vk var15 = null;
        kb var16 = null;
        vk var17 = null;
        kb var18 = null;
        vk var19 = null;
        var5 = param3 ^ (param0 >>> -276913716 | (param0 & 536875007) << 1565084164);
        var5 = var5 | param0 << -609592560;
        var6 = (long)var5;
        var8 = (vk) (Object) ((cf) this).field_f.a(true, var6);
        if (var8 == null) {
          if (param1 == -609592560) {
            if (param2 != null) {
              if ((param2[0] ^ -1) >= -1) {
                return null;
              } else {
                var18 = kb.a(((cf) this).field_d, param0, param3);
                if (var18 != null) {
                  L0: {
                    var19 = var18.a();
                    var11 = var19;
                    var8_ref = var19;
                    ((cf) this).field_f.a((gi) (Object) var8_ref, var6, -1);
                    if (param2 != null) {
                      param2[0] = param2[0] - var19.field_i.length;
                      break L0;
                    } else {
                      break L0;
                    }
                  }
                  return var8_ref;
                } else {
                  return null;
                }
              }
            } else {
              var16 = kb.a(((cf) this).field_d, param0, param3);
              if (var16 != null) {
                L1: {
                  var17 = var16.a();
                  var8_ref = var17;
                  ((cf) this).field_f.a((gi) (Object) var8_ref, var6, -1);
                  if (param2 != null) {
                    param2[0] = param2[0] - var17.field_i.length;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return var8_ref;
              } else {
                return null;
              }
            }
          } else {
            var10 = null;
            vk discarded$1 = this.b(-34, -12, (int[]) null, 51);
            if (param2 != null) {
              if ((param2[0] ^ -1) >= -1) {
                return null;
              } else {
                var14 = kb.a(((cf) this).field_d, param0, param3);
                if (var14 != null) {
                  L2: {
                    var15 = var14.a();
                    var11 = var15;
                    var8_ref = var15;
                    ((cf) this).field_f.a((gi) (Object) var8_ref, var6, -1);
                    if (param2 != null) {
                      param2[0] = param2[0] - var15.field_i.length;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  return var8_ref;
                } else {
                  return null;
                }
              }
            } else {
              var12 = kb.a(((cf) this).field_d, param0, param3);
              if (var12 != null) {
                L3: {
                  var13 = var12.a();
                  var11 = var13;
                  var8_ref = var13;
                  ((cf) this).field_f.a((gi) (Object) var8_ref, var6, -1);
                  if (param2 != null) {
                    param2[0] = param2[0] - var13.field_i.length;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                return var8_ref;
              } else {
                return null;
              }
            }
          }
        } else {
          return var8;
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        field_g = null;
        if (param0 > -60) {
            field_b = null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final vk a(int param0, int param1, int[] param2) {
        if (param0 != 256) {
            Object var5 = null;
            vk discarded$8 = ((cf) this).a((int[]) null, -91, -63);
            if (!(-2 != (((cf) this).field_h.b(param0 + -16288) ^ -1))) {
                return this.a(param1, 0, param2, -106);
            }
            if (((cf) this).field_h.a(param1, (byte) 127) == 1) {
                return this.a(0, param1, param2, -93);
            }
            throw new RuntimeException();
        }
        if (!(-2 != (((cf) this).field_h.b(param0 + -16288) ^ -1))) {
            return this.a(param1, 0, param2, -106);
        }
        if (((cf) this).field_h.a(param1, (byte) 127) == 1) {
            return this.a(0, param1, param2, -93);
        }
        throw new RuntimeException();
    }

    cf(vj param0, vj param1) {
        ((cf) this).field_e = new tg(256);
        ((cf) this).field_f = new tg(256);
        ((cf) this).field_h = param1;
        ((cf) this).field_d = param0;
    }

    final vk a(int[] param0, int param1, int param2) {
        if (!(-2 != (((cf) this).field_d.b(-16032) ^ -1))) {
            return this.b(0, -609592560, param0, param1);
        }
        if (!(((cf) this).field_d.a(param1, (byte) 127) != param2)) {
            return this.b(param1, -609592560, param0, 0);
        }
        throw new RuntimeException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Confirm Password: ";
    }
}
