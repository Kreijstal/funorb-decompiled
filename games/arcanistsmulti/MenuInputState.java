/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MenuInputState {
    static String field_b;
    private boolean field_l;
    private int field_a;
    static String field_p;
    static int field_d;
    private int field_m;
    static int[] field_c;
    static boolean field_j;
    private int field_e;
    static ResourceArchive field_k;
    static String field_g;
    int field_h;
    private int field_o;
    static String field_n;
    int field_f;
    static DraggableWidget field_i;

    final void setItemBounds(int param0, int param1, int param2) {
        if (param0 >= this.field_f) {
          throw new IllegalArgumentException();
        }
        if (param2 == -97) {
          if (this.field_f <= param1) {
            throw new IllegalArgumentException();
          }
          this.field_a = 0;
          this.field_o = 0;
          if (0 != WrappedTextLayout.field_r) {
            this.field_o = WrappedTextLayout.field_r;
            this.field_l = true;
            this.field_h = param1;
            this.field_m = WrappedTextLayout.field_r;
            this.field_e = hn.field_p;
          }
          if (this.field_m != 0 &&
            PacketBuffer.field_m != 0) {
            if (0 >= this.field_e) {
              this.field_e = MusicPatchNode.field_g;
              this.field_e = this.field_e - 1;
              if (0 == WrappedTextLayout.field_r &&
                PacketBuffer.field_m == 0) {
                this.field_m = 0;
              }
              if (this.field_m == 0) {
                if (!this.field_l &&
                  !ArchiveProvider.field_d) {
                  return;
                }
                if (0 > param0) {
                  if (this.field_l) {
                    this.field_h = -1;
                  }
                } else {
                  if (param0 != this.field_h) {
                    this.field_h = param0;
                    this.field_l = true;
                  } else {
                    this.field_h = param0;
                    this.field_l = true;
                  }
                }
              }
              return;
            }
            this.field_e = this.field_e - 1;
          }
          if (0 == WrappedTextLayout.field_r &&
            PacketBuffer.field_m == 0) {
            this.field_m = 0;
            if (this.field_m == 0) {
              if (!this.field_l &&
                !ArchiveProvider.field_d) {
                return;
              }
              if (0 > param0) {
                if (this.field_l) {
                  this.field_h = -1;
                }
              } else {
                if (param0 != this.field_h) {
                  this.field_h = param0;
                  this.field_l = true;
                } else {
                  this.field_h = param0;
                  this.field_l = true;
                }
              }
            }
            return;
          }
          if (this.field_m != 0) {
            return;
          }
          if (this.field_l) {
            if (0 > param0) {
              if (!this.field_l) {
                return;
              }
              this.field_h = -1;
              return;
            }
            if (param0 != this.field_h) {
            }
            this.field_h = param0;
            this.field_l = true;
            return;
          }
          if (!ArchiveProvider.field_d) {
            return;
          }
          if (0 > param0) {
            if (this.field_l) {
              this.field_h = -1;
            }
          } else {
            if (param0 != this.field_h) {
            }
            this.field_h = param0;
            this.field_l = true;
          }
          return;
        }
        field_j = false;
        if (this.field_f <= param1) {
          throw new IllegalArgumentException();
        }
        this.field_a = 0;
        this.field_o = 0;
        if (0 == WrappedTextLayout.field_r) {
          if (this.field_m != 0 &&
            PacketBuffer.field_m != 0) {
            if (0 >= this.field_e) {
              this.field_e = MusicPatchNode.field_g;
              this.field_e = this.field_e - 1;
              if (0 == WrappedTextLayout.field_r &&
                PacketBuffer.field_m == 0) {
                this.field_m = 0;
              }
              if (this.field_m == 0) {
                if (!this.field_l &&
                  !ArchiveProvider.field_d) {
                  return;
                }
                if (0 > param0) {
                  if (this.field_l) {
                    this.field_h = -1;
                  }
                } else {
                  if (param0 != this.field_h) {
                    this.field_h = param0;
                    this.field_l = true;
                  } else {
                    this.field_h = param0;
                    this.field_l = true;
                  }
                }
              }
              return;
            }
            this.field_e = this.field_e - 1;
          }
          if (0 == WrappedTextLayout.field_r &&
            PacketBuffer.field_m == 0) {
            this.field_m = 0;
            if (this.field_m == 0) {
              if (!this.field_l &&
                !ArchiveProvider.field_d) {
                return;
              }
              if (0 > param0) {
                if (this.field_l) {
                  this.field_h = -1;
                }
              } else {
                if (param0 != this.field_h) {
                  this.field_h = param0;
                  this.field_l = true;
                } else {
                  this.field_h = param0;
                  this.field_l = true;
                }
              }
            }
            return;
          }
          if (this.field_m != 0) {
            return;
          }
          if (this.field_l) {
            if (0 > param0) {
              if (!this.field_l) {
                return;
              }
              this.field_h = -1;
              return;
            }
            if (param0 != this.field_h) {
            }
            this.field_h = param0;
            this.field_l = true;
            return;
          }
          if (!ArchiveProvider.field_d) {
            return;
          }
          if (0 > param0) {
            if (this.field_l) {
              this.field_h = -1;
            }
          } else {
            if (param0 != this.field_h) {
            }
            this.field_h = param0;
            this.field_l = true;
          }
          return;
        }
        this.field_o = WrappedTextLayout.field_r;
        this.field_l = true;
        this.field_h = param1;
        this.field_m = WrappedTextLayout.field_r;
        this.field_e = hn.field_p;
        if (this.field_m != 0 &&
          PacketBuffer.field_m != 0) {
          if (0 >= this.field_e) {
            this.field_e = MusicPatchNode.field_g;
            this.field_e = this.field_e - 1;
            if (0 == WrappedTextLayout.field_r &&
              PacketBuffer.field_m == 0) {
              this.field_m = 0;
            }
            if (this.field_m == 0) {
              if (!this.field_l &&
                !ArchiveProvider.field_d) {
                return;
              }
              if (0 > param0) {
                if (this.field_l) {
                  this.field_h = -1;
                }
              } else {
                if (param0 != this.field_h) {
                  this.field_h = param0;
                  this.field_l = true;
                } else {
                  this.field_h = param0;
                  this.field_l = true;
                }
              }
            }
            return;
          }
          this.field_e = this.field_e - 1;
        }
        if (0 == WrappedTextLayout.field_r &&
          PacketBuffer.field_m == 0) {
          this.field_m = 0;
          if (this.field_m != 0) {
            return;
          }
          if (!this.field_l &&
            !ArchiveProvider.field_d) {
            return;
          }
        } else {
          if (this.field_m != 0) {
            return;
          }
          if (!this.field_l &&
            !ArchiveProvider.field_d) {
            return;
          }
        }
        if (0 > param0) {
          if (!this.field_l) {
            return;
          }
          this.field_h = -1;
          return;
        }
        if (param0 != this.field_h) {
        }
        this.field_h = param0;
        this.field_l = true;
    }

    final void pollKeysAndPointer(int param0, int param1) {
        int var3;
        var3 = -55 % ((-18 - param0) / 61);
        this.field_o = 0;
        this.field_a = 0;
        if (this.field_m == 0) {
          this.field_a = IntrusiveDeque.field_d;
        }
        if (this.field_m == 0) {
          if (IntrusiveDeque.field_d != 96) {
            if (this.field_m != 0) {
              if (this.field_m == 0) {
                if (IntrusiveDeque.field_d != 98 &&
                  IntrusiveDeque.field_d != 99) {
                  return;
                }
                this.field_l = false;
                if (this.field_h < 0) {
                  this.field_h = param1;
                }
              }
              return;
            }
            if (IntrusiveDeque.field_d != 97) {
              if (this.field_m == 0) {
                if (IntrusiveDeque.field_d != 98 &&
                  IntrusiveDeque.field_d != 99) {
                  return;
                }
                this.field_l = false;
                if (this.field_h < 0) {
                  this.field_h = param1;
                }
              }
              return;
            }
            this.field_h = this.field_h + 1;
            this.field_l = false;
            if (this.field_h >= this.field_f) {
              this.field_h = 0;
            }
            if (this.field_m == 0) {
              if (IntrusiveDeque.field_d != 98 &&
                IntrusiveDeque.field_d != 99) {
                return;
              }
              this.field_l = false;
              if (this.field_h < 0) {
                this.field_h = param1;
              }
            }
            return;
          }
          if (this.field_h <= 0) {
            this.field_h = this.field_f;
          }
          this.field_h = this.field_h - 1;
          this.field_l = false;
        }
        if (this.field_m == 0 &&
          IntrusiveDeque.field_d == 97) {
          this.field_h = this.field_h + 1;
          this.field_l = false;
          if (this.field_h >= this.field_f) {
            this.field_h = 0;
          }
        }
        if (this.field_m != 0) {
          return;
        }
        if (IntrusiveDeque.field_d != 98 &&
          IntrusiveDeque.field_d != 99) {
          return;
        }
        this.field_l = false;
        if (this.field_h >= 0) {
          return;
        }
        this.field_h = param1;
    }

    final void pollKeys(byte param0) {
        this.field_o = 0;
        this.field_a = 0;
        if (param0 != -76) {
          field_p = (String) null;
        }
        if (this.field_m == 0) {
          this.field_a = IntrusiveDeque.field_d;
        }
        if (this.field_m == 0 &&
          IntrusiveDeque.field_d == 98) {
          if (this.field_h <= 0) {
            this.field_h = this.field_f;
          }
          this.field_l = false;
          this.field_h = this.field_h - 1;
        }
        if (this.field_m != 0) {
          return;
        }
        if (99 != IntrusiveDeque.field_d) {
          return;
        }
        this.field_h = this.field_h + 1;
        if (this.field_h >= this.field_f) {
          this.field_h = 0;
        }
        this.field_l = false;
    }

    final void setHighlightedItem(int param0, boolean param1) {
        if (param1) {
          this.field_h = -45;
          if (this.field_m == 0) {
            this.field_l = false;
            this.field_h = param0;
            return;
          }
          return;
        }
        if (this.field_m != 0) {
          return;
        }
        this.field_l = false;
        this.field_h = param0;
    }

    final void reset(boolean param0, int param1, boolean param2, int param3) {
        this.field_m = 0;
        this.field_l = param0 ? true : false;
        if (this.field_l) {
          this.field_h = param3;
          if (param2) {
            this.isPointerMode((byte) 42);
            return;
          }
          return;
        }
        this.field_h = param1;
        if (param2) {
          this.isPointerMode((byte) 42);
          return;
        }
    }

    final boolean isActivatePressed(boolean param0) {
        if (!param0) {
          return false;
        }
        if (this.field_o != 0) {
          return true;
        }
        if (this.field_a == 84) {
          return true;
        }
        if (this.field_a != 83) {
          return false;
        }
        return true;
    }

    final boolean isEndPressed(byte param0) {
        int var2 = -101 / ((param0 - 43) / 52);
        return this.field_a == 103 ? true : false;
    }

    final static void detachMouseInput(java.awt.Component param0, int param1) {
        try {
          param0.removeMouseListener(ResizableModalPanel.field_hb);
          param0.removeMouseMotionListener(ResizableModalPanel.field_hb);
          param0.removeFocusListener(ResizableModalPanel.field_hb);
          rk.field_K = param1;
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "so.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean isPointerMode(byte param0) {
        int var2 = 42 % ((param0 - 45) / 35);
        return this.field_m != 0 ? true : false;
    }

    final static aj[] getRegisteredEntries(int param0) {
        if (param0 == 96) {
          return new aj[]{ValidationHelpWidget.field_W, Js5NetworkRequest.field_B, IntrusiveDequeCursor.field_b, td.field_G, om.field_M, ModalPanelStack.field_G, BevelTextPainter.field_q, gl.field_b, um.field_b, gg.field_b, fc.field_b, DropTargetWidget.field_G, ng.field_I, GameAppletShell.field_e};
        }
        field_i = (DraggableWidget) null;
        return new aj[]{ValidationHelpWidget.field_W, Js5NetworkRequest.field_B, IntrusiveDequeCursor.field_b, td.field_G, om.field_M, ModalPanelStack.field_G, BevelTextPainter.field_q, gl.field_b, um.field_b, gg.field_b, fc.field_b, DropTargetWidget.field_G, ng.field_I, GameAppletShell.field_e};
    }

    final void clearInput(int param0) {
        this.field_o = 0;
        int var2 = 30 % ((-43 - param0) / 55);
        this.field_a = 0;
        if (0 != this.field_m) {
          return;
        }
        this.field_a = IntrusiveDeque.field_d;
    }

    public static void releaseStatics(boolean param0) {
        if (param0) {
          field_g = null;
          field_b = null;
          field_c = null;
          field_n = null;
          field_k = null;
          field_i = null;
          field_p = null;
          return;
        }
        java.awt.Component var2 = (java.awt.Component) null;
        MenuInputState.detachMouseInput((java.awt.Component) null, 80);
        field_g = null;
        field_b = null;
        field_c = null;
        field_n = null;
        field_k = null;
        field_i = null;
        field_p = null;
    }

    final boolean isHomePressed(int param0) {
        if (param0 == -13722) {
          return 102 == this.field_a ? true : false;
        }
        this.setItemBounds(-52, 68, 71);
        return 102 == this.field_a ? true : false;
    }

    final boolean isRightPressed(int param0) {
        if (param0 > -62) {
          return true;
        }
        return this.field_a == 97 ? true : false;
    }

    final boolean isLeftPressed(byte param0) {
        if (param0 == -40) {
          return 96 == this.field_a ? true : false;
        }
        this.field_e = -77;
        return 96 == this.field_a ? true : false;
    }

    MenuInputState(int param0) {
        this.field_l = false;
        this.field_h = 0;
        this.field_f = param0;
    }

    static {
        field_d = -1;
        field_c = new int[6];
        field_b = "Set up new unrated game";
        field_n = "<%0> has been removed.";
    }
}
