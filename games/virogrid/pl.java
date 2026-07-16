/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pl {
    static int field_b;
    static int field_c;
    static String field_f;
    static km field_a;
    static String field_d;
    static String field_e;

    final static void a(boolean param0) {
        Object var1 = null;
        int var2 = 0;
        int var7 = 0;
        int var8 = 0;
        he stackIn_18_0 = null;
        Object stackIn_26_0 = null;
        he stackIn_40_0 = null;
        Object stackIn_48_0 = null;
        l stackOut_47_0 = null;
        he stackOut_39_0 = null;
        he stackOut_17_0 = null;
        l stackOut_25_0 = null;
        var2 = Virogrid.field_F ? 1 : 0;
        var1 = (Object) (Object) (lk) (Object) ci.field_o.a((byte) -26);
        L0: while (true) {
          L1: {
            if (var1 == null) {
              break L1;
            } else {
              var8 = ((lk) var1).field_Gb;
              var7 = 0;
              if (var2 != 0) {
                L2: {
                  if (var7 <= var8) {
                    break L2;
                  } else {
                    ((lk) var1).field_Gb = ((lk) var1).field_Gb - 1;
                    if (0 != ((lk) var1).field_Gb) {
                      break L2;
                    } else {
                      ((lk) var1).field_Wb = 0;
                      if (!((lk) var1).g(0)) {
                        break L2;
                      } else {
                        ((lk) var1).a(false);
                        break L2;
                      }
                    }
                  }
                }
                L3: while (true) {
                  var1 = (Object) (Object) (lk) (Object) qm.field_Mb.a(16213);
                  if (var1 != null) {
                    if (var2 == 0) {
                      if (-1 <= (((lk) var1).field_Gb ^ -1)) {
                        continue L3;
                      } else {
                        ((lk) var1).field_Gb = ((lk) var1).field_Gb - 1;
                        if (0 != ((lk) var1).field_Gb) {
                          continue L3;
                        } else {
                          ((lk) var1).field_Wb = 0;
                          if (!((lk) var1).g(0)) {
                            continue L3;
                          } else {
                            ((lk) var1).a(false);
                            continue L3;
                          }
                        }
                      }
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                L4: {
                  if (var7 >= var8) {
                    break L4;
                  } else {
                    ((lk) var1).field_Gb = ((lk) var1).field_Gb - 1;
                    if (((lk) var1).field_Gb != 0) {
                      break L4;
                    } else {
                      ((lk) var1).field_Wb = 0;
                      if (!((lk) var1).g(0)) {
                        break L4;
                      } else {
                        ((lk) var1).a(false);
                        break L4;
                      }
                    }
                  }
                }
                var1 = (Object) (Object) (lk) (Object) ci.field_o.a(16213);
                if (var2 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
          }
          var1 = (Object) (Object) (he) (Object) te.field_f.a((byte) -94);
          if (param0) {
            pl.a(true);
            L5: while (true) {
              L6: {
                if (var1 == null) {
                  stackOut_47_0 = qm.field_Mb.a((byte) -51);
                  stackIn_48_0 = (Object) (Object) stackOut_47_0;
                  break L6;
                } else {
                  stackOut_39_0 = (he) var1;
                  stackIn_48_0 = (Object) (Object) stackOut_39_0;
                  stackIn_40_0 = stackOut_39_0;
                  if (var2 != 0) {
                    break L6;
                  } else {
                    L7: {
                      if ((stackIn_40_0.field_Mb ^ -1) < -1) {
                        ((he) var1).field_Mb = ((he) var1).field_Mb - 1;
                        if (0 == ((he) var1).field_Mb) {
                          ((he) var1).field_Eb = 0;
                          if (!((he) var1).f((byte) -89)) {
                            break L7;
                          } else {
                            ((he) var1).a(false);
                            break L7;
                          }
                        } else {
                          break L7;
                        }
                      } else {
                        break L7;
                      }
                    }
                    var1 = (Object) (Object) (he) (Object) te.field_f.a(16213);
                    continue L5;
                  }
                }
              }
              var1 = (Object) (Object) (lk) (Object) stackIn_48_0;
              L8: while (true) {
                if (var1 != null) {
                  if (var2 == 0) {
                    L9: {
                      if (-1 <= (((lk) var1).field_Gb ^ -1)) {
                        break L9;
                      } else {
                        ((lk) var1).field_Gb = ((lk) var1).field_Gb - 1;
                        if (0 != ((lk) var1).field_Gb) {
                          break L9;
                        } else {
                          ((lk) var1).field_Wb = 0;
                          if (!((lk) var1).g(0)) {
                            break L9;
                          } else {
                            ((lk) var1).a(false);
                            break L9;
                          }
                        }
                      }
                    }
                    var1 = (Object) (Object) (lk) (Object) qm.field_Mb.a(16213);
                    continue L8;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          } else {
            L10: while (true) {
              L11: {
                L12: {
                  if (var1 == null) {
                    break L12;
                  } else {
                    stackOut_17_0 = (he) var1;
                    stackIn_26_0 = (Object) (Object) stackOut_17_0;
                    stackIn_18_0 = stackOut_17_0;
                    if (var2 != 0) {
                      break L11;
                    } else {
                      L13: {
                        if ((stackIn_18_0.field_Mb ^ -1) < -1) {
                          ((he) var1).field_Mb = ((he) var1).field_Mb - 1;
                          if (0 == ((he) var1).field_Mb) {
                            ((he) var1).field_Eb = 0;
                            if (!((he) var1).f((byte) -89)) {
                              break L13;
                            } else {
                              ((he) var1).a(false);
                              break L13;
                            }
                          } else {
                            break L13;
                          }
                        } else {
                          break L13;
                        }
                      }
                      var1 = (Object) (Object) (he) (Object) te.field_f.a(16213);
                      if (var2 == 0) {
                        continue L10;
                      } else {
                        break L12;
                      }
                    }
                  }
                }
                stackOut_25_0 = qm.field_Mb.a((byte) -51);
                stackIn_26_0 = (Object) (Object) stackOut_25_0;
                break L11;
              }
              var1 = (Object) (Object) (lk) (Object) stackIn_26_0;
              L14: while (true) {
                if (var1 != null) {
                  if (var2 == 0) {
                    L15: {
                      if (-1 <= (((lk) var1).field_Gb ^ -1)) {
                        break L15;
                      } else {
                        ((lk) var1).field_Gb = ((lk) var1).field_Gb - 1;
                        if (0 != ((lk) var1).field_Gb) {
                          break L15;
                        } else {
                          ((lk) var1).field_Wb = 0;
                          if (!((lk) var1).g(0)) {
                            break L15;
                          } else {
                            ((lk) var1).a(false);
                            break L15;
                          }
                        }
                      }
                    }
                    var1 = (Object) (Object) (lk) (Object) qm.field_Mb.a(16213);
                    continue L14;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    final static int a(byte param0, CharSequence param1, int param2) {
        if (param0 >= -44) {
            field_f = null;
            return p.a(param2, 4330, true, param1);
        }
        return p.a(param2, 4330, true, param1);
    }

    final static bk a(long param0, String param1, int param2, String param3, boolean param4) {
        if ((param0 ^ -1L) == -1L) {
          if (param1 == null) {
            if (!param4) {
              if (param2 > 126) {
                return (bk) (Object) new mh(param0, param3);
              } else {
                field_d = null;
                return (bk) (Object) new mh(param0, param3);
              }
            } else {
              return (bk) (Object) new re(param0, param3);
            }
          } else {
            return (bk) (Object) new vi(param1, param3);
          }
        } else {
          if (!param4) {
            if (param2 > 126) {
              return (bk) (Object) new mh(param0, param3);
            } else {
              field_d = null;
              return (bk) (Object) new mh(param0, param3);
            }
          } else {
            return (bk) (Object) new re(param0, param3);
          }
        }
    }

    public static void a(byte param0) {
        field_f = null;
        if (param0 < -88) {
          field_d = null;
          field_a = null;
          field_e = null;
          return;
        } else {
          field_e = null;
          field_d = null;
          field_a = null;
          field_e = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "You are offering to draw.";
        field_c = -1;
        field_d = "Loading models";
        field_e = "You are invited to <%0>'s game.";
    }
}
