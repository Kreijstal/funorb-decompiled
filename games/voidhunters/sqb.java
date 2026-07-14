/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sqb extends fh {
    int field_p;
    static phb[] field_o;
    int field_l;
    int field_n;
    int field_q;
    int field_k;
    int field_m;

    final static tv[] a(tv[] param0, tv[] param1, int param2, dja param3, boolean param4) {
        int var5 = 0;
        tv var6 = null;
        tv var7 = null;
        tv var7_ref = null;
        int var8 = 0;
        tv var9 = null;
        tv var10 = null;
        int var11 = 0;
        var11 = VoidHunters.field_G;
        if (param1 != null) {
          if (param0 == null) {
            param0 = param3.a(11995, param1.length);
            if (param4) {
              return null;
            } else {
              L0: {
                var5 = 0;
                if (param1.length <= var5) {
                  break L0;
                } else {
                  L1: {
                    L2: {
                      var6 = param1[var5];
                      if (var6 != null) {
                        L3: {
                          var7 = param0[var5];
                          if (var7 == null) {
                            param0[var5] = param3.a((byte) -124);
                            var7_ref = param3.a((byte) -124);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        L4: {
                          var8 = param2;
                          var9 = var6;
                          var10 = var7_ref;
                          if (var8 == 1) {
                            var9.b((byte) 124, var10);
                            break L4;
                          } else {
                            L5: {
                              if (2 == var8) {
                                ((tva) (Object) var9).a(var10, 29106);
                                break L5;
                              } else {
                                if ((var8 ^ -1) == -4) {
                                  ((sjb) (Object) var9).a(var10, (byte) 39);
                                  var5++;
                                  break L5;
                                } else {
                                  var5++;
                                  break L1;
                                }
                              }
                            }
                            var5++;
                            break L4;
                          }
                        }
                        var5++;
                        break L2;
                      } else {
                        param0[var5] = null;
                        var5++;
                        break L2;
                      }
                    }
                    var5++;
                    break L1;
                  }
                  var5++;
                  var5++;
                  break L0;
                }
              }
              return param0;
            }
          } else {
            if (param0.length != param1.length) {
              param0 = param3.a(11995, param1.length);
              if (param4) {
                return null;
              } else {
                L6: {
                  var5 = 0;
                  if (param1.length <= var5) {
                    break L6;
                  } else {
                    L7: {
                      L8: {
                        var6 = param1[var5];
                        if (var6 != null) {
                          L9: {
                            var7 = param0[var5];
                            if (var7 == null) {
                              param0[var5] = param3.a((byte) -124);
                              var7_ref = param3.a((byte) -124);
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          L10: {
                            var8 = param2;
                            var9 = var6;
                            var10 = var7_ref;
                            if (var8 == 1) {
                              var9.b((byte) 124, var10);
                              break L10;
                            } else {
                              L11: {
                                if (2 == var8) {
                                  ((tva) (Object) var9).a(var10, 29106);
                                  break L11;
                                } else {
                                  if ((var8 ^ -1) == -4) {
                                    ((sjb) (Object) var9).a(var10, (byte) 39);
                                    var5++;
                                    break L11;
                                  } else {
                                    var5++;
                                    break L7;
                                  }
                                }
                              }
                              var5++;
                              break L10;
                            }
                          }
                          var5++;
                          break L8;
                        } else {
                          param0[var5] = null;
                          var5++;
                          break L8;
                        }
                      }
                      var5++;
                      break L7;
                    }
                    var5++;
                    var5++;
                    break L6;
                  }
                }
                return param0;
              }
            } else {
              if (param4) {
                return null;
              } else {
                var5 = 0;
                L12: while (true) {
                  if (param1.length <= var5) {
                    return param0;
                  } else {
                    var6 = param1[var5];
                    if (var6 != null) {
                      L13: {
                        var7 = param0[var5];
                        if (var7 == null) {
                          param0[var5] = param3.a((byte) -124);
                          var7_ref = param3.a((byte) -124);
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      var8 = param2;
                      var9 = var6;
                      var10 = var7_ref;
                      if (var8 == 1) {
                        var9.b((byte) 124, var10);
                        var5++;
                        continue L12;
                      } else {
                        if (2 == var8) {
                          ((tva) (Object) var9).a(var10, 29106);
                          var5++;
                          continue L12;
                        } else {
                          if ((var8 ^ -1) == -4) {
                            ((sjb) (Object) var9).a(var10, (byte) 39);
                            var5++;
                            var5++;
                            continue L12;
                          } else {
                            var5++;
                            var5++;
                            continue L12;
                          }
                        }
                      }
                    } else {
                      param0[var5] = null;
                      var5++;
                      var5++;
                      continue L12;
                    }
                  }
                }
              }
            }
          }
        } else {
          return null;
        }
    }

    final static int a(int param0, int param1, int param2) {
        if (param1 > 42) {
          if (param2 != -1) {
            if (param2 <= -1) {
              if (0 == param0) {
                return 0;
              } else {
                if (0 <= param0) {
                  return kq.a(param0, param2, 11105);
                } else {
                  return -kq.a(-param0, param2, 11105);
                }
              }
            } else {
              if (0 == param0) {
                return 4096;
              } else {
                if (-1 > param0) {
                  return -4096 + kq.a(-param0, -param2, 11105);
                } else {
                  return -kq.a(param0, -param2, 11105) + 4096;
                }
              }
            }
          } else {
            if (-1 != param0) {
              if (0 <= param0) {
                return 2048;
              } else {
                return -2048;
              }
            } else {
              return 0;
            }
          }
        } else {
          field_o = null;
          if (param2 != -1) {
            if (param2 <= -1) {
              if (0 == param0) {
                return 0;
              } else {
                if (0 <= param0) {
                  return kq.a(param0, param2, 11105);
                } else {
                  return -kq.a(-param0, param2, 11105);
                }
              }
            } else {
              if (0 == param0) {
                return 4096;
              } else {
                if (-1 > param0) {
                  return -4096 + kq.a(-param0, -param2, 11105);
                } else {
                  return -kq.a(param0, -param2, 11105) + 4096;
                }
              }
            }
          } else {
            if (-1 != param0) {
              if (0 <= param0) {
                return 2048;
              } else {
                return -2048;
              }
            } else {
              return 0;
            }
          }
        }
    }

    public static void a(boolean param0) {
        field_o = null;
        if (!param0) {
            int discarded$0 = sqb.a(2, -61, -79);
        }
    }

    sqb() {
    }

    static {
    }
}
