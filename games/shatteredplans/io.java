/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class io {
    static qr field_c;
    private bc field_b;
    private ti field_a;
    private bc field_e;
    private ti field_d;

    private final kk a(int param0, int[] param1, int param2, int param3) {
        int var5 = 0;
        long var6 = 0L;
        kk var8 = null;
        kk var8_ref = null;
        dq var9 = null;
        kk var10 = null;
        dq var11 = null;
        kk var12 = null;
        dq var20 = null;
        kk var21 = null;
        dq var23 = null;
        kk var24 = null;
        if (param2 == 0) {
          var5 = param3 ^ (param0 << -1430262716 & 65523 | param0 >>> -1217973908);
          var5 = var5 | param0 << -1272090960;
          var6 = (long)var5;
          var8 = (kk) (Object) ((io) this).field_d.a(var6, -25064);
          if (var8 != null) {
            return var8;
          } else {
            if (param1 != null) {
              if ((param1[0] ^ -1) < -1) {
                var23 = dq.a(((io) this).field_b, param0, param3);
                if (var23 == null) {
                  return null;
                } else {
                  L0: {
                    var24 = var23.b();
                    var8_ref = var24;
                    ((io) this).field_d.a((oh) (Object) var8_ref, 13, var6);
                    if (param1 != null) {
                      param1[0] = param1[0] - var24.field_m.length;
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
              var23 = dq.a(((io) this).field_b, param0, param3);
              if (var23 == null) {
                return null;
              } else {
                L1: {
                  var24 = var23.b();
                  var8_ref = var24;
                  ((io) this).field_d.a((oh) (Object) var8_ref, 13, var6);
                  if (param1 != null) {
                    param1[0] = param1[0] - var24.field_m.length;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return var8_ref;
              }
            }
          }
        } else {
          ((io) this).field_b = null;
          var5 = param3 ^ (param0 << -1430262716 & 65523 | param0 >>> -1217973908);
          var5 = var5 | param0 << -1272090960;
          var6 = (long)var5;
          var8 = (kk) (Object) ((io) this).field_d.a(var6, -25064);
          if (var8 != null) {
            return var8;
          } else {
            if (param1 != null) {
              if ((param1[0] ^ -1) < -1) {
                var20 = dq.a(((io) this).field_b, param0, param3);
                var9 = var20;
                if (var20 == null) {
                  return null;
                } else {
                  L2: {
                    var21 = var20.b();
                    var8_ref = var21;
                    ((io) this).field_d.a((oh) (Object) var8_ref, 13, var6);
                    if (param1 != null) {
                      param1[0] = param1[0] - var21.field_m.length;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  return var8_ref;
                }
              } else {
                return null;
              }
            } else {
              var11 = dq.a(((io) this).field_b, param0, param3);
              var9 = var11;
              if (var11 == null) {
                return null;
              } else {
                L3: {
                  var12 = var11.b();
                  var10 = var12;
                  var8_ref = var12;
                  ((io) this).field_d.a((oh) (Object) var8_ref, 13, var6);
                  if (param1 != null) {
                    param1[0] = param1[0] - var12.field_m.length;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                return var8_ref;
              }
            }
          }
        }
    }

    final kk a(int param0, int[] param1, int param2) {
        Object var5 = null;
        if (-2 != (((io) this).field_e.a((byte) -114) ^ -1)) {
          if (-2 == (((io) this).field_e.a(param2, param0 ^ -26268) ^ -1)) {
            return this.a(param0 + -12203, 0, param2, param1);
          } else {
            if (param0 != 0) {
              var5 = null;
              kk discarded$2 = this.a(84, 113, 110, (int[]) null);
              throw new RuntimeException();
            } else {
              throw new RuntimeException();
            }
          }
        } else {
          return this.a(param0 + -12203, param2, 0, param1);
        }
    }

    final kk a(int param0, byte param1, int[] param2) {
        Object var5 = null;
        if (((io) this).field_b.a((byte) -79) != 1) {
          if (1 != ((io) this).field_b.a(param0, -26268)) {
            if (param1 != -63) {
              var5 = null;
              kk discarded$2 = ((io) this).a(-103, (int[]) null, -81);
              throw new RuntimeException();
            } else {
              throw new RuntimeException();
            }
          } else {
            return this.a(param0, param2, param1 ^ -63, 0);
          }
        } else {
          return this.a(0, param2, 0, param0);
        }
    }

    private final kk a(int[] param0, int param1, String param2, String param3) {
        int var5 = 0;
        int var6 = 0;
        var5 = ((io) this).field_b.a(122, param3);
        if (0 <= var5) {
          var6 = ((io) this).field_b.a(var5, (byte) 106, param2);
          if (param1 < (var6 ^ -1)) {
            return null;
          } else {
            return this.a(var5, param0, 0, var6);
          }
        } else {
          return null;
        }
    }

    private final kk a(int param0, int param1, int param2, int[] param3) {
        int var5 = 0;
        long var6 = 0L;
        kk var8 = null;
        kk var8_ref = null;
        fd var9 = null;
        fd var9_ref = null;
        var5 = (param2 >>> -1646661908 | 65520 & param2 << 1839660580) ^ param1;
        var5 = var5 | param2 << -188452336;
        var6 = 4294967296L ^ (long)var5;
        var8 = (kk) (Object) ((io) this).field_d.a(var6, -25064);
        if (var8 == null) {
          if (param3 != null) {
            if (0 < param3[0]) {
              L0: {
                var9 = (fd) (Object) ((io) this).field_a.a(var6, -25064);
                if (var9 == null) {
                  var9_ref = fd.a(((io) this).field_e, param2, param1);
                  if (var9_ref != null) {
                    ((io) this).field_a.a((oh) (Object) var9_ref, 66, var6);
                    break L0;
                  } else {
                    return null;
                  }
                } else {
                  break L0;
                }
              }
              var8_ref = var9_ref.a(param3);
              if (var8_ref != null) {
                var9_ref.b((byte) -98);
                ((io) this).field_d.a((oh) (Object) var8_ref, -128, var6);
                if (param0 != -12203) {
                  return null;
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
            L1: {
              var9 = (fd) (Object) ((io) this).field_a.a(var6, -25064);
              if (var9 == null) {
                var9_ref = fd.a(((io) this).field_e, param2, param1);
                if (var9_ref != null) {
                  ((io) this).field_a.a((oh) (Object) var9_ref, 66, var6);
                  break L1;
                } else {
                  return null;
                }
              } else {
                break L1;
              }
            }
            var8_ref = var9_ref.a(param3);
            if (var8_ref != null) {
              var9_ref.b((byte) -98);
              ((io) this).field_d.a((oh) (Object) var8_ref, -128, var6);
              if (param0 != -12203) {
                return null;
              } else {
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
        if (param0 < 104) {
            io.a((byte) -77);
            field_c = null;
            return;
        }
        field_c = null;
    }

    final kk a(String param0, String param1, int param2) {
        if (param2 != -22888) {
            return null;
        }
        return this.a(param0, true, (int[]) null, param1);
    }

    final static bc a(int param0, int param1) {
        if (param1 < 27) {
          field_c = null;
          return cc.a(1, false, param0, 12000, true, false);
        } else {
          return cc.a(1, false, param0, 12000, true, false);
        }
    }

    private final kk a(String param0, boolean param1, int[] param2, String param3) {
        int var5 = 0;
        int var6 = 0;
        if (param1) {
          var5 = ((io) this).field_e.a(124, param0);
          if (var5 >= 0) {
            var6 = ((io) this).field_e.a(var5, (byte) 106, param3);
            if (var6 < 0) {
              return null;
            } else {
              return this.a(-12203, var6, var5, param2);
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    io(bc param0, bc param1) {
        ((io) this).field_a = new ti(256);
        ((io) this).field_d = new ti(256);
        ((io) this).field_e = param1;
        ((io) this).field_b = param0;
    }

    final kk a(int param0, String param1, String param2) {
        if (param0 != 28116) {
          ((io) this).field_e = null;
          return this.a((int[]) null, -1, param1, param2);
        } else {
          return this.a((int[]) null, -1, param1, param2);
        }
    }

    static {
    }
}
