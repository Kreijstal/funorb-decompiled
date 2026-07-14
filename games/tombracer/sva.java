/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sva implements ev {
    private ob[] field_a;
    static int field_d;
    private vna field_b;
    private la field_c;

    public final void a(int param0) {
        if (param0 != 13113) {
            ((sva) this).field_a = null;
        }
        ((sva) this).field_b.d(8);
    }

    public final void a(iq param0, int param1) {
        float var3 = 0.0f;
        float var4 = 0.0f;
        float var5 = 0.0f;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        uh var12 = null;
        int var13 = 0;
        Object var14 = null;
        L0: {
          var13 = TombRacer.field_G ? 1 : 0;
          if (ss.a(param1 ^ -15574)) {
            var9 = 0;
            var7 = 0;
            var6 = 16777215;
            var8 = -10;
            var3 = 0.0f;
            var4 = 0.15000000596046448f;
            var5 = 0.6499999761581421f;
            break L0;
          } else {
            L1: {
              var10 = ((sva) this).field_c.l((byte) 119);
              if (var10 == 0) {
                break L1;
              } else {
                if (1 != var10) {
                  break L1;
                } else {
                  var8 = -8;
                  var9 = -32;
                  var6 = 11180543;
                  var3 = 0.20000000298023224f;
                  var5 = 0.4000000059604645f;
                  var7 = 0;
                  var4 = 0.03999999910593033f;
                  break L0;
                }
              }
            }
            var9 = -24;
            var5 = 0.6499999761581421f;
            var6 = 16770747;
            var8 = -8;
            var7 = 0;
            var3 = 0.10000000149011612f;
            var4 = 0.05000000074505806f;
            break L0;
          }
        }
        L2: {
          var10 = 0;
          var11 = 16384;
          tga.field_a.L(var10, var11, 0);
          tga.field_a.xa(var5);
          tga.field_a.ZA(var6, var3, var4, (float)var7, (float)var8, (float)var9);
          if (uh.a((byte) -7)) {
            var12 = (uh) (Object) ((sva) this).field_b.f(-80);
            L3: while (true) {
              if (var12 == null) {
                tga.field_a.a(0, (ob[]) null);
                break L2;
              } else {
                L4: {
                  if (!var12.c(param1 + -1459836712)) {
                    var12.a((byte) 100, ((sva) this).field_c.a(-1553494544).field_c);
                    break L4;
                  } else {
                    var12.p(57);
                    break L4;
                  }
                }
                var12 = (uh) (Object) ((sva) this).field_b.e(116);
                continue L3;
              }
            }
          } else {
            break L2;
          }
        }
        L5: {
          if (param1 == -15530) {
            break L5;
          } else {
            var14 = null;
            ((sva) this).a(92, (fo) null, (iq) null);
            break L5;
          }
        }
    }

    public final void a(int param0, iq param1) {
        if (uh.a((byte) -7)) {
            tga.field_a.a(0, (ob[]) null);
        }
        if (param0 != -16188) {
            ((sva) this).field_b = null;
        }
    }

    final static iu[] a(int param0, int param1, int param2) {
        if (param2 != 4) {
            iu[] discarded$0 = sva.a(17, 31, 46);
        }
        return vl.a((byte) 125, param0, param1, 1);
    }

    final void b(byte param0, uh param1) {
        int var3 = 86 % ((-52 - param0) / 48);
        param1.p(66);
    }

    public final void a(vf param0, int param1, iq param2, boolean param3) {
        if (!param3) {
            iu[] discarded$0 = sva.a(112, -118, 127);
        }
    }

    public final void a(int param0, vf param1, iq param2, int param3) {
        if (param3 != 11180543) {
            field_d = -52;
        }
    }

    public final void a(int param0, fo param1, iq param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        gs var7_ref = null;
        int var8 = 0;
        int var9 = 0;
        uh var10 = null;
        uh var11 = null;
        int var12 = 0;
        Object var13 = null;
        L0: {
          var12 = TombRacer.field_G ? 1 : 0;
          if (param0 == 0) {
            break L0;
          } else {
            var13 = null;
            ((sva) this).a(true, (fo) null, (iq) null);
            break L0;
          }
        }
        L1: {
          if (!uh.a((byte) -7)) {
            break L1;
          } else {
            L2: {
              var4 = param1 instanceof hr ? 1 : 0;
              var5 = 0;
              var6 = et.b(((sva) this).field_a.length, tga.field_a.l(), -97);
              var7 = null;
              if (!(param1 instanceof gs)) {
                break L2;
              } else {
                var7_ref = (gs) (Object) param1;
                break L2;
              }
            }
            L3: {
              var9 = 0;
              var10 = null;
              if (var4 != 0) {
                break L3;
              } else {
                L4: {
                  if (var7_ref == null) {
                    break L4;
                  } else {
                    if (!var7_ref.a(true)) {
                      break L4;
                    } else {
                      tga.field_a.a(var5, ((sva) this).field_a);
                      break L1;
                    }
                  }
                }
                var11 = (uh) (Object) ((sva) this).field_b.f(-80);
                L5: while (true) {
                  if (var11 == null) {
                    L6: while (true) {
                      if (var5 >= var6) {
                        break L3;
                      } else {
                        var10 = null;
                        var9 = 0;
                        var11 = (uh) (Object) ((sva) this).field_b.f(-80);
                        L7: while (true) {
                          if (var11 == null) {
                            if (var10 == null) {
                              break L3;
                            } else {
                              var10.a(-1, 81);
                              ((sva) this).field_a[var5] = var10.a(47).field_c;
                              var5++;
                              continue L6;
                            }
                          } else {
                            L8: {
                              var8 = var11.b(121);
                              if (0 >= var8) {
                                break L8;
                              } else {
                                if (var8 > var9) {
                                  var10 = var11;
                                  var9 = var8;
                                  break L8;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            var11 = (uh) (Object) ((sva) this).field_b.e(115);
                            continue L7;
                          }
                        }
                      }
                    }
                  } else {
                    L9: {
                      L10: {
                        if (var7_ref == null) {
                          break L10;
                        } else {
                          if (!var7_ref.a(false, var11)) {
                            break L10;
                          } else {
                            var8 = -1;
                            break L9;
                          }
                        }
                      }
                      var8 = var11.a(param1.e((byte) -124), param1.b((byte) -101), param1.c((byte) 95), -43);
                      break L9;
                    }
                    var11.a(var8, 92);
                    var11 = (uh) (Object) ((sva) this).field_b.e(119);
                    continue L5;
                  }
                }
              }
            }
            tga.field_a.a(var5, ((sva) this).field_a);
            break L1;
          }
        }
    }

    public final void a(boolean param0, fo param1, iq param2) {
        if (param0) {
            Object var5 = null;
            ((sva) this).a(3, (iq) null);
        }
    }

    sva(la param0) {
        ((sva) this).field_a = new ob[4];
        ((sva) this).field_b = new vna();
        ((sva) this).field_c = param0;
    }

    final void a(byte param0, uh param1) {
        if (param0 != 45) {
            return;
        }
        ((sva) this).field_b.b((byte) -61, (vg) (Object) param1);
    }

    static {
    }
}
