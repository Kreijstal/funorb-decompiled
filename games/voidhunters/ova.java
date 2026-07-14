/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ova {
    private int field_a;
    private byte[] field_c;
    private int field_e;
    private int field_d;
    private int field_b;
    private int field_f;

    final boolean a(int param0) {
        Object var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 0) {
          L0: {
            var3 = null;
            ((ova) this).a((byte[]) null, 29);
            if (((ova) this).field_c != null) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (((ova) this).field_c != null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void a(byte[] param0, int param1) {
        ((ova) this).field_c = param0;
        ((ova) this).field_b = param1;
    }

    final void a(faa param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (null == ((ova) this).field_c) {
          return;
        } else {
          ((ova) this).field_a = ((ova) this).field_a - 1;
          if (((ova) this).field_a - 1 <= 0) {
            ((ova) this).field_a = ((ova) this).field_a + ((ova) this).field_f;
            if (!param1) {
              var4 = param0.field_h.length - param0.field_e;
              if (param2 > 121) {
                var5 = -((ova) this).field_d + var4;
                if (!param1) {
                  if (var5 > 0) {
                    L0: {
                      param0.h(24335, ((ova) this).field_e);
                      param0.field_e = param0.field_e + 2;
                      var6 = param0.field_e;
                      param0.d(((ova) this).field_c.length, 332614536);
                      param0.d(((ova) this).field_b, 332614536);
                      if (var5 <= ((ova) this).field_c.length + -((ova) this).field_b) {
                        break L0;
                      } else {
                        var5 = -((ova) this).field_b + ((ova) this).field_c.length;
                        break L0;
                      }
                    }
                    param0.a(var5, true);
                    param0.a(((ova) this).field_b, ((ova) this).field_c, -1, var5);
                    param0.a(param0.field_e + -var6, -124);
                    ((ova) this).field_b = ((ova) this).field_b + var5;
                    if (((ova) this).field_b >= ((ova) this).field_c.length) {
                      ((ova) this).field_c = null;
                      if (!param1) {
                        return;
                      } else {
                        System.out.println("done sending this data.");
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  System.out.println("sendable_now " + var5);
                  if (var5 > 0) {
                    L1: {
                      param0.h(24335, ((ova) this).field_e);
                      param0.field_e = param0.field_e + 2;
                      var6 = param0.field_e;
                      param0.d(((ova) this).field_c.length, 332614536);
                      param0.d(((ova) this).field_b, 332614536);
                      if (var5 <= ((ova) this).field_c.length + -((ova) this).field_b) {
                        break L1;
                      } else {
                        var5 = -((ova) this).field_b + ((ova) this).field_c.length;
                        break L1;
                      }
                    }
                    param0.a(var5, true);
                    param0.a(((ova) this).field_b, ((ova) this).field_c, -1, var5);
                    param0.a(param0.field_e + -var6, -124);
                    ((ova) this).field_b = ((ova) this).field_b + var5;
                    if (((ova) this).field_b >= ((ova) this).field_c.length) {
                      ((ova) this).field_c = null;
                      System.out.println("done sending this data.");
                      return;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                ((ova) this).field_e = 8;
                var5 = -((ova) this).field_d + var4;
                if (!param1) {
                  if (var5 > 0) {
                    L2: {
                      param0.h(24335, ((ova) this).field_e);
                      param0.field_e = param0.field_e + 2;
                      var6 = param0.field_e;
                      param0.d(((ova) this).field_c.length, 332614536);
                      param0.d(((ova) this).field_b, 332614536);
                      if (var5 <= ((ova) this).field_c.length + -((ova) this).field_b) {
                        break L2;
                      } else {
                        var5 = -((ova) this).field_b + ((ova) this).field_c.length;
                        break L2;
                      }
                    }
                    param0.a(var5, true);
                    param0.a(((ova) this).field_b, ((ova) this).field_c, -1, var5);
                    param0.a(param0.field_e + -var6, -124);
                    ((ova) this).field_b = ((ova) this).field_b + var5;
                    if (((ova) this).field_b >= ((ova) this).field_c.length) {
                      ((ova) this).field_c = null;
                      if (!param1) {
                        return;
                      } else {
                        System.out.println("done sending this data.");
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  L3: {
                    System.out.println("sendable_now " + var5);
                    if (var5 > 0) {
                      L4: {
                        param0.h(24335, ((ova) this).field_e);
                        param0.field_e = param0.field_e + 2;
                        var6 = param0.field_e;
                        param0.d(((ova) this).field_c.length, 332614536);
                        param0.d(((ova) this).field_b, 332614536);
                        if (var5 <= ((ova) this).field_c.length + -((ova) this).field_b) {
                          break L4;
                        } else {
                          var5 = -((ova) this).field_b + ((ova) this).field_c.length;
                          break L4;
                        }
                      }
                      param0.a(var5, true);
                      param0.a(((ova) this).field_b, ((ova) this).field_c, -1, var5);
                      param0.a(param0.field_e + -var6, -124);
                      ((ova) this).field_b = ((ova) this).field_b + var5;
                      if (((ova) this).field_b < ((ova) this).field_c.length) {
                        break L3;
                      } else {
                        ((ova) this).field_c = null;
                        if (param1) {
                          System.out.println("done sending this data.");
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  return;
                }
              }
            } else {
              System.out.println("updating datasender, total " + ((ova) this).field_c.length);
              var4 = param0.field_h.length - param0.field_e;
              if (param2 <= 121) {
                ((ova) this).field_e = 8;
                var5 = -((ova) this).field_d + var4;
                if (param1) {
                  System.out.println("sendable_now " + var5);
                  if (var5 > 0) {
                    L5: {
                      param0.h(24335, ((ova) this).field_e);
                      param0.field_e = param0.field_e + 2;
                      var6 = param0.field_e;
                      param0.d(((ova) this).field_c.length, 332614536);
                      param0.d(((ova) this).field_b, 332614536);
                      if (var5 <= ((ova) this).field_c.length + -((ova) this).field_b) {
                        break L5;
                      } else {
                        var5 = -((ova) this).field_b + ((ova) this).field_c.length;
                        break L5;
                      }
                    }
                    param0.a(var5, true);
                    param0.a(((ova) this).field_b, ((ova) this).field_c, -1, var5);
                    param0.a(param0.field_e + -var6, -124);
                    ((ova) this).field_b = ((ova) this).field_b + var5;
                    if (((ova) this).field_b >= ((ova) this).field_c.length) {
                      ((ova) this).field_c = null;
                      if (!param1) {
                        return;
                      } else {
                        System.out.println("done sending this data.");
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  L6: {
                    if (var5 > 0) {
                      L7: {
                        param0.h(24335, ((ova) this).field_e);
                        param0.field_e = param0.field_e + 2;
                        var6 = param0.field_e;
                        param0.d(((ova) this).field_c.length, 332614536);
                        param0.d(((ova) this).field_b, 332614536);
                        if (var5 <= ((ova) this).field_c.length + -((ova) this).field_b) {
                          break L7;
                        } else {
                          var5 = -((ova) this).field_b + ((ova) this).field_c.length;
                          break L7;
                        }
                      }
                      param0.a(var5, true);
                      param0.a(((ova) this).field_b, ((ova) this).field_c, -1, var5);
                      param0.a(param0.field_e + -var6, -124);
                      ((ova) this).field_b = ((ova) this).field_b + var5;
                      if (((ova) this).field_b < ((ova) this).field_c.length) {
                        break L6;
                      } else {
                        ((ova) this).field_c = null;
                        break L6;
                      }
                    } else {
                      break L6;
                    }
                  }
                  return;
                }
              } else {
                var5 = -((ova) this).field_d + var4;
                System.out.println("sendable_now " + var5);
                L8: {
                  if (var5 > 0) {
                    L9: {
                      param0.h(24335, ((ova) this).field_e);
                      param0.field_e = param0.field_e + 2;
                      var6 = param0.field_e;
                      param0.d(((ova) this).field_c.length, 332614536);
                      param0.d(((ova) this).field_b, 332614536);
                      if (var5 <= ((ova) this).field_c.length + -((ova) this).field_b) {
                        break L9;
                      } else {
                        var5 = -((ova) this).field_b + ((ova) this).field_c.length;
                        break L9;
                      }
                    }
                    param0.a(var5, true);
                    param0.a(((ova) this).field_b, ((ova) this).field_c, -1, var5);
                    param0.a(param0.field_e + -var6, -124);
                    ((ova) this).field_b = ((ova) this).field_b + var5;
                    if (((ova) this).field_b < ((ova) this).field_c.length) {
                      break L8;
                    } else {
                      ((ova) this).field_c = null;
                      if (param1) {
                        System.out.println("done sending this data.");
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                  } else {
                    break L8;
                  }
                }
                return;
              }
            }
          } else {
            return;
          }
        }
    }

    ova(int param0) {
        ((ova) this).field_d = 1024;
        ((ova) this).field_f = 8;
        ((ova) this).field_a = 0;
        ((ova) this).field_e = param0;
    }

    static {
    }
}
