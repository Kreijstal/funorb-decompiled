/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p {
    private kl field_g;
    static String field_d;
    static int field_b;
    static wd field_a;
    static String field_i;
    static String field_f;
    private kl field_h;
    private bg field_e;
    static String field_c;
    private bg field_j;

    private final sn a(String param0, String param1, int param2, int[] param3) {
        int var5 = 0;
        int var6 = 0;
        var5 = ((p) this).field_g.a(param1, 125);
        if (var5 >= param2) {
          var6 = ((p) this).field_g.a((byte) 119, var5, param0);
          if (-1 < (var6 ^ -1)) {
            return null;
          } else {
            return this.a(param2 ^ 0, param3, var6, var5);
          }
        } else {
          return null;
        }
    }

    final sn a(boolean param0, int[] param1, int param2) {
        if (((p) this).field_g.e(-113) != 1) {
          if (1 == ((p) this).field_g.d(param2, -2)) {
            return this.a(0, param1, 0, param2);
          } else {
            if (!param0) {
              field_a = null;
              throw new RuntimeException();
            } else {
              throw new RuntimeException();
            }
          }
        } else {
          return this.a(0, param1, param2, 0);
        }
    }

    final sn a(byte param0, String param1, String param2) {
        Object var5 = null;
        if (param0 >= -125) {
          var5 = null;
          p.a(-46, (java.applet.Applet) null);
          return this.a((int[]) null, (byte) 115, param2, param1);
        } else {
          return this.a((int[]) null, (byte) 115, param2, param1);
        }
    }

    private final sn b(int param0, int[] param1, int param2, int param3) {
        int var5 = 0;
        long var6 = 0L;
        sn var8 = null;
        sn var8_ref = null;
        qs var9 = null;
        qs var9_ref = null;
        var5 = param3 ^ (65532 & param2 << -648691772 | param2 >>> -738062324);
        var5 = var5 | param2 << -489095696;
        var6 = 4294967296L ^ (long)var5;
        var8 = (sn) (Object) ((p) this).field_j.a(-56, var6);
        if (var8 == null) {
          if (param1 != null) {
            if (0 < param1[0]) {
              L0: {
                var9 = (qs) (Object) ((p) this).field_e.a(param0 + 648691672, var6);
                if (var9 != null) {
                  break L0;
                } else {
                  var9_ref = qs.a(((p) this).field_h, param2, param3);
                  if (var9_ref != null) {
                    ((p) this).field_e.a((tc) (Object) var9_ref, var6, param0 + 648691834);
                    break L0;
                  } else {
                    return null;
                  }
                }
              }
              var8_ref = var9_ref.a(param1);
              if (var8_ref != null) {
                var9_ref.d(param0 + 648691815);
                if (param0 != -648691772) {
                  return null;
                } else {
                  ((p) this).field_j.a((tc) (Object) var8_ref, var6, 32);
                  return var8_ref;
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          } else {
            L1: {
              var9 = (qs) (Object) ((p) this).field_e.a(param0 + 648691672, var6);
              if (var9 != null) {
                break L1;
              } else {
                var9_ref = qs.a(((p) this).field_h, param2, param3);
                if (var9_ref != null) {
                  ((p) this).field_e.a((tc) (Object) var9_ref, var6, param0 + 648691834);
                  break L1;
                } else {
                  return null;
                }
              }
            }
            var8_ref = var9_ref.a(param1);
            if (var8_ref != null) {
              var9_ref.d(param0 + 648691815);
              if (param0 != -648691772) {
                return null;
              } else {
                ((p) this).field_j.a((tc) (Object) var8_ref, var6, 32);
                return var8_ref;
              }
            } else {
              return null;
            }
          }
        } else {
          return var8;
        }
    }

    public static void a(byte param0) {
        Object var2 = null;
        field_a = null;
        field_f = null;
        field_i = null;
        field_c = null;
        if (param0 != -58) {
          var2 = null;
          p.a(114, (java.applet.Applet) null);
          field_d = null;
          return;
        } else {
          field_d = null;
          return;
        }
    }

    private final sn a(int param0, int[] param1, int param2, int param3) {
        int var5 = 0;
        long var6 = 0L;
        sn var8 = null;
        sn var8_ref = null;
        sn var10 = null;
        rm var11 = null;
        sn var12 = null;
        rm var13 = null;
        sn var14 = null;
        var5 = (param3 >>> 1547181580 | (1073745919 & param3) << 901174596) ^ param2;
        var5 = var5 | param3 << 1476039312;
        var6 = (long)var5;
        var8 = (sn) (Object) ((p) this).field_j.a(param0 ^ -121, var6);
        if (var8 == null) {
          if (param1 != null) {
            if (param1[0] > 0) {
              var13 = rm.a(((p) this).field_g, param3, param2);
              if (var13 != null) {
                if (param0 != 0) {
                  return null;
                } else {
                  L0: {
                    var14 = var13.b();
                    var10 = var14;
                    var8_ref = var14;
                    ((p) this).field_j.a((tc) (Object) var8_ref, var6, 77);
                    if (param1 != null) {
                      param1[0] = param1[0] - var14.field_o.length;
                      break L0;
                    } else {
                      break L0;
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
            var11 = rm.a(((p) this).field_g, param3, param2);
            if (var11 != null) {
              if (param0 != 0) {
                return null;
              } else {
                L1: {
                  var12 = var11.b();
                  var8_ref = var12;
                  ((p) this).field_j.a((tc) (Object) var8_ref, var6, 77);
                  if (param1 != null) {
                    param1[0] = param1[0] - var12.field_o.length;
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
          }
        } else {
          return var8;
        }
    }

    final sn a(int[] param0, int param1, int param2) {
        if (((p) this).field_h.e(-111) == -2) {
            return this.b(-648691772, param0, 0, param2);
        }
        if (!(-2 != ((p) this).field_h.d(param2, -2))) {
            return this.b(-648691772, param0, param2, 0);
        }
        int var4 = 50 % ((param1 - -62) / 45);
        throw new RuntimeException();
    }

    final static void a(int param0, java.applet.Applet param1) {
        String var2 = null;
        CharSequence var3 = null;
        var2 = param1.getParameter("username");
        if (param0 == -24602) {
          if (var2 != null) {
            var3 = (CharSequence) (Object) var2;
            if (0L == wc.a(var3, 0)) {
              return;
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final sn a(String param0, byte param1, String param2) {
        if (param1 != -97) {
            return null;
        }
        return this.a(param0, param2, param1 + 97, (int[]) null);
    }

    final static String a(int param0, int param1, byte param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        if (0 < param0) {
          if (0 != param3) {
            if (param2 < -90) {
              if (param3 == 1) {
                return param0 + ".";
              } else {
                if (param3 != 2) {
                  if (3 != param3) {
                    if ((param3 ^ -1) == -5) {
                      return param0 + "e";
                    } else {
                      throw new IllegalArgumentException("Unsupported language " + param3);
                    }
                  } else {
                    if (2 != param1) {
                      return param0 + "º";
                    } else {
                      return param0 + "ª";
                    }
                  }
                } else {
                  if (param0 == 1) {
                    if (param1 == 2) {
                      return param0 + "ère";
                    } else {
                      return param0 + "er";
                    }
                  } else {
                    return param0 + "ème";
                  }
                }
              }
            } else {
              field_c = null;
              if (param3 == 1) {
                return param0 + ".";
              } else {
                if (param3 != 2) {
                  if (3 != param3) {
                    if ((param3 ^ -1) == -5) {
                      return param0 + "e";
                    } else {
                      throw new IllegalArgumentException("Unsupported language " + param3);
                    }
                  } else {
                    if (2 != param1) {
                      return param0 + "º";
                    } else {
                      return param0 + "ª";
                    }
                  }
                } else {
                  if (param0 == 1) {
                    if (param1 == 2) {
                      return param0 + "ère";
                    } else {
                      return param0 + "er";
                    }
                  } else {
                    return param0 + "ème";
                  }
                }
              }
            }
          } else {
            var4 = param0 % 100;
            if (-12 < (var4 ^ -1)) {
              var5 = param0 % 10;
              if (var5 == 1) {
                return param0 + "st";
              } else {
                if (-3 == (var5 ^ -1)) {
                  return param0 + "nd";
                } else {
                  if (var5 == 3) {
                    return param0 + "rd";
                  } else {
                    return param0 + "th";
                  }
                }
              }
            } else {
              if (var4 > 13) {
                var5 = param0 % 10;
                if (var5 == 1) {
                  return param0 + "st";
                } else {
                  if (-3 == (var5 ^ -1)) {
                    return param0 + "nd";
                  } else {
                    if (var5 == 3) {
                      return param0 + "rd";
                    } else {
                      return param0 + "th";
                    }
                  }
                }
              } else {
                return param0 + "th";
              }
            }
          }
        } else {
          throw new IllegalArgumentException("Can only get ordinal for positive numbers");
        }
    }

    p(kl param0, kl param1) {
        ((p) this).field_e = new bg(256);
        ((p) this).field_j = new bg(256);
        ((p) this).field_g = param0;
        ((p) this).field_h = param1;
    }

    private final sn a(int[] param0, byte param1, String param2, String param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var5 = ((p) this).field_h.a(param3, 108);
        if (var5 >= 0) {
          var6 = ((p) this).field_h.a((byte) 119, var5, param2);
          if (var6 < 0) {
            return null;
          } else {
            var7 = -61 / ((param1 - 48) / 33);
            return this.b(-648691772, param0, var5, var6);
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Searching for opponents";
        field_i = "<%0> wins!";
        field_d = "This password contains your email address, and would be easy to guess";
        field_c = "Catalysts that cause units to duplicate.";
    }
}
