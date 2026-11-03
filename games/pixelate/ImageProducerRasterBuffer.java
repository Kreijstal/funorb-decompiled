/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ImageProducerRasterBuffer extends CanvasRasterBuffer implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    private java.awt.image.ColorModel field_o;
    private java.awt.image.ImageConsumer field_p;
    static IntrusiveDeque field_n;
    static int field_l;
    static String field_m;

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
          this.field_p = param0;
          param0.setDimensions(this.field_a, this.field_i);
          param0.setProperties((Hashtable) null);
          param0.setColorModel(this.field_o);
          param0.setHints(14);
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "i.addConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        String var3 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -640) {
            var3 = (String) null;
            ImageProducerRasterBuffer.a(54, (String) null);
          }
          stackIn_5_0 = (DisplayNameForm.findFriend(param1, -99) != null);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("i.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final void drawImage(java.awt.Graphics param0, boolean param1, int param2, int param3) {
        try {
          this.b(param1);
          param0.drawImage(this.field_d, param3, param2, (java.awt.image.ImageObserver) (this));
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "i.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final synchronized void b(boolean param0) {
        if (null == this.field_p) {
          return;
        }
        if (!param0) {
          this.field_p.setPixels(0, 0, this.field_a, this.field_i, this.field_o, this.field_e, 0, this.field_a);
          this.field_p.imageComplete(2);
          return;
        }
        field_l = 110;
        this.field_p.setPixels(0, 0, this.field_a, this.field_i, this.field_o, this.field_e, 0, this.field_a);
        this.field_p.imageComplete(2);
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
          this.addConsumer(param0);
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "i.startProduction(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final boolean imageUpdate(java.awt.Image param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_4_0 = var7;
          stackIn_4_1 = new StringBuilder().append("i.imageUpdate(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final void initialize(int param0, java.awt.Component param1, int param2, byte param3) {
        try {
          this.field_i = param2;
          this.field_a = param0;
          this.field_e = new int[1 + param0 * param2];
          this.field_o = (java.awt.image.ColorModel) ((Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255));
          this.field_d = param1.createImage((java.awt.image.ImageProducer) (this));
          this.b(false);
          param1.prepareImage(this.field_d, (java.awt.image.ImageObserver) (this));
          if (param3 > -51) {
            ImageProducerRasterBuffer.a(-29, true, false, false, true, 57, -40, true, -122, -23);
          }
          this.b(false);
          param1.prepareImage(this.field_d, (java.awt.image.ImageObserver) (this));
          this.b(false);
          param1.prepareImage(this.field_d, (java.awt.image.ImageObserver) (this));
          this.a(19692);
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "i.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return param0 == this.field_p;
    }

    ImageProducerRasterBuffer() {
    }

    public static void c(int param0) {
        field_m = null;
        field_n = null;
        if (param0 >= -19) {
          field_l = -71;
        }
    }

    final static Class loadClassOrPrimitive(String param0, int param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_3_0 = null;
        Class stackIn_7_0 = null;
        Class stackIn_11_0 = null;
        Class stackIn_15_0 = null;
        Class stackIn_18_0 = null;
        Class stackIn_24_0 = null;
        Class stackIn_28_0 = null;
        Class stackIn_31_0 = null;
        Class stackIn_33_0 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0.equals("B")) {
            stackIn_3_0 = Byte.TYPE;
            return stackIn_3_0;
          }
          if (param0.equals("I")) {
            stackIn_7_0 = Integer.TYPE;
            return stackIn_7_0;
          }
          if (param0.equals("S")) {
            stackIn_11_0 = Short.TYPE;
            return stackIn_11_0;
          }
          if (param0.equals("J")) {
            stackIn_15_0 = Long.TYPE;
            return stackIn_15_0;
          }
          if (param0.equals("Z")) {
            stackIn_18_0 = Boolean.TYPE;
            return stackIn_18_0;
          }
          if (param1 >= -66) {
            ImageProducerRasterBuffer.c(49);
          }
          if (param0.equals("F")) {
            stackIn_24_0 = Float.TYPE;
            return stackIn_24_0;
          }
          if (param0.equals("D")) {
            stackIn_28_0 = Double.TYPE;
            return stackIn_28_0;
          }
          if (!param0.equals("C")) {
            stackIn_33_0 = Class.forName(param0);
            return stackIn_33_0;
          }
          stackIn_31_0 = Character.TYPE;
          return stackIn_31_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_36_0 = var2;
          stackIn_36_1 = new StringBuilder().append("i.E(");
          if (param0 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1, boolean param2, boolean param3, boolean param4, int param5, int param6, boolean param7, int param8, int param9) {
        int var11;
        var11 = Pixelate.field_H ? 1 : 0;
        if (param4) {
          if (param4) {
            TextTableInitializer.field_c = WeightedLruCache.field_c;
            pj.a((byte) 111, param4);
            if (param6 != -28362) {
              field_m = (String) null;
            }
            if (0 < oo.field_b) {
              AccountChoicePanel.a(2, param0, param7, param4);
            }
            nk.field_e.horizontalAlignment = 1;
            nk.field_e.field_C = ArchiveIndex.field_l.field_C;
            if (vn.field_g > 0) {
              AccountNoticeDialog.a(param0, param7, 3, param4);
            }
            if (Checkbox.field_W > 0) {
              CachedTextLayout.a(param1, param6 + 28363, param0, param4, param7);
            }
            if (EmergentBehaviourBackground.field_o &&
              io.field_c.field_ec <= io.field_c.field_mc) {
              jm.field_b.field_Ib.field_cb = fo.field_m;
              StripedProgressBar.field_O.field_rb = false;
              GrowableIntList.a(jm.field_b.content, false);
            } else {
              StripedProgressBar.field_O.field_rb = true;
              jm.field_b.field_Ib.field_cb = null;
              la.a(70, param0, jm.field_b, param8, param3);
            }
          } else {
            TextTableInitializer.field_c = (-640 + ni.field_q) / 2;
            pj.a((byte) 111, param4);
            if (param6 != -28362) {
              field_m = (String) null;
              if (0 < oo.field_b) {
                AccountChoicePanel.a(2, param0, param7, param4);
              }
              nk.field_e.horizontalAlignment = 1;
              nk.field_e.field_C = ArchiveIndex.field_l.field_C;
              if (vn.field_g > 0) {
                AccountNoticeDialog.a(param0, param7, 3, param4);
              }
              if (Checkbox.field_W > 0) {
                CachedTextLayout.a(param1, param6 + 28363, param0, param4, param7);
              }
              if (EmergentBehaviourBackground.field_o &&
                io.field_c.field_ec <= io.field_c.field_mc) {
                jm.field_b.field_Ib.field_cb = fo.field_m;
                StripedProgressBar.field_O.field_rb = false;
                GrowableIntList.a(jm.field_b.content, false);
              } else {
                StripedProgressBar.field_O.field_rb = true;
                jm.field_b.field_Ib.field_cb = null;
                la.a(70, param0, jm.field_b, param8, param3);
              }
            } else {
              if (0 < oo.field_b) {
                AccountChoicePanel.a(2, param0, param7, param4);
                nk.field_e.horizontalAlignment = 1;
                nk.field_e.field_C = ArchiveIndex.field_l.field_C;
                if (vn.field_g > 0) {
                  AccountNoticeDialog.a(param0, param7, 3, param4);
                }
                if (Checkbox.field_W > 0) {
                  CachedTextLayout.a(param1, param6 + 28363, param0, param4, param7);
                }
                if (EmergentBehaviourBackground.field_o &&
                  io.field_c.field_ec <= io.field_c.field_mc) {
                  jm.field_b.field_Ib.field_cb = fo.field_m;
                  StripedProgressBar.field_O.field_rb = false;
                  GrowableIntList.a(jm.field_b.content, false);
                } else {
                  StripedProgressBar.field_O.field_rb = true;
                  jm.field_b.field_Ib.field_cb = null;
                  la.a(70, param0, jm.field_b, param8, param3);
                }
              } else {
                nk.field_e.horizontalAlignment = 1;
                nk.field_e.field_C = ArchiveIndex.field_l.field_C;
                if (vn.field_g > 0) {
                  AccountNoticeDialog.a(param0, param7, 3, param4);
                  if (Checkbox.field_W > 0) {
                    CachedTextLayout.a(param1, param6 + 28363, param0, param4, param7);
                  }
                  if (EmergentBehaviourBackground.field_o &&
                    io.field_c.field_ec <= io.field_c.field_mc) {
                    jm.field_b.field_Ib.field_cb = fo.field_m;
                    StripedProgressBar.field_O.field_rb = false;
                    GrowableIntList.a(jm.field_b.content, false);
                  } else {
                    StripedProgressBar.field_O.field_rb = true;
                    jm.field_b.field_Ib.field_cb = null;
                    la.a(70, param0, jm.field_b, param8, param3);
                  }
                } else {
                  if (Checkbox.field_W > 0) {
                    CachedTextLayout.a(param1, param6 + 28363, param0, param4, param7);
                  }
                  if (!EmergentBehaviourBackground.field_o) {
                    StripedProgressBar.field_O.field_rb = true;
                    jm.field_b.field_Ib.field_cb = null;
                    la.a(70, param0, jm.field_b, param8, param3);
                  } else {
                    if (io.field_c.field_ec <= io.field_c.field_mc) {
                      jm.field_b.field_Ib.field_cb = fo.field_m;
                      StripedProgressBar.field_O.field_rb = false;
                      GrowableIntList.a(jm.field_b.content, false);
                    } else {
                      StripedProgressBar.field_O.field_rb = true;
                      jm.field_b.field_Ib.field_cb = null;
                      la.a(70, param0, jm.field_b, param8, param3);
                    }
                  }
                }
              }
            }
          }
        } else {
          if (ni.field_q == SoftwareRasterizer.field_j) {
            if (SoftwareRasterizer.field_d != Matrix3.field_b &&
              ClientException.field_f.field_i == SoftwareRasterizer.field_d &&
              ClientException.field_f.field_a == SoftwareRasterizer.field_j) {
              if (io.field_c != null) {
                DebouncedValidator.a((byte) 32, false);
              } else {
                if (DraggableWidget.field_S != null) {
                  DebouncedValidator.a((byte) 32, true);
                } else {
                  PacketBuffer.b(false);
                }
              }
            }
            if (param4) {
              TextTableInitializer.field_c = WeightedLruCache.field_c;
              pj.a((byte) 111, param4);
              if (param6 != -28362) {
                field_m = (String) null;
              }
              if (0 < oo.field_b) {
                AccountChoicePanel.a(2, param0, param7, param4);
              }
              nk.field_e.horizontalAlignment = 1;
              nk.field_e.field_C = ArchiveIndex.field_l.field_C;
              if (vn.field_g > 0) {
                AccountNoticeDialog.a(param0, param7, 3, param4);
              }
              if (Checkbox.field_W > 0) {
                CachedTextLayout.a(param1, param6 + 28363, param0, param4, param7);
              }
              if (EmergentBehaviourBackground.field_o &&
                io.field_c.field_ec <= io.field_c.field_mc) {
                jm.field_b.field_Ib.field_cb = fo.field_m;
                StripedProgressBar.field_O.field_rb = false;
                GrowableIntList.a(jm.field_b.content, false);
              } else {
                StripedProgressBar.field_O.field_rb = true;
                jm.field_b.field_Ib.field_cb = null;
                la.a(70, param0, jm.field_b, param8, param3);
              }
            } else {
              TextTableInitializer.field_c = (-640 + ni.field_q) / 2;
              pj.a((byte) 111, param4);
              if (param6 != -28362) {
                field_m = (String) null;
                if (0 < oo.field_b) {
                  AccountChoicePanel.a(2, param0, param7, param4);
                }
                nk.field_e.horizontalAlignment = 1;
                nk.field_e.field_C = ArchiveIndex.field_l.field_C;
                if (vn.field_g > 0) {
                  AccountNoticeDialog.a(param0, param7, 3, param4);
                }
                if (Checkbox.field_W > 0) {
                  CachedTextLayout.a(param1, param6 + 28363, param0, param4, param7);
                }
                if (EmergentBehaviourBackground.field_o &&
                  io.field_c.field_ec <= io.field_c.field_mc) {
                  jm.field_b.field_Ib.field_cb = fo.field_m;
                  StripedProgressBar.field_O.field_rb = false;
                  GrowableIntList.a(jm.field_b.content, false);
                } else {
                  StripedProgressBar.field_O.field_rb = true;
                  jm.field_b.field_Ib.field_cb = null;
                  la.a(70, param0, jm.field_b, param8, param3);
                }
              } else {
                if (0 < oo.field_b) {
                  AccountChoicePanel.a(2, param0, param7, param4);
                }
                nk.field_e.horizontalAlignment = 1;
                nk.field_e.field_C = ArchiveIndex.field_l.field_C;
                if (vn.field_g > 0) {
                  AccountNoticeDialog.a(param0, param7, 3, param4);
                  if (Checkbox.field_W > 0) {
                    CachedTextLayout.a(param1, param6 + 28363, param0, param4, param7);
                  }
                  if (EmergentBehaviourBackground.field_o &&
                    io.field_c.field_ec <= io.field_c.field_mc) {
                    jm.field_b.field_Ib.field_cb = fo.field_m;
                    StripedProgressBar.field_O.field_rb = false;
                    GrowableIntList.a(jm.field_b.content, false);
                  } else {
                    StripedProgressBar.field_O.field_rb = true;
                    jm.field_b.field_Ib.field_cb = null;
                    la.a(70, param0, jm.field_b, param8, param3);
                  }
                } else {
                  if (Checkbox.field_W > 0) {
                    CachedTextLayout.a(param1, param6 + 28363, param0, param4, param7);
                  }
                  if (!EmergentBehaviourBackground.field_o) {
                    StripedProgressBar.field_O.field_rb = true;
                    jm.field_b.field_Ib.field_cb = null;
                    la.a(70, param0, jm.field_b, param8, param3);
                  } else {
                    if (io.field_c.field_ec <= io.field_c.field_mc) {
                      jm.field_b.field_Ib.field_cb = fo.field_m;
                      StripedProgressBar.field_O.field_rb = false;
                      GrowableIntList.a(jm.field_b.content, false);
                    } else {
                      StripedProgressBar.field_O.field_rb = true;
                      jm.field_b.field_Ib.field_cb = null;
                      la.a(70, param0, jm.field_b, param8, param3);
                    }
                  }
                }
              }
            }
          } else {
            if (ClientException.field_f.field_i == SoftwareRasterizer.field_d &&
              ClientException.field_f.field_a == SoftwareRasterizer.field_j) {
              if (io.field_c != null) {
                DebouncedValidator.a((byte) 32, false);
              } else {
                if (DraggableWidget.field_S != null) {
                  DebouncedValidator.a((byte) 32, true);
                } else {
                  PacketBuffer.b(false);
                }
              }
            }
            if (param4) {
              TextTableInitializer.field_c = WeightedLruCache.field_c;
              pj.a((byte) 111, param4);
              if (param6 != -28362) {
                field_m = (String) null;
              }
              if (0 < oo.field_b) {
                AccountChoicePanel.a(2, param0, param7, param4);
              }
              nk.field_e.horizontalAlignment = 1;
              nk.field_e.field_C = ArchiveIndex.field_l.field_C;
              if (vn.field_g > 0) {
                AccountNoticeDialog.a(param0, param7, 3, param4);
              }
              if (Checkbox.field_W > 0) {
                CachedTextLayout.a(param1, param6 + 28363, param0, param4, param7);
              }
              if (EmergentBehaviourBackground.field_o &&
                io.field_c.field_ec <= io.field_c.field_mc) {
                jm.field_b.field_Ib.field_cb = fo.field_m;
                StripedProgressBar.field_O.field_rb = false;
                GrowableIntList.a(jm.field_b.content, false);
              } else {
                StripedProgressBar.field_O.field_rb = true;
                jm.field_b.field_Ib.field_cb = null;
                la.a(70, param0, jm.field_b, param8, param3);
              }
            } else {
              TextTableInitializer.field_c = (-640 + ni.field_q) / 2;
              pj.a((byte) 111, param4);
              if (param6 != -28362) {
                field_m = (String) null;
                if (0 < oo.field_b) {
                  AccountChoicePanel.a(2, param0, param7, param4);
                }
                nk.field_e.horizontalAlignment = 1;
                nk.field_e.field_C = ArchiveIndex.field_l.field_C;
                if (vn.field_g > 0) {
                  AccountNoticeDialog.a(param0, param7, 3, param4);
                }
                if (Checkbox.field_W > 0) {
                  CachedTextLayout.a(param1, param6 + 28363, param0, param4, param7);
                }
                if (EmergentBehaviourBackground.field_o &&
                  io.field_c.field_ec <= io.field_c.field_mc) {
                  jm.field_b.field_Ib.field_cb = fo.field_m;
                  StripedProgressBar.field_O.field_rb = false;
                  GrowableIntList.a(jm.field_b.content, false);
                } else {
                  StripedProgressBar.field_O.field_rb = true;
                  jm.field_b.field_Ib.field_cb = null;
                  la.a(70, param0, jm.field_b, param8, param3);
                }
              } else {
                if (0 < oo.field_b) {
                  AccountChoicePanel.a(2, param0, param7, param4);
                  nk.field_e.horizontalAlignment = 1;
                  nk.field_e.field_C = ArchiveIndex.field_l.field_C;
                  if (vn.field_g > 0) {
                    AccountNoticeDialog.a(param0, param7, 3, param4);
                  }
                  if (Checkbox.field_W > 0) {
                    CachedTextLayout.a(param1, param6 + 28363, param0, param4, param7);
                  }
                  if (EmergentBehaviourBackground.field_o &&
                    io.field_c.field_ec <= io.field_c.field_mc) {
                    jm.field_b.field_Ib.field_cb = fo.field_m;
                    StripedProgressBar.field_O.field_rb = false;
                    GrowableIntList.a(jm.field_b.content, false);
                  } else {
                    StripedProgressBar.field_O.field_rb = true;
                    jm.field_b.field_Ib.field_cb = null;
                    la.a(70, param0, jm.field_b, param8, param3);
                  }
                } else {
                  nk.field_e.horizontalAlignment = 1;
                  nk.field_e.field_C = ArchiveIndex.field_l.field_C;
                  if (vn.field_g > 0) {
                    AccountNoticeDialog.a(param0, param7, 3, param4);
                    if (Checkbox.field_W > 0) {
                      CachedTextLayout.a(param1, param6 + 28363, param0, param4, param7);
                    }
                    if (EmergentBehaviourBackground.field_o &&
                      io.field_c.field_ec <= io.field_c.field_mc) {
                      jm.field_b.field_Ib.field_cb = fo.field_m;
                      StripedProgressBar.field_O.field_rb = false;
                      GrowableIntList.a(jm.field_b.content, false);
                    } else {
                      StripedProgressBar.field_O.field_rb = true;
                      jm.field_b.field_Ib.field_cb = null;
                      la.a(70, param0, jm.field_b, param8, param3);
                    }
                  } else {
                    if (Checkbox.field_W > 0) {
                      CachedTextLayout.a(param1, param6 + 28363, param0, param4, param7);
                    }
                    if (!EmergentBehaviourBackground.field_o) {
                      StripedProgressBar.field_O.field_rb = true;
                      jm.field_b.field_Ib.field_cb = null;
                      la.a(70, param0, jm.field_b, param8, param3);
                    } else {
                      if (io.field_c.field_ec <= io.field_c.field_mc) {
                        jm.field_b.field_Ib.field_cb = fo.field_m;
                        StripedProgressBar.field_O.field_rb = false;
                        GrowableIntList.a(jm.field_b.content, false);
                      } else {
                        StripedProgressBar.field_O.field_rb = true;
                        jm.field_b.field_Ib.field_cb = null;
                        la.a(70, param0, jm.field_b, param8, param3);
                      }
                    }
                  }
                }
              }
            }
          }
        }
        Pixelate.a(param3, (byte) 69, param8, param2, param5, param0, param9);
        la.a(58, param0, Vector3.field_c, param8, param3);
        AchievementsScreen.field_o = AchievementsScreen.field_o + 1;
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 == this.field_p) {
            this.field_p = null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("i.removeConsumer(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        field_m = "Invite <%0> to this game";
    }
}
