/*
 * Decompiled by CFR-JS 0.4.0.
 */
class uqb extends ksa implements ntb {
    boolean field_f;
    static int field_h;
    int field_e;
    pwa field_d;
    boolean field_g;

    public void b(faa param0, int param1) {
        faa stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        faa stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        faa stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        faa stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        faa stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        faa stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        param0.a(-632, ((uqb) this).field_e, bnb.field_p);
        if (param1 >= -109) {
          return;
        } else {
          L0: {
            stackOut_1_0 = (faa) param0;
            stackOut_1_1 = 59;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_2_0 = stackOut_1_0;
            stackIn_2_1 = stackOut_1_1;
            if (((uqb) this).field_d == null) {
              stackOut_3_0 = (faa) (Object) stackIn_3_0;
              stackOut_3_1 = stackIn_3_1;
              stackOut_3_2 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              stackIn_4_2 = stackOut_3_2;
              break L0;
            } else {
              stackOut_2_0 = (faa) (Object) stackIn_2_0;
              stackOut_2_1 = stackIn_2_1;
              stackOut_2_2 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              stackIn_4_2 = stackOut_2_2;
              break L0;
            }
          }
          L1: {
            if (vq.a(stackIn_4_0, stackIn_4_1, stackIn_4_2 != 0)) {
              ((uqb) this).field_d.b(param0, -113);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final void a(byte param0, mfa param1, tja param2) {
        int var5 = 0;
        Object var7 = null;
        hg var12 = null;
        bha var13 = null;
        hg var14 = null;
        bha var15 = null;
        gqa var16 = null;
        bha var17 = null;
        gqa var20 = null;
        bha var21 = null;
        hg var22 = null;
        bha var23 = null;
        if (param0 < -111) {
          if (((uqb) this).field_d != null) {
            if (((uqb) this).field_d.field_e != null) {
              L0: {
                var20 = ((uqb) this).field_d.field_e;
                var5 = var20.field_a;
                var21 = param2.field_c[var5];
                if (param1 != null) {
                  param1.a(var20.field_b, var5, (byte) -117);
                  break L0;
                } else {
                  break L0;
                }
              }
              var21.field_a = true;
              var21.a(param2, var5, -24354, ((uqb) this).field_e);
              iva.a(-6940, "CarouselEvent: Applied join for " + var20.field_b);
              if (null == ((uqb) this).field_d) {
                ((uqb) this).a(param1, 0, param2);
                return;
              } else {
                return;
              }
            } else {
              L1: {
                if (null == ((uqb) this).field_d) {
                  break L1;
                } else {
                  if (((uqb) this).field_d.field_d != null) {
                    var22 = ((uqb) this).field_d.field_d;
                    var5 = var22.field_d;
                    var23 = param2.field_c[var5];
                    var23.field_a = false;
                    var23.a(true, param2, ((uqb) this).field_e, var5);
                    iva.a(-6940, "CarouselEvent: Applied leave for player " + var5);
                    break L1;
                  } else {
                    if (null == ((uqb) this).field_d) {
                      ((uqb) this).a(param1, 0, param2);
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
              if (null == ((uqb) this).field_d) {
                ((uqb) this).a(param1, 0, param2);
                return;
              } else {
                return;
              }
            }
          } else {
            L2: {
              if (null == ((uqb) this).field_d) {
                break L2;
              } else {
                if (((uqb) this).field_d.field_d != null) {
                  var22 = ((uqb) this).field_d.field_d;
                  var5 = var22.field_d;
                  var23 = param2.field_c[var5];
                  var23.field_a = false;
                  var23.a(true, param2, ((uqb) this).field_e, var5);
                  iva.a(-6940, "CarouselEvent: Applied leave for player " + var5);
                  break L2;
                } else {
                  if (null == ((uqb) this).field_d) {
                    ((uqb) this).a(param1, 0, param2);
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
            if (null == ((uqb) this).field_d) {
              ((uqb) this).a(param1, 0, param2);
              return;
            } else {
              return;
            }
          }
        } else {
          var7 = null;
          boolean discarded$1 = ((uqb) this).a((byte) 62, (tv) null);
          if (((uqb) this).field_d != null) {
            if (((uqb) this).field_d.field_e != null) {
              L3: {
                var16 = ((uqb) this).field_d.field_e;
                var5 = var16.field_a;
                var17 = param2.field_c[var5];
                if (param1 != null) {
                  param1.a(var16.field_b, var5, (byte) -117);
                  break L3;
                } else {
                  break L3;
                }
              }
              var17.field_a = true;
              var17.a(param2, var5, -24354, ((uqb) this).field_e);
              iva.a(-6940, "CarouselEvent: Applied join for " + var16.field_b);
              if (null == ((uqb) this).field_d) {
                ((uqb) this).a(param1, 0, param2);
                return;
              } else {
                return;
              }
            } else {
              L4: {
                if (null == ((uqb) this).field_d) {
                  break L4;
                } else {
                  if (((uqb) this).field_d.field_d != null) {
                    var14 = ((uqb) this).field_d.field_d;
                    var5 = var14.field_d;
                    var15 = param2.field_c[var5];
                    var15.field_a = false;
                    var15.a(true, param2, ((uqb) this).field_e, var5);
                    iva.a(-6940, "CarouselEvent: Applied leave for player " + var5);
                    break L4;
                  } else {
                    L5: {
                      if (null != ((uqb) this).field_d) {
                        break L5;
                      } else {
                        ((uqb) this).a(param1, 0, param2);
                        break L5;
                      }
                    }
                    return;
                  }
                }
              }
              if (null == ((uqb) this).field_d) {
                ((uqb) this).a(param1, 0, param2);
                return;
              } else {
                return;
              }
            }
          } else {
            L6: {
              if (null == ((uqb) this).field_d) {
                break L6;
              } else {
                if (((uqb) this).field_d.field_d != null) {
                  var12 = ((uqb) this).field_d.field_d;
                  var5 = var12.field_d;
                  var13 = param2.field_c[var5];
                  var13.field_a = false;
                  var13.a(true, param2, ((uqb) this).field_e, var5);
                  iva.a(-6940, "CarouselEvent: Applied leave for player " + var5);
                  break L6;
                } else {
                  break L6;
                }
              }
            }
            if (null == ((uqb) this).field_d) {
              ((uqb) this).a(param1, 0, param2);
              return;
            } else {
              return;
            }
          }
        }
    }

    public boolean a(byte param0, tv param1) {
        uqb var3 = null;
        int var4 = 0;
        var3 = (uqb) (Object) param1;
        var4 = 72 % ((22 - param0) / 59);
        if (var3.field_e == var3.field_e) {
          pwa discarded$2 = var3.field_d;
          if (null != var3.field_d) {
            if (!var3.field_d.a((byte) 121, (tv) (Object) var3.field_d)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    public void a(tv param0, int param1) {
        int var4 = 0;
        Object var5 = null;
        Object var6 = null;
        uqb var6_ref = null;
        L0: {
          var6 = null;
          var6_ref = (uqb) (Object) param0;
          var4 = 0;
          if (var6_ref.field_e != var6_ref.field_e) {
            iva.a(-6940, "int tick has changed. before=" + var6_ref.field_e + ", now=" + var6_ref.field_e);
            var4 = 1;
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 <= -19) {
          L1: {
            if (var6_ref.field_d == null) {
              break L1;
            } else {
              if (null != var6_ref.field_d) {
                var6_ref.field_d.a((tv) (Object) var6_ref.field_d, -70);
                break L1;
              } else {
                pwa discarded$4 = var6_ref.field_d;
                L2: {
                  if (var6_ref.field_d == null) {
                    break L2;
                  } else {
                    if (!var6_ref.field_d.a((byte) 108, (tv) (Object) var6_ref.field_d)) {
                      L3: {
                        if (var4 != 0) {
                          tfb.a((byte) -78, "This instance of CarouselEvent has changed");
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      return;
                    } else {
                      var4 = 1;
                      iva.a(-6940, "CarouselSystemMessage system_message has changed. before=" + var6_ref.field_d + ", now=" + var6_ref.field_d);
                      break L2;
                    }
                  }
                }
                L4: {
                  if (var4 != 0) {
                    tfb.a((byte) -78, "This instance of CarouselEvent has changed");
                    break L4;
                  } else {
                    break L4;
                  }
                }
                return;
              }
            }
          }
          pwa discarded$5 = var6_ref.field_d;
          L5: {
            if (var6_ref.field_d == null) {
              break L5;
            } else {
              if (!var6_ref.field_d.a((byte) 108, (tv) (Object) var6_ref.field_d)) {
                L6: {
                  if (var4 != 0) {
                    tfb.a((byte) -78, "This instance of CarouselEvent has changed");
                    break L6;
                  } else {
                    break L6;
                  }
                }
                return;
              } else {
                var4 = 1;
                iva.a(-6940, "CarouselSystemMessage system_message has changed. before=" + var6_ref.field_d + ", now=" + var6_ref.field_d);
                break L5;
              }
            }
          }
          L7: {
            if (var4 != 0) {
              tfb.a((byte) -78, "This instance of CarouselEvent has changed");
              break L7;
            } else {
              break L7;
            }
          }
          return;
        } else {
          var5 = null;
          ((uqb) this).b((faa) null, 67);
          if (var6_ref.field_d != null) {
            L8: {
              if (null != var6_ref.field_d) {
                var6_ref.field_d.a((tv) (Object) var6_ref.field_d, -70);
                break L8;
              } else {
                break L8;
              }
            }
            pwa discarded$6 = var6_ref.field_d;
            L9: {
              if (var6_ref.field_d == null) {
                break L9;
              } else {
                if (!var6_ref.field_d.a((byte) 108, (tv) (Object) var6_ref.field_d)) {
                  L10: {
                    if (var4 != 0) {
                      tfb.a((byte) -78, "This instance of CarouselEvent has changed");
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  return;
                } else {
                  var4 = 1;
                  iva.a(-6940, "CarouselSystemMessage system_message has changed. before=" + var6_ref.field_d + ", now=" + var6_ref.field_d);
                  break L9;
                }
              }
            }
            L11: {
              if (var4 != 0) {
                tfb.a((byte) -78, "This instance of CarouselEvent has changed");
                break L11;
              } else {
                break L11;
              }
            }
            return;
          } else {
            pwa discarded$7 = var6_ref.field_d;
            if (var6_ref.field_d != null) {
              if (!var6_ref.field_d.a((byte) 108, (tv) (Object) var6_ref.field_d)) {
                L12: {
                  if (var4 != 0) {
                    tfb.a((byte) -78, "This instance of CarouselEvent has changed");
                    break L12;
                  } else {
                    break L12;
                  }
                }
                return;
              } else {
                var4 = 1;
                iva.a(-6940, "CarouselSystemMessage system_message has changed. before=" + var6_ref.field_d + ", now=" + var6_ref.field_d);
                L13: {
                  if (var4 != 0) {
                    tfb.a((byte) -78, "This instance of CarouselEvent has changed");
                    break L13;
                  } else {
                    break L13;
                  }
                }
                return;
              }
            } else {
              L14: {
                if (var4 != 0) {
                  tfb.a((byte) -78, "This instance of CarouselEvent has changed");
                  break L14;
                } else {
                  break L14;
                }
              }
              return;
            }
          }
        }
    }

    final boolean c(int param0) {
        int var2 = -71 / ((param0 - 59) / 43);
        return null != ((uqb) this).field_d ? true : false;
    }

    final void a(int param0, int param1) {
        int var3 = -106 % ((-71 - param1) / 44);
        ((uqb) this).field_d = new pwa();
        ((uqb) this).field_d.field_f = new gtb(param0);
    }

    public void b(byte param0, tv param1) {
        uqb var3 = null;
        uqb var4 = null;
        var4 = (uqb) (Object) param1;
        var3 = var4;
        var4.field_e = var4.field_e;
        if (param0 >= 54) {
          if (var4.field_d != null) {
            if (null == var3.field_d) {
              var3.field_d = new pwa();
              var4.field_d.b((byte) 121, (tv) (Object) var3.field_d);
              return;
            } else {
              if (((Object) (Object) var3.field_d).getClass() != ((Object) (Object) var4.field_d).getClass()) {
                var3.field_d = new pwa();
                var4.field_d.b((byte) 121, (tv) (Object) var3.field_d);
                return;
              } else {
                var4.field_d.b((byte) 121, (tv) (Object) var3.field_d);
                return;
              }
            }
          } else {
            var4.field_d = null;
            return;
          }
        } else {
          return;
        }
    }

    void a(mfa param0, int param1, tja param2) {
        if (param1 != 0) {
            Object var5 = null;
            boolean discarded$0 = ((uqb) this).a((byte) -98, (tv) null);
        }
    }

    final boolean c(byte param0) {
        if (param0 <= 21) {
            ((uqb) this).a(52, -95);
            return ((uqb) this).field_g;
        }
        return ((uqb) this).field_g;
    }

    public void a(faa param0, boolean param1) {
        ((uqb) this).field_e = param0.i(0, bnb.field_p);
        if (!param1) {
          if (kv.a(param1, param0)) {
            L0: {
              if (((uqb) this).field_d == null) {
                ((uqb) this).field_d = new pwa();
                break L0;
              } else {
                break L0;
              }
            }
            ((uqb) this).field_d.a(param0, param1);
            return;
          } else {
            ((uqb) this).field_d = null;
            return;
          }
        } else {
          return;
        }
    }

    final boolean a(int param0) {
        int var2 = -72 % ((param0 - 70) / 40);
        return ((uqb) this).field_f;
    }

    uqb() {
        ((uqb) this).field_f = true;
        ((uqb) this).field_g = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = 0;
    }
}
