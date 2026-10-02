/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jc {
    static Sprite field_a;
    static String toCustomerSupportText;
    static String field_b;

    final static void requestAvatarFeedback(int feedbackRequestId, boolean clearSpriteGuard) {
        int unusedClientControlSnapshot;
        unusedClientControlSnapshot = Geoblox.field_C;
        if (7 == feedbackRequestId) {
          if (MenuScreen.avatarFeedbackFrameBase != 36) {
            MenuScreen.avatarFeedbackFrameBase = 36;
            pa.avatarFeedbackHoldTicks = 110;
            nd.avatarFeedbackModeId = 6;
            td.playPcmSample(-348, fl.field_c[23]);
          }
        }
        if (pa.avatarFeedbackHoldTicks <= 0) {
          if (clearSpriteGuard) {
            field_a = (Sprite) null;
            if (feedbackRequestId != 0) {
              if (1 != feedbackRequestId) {
                if (feedbackRequestId != 2) {
                  if (3 != feedbackRequestId) {
                    if (feedbackRequestId != 4) {
                      if (feedbackRequestId == 5) {
                        pa.avatarFeedbackHoldTicks = 110;
                        nd.avatarFeedbackModeId = 5;
                        MenuScreen.avatarFeedbackFrameBase = 30;
                        td.playPcmSample(-348, fl.field_c[24]);
                        uf.avatarFeedbackFrameIndex = uf.avatarFeedbackFrameIndex % 6 + MenuScreen.avatarFeedbackFrameBase;
                        return;
                      } else {
                        uf.avatarFeedbackFrameIndex = uf.avatarFeedbackFrameIndex % 6 + MenuScreen.avatarFeedbackFrameBase;
                        return;
                      }
                    } else {
                      pa.avatarFeedbackHoldTicks = 110;
                      MenuScreen.avatarFeedbackFrameBase = 24;
                      nd.avatarFeedbackModeId = 4;
                      uf.avatarFeedbackFrameIndex = uf.avatarFeedbackFrameIndex % 6 + MenuScreen.avatarFeedbackFrameBase;
                      return;
                    }
                  } else {
                    MenuScreen.avatarFeedbackFrameBase = 18;
                    wa.avatarShockEffectTicks = 50;
                    pa.avatarFeedbackHoldTicks = 110;
                    nd.avatarFeedbackModeId = 3;
                    td.playPcmSample(-348, fl.field_c[27]);
                    uf.avatarFeedbackFrameIndex = uf.avatarFeedbackFrameIndex % 6 + MenuScreen.avatarFeedbackFrameBase;
                    return;
                  }
                } else {
                  if (12 != MenuScreen.avatarFeedbackFrameBase) {
                    if (MenuScreen.avatarFeedbackFrameBase != 24) {
                      if (30 != MenuScreen.avatarFeedbackFrameBase) {
                        if (36 != MenuScreen.avatarFeedbackFrameBase) {
                          td.playPcmSample(-348, fl.field_c[26]);
                          nd.avatarFeedbackModeId = 2;
                          MenuScreen.avatarFeedbackFrameBase = 12;
                          uf.avatarFeedbackFrameIndex = uf.avatarFeedbackFrameIndex % 6 + MenuScreen.avatarFeedbackFrameBase;
                          return;
                        } else {
                          nd.avatarFeedbackModeId = 2;
                          MenuScreen.avatarFeedbackFrameBase = 12;
                          uf.avatarFeedbackFrameIndex = uf.avatarFeedbackFrameIndex % 6 + MenuScreen.avatarFeedbackFrameBase;
                          return;
                        }
                      } else {
                        nd.avatarFeedbackModeId = 2;
                        MenuScreen.avatarFeedbackFrameBase = 12;
                        uf.avatarFeedbackFrameIndex = uf.avatarFeedbackFrameIndex % 6 + MenuScreen.avatarFeedbackFrameBase;
                        return;
                      }
                    } else {
                      nd.avatarFeedbackModeId = 2;
                      MenuScreen.avatarFeedbackFrameBase = 12;
                      uf.avatarFeedbackFrameIndex = uf.avatarFeedbackFrameIndex % 6 + MenuScreen.avatarFeedbackFrameBase;
                      return;
                    }
                  } else {
                    nd.avatarFeedbackModeId = 2;
                    MenuScreen.avatarFeedbackFrameBase = 12;
                    uf.avatarFeedbackFrameIndex = uf.avatarFeedbackFrameIndex % 6 + MenuScreen.avatarFeedbackFrameBase;
                    return;
                  }
                }
              } else {
                nd.avatarFeedbackModeId = 1;
                MenuScreen.avatarFeedbackFrameBase = 6;
                uf.avatarFeedbackFrameIndex = uf.avatarFeedbackFrameIndex % 6 + MenuScreen.avatarFeedbackFrameBase;
                return;
              }
            } else {
              if (MenuScreen.avatarFeedbackFrameBase != 0) {
                if (24 != MenuScreen.avatarFeedbackFrameBase) {
                  if (MenuScreen.avatarFeedbackFrameBase != 30) {
                    if (MenuScreen.avatarFeedbackFrameBase != 36) {
                      td.playPcmSample(-348, fl.field_c[25]);
                      MenuScreen.avatarFeedbackFrameBase = 0;
                      nd.avatarFeedbackModeId = 0;
                      uf.avatarFeedbackFrameIndex = uf.avatarFeedbackFrameIndex % 6 + MenuScreen.avatarFeedbackFrameBase;
                      return;
                    } else {
                      MenuScreen.avatarFeedbackFrameBase = 0;
                      nd.avatarFeedbackModeId = 0;
                      uf.avatarFeedbackFrameIndex = uf.avatarFeedbackFrameIndex % 6 + MenuScreen.avatarFeedbackFrameBase;
                      return;
                    }
                  } else {
                    MenuScreen.avatarFeedbackFrameBase = 0;
                    nd.avatarFeedbackModeId = 0;
                    uf.avatarFeedbackFrameIndex = uf.avatarFeedbackFrameIndex % 6 + MenuScreen.avatarFeedbackFrameBase;
                    return;
                  }
                } else {
                  MenuScreen.avatarFeedbackFrameBase = 0;
                  nd.avatarFeedbackModeId = 0;
                  uf.avatarFeedbackFrameIndex = uf.avatarFeedbackFrameIndex % 6 + MenuScreen.avatarFeedbackFrameBase;
                  return;
                }
              } else {
                MenuScreen.avatarFeedbackFrameBase = 0;
                nd.avatarFeedbackModeId = 0;
                uf.avatarFeedbackFrameIndex = uf.avatarFeedbackFrameIndex % 6 + MenuScreen.avatarFeedbackFrameBase;
                return;
              }
            }
          } else {
            if (feedbackRequestId != 0) {
              if (1 != feedbackRequestId) {
                if (feedbackRequestId != 2) {
                  if (3 != feedbackRequestId) {
                    if (feedbackRequestId != 4) {
                      if (feedbackRequestId != 5) {
                        uf.avatarFeedbackFrameIndex = uf.avatarFeedbackFrameIndex % 6 + MenuScreen.avatarFeedbackFrameBase;
                        return;
                      } else {
                        pa.avatarFeedbackHoldTicks = 110;
                        nd.avatarFeedbackModeId = 5;
                        MenuScreen.avatarFeedbackFrameBase = 30;
                        td.playPcmSample(-348, fl.field_c[24]);
                        uf.avatarFeedbackFrameIndex = uf.avatarFeedbackFrameIndex % 6 + MenuScreen.avatarFeedbackFrameBase;
                        return;
                      }
                    } else {
                      pa.avatarFeedbackHoldTicks = 110;
                      MenuScreen.avatarFeedbackFrameBase = 24;
                      nd.avatarFeedbackModeId = 4;
                      uf.avatarFeedbackFrameIndex = uf.avatarFeedbackFrameIndex % 6 + MenuScreen.avatarFeedbackFrameBase;
                      return;
                    }
                  } else {
                    MenuScreen.avatarFeedbackFrameBase = 18;
                    wa.avatarShockEffectTicks = 50;
                    pa.avatarFeedbackHoldTicks = 110;
                    nd.avatarFeedbackModeId = 3;
                    td.playPcmSample(-348, fl.field_c[27]);
                    uf.avatarFeedbackFrameIndex = uf.avatarFeedbackFrameIndex % 6 + MenuScreen.avatarFeedbackFrameBase;
                    return;
                  }
                } else {
                  if (12 == MenuScreen.avatarFeedbackFrameBase) {
                    nd.avatarFeedbackModeId = 2;
                    MenuScreen.avatarFeedbackFrameBase = 12;
                  } else {
                    if (MenuScreen.avatarFeedbackFrameBase != 24) {
                      if (30 != MenuScreen.avatarFeedbackFrameBase) {
                        if (36 != MenuScreen.avatarFeedbackFrameBase) {
                          td.playPcmSample(-348, fl.field_c[26]);
                          nd.avatarFeedbackModeId = 2;
                          MenuScreen.avatarFeedbackFrameBase = 12;
                          uf.avatarFeedbackFrameIndex = uf.avatarFeedbackFrameIndex % 6 + MenuScreen.avatarFeedbackFrameBase;
                          return;
                        } else {
                          nd.avatarFeedbackModeId = 2;
                          MenuScreen.avatarFeedbackFrameBase = 12;
                          uf.avatarFeedbackFrameIndex = uf.avatarFeedbackFrameIndex % 6 + MenuScreen.avatarFeedbackFrameBase;
                          return;
                        }
                      } else {
                        nd.avatarFeedbackModeId = 2;
                        MenuScreen.avatarFeedbackFrameBase = 12;
                        uf.avatarFeedbackFrameIndex = uf.avatarFeedbackFrameIndex % 6 + MenuScreen.avatarFeedbackFrameBase;
                        return;
                      }
                    } else {
                      nd.avatarFeedbackModeId = 2;
                      MenuScreen.avatarFeedbackFrameBase = 12;
                      uf.avatarFeedbackFrameIndex = uf.avatarFeedbackFrameIndex % 6 + MenuScreen.avatarFeedbackFrameBase;
                      return;
                    }
                  }
                }
              } else {
                nd.avatarFeedbackModeId = 1;
                MenuScreen.avatarFeedbackFrameBase = 6;
                uf.avatarFeedbackFrameIndex = uf.avatarFeedbackFrameIndex % 6 + MenuScreen.avatarFeedbackFrameBase;
                return;
              }
            } else {
              if (MenuScreen.avatarFeedbackFrameBase != 0) {
                if (24 != MenuScreen.avatarFeedbackFrameBase) {
                  if (MenuScreen.avatarFeedbackFrameBase != 30) {
                    if (MenuScreen.avatarFeedbackFrameBase != 36) {
                      td.playPcmSample(-348, fl.field_c[25]);
                      MenuScreen.avatarFeedbackFrameBase = 0;
                      nd.avatarFeedbackModeId = 0;
                    } else {
                      MenuScreen.avatarFeedbackFrameBase = 0;
                      nd.avatarFeedbackModeId = 0;
                    }
                  } else {
                    MenuScreen.avatarFeedbackFrameBase = 0;
                    nd.avatarFeedbackModeId = 0;
                  }
                } else {
                  MenuScreen.avatarFeedbackFrameBase = 0;
                  nd.avatarFeedbackModeId = 0;
                }
              } else {
                MenuScreen.avatarFeedbackFrameBase = 0;
                nd.avatarFeedbackModeId = 0;
              }
            }
            uf.avatarFeedbackFrameIndex = uf.avatarFeedbackFrameIndex % 6 + MenuScreen.avatarFeedbackFrameBase;
            return;
          }
        } else {
          if (feedbackRequestId == 3) {
            wa.avatarShockEffectTicks = 50;
            td.playPcmSample(-348, fl.field_c[27]);
          }
          return;
        }
    }

    final static fd[] a(pk param0, boolean param1) {
        int var5 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        fd[] var4 = null;
        fd var6_ref_fd = null;
        int var6 = 0;
        int var7 = 0;
        fd[] stackIn_3_0 = null;
        Object stackIn_6_0 = null;
        fd[] stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Geoblox.field_C;
        try {
          var2_int = param0.e((byte) -17, 8);
          if (param1) {
            if (0 >= var2_int) {
              var3 = param0.e((byte) -17, 12);
              var4 = new fd[var3];
              for (var5 = 0; var3 > var5; var5++) {
                if (!ac.a((byte) 71, param0)) {
                  var6 = param0.e((byte) -17, td.a(var5 - 1, (byte) 66));
                  var4[var5] = var4[var6];
                } else {
                  var6_ref_fd = new fd();
                  param0.e((byte) -17, 24);
                  param0.e((byte) -17, 24);
                  var6_ref_fd.field_a = param0.e((byte) -17, 24);
                  param0.e((byte) -17, 9);
                  param0.e((byte) -17, 12);
                  param0.e((byte) -17, 12);
                  param0.e((byte) -17, 12);
                  var4[var5] = var6_ref_fd;
                }
              }
              stackIn_14_0 = (fd[]) (var4);
              return stackIn_14_0;
            } else {
              stackIn_6_0 = null;
              return (fd[]) ((Object) stackIn_6_0);
            }
          } else {
            stackIn_3_0 = (fd[]) null;
            return stackIn_3_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_17_0 = (RuntimeException) (var2);

          stackIn_17_1 = new StringBuilder().append("jc.D(");

          if (param0 == null) {
            stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
            stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
            stackIn_18_2 = "null";
          } else {
            stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
            stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
            stackIn_18_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 > -13) {
            field_a = (Sprite) null;
            toCustomerSupportText = null;
            return;
        }
        toCustomerSupportText = null;
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        if (param2 <= -33) {
            var3 = param0 >> 31 & param1 - 1;
            return var3 + ((param0 >>> 31) + param0) % param1;
        }
        return 80;
    }

    static {
        toCustomerSupportText = "To Customer Support";
    }
}
