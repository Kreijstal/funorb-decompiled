/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qpb extends mc {
    static llb field_w;
    int field_v;

    qpb(shb param0) {
        super(param0.field_g, param0.field_r, param0.field_h, param0.field_f, (wwa) null, (sba) null);
        param0.a(0, ((qpb) this).field_h, ((qpb) this).field_f, 1, 0);
        ((qpb) this).field_t = param0;
        ((qpb) this).field_v = 256;
    }

    final static int a(boolean param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = VoidHunters.field_G;
        var3 = 16777215;
        var4 = param1;
        if (var4 == 0) {
          var3 = 60159;
          if (param2 != 13894143) {
            return -77;
          } else {
            L0: {
              if (!param0) {
                break L0;
              } else {
                var3 = (16711422 & var3 | 13421772) << 2142435265;
                break L0;
              }
            }
            return var3;
          }
        } else {
          if (var4 == 1) {
            var3 = 13421619;
            if (param2 != 13894143) {
              return -77;
            } else {
              L1: {
                if (!param0) {
                  break L1;
                } else {
                  var3 = (16711422 & var3 | 13421772) << 2142435265;
                  break L1;
                }
              }
              return var3;
            }
          } else {
            if (2 == var4) {
              var3 = 3394611;
              if (param2 != 13894143) {
                return -77;
              } else {
                L2: {
                  if (!param0) {
                    break L2;
                  } else {
                    var3 = (16711422 & var3 | 13421772) << 2142435265;
                    break L2;
                  }
                }
                return var3;
              }
            } else {
              if (3 == var4) {
                var3 = 14540253;
                if (param2 != 13894143) {
                  return -77;
                } else {
                  L3: {
                    if (!param0) {
                      break L3;
                    } else {
                      var3 = (16711422 & var3 | 13421772) << 2142435265;
                      break L3;
                    }
                  }
                  return var3;
                }
              } else {
                if (var4 != -5) {
                  if (-6 != var4) {
                    if (-7 == var4) {
                      var3 = 3422668;
                      if (param2 != 13894143) {
                        return -77;
                      } else {
                        L4: {
                          if (!param0) {
                            break L4;
                          } else {
                            var3 = (16711422 & var3 | 13421772) << 2142435265;
                            break L4;
                          }
                        }
                        return var3;
                      }
                    } else {
                      if (-8 == var4) {
                        var3 = 15372852;
                        if (param2 == 13894143) {
                          L5: {
                            if (!param0) {
                              break L5;
                            } else {
                              var3 = (16711422 & var3 | 13421772) << 2142435265;
                              break L5;
                            }
                          }
                          return var3;
                        } else {
                          return -77;
                        }
                      } else {
                        if (param2 != 13894143) {
                          return -77;
                        } else {
                          L6: {
                            if (!param0) {
                              break L6;
                            } else {
                              var3 = (16711422 & var3 | 13421772) << 2142435265;
                              break L6;
                            }
                          }
                          return var3;
                        }
                      }
                    }
                  } else {
                    var3 = 3460236;
                    if (param2 != 13894143) {
                      return -77;
                    } else {
                      L7: {
                        if (!param0) {
                          break L7;
                        } else {
                          var3 = (16711422 & var3 | 13421772) << 2142435265;
                          break L7;
                        }
                      }
                      return var3;
                    }
                  }
                } else {
                  var3 = 13894143;
                  if (param2 != 13894143) {
                    return -77;
                  } else {
                    L8: {
                      if (!param0) {
                        break L8;
                      } else {
                        var3 = (16711422 & var3 | 13421772) << 2142435265;
                        break L8;
                      }
                    }
                    return var3;
                  }
                }
              }
            }
          }
        }
    }

    public qpb() {
        super(0, 0, 0, 0, (wwa) null, (sba) null);
        ((qpb) this).field_v = 256;
    }

    public static void b(boolean param0) {
        field_w = null;
        if (!param0) {
            field_w = null;
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        phb var7 = null;
        phb var8 = null;
        if (-1 == (param1 ^ -1)) {
          if (null != ((qpb) this).field_t) {
            if (param2 > 47) {
              if (-1 != (((qpb) this).field_v ^ -1)) {
                if (256 == ((qpb) this).field_v) {
                  ((qpb) this).field_t.b(param0 + ((qpb) this).field_g, param1, 74, param3 - -((qpb) this).field_r);
                  return;
                } else {
                  var8 = new phb(((qpb) this).field_t.field_h, ((qpb) this).field_t.field_f);
                  de.a(117, var8);
                  ((qpb) this).field_t.b(0, param1, 115, 0);
                  bia.a((byte) 124);
                  var8.d(param0 - -((qpb) this).field_g, ((qpb) this).field_r + param3, ((qpb) this).field_v);
                  return;
                }
              } else {
                return;
              }
            } else {
              int discarded$1 = qpb.a(false, 44, 54);
              if (-1 != (((qpb) this).field_v ^ -1)) {
                if (256 == ((qpb) this).field_v) {
                  ((qpb) this).field_t.b(param0 + ((qpb) this).field_g, param1, 74, param3 - -((qpb) this).field_r);
                  return;
                } else {
                  var7 = new phb(((qpb) this).field_t.field_h, ((qpb) this).field_t.field_f);
                  de.a(117, var7);
                  ((qpb) this).field_t.b(0, param1, 115, 0);
                  bia.a((byte) 124);
                  var7.d(param0 - -((qpb) this).field_g, ((qpb) this).field_r + param3, ((qpb) this).field_v);
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    static {
    }
}
