/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ci {
    private rh field_d;
    private fi field_a;
    private rh field_c;
    private fi field_b;

    final gd c(int param0, String param1) {
        if (param0 != -1879044097) {
            return null;
        }
        return this.a(param1, (int[]) null, param0 ^ -1879044098);
    }

    final gd b(int param0, String param1) {
        if (param0 != 1) {
            return null;
        }
        return this.a((byte) -90, param1, (int[]) null);
    }

    final gd a(int param0, int param1, int[] param2) {
        if (!(1 != ((ci) this).field_d.a(false))) {
            return this.a(param2, 0, param0, (byte) 14);
        }
        if (!(param1 != ((ci) this).field_d.c(-9467, param0))) {
            return this.a(param2, param0, 0, (byte) 14);
        }
        throw new RuntimeException();
    }

    final gd a(int param0, int[] param1, boolean param2) {
        if (!(-2 != (((ci) this).field_c.a(param2) ^ -1))) {
            return this.a(param1, 97, 0, param0);
        }
        if (!(1 != ((ci) this).field_c.c(-9467, param0))) {
            return this.a(param1, 125, param0, 0);
        }
        throw new RuntimeException();
    }

    private final gd a(byte param0, String param1, int[] param2) {
        if (param0 == -90) {
          if (((ci) this).field_c.b((byte) -126, "")) {
            return this.a(param2, param1, "", true);
          } else {
            return this.a(param2, "", param1, true);
          }
        } else {
          ((ci) this).field_d = null;
          if (((ci) this).field_c.b((byte) -126, "")) {
            return this.a(param2, param1, "", true);
          } else {
            return this.a(param2, "", param1, true);
          }
        }
    }

    final static h a(int param0, String param1) {
        Object var3 = null;
        L0: {
          if (!ih.field_c.a(-87)) {
            break L0;
          } else {
            if (!param1.equals((Object) (Object) ih.field_c.b(19491))) {
              ih.field_c = bf.a((byte) 86, param1);
              break L0;
            } else {
              if (param0 == -1) {
                return ih.field_c;
              } else {
                var3 = null;
                h discarded$4 = ci.a(-30, (String) null);
                return ih.field_c;
              }
            }
          }
        }
        if (param0 != -1) {
          var3 = null;
          h discarded$5 = ci.a(-30, (String) null);
          return ih.field_c;
        } else {
          return ih.field_c;
        }
    }

    private final gd a(int[] param0, String param1, String param2, boolean param3) {
        int var5 = 0;
        int var6 = 0;
        var5 = ((ci) this).field_c.a((byte) 127, param2);
        if (var5 >= 0) {
          if (param3) {
            var6 = ((ci) this).field_c.a(param1, -98, var5);
            if (-1 < (var6 ^ -1)) {
              return null;
            } else {
              return this.a(param0, 98, var5, var6);
            }
          } else {
            ((ci) this).field_c = null;
            var6 = ((ci) this).field_c.a(param1, -98, var5);
            if (-1 < (var6 ^ -1)) {
              return null;
            } else {
              return this.a(param0, 98, var5, var6);
            }
          }
        } else {
          return null;
        }
    }

    private final gd a(int[] param0, int param1, int param2, int param3) {
        int var5 = 0;
        long var6 = 0L;
        gd var8 = null;
        gd var8_ref = null;
        fg var9 = null;
        fg var11 = null;
        gd var12 = null;
        fg var39 = null;
        gd var40 = null;
        fg var47 = null;
        gd var48 = null;
        var5 = param3 ^ (65533 & param2 << 356185060 | param2 >>> 1491735340);
        var5 = var5 | param2 << -1345231792;
        var6 = (long)var5;
        var8 = (gd) (Object) ((ci) this).field_b.a(var6, (byte) -74);
        if (param1 > 19) {
          if (var8_ref != null) {
            return var8_ref;
          } else {
            if (param0 != null) {
              if (-1 > (param0[0] ^ -1)) {
                var47 = fg.a(((ci) this).field_c, param2, param3);
                if (var47 != null) {
                  var48 = var47.a();
                  var8_ref = var48;
                  ((ci) this).field_b.a((byte) 102, (hf) (Object) var8_ref, var6);
                  if (param0 != null) {
                    param0[0] = param0[0] - var48.field_k.length;
                    return var8_ref;
                  } else {
                    return var8_ref;
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            } else {
              var47 = fg.a(((ci) this).field_c, param2, param3);
              if (var47 != null) {
                var48 = var47.a();
                var8_ref = var48;
                ((ci) this).field_b.a((byte) 102, (hf) (Object) var8_ref, var6);
                if (param0 != null) {
                  param0[0] = param0[0] - var48.field_k.length;
                  return var8_ref;
                } else {
                  return var8_ref;
                }
              } else {
                return null;
              }
            }
          }
        } else {
          ((ci) this).field_c = null;
          if (var8 != null) {
            return var8;
          } else {
            if (param0 != null) {
              if (-1 > (param0[0] ^ -1)) {
                var39 = fg.a(((ci) this).field_c, param2, param3);
                var9 = var39;
                if (var39 != null) {
                  var40 = var39.a();
                  var8_ref = var40;
                  ((ci) this).field_b.a((byte) 102, (hf) (Object) var8_ref, var6);
                  if (param0 != null) {
                    param0[0] = param0[0] - var40.field_k.length;
                    return var8_ref;
                  } else {
                    return var8_ref;
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            } else {
              var11 = fg.a(((ci) this).field_c, param2, param3);
              var9 = var11;
              if (var11 != null) {
                var12 = var11.a();
                var8_ref = var12;
                ((ci) this).field_b.a((byte) 102, (hf) (Object) var8_ref, var6);
                if (param0 != null) {
                  param0[0] = param0[0] - var12.field_k.length;
                  return var8_ref;
                } else {
                  return var8_ref;
                }
              } else {
                return null;
              }
            }
          }
        }
    }

    private final gd a(int[] param0, int param1, int param2, byte param3) {
        int var5 = 0;
        long var6 = 0L;
        gd var8 = null;
        gd var8_ref = null;
        ua var9 = null;
        ua var9_ref = null;
        var5 = ((param1 & -1879044097) << 139467780 | param1 >>> 416577356) ^ param2;
        var5 = var5 | param1 << 187785136;
        var6 = (long)var5 ^ 4294967296L;
        var8 = (gd) (Object) ((ci) this).field_b.a(var6, (byte) -115);
        if (param3 == 14) {
          if (var8 != null) {
            return var8;
          } else {
            if (param0 != null) {
              if (-1 > (param0[0] ^ -1)) {
                L0: {
                  var9 = (ua) (Object) ((ci) this).field_a.a(var6, (byte) -96);
                  if (var9 != null) {
                    break L0;
                  } else {
                    var9_ref = ua.a(((ci) this).field_d, param1, param2);
                    if (var9_ref != null) {
                      ((ci) this).field_a.a((byte) 102, (hf) (Object) var9_ref, var6);
                      break L0;
                    } else {
                      return null;
                    }
                  }
                }
                var8_ref = var9_ref.a(param0);
                if (var8_ref == null) {
                  return null;
                } else {
                  var9_ref.a(false);
                  ((ci) this).field_b.a((byte) 102, (hf) (Object) var8_ref, var6);
                  return var8_ref;
                }
              } else {
                return null;
              }
            } else {
              L1: {
                var9 = (ua) (Object) ((ci) this).field_a.a(var6, (byte) -96);
                if (var9 != null) {
                  break L1;
                } else {
                  var9_ref = ua.a(((ci) this).field_d, param1, param2);
                  if (var9_ref != null) {
                    ((ci) this).field_a.a((byte) 102, (hf) (Object) var9_ref, var6);
                    break L1;
                  } else {
                    return null;
                  }
                }
              }
              var8_ref = var9_ref.a(param0);
              if (var8_ref == null) {
                return null;
              } else {
                var9_ref.a(false);
                ((ci) this).field_b.a((byte) 102, (hf) (Object) var8_ref, var6);
                return var8_ref;
              }
            }
          }
        } else {
          return null;
        }
    }

    final static void a(String[] args, int param1) {
        if (param1 == 416577356) {
          if (gf.field_d != null) {
            L0: {
              gf.field_d.field_K.a((byte) 126, args);
              if (null != vk.field_d) {
                vk.field_d.field_D.a((byte) 126, args);
                break L0;
              } else {
                break L0;
              }
            }
            return;
          } else {
            L1: {
              if (null != vk.field_d) {
                vk.field_d.field_D.a((byte) 126, args);
                break L1;
              } else {
                break L1;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    private final gd a(String param0, int[] param1, int param2) {
        if (((ci) this).field_d.b((byte) -120, "")) {
          return this.a(param0, param1, 12628, "");
        } else {
          if (param2 != 1) {
            ((ci) this).field_a = null;
            return this.a("", param1, 12628, param0);
          } else {
            return this.a("", param1, 12628, param0);
          }
        }
    }

    private final gd a(String param0, int[] param1, int param2, String param3) {
        int var5 = 0;
        int var6 = 0;
        var5 = ((ci) this).field_d.a((byte) 127, param3);
        if (0 <= var5) {
          if (param2 == 12628) {
            var6 = ((ci) this).field_d.a(param0, -89, var5);
            if (-1 < (var6 ^ -1)) {
              return null;
            } else {
              return this.a(param1, var5, var6, (byte) 14);
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    ci(rh param0, rh param1) {
        ((ci) this).field_a = new fi(256);
        ((ci) this).field_b = new fi(256);
        ((ci) this).field_c = param0;
        ((ci) this).field_d = param1;
    }

    static {
    }
}
